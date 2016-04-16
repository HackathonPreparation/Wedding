package gr.newbies.qrwedding.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GRepository<A> extends JpaRepository<A,Long> {
    
}
