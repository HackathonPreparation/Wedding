package gr.newbies.qrwedding.models.entities;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
        @NamedQuery(name = "Event.findEventByUUID", query = "SELECT p FROM Event p WHERE p.uuid = ?1")
})
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
