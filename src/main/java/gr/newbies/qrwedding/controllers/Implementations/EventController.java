package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.services.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController extends BaseController{

    @Autowired
    EventService eventService;

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseEntity<Event> NewEvent (@RequestBody EventCreationDTO dto){
        Event e = eventService.create(dto);
        if (e != null){
            return new ResponseEntity<>(e,HttpStatus.OK);
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

    @RequestMapping(value = "/{uuid}",method = RequestMethod.GET)
    public HttpEntity GetEvent (){
        //todo return event + list of visitors with event_uuid = event.uuid
        throw new UnsupportedOperationException("soonish");
    }
}
