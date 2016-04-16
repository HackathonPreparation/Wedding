package gr.newbies.qrwedding.services;

import java.util.List;
import java.util.UUID;

public interface GeneralService<E> {    
    
    E create(E entity);
    
    E findOne(UUID uuid);
    
    List<E> findAll();

    boolean delete(UUID uuid);
}