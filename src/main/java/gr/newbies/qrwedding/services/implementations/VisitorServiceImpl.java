package gr.newbies.qrwedding.services.implementations;

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

@Service
public class VisitorServiceImpl extends GeneralServiceImpl<Visitor>
        implements VisitorService{
    
    @Autowired
    VisitorServiceImpl(VisitorRepository visitorRepository){
        repository = visitorRepository;
    }   
    
    @Override
    public Visitor create(VisitorCreationDTO visitorCreationDTO) {
        System.out.println(visitorCreationDTO.getEventUUID());
        System.out.println(visitorCreationDTO.getName());
        return super.create(new Visitor(visitorCreationDTO));
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