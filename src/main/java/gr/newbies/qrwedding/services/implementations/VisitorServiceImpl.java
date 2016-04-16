package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.dtos.VisitorUpdateDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.repositories.VisitorRepository;
import gr.newbies.qrwedding.services.GeneralServiceImpl;
import gr.newbies.qrwedding.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl extends GeneralServiceImpl<Visitor, 
        VisitorCreationDTO, VisitorUpdateDTO> implements VisitorService{
    
    @Autowired
    private VisitorRepository visitorRepository;
    
    VisitorServiceImpl(){
        repository = visitorRepository;
    }   
}