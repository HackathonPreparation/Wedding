package gr.newbies.qrwedding.models.entities;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event extends GenericModel implements Serializable {
    
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
