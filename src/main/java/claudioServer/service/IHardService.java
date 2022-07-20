package claudioServer.service;
import claudioServer.model.Hard;
import java.util.List;

public interface IHardService {
    List<Hard> verHard();
    void crearHard(Hard skl);
    void borrarHard(Long id);
    Hard buscarHard(Long id);
    void save(Hard skill);
}
