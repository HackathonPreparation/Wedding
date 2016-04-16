package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.dtos.VisitorUpdateDTO;
import gr.newbies.qrwedding.models.entities.Visitor;
import gr.newbies.qrwedding.repositories.GRepository;
import gr.newbies.qrwedding.services.GeneralServiceImpl;
import gr.newbies.qrwedding.services.VisitorService;
import org.springframework.stereotype.Service;

@Service
public class VisitorServiceImpl extends GeneralServiceImpl<Visitor, 
        VisitorCreationDTO, VisitorUpdateDTO> implements VisitorService{
    
    VisitorServiceImpl(GRepository repository){
        super(repository);
    }
   
}