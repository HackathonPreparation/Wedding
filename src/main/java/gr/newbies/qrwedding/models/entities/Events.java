package gr.newbies.qrwedding.models.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author SoUlKeePeR
 */
@Entity
@Table(name = "events")
public class Events implements Serializable {
    @Id
    private Long id;
    
    @Column (name = "uuid")
    private String uuid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "tables_count")
    private int tables_count;
    
    @Column(name = "table_left")
    private int table_left;
    
    @Column(name = "comments")
    private String comments;

    public Long getId() {
        return id;
    }

    public String getUuid() {
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
