package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.extras.Status;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import org.json.simple.JSONArray;

public interface VisitorService extends GeneralService<Visitor>{
    Visitor create(VisitorCreationDTO visitorCreationDTO);
    JSONArray findVisitorsByEventId(String uuid);    
    Visitor updateStatus(String uuid,Status status);
    List<Visitor> findAllAccepted(String uuid_ev);
}
