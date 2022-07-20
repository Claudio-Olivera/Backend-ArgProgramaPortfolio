package claudioServer.service;

import claudioServer.model.Educacion;
import claudioServer.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {return eduRepo.findAll();}

    @Override
    public void crearEducacion(Educacion edu) {eduRepo.save(edu);}

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    public void save(Educacion educacion) {
        eduRepo.save(educacion);
    }

}
