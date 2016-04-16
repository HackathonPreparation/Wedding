package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;

public interface EventService extends GeneralService<Event, 
        EventCreationDTO,EventUpdateDTO>{

}
