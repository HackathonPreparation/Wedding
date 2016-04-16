package gr.newbies.qrwedding.repositories;

import gr.newbies.qrwedding.models.entities.Event;
import gr.newbies.qrwedding.models.entities.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor,Long>{
    
}
