package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.extras.QRGenerator;
import gr.newbies.qrwedding.extras.Status;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.repositories.VisitorRepository;
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
    
    private QRGenerator myQR = new QRGenerator();
    
    @Autowired
    VisitorServiceImpl(VisitorRepository visitorRepository){
        repository = visitorRepository;
    }   
    
    @Override
    public Visitor create(VisitorCreationDTO visitorCreationDTO){
        String uuid = UUID.randomUUID().toString();
        String filePath = myQR.generateQR(uuid, visitorCreationDTO.getEventUUID());
        
        return super.create(new Visitor(visitorCreationDTO,uuid,filePath));
    }
    
    @Override
    public Visitor findOne(String uuid){ //ignores superclass findOne because its not needed here
        return ((VisitorRepository)repository).findVisitorByUUID(uuid);
    }
    
    public Visitor updateStatus(String uuid){
        return ((VisitorRepository)repository).updateVisitorByUUID(Status.ACCEPTED.getData(), uuid);
    }

    @Override
    public JSONArray findVisitorsByEventId(String uuid){
        JSONArray jsonArray = new JSONArray();
        List<Visitor> v = ((VisitorRepository)repository).findVisitorsByEventUUID(uuid);
        for (Visitor visitor: v) {
            JSONObject json = visitor.toJson();
            jsonArray.add(json);
        }
        return jsonArray;
    }
}