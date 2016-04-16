package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.extras.Status;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "visitors")
public class Visitor extends GenericModel implements Serializable {
    
    @Column(name = "uuid")
    private UUID uuid;
    
    @Column(name = "event_id")
    private Long event_id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "status")
    private Status status;
    
    @Column(name ="table_reg")
    private int table_reg;

    public UUID getUuid() {
        return uuid;
    }

    public Long getEvent_id() {
        return event_id;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public int getTable_reg() {
        return table_reg;
    }  
}
