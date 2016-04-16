package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.services.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController extends BaseController{

    @Autowired
    EventService eventService;

//    @RequestMapping(method = RequestMethod.POST)
//    public HttpEntity NewEvent(@RequestBody EventCreationDTO newEvent){
//        //TODO creation DTO = comment+name
//        //TODO post to database new event, id, uuid, comment, name
//        //todo IF uuid exists, retry
//        //todo return OK made new        
//        throw new UnsupportedOperationException("soonish");
//    }

    @RequestMapping(value = "/{uuid}",method = RequestMethod.GET)
    public HttpEntity GetEvent (){
        //todo return data about wedding (name, comment, visitor status)
        //todo list of visitors and their status returned
        throw new UnsupportedOperationException("soonish");
    }
    
    @RequestMapping(value = "/test")
    public HttpEntity tryMe(){        
        List<Event> l = eventService.findAll();
        for(Event vLookUp:l){
            System.out.println(vLookUp.getComments());
            System.out.println(vLookUp.getId());
            System.out.println(vLookUp.getName());
            System.out.println(vLookUp.getTable_left());
            System.out.println(vLookUp.getTables_count());
            System.out.println(vLookUp.getUuid());
        }
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
