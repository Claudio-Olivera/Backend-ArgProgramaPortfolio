package claudioServer.service;
import claudioServer.model.Soft;
import java.util.List;

public interface ISoftService {
    List<Soft> verSoft();
    void crearSoft(Soft skl);
    void borrarSoft(Long id);
    Soft buscarSoft(Long id);
    void save(Soft skill);
}
