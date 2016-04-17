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
public class EventServiceImpl extends GeneralServiceImpl<Event> 
        implements EventService{
    
    @Autowired
    EventServiceImpl(EventRepository eventRepository){
        repository = eventRepository;
    }

    @Override
    public Event create(EventCreationDTO eventCreationDTO) {
        if(eventCreationDTO.getName() == null || eventCreationDTO.getComment() == null){
            return null;
        }
        return super.create(new Event(eventCreationDTO));
    }

    @Override
    public Event findOne(String uuid) {
        return ((EventRepository)repository).findByUuid(uuid);
    }
    
    @Override
    public boolean delete(Event e){
        if (e == null) {
            return false;
        }
        return super.delete(e);
    }
    
    @Override
    public boolean update(EventUpdateDTO eventUpdateDTO){
        if(((EventRepository)repository).findByUuid(eventUpdateDTO.getUuid())==null){
            return false;
        }
        
        ((EventRepository)repository).updateEventByUUID(eventUpdateDTO.getSeats(),
                eventUpdateDTO.getSeats(),eventUpdateDTO.getName(),
                eventUpdateDTO.getComment(),eventUpdateDTO.getUuid());
        return true;
    }
}