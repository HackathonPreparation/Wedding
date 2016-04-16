package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitor")
public class VisitorController extends BaseController{

    @Autowired
    VisitorService visitorService;

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    public ResponseEntity<Visitor> NewEvent (@RequestBody VisitorCreationDTO visitorCreationDTO){
        Visitor v = visitorService.create(visitorCreationDTO);
        if (v != null){
            return new ResponseEntity<>(v,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/{uuid}",method = RequestMethod.GET)
    public HttpEntity GetEvent (){
        //todo return visitor data with uuid = uuid
        throw new UnsupportedOperationException("soonish");
    }
}
