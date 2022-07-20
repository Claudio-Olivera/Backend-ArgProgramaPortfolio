package claudioServer.service;

import claudioServer.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

     List<Experiencia> verExperiencia();

    void crearExperiencia(Experiencia exp);

    void borrarExperiencia(Long id);

    Experiencia buscarExperiencia(Long id);

    void save(Experiencia exp);




}
