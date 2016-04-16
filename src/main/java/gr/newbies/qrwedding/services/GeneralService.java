package gr.newbies.qrwedding.services;

import java.util.List;

public interface GeneralService<E> {    
    
    E create(E entity);
    
    E findOne(String uuid);
    
    List<E> findAll();

    boolean delete(String uuid);
}