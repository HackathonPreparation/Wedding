package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.repositories.EventRepository;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.GeneralServiceImpl;
import gr.newbies.qrwedding.services.tools.FileWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EventServiceImpl extends GeneralServiceImpl<Event> 
        implements EventService{
    
    FileWorker FW = new FileWorker();
    
    @Autowired
    EventServiceImpl(EventRepository eventRepository){
        repository = eventRepository;
    }
    
    /**
     * registration of a new event
     * @param eventCreationDTO
     * @return 
     */
    @Override
    public Event create(EventCreationDTO eventCreationDTO) {
        if(eventCreationDTO.getName() == null || eventCreationDTO.getComment() == null){
            return null;
        }
        return super.create(new Event(eventCreationDTO));
    }
    
    /**
     * returns an event by a uuid
     * @param uuid
     * @return 
     */
    @Override
    public Event findOne(String uuid) {
        return ((EventRepository)repository).findByUuid(uuid);
    }
    
    /**
     * returns true if event have been deleted
     * returns false if the event parameter is null 
     * @param e
     * @return 
     */
    @Override
    public boolean delete(Event e){
        if (e == null) {
            return false;
        }
        FW.deleteFolder(e.getUuid());
        return super.delete(e);
    }
    
    /**
     * returns true every time that update is successful
     * returns false if the event DTO is not found or if it is null
     * @param eventUpdateDTO
     * @return 
     */
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
