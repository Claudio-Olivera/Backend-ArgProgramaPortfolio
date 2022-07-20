package claudioServer.service;

import claudioServer.model.Acerca;
import java.util.List;


public interface IAcercaService {

    List<Acerca> verAcerca();

    void crearAcerca(Acerca ace);

    void borrarAcerca(Long id);


    Acerca buscarAcerca(Long id);

    void save(Acerca ace);

}
