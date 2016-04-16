package gr.newbies.qrwedding.controllers.Implementations;

import gr.newbies.qrwedding.controllers.BaseController;
import gr.newbies.qrwedding.extras.Status;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/{uuid:^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$}",method = RequestMethod.GET)
    public HttpEntity<String> GetEvent (@PathVariable String uuid){
        Visitor v = visitorService.findOne(uuid);
        if (v != null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Status status  = v.getStatus();
        if (status == Status.PENDING || status == Status.DECLINDED){
            return new ResponseEntity<>(status.toString(),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(v.toString(),HttpStatus.OK);
        }
    }
}
