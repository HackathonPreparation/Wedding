package gr.newbies.qrwedding.models.entities;

import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class GenericModel {            
    @Id
    UUID uuid;

    public UUID getUuid() {
        return uuid;
    }
}