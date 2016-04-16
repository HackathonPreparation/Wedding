package gr.newbies.qrwedding.repositories;

import gr.newbies.qrwedding.models.entities.Visitor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface VisitorRepository extends GRepository<Visitor>{
    Visitor findByUuid(UUID uuid);
    List<Visitor> findByEventUuid(UUID event_uuid);
}
