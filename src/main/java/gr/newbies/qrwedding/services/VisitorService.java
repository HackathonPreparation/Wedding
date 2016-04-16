package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import gr.newbies.qrwedding.models.dtos.VisitorUpdateDTO;
import gr.newbies.qrwedding.models.entities.Visitor;

public interface VisitorService extends GeneralService<Visitor>{
    Visitor create(VisitorCreationDTO visitorCreationDTO);
    boolean update(VisitorUpdateDTO visitorUpdateDTO);
}
