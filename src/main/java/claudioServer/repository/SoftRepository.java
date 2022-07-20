package claudioServer.repository;

import claudioServer.model.Soft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftRepository extends JpaRepository<Soft, Long> {
}
