package claudioServer.service;

import claudioServer.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    List<Proyectos> verProyectos();
    void crearProyectos(Proyectos pro);
    void borrarProyectos(Long id);

    Proyectos buscarProyectos(Long id);

    void save(Proyectos pro);
}
