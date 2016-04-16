package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import java.util.List;

/**
 *
 * @author SoUlKeePeR
 */
public interface VisitorService {
    boolean create(EventCreationDTO eventCreationDTO);
    
    Event findOne(String uuid);
    
    List<Event> findAll();
        
    boolean update(EventUpdateDTO eventUpdateDTO);
    
    boolean delete(String uuid);    
}
