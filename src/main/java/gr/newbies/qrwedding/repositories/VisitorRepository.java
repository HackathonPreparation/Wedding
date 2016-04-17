package gr.newbies.qrwedding.repositories;

import gr.newbies.qrwedding.models.entities.Visitor;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface VisitorRepository extends GRepository<Visitor>{
    Visitor findVisitorByUUID(String uuid);
    List<Visitor> findVisitorsByEventUUID(String event_id);
    
    @Modifying
    @Query("update Visitor u set u.status = ?1 where u.uuid = ?2")
    Visitor updateVisitorByUUID(String status, String uuid);
}