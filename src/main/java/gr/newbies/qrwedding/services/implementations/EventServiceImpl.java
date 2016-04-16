package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.repositories.GRepository;
import gr.newbies.qrwedding.services.EventService;
import gr.newbies.qrwedding.services.GeneralServiceImpl;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author SoUlKeePeR
 */
@Service
public class EventServiceImpl extends GeneralServiceImpl<Event, EventCreationDTO, EventUpdateDTO> implements EventService{
    
    EventServiceImpl(GRepository repository){
        super(repository);
    }
}
