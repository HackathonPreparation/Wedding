package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.repositories.GRepository;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;

public abstract class GeneralServiceImpl<E, DC, DU> 
        implements GeneralService<E, DC, DU>{
    
    protected GRepository repository;
    
    public GeneralServiceImpl() {
    }
    
    @Transactional
    @Override
    public boolean create(DC dc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Transactional
    @Override
    public E findOne(UUID uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public boolean update(DU eventUpdateDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public boolean delete(UUID uuid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
