package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "Event.findEventByUUID", query = "SELECT p FROM Event p WHERE p.uuid = ?1"),
        @NamedQuery(name = "Event.updateEventByUUID", query = "UPDATE Event p SET p.tables_count = ?2,p.tables_left = ?3,p.name = ?4, p.comments = ?5 WHERE p.uuid = ?1")
})
@Entity
@Table(name = "events")
public class Event extends GenericModel implements Serializable {

    @Column(name = "name")
    private String name;
    
    @Column(name = "tables_count")
    private int tables_count;
    
    @Column(name = "tables_left")
    private int table_left;
    
    @Column(name = "comments")
    private String comments;

    public Event(EventCreationDTO eventCreationDTO){
        uuid = UUID.randomUUID();
        name = eventCreationDTO.getName();
        comments = eventCreationDTO.getComment();
        tables_count = 1;
        table_left = tables_count;
    }

    public Event(){

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
