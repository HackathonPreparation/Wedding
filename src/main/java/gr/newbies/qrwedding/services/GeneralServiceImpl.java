package gr.newbies.qrwedding.services;

import gr.newbies.qrwedding.repositories.GRepository;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;

public abstract class GeneralServiceImpl<E> 
        implements GeneralService<E>{
    
    protected GRepository repository;
    
    public GeneralServiceImpl() {
    }
    
    @Transactional
    @Override
    public E create(E entity) {
        System.out.println("before");
        E e = (E)repository.save(entity);
        System.out.println("after");
        System.out.println("->" + e.toString());
        System.out.println("is it here?");
//        return (E)repository.save(entity);
        return null;
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
