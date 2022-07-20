package claudioServer.repository;


import claudioServer.model.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaRepository extends JpaRepository <Acerca, Long>{

}
