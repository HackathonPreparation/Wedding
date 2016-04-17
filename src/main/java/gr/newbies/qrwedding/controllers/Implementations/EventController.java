package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.VisitorService;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController extends BaseController{

    @Autowired
    EventService eventService;

    @Autowired
    VisitorService visitorService;

    /**
     * create a new event
     * @param dto
     * @return 
     */
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseEntity<JSONObject> NewEvent (@RequestBody EventCreationDTO dto){
        Event e = eventService.create(dto);
        if (e != null){
            JSONObject jsonObject = e.toJson();
            return new ResponseEntity<>(jsonObject,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public boolean cancelInvitation(@PathVariable String id){
        return visitorService.delete(visitorService.findOne(id));         
    }
  
    
    @RequestMapping(value ="/cancelEvent/{id}", method = RequestMethod.GET)
    public boolean cancelEvent(@PathVariable String id){
        return eventService.delete(eventService.findOne(id));
    }
  
    /**
     * change wedding's data
     * @param dto
     * @return 
     */
    @RequestMapping(value = "/edit",method = RequestMethod.PUT)
    public ResponseEntity EditEvent (@RequestBody EventUpdateDTO dto){
        boolean response = eventService.update(dto);
        System.out.println(response + " <- ");
        System.out.println(dto.toString());
        if (response){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * show wedding's accepted visitors
     * @param uuid
     * @return 
     */
    @RequestMapping(value = "/{uuid:^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$}/accepted",method = RequestMethod.GET)
    public HttpEntity<JSONObject> GetEvent (@PathVariable String uuid){
        Event e = eventService.findOne(uuid);
        
        if (e == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        List<Visitor> l = visitorService.findAllAccepted(uuid);
        JSONArray jsonArray = new JSONArray();
        
        for(Visitor vLookUp:l){
            jsonArray.add(vLookUp.toJson());            
        }
                
        JSONObject json;
        json = e.toJson();
        json.put("visitors",jsonArray);
        return new ResponseEntity<>(json,HttpStatus.OK);
    }
    
    /**
     * show all invited visitors
     * @param uuid
     * @return 
     */
    @RequestMapping(value = "/{uuid:^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$}/all",method = RequestMethod.GET)
    public HttpEntity<JSONObject> GetAllEvent (@PathVariable String uuid){
        Event e = eventService.findOne(uuid);
        if (e == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        JSONArray jsonArray = visitorService.findVisitorsByEventId(uuid);
        
        JSONObject json;
        json = e.toJson();
        json.put("visitors",jsonArray);
        return new ResponseEntity<>(json,HttpStatus.OK);
    }
}
