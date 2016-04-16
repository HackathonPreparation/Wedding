package gr.newbies.qrwedding.controllers.Implementations;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/event")
public class EventController {


    @RequestMapping(method = RequestMethod.POST)
    public HttpEntity NewEvent(@RequestBody EventCreationDTO newEvent){
        UUID uuid = UUID.randomUUID();
        //TODO creation DTO = comment+name
        //TODO post to database new event, id, uuid, comment, name
        //todo IF uuid exists, retry
        //todo return OK made new
    }

    @RequestMapping(value = "/{uuid}",method = RequestMethod.GET)
    public HttpEntity GetEvent (){
        //todo return data about wedding (name, comment, visitor status)
        //todo list of visitors and their status returned
    }
}
