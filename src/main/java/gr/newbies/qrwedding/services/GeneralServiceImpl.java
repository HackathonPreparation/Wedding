package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.repositories.GRepository;
import java.util.List;
import javax.transaction.Transactional;

public abstract class GeneralServiceImpl<E> 
        implements GeneralService<E>{
    
    protected GRepository repository;
    
    public GeneralServiceImpl() {
    }
    
    @Transactional
    @Override
    public E create(E entity) {
        return (E)repository.save(entity);
    }
    
    @Transactional
    @Override
    public E findOne(String uuid) {
        return (E)repository.findOne(uuid);
    }

    @Transactional
    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public boolean delete(String uuid) {
        repository.delete(uuid);
        return true;
    }
}