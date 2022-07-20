package claudioServer.repository;

import claudioServer.model.Hard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardRepository extends JpaRepository<Hard, Long> {
}
