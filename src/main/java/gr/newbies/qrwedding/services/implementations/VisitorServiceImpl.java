package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.extras.QRGenerator;
import gr.newbies.qrwedding.extras.Status;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.repositories.VisitorRepository;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.GeneralServiceImpl;
import gr.newbies.qrwedding.services.VisitorService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VisitorServiceImpl extends GeneralServiceImpl<Visitor>
        implements VisitorService{
    
    @Autowired
    EventService eventService;
    
    private QRGenerator myQR = new QRGenerator();
    
    @Autowired
    VisitorServiceImpl(VisitorRepository visitorRepository){
        repository = visitorRepository;
    }   
    
    @Override
    public Visitor create(VisitorCreationDTO visitorCreationDTO){
        if(visitorCreationDTO.getEventUUID() == null || visitorCreationDTO.getName() == null) {
            return null;
        }
        
        if(eventService.findOne(visitorCreationDTO.getEventUUID()) == null){
            return null;
        }
        
        String uuid = UUID.randomUUID().toString();
        String filePath = myQR.generateQR(uuid, visitorCreationDTO.getEventUUID());
        
        return super.create(new Visitor(visitorCreationDTO,uuid,filePath));
    }
    
    @Override
    public Visitor findOne(String uuid){ //ignores superclass findOne because its not needed here
        return ((VisitorRepository)repository).findVisitorByUUID(uuid);
    }
    
    @Override
    public Visitor updateStatus(String uuid, Status status){
        if(((VisitorRepository)repository).findVisitorByUUID(uuid) == null){
            return null;
        }
        return ((VisitorRepository)repository).updateVisitorByUUID(status.getData(), uuid);
    }

    @Override
    public JSONArray findVisitorsByEventId(String uuid){
        JSONArray jsonArray = new JSONArray();
        List<Visitor> v = ((VisitorRepository)repository).findVisitorsByEventUUID(uuid);
        
        if(v == null || v.isEmpty()){
            return null;
        }
        
        for (Visitor visitor: v) {
            JSONObject json = visitor.toJson();
            jsonArray.add(json);
        }
        return jsonArray;
    }
    
    @Override
    public boolean delete(Visitor e){
        if (e == null) {
            return false;
        }
        return super.delete(e);
    }
    
    @Override
    public List<Visitor> findAllAccepted(String uuid_ev) {
        return ((VisitorRepository)repository).findAcceptedVisitorsByEventUUID(uuid_ev, Status.ACCEPTED.getData());
    }
}