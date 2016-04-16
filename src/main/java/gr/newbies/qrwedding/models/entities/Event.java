package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event implements Serializable {
    @Id
    private Long id;
    
    @Column (name = "uuid")
    private UUID uuid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "tables_count")
    private int tables_count;
    
    @Column(name = "table_left")
    private int table_left;
    
    @Column(name = "comments")
    private String comments;

    public Event(long id, UUID uuid, EventCreationDTO dto){
        this(id,uuid,dto.getName(),dto.getComment());
    }

    public Event(long id, UUID uuid,String name,String comment){
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.comments = comment;
    }

    public Long getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getTables_count() {
        return tables_count;
    }

    public int getTable_left() {
        return table_left;
    }

    public String getComments() {
        return comments;
    }
    
    
}
