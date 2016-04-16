package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EventService {
    void create(EventCreationDTO eventCreationDTO);
    
    Event findOne(String uuid);
    
    List<Event> findAll();
        
    boolean update(EventUpdateDTO eventUpdateDTO);
    
    boolean delete(String uuid);

    public long getNextID();

    @Transactional
    long getCount();
}
