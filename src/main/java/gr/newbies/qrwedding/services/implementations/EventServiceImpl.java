package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.repositories.EventRepository;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.GeneralServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl extends GeneralServiceImpl<Event, EventCreationDTO, EventUpdateDTO> 
        implements EventService{
        
    @Autowired
    EventServiceImpl(EventRepository eventRepository){
        repository = eventRepository;
    }
}
