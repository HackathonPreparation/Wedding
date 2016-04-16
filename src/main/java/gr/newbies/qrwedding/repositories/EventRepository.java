package gr.newbies.qrwedding.repositories;

import gr.newbies.qrwedding.models.entities.Event;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventRepository extends GRepository<Event>{

    @Modifying
    @Query("UPDATE Event p SET p.tables_count = ?1,p.tables_left = ?2,p.name = ?3, p.comments = ?4 WHERE p.uuid = ?5")
    void updateEventByUUID(int tables_count, int tables_left,String name, String comment,UUID uuid);
}