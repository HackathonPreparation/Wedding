package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.models.dtos.EventCreationDTO;
import org.json.simple.JSONObject;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name = "Event.findEventByUUID", query = "SELECT p FROM Event p WHERE p.uuid = ?1"),
})
@Table(name = "events")
public class Event extends GenericModel implements Serializable {

    @Column(name = "name")
    private String name;
    
    @Column(name = "tables_count")
    private int tables_count;
    
    @Column(name = "tables_left")
    private int tables_left;
    
    @Column(name = "comments")
    private String comments;

    public Event(EventCreationDTO eventCreationDTO){
        uuid = UUID.randomUUID().toString();
        name = eventCreationDTO.getName();
        comments = eventCreationDTO.getComment();
        tables_count = 1; 
        tables_left = tables_count;
    }

    public Event(){

    }

    public String getName() {
        return name;
    }

    public int getTables_count() {
        return tables_count;
    }

    public int getTables_left() {
        return tables_left;
    }

    public String getComments() {
        return comments;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("uuid",uuid);
        json.put("name",name);
        json.put("comments",comments);
        json.put("tables_count",tables_count);
        json.put("tables_left",tables_left);
        return json;
    }
}
