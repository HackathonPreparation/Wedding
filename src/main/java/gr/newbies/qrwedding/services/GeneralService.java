package gr.newbies.qrwedding.services;

import java.util.List;
import java.util.UUID;

public interface GeneralService<E,DC, DU > {    
    
     boolean create(DC eventCreationDTO);
    
    E findOne(UUID uuid);
    
    List<E> findAll();
        
    boolean update(DU eventUpdateDTO);
    
    boolean delete(UUID uuid);
}
