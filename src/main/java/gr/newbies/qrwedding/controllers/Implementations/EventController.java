package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.VisitorService;
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

    @RequestMapping(value = "/edit",method = RequestMethod.PUT)
    public ResponseEntity EditEvent (@RequestBody EventUpdateDTO dto){
        boolean response = eventService.update(dto);
        if (response){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/{uuid:^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$}",method = RequestMethod.GET)
    public HttpEntity<JSONObject> GetEvent (@PathVariable String uuid){
        JSONArray jsonArray = visitorService.findVisitorsByEventId(uuid);
        Event e = eventService.findOne(uuid);
        if (e == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        JSONObject json;
        json = e.toJson();
        json.put("visitors",jsonArray);
        System.out.println(json.toString());
        return new ResponseEntity<>(json,HttpStatus.OK);
    }
}
