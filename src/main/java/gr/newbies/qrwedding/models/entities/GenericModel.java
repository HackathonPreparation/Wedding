package gr.newbies.qrwedding.models.entities;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GenericModel {    
    @Id
    private Long id;
    
    public Long getId() {
        return id;
    }
}
