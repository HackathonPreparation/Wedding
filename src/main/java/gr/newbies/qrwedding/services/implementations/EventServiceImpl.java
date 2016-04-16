package gr.newbies.qrwedding.services.implementations;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.models.dtos.EventUpdateDTO;
import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.repositories.EventRepository;
import gr.newbies.qrwedding.services.EventService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository repository;

    @Override
    public void create(EventCreationDTO eventCreationDTO) {
        UUID uuid = UUID.randomUUID();
        Event event = new Event(getNextID(),uuid,eventCreationDTO);
        repository.save(event);
    }

    @Override
    public Event findOne(String uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Event> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(EventUpdateDTO eventUpdateDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public long getNextID() {
        Long i = getCount();
        Long x = repository.getOne(i).getId();
        return x + 1L ;
    }

    @Override
    @Transactional
    public long getCount() {
        return repository.count();
    }
}
