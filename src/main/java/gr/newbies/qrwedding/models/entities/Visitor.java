package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.extras.Status;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "visitors")
public class Visitor extends GenericModel implements Serializable {

    @Column(name = "event_id")
    private UUID event_uuid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "status")
    private Status status;
    
    @Column(name ="table_reg")
    private int table_reg;

    //TODO QR IMAGE PATH

    public Visitor(VisitorCreationDTO visitorCreationDTO){
        uuid = UUID.randomUUID();
        name = visitorCreationDTO.getName();
        event_uuid = visitorCreationDTO.getEventUUID();
        //TODO create QR here
    }

    public String getName() {
        return name;
    }

    public UUID getEvent_uuid() {
        return event_uuid;
    }

    public Status getStatus() {
        return status;
    }

    public int getTable_reg() {
        return table_reg;
    }  
}
