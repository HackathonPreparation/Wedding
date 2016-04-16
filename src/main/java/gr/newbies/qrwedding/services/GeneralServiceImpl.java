package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import gr.newbies.qrwedding.repositories.GRepository;
import java.util.List;
import java.util.UUID;

public abstract class GeneralServiceImpl<E, DC, DU> 
        implements GeneralService<E, DC, DU>{
    
    GRepository repository;
    
    protected GeneralServiceImpl(GRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public boolean create(DC dc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public E findOne(UUID uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DU eventUpdateDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(UUID uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
