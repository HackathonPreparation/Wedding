package gr.newbies.qrwedding.models.entities;

import gr.newbies.qrwedding.extras.Status;
import gr.newbies.qrwedding.models.dtos.VisitorCreationDTO;
import org.json.simple.JSONObject;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "Visitor.findVisitorByUUID", query = "SELECT p FROM Visitor p WHERE p.uuid = ?1"),
    @NamedQuery(name = "Visitor.findVisitorsByEventUUID", query = "SELECT p FROM Visitor p WHERE p.event_id = ?1")
})
@Table(name = "visitors")
public class Visitor extends GenericModel implements Serializable {

    @Column(name = "event_id")
    private String event_id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "table_reg")
    private int table_reg;

    @Column(name = "image_path")
    private String image_path;
    
    public Visitor() {
    }

    public Visitor(VisitorCreationDTO visitorCreationDTO,String uuid, String image_path){
        this.uuid = uuid;
        name = visitorCreationDTO.getName();
        event_id = visitorCreationDTO.getEventUUID();
        status = Status.PENDING.getData();
        this.image_path = image_path;
    }

    public String getName() {
        return name;
    }

    public String getEvent_id() {
        return event_id;
    }

    public String getStatus() {
        return status;
    }

    public int getTable_reg() {
        return table_reg;
    }

    public String getImage_path() {
        return image_path;
    }
    
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("uuid",uuid);
        json.put("name",name);
        json.put("event_id",event_id);
        json.put("status",status);
        json.put("table_reg",table_reg);
        json.put("image_path",image_path);
        return json;
    }
}