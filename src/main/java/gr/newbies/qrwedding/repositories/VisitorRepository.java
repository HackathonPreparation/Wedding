package gr.newbies.qrwedding.repositories;

import gr.newbies.qrwedding.models.entities.Visitor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitorRepository extends GRepository<Visitor>{
    Visitor findVisitorByUUID(String uuid);
    List<Visitor> findVisitorsByEventUUID(String event_id);
}
