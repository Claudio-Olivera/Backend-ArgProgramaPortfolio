package claudioServer.service;


import claudioServer.model.Proyectos;
import claudioServer.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    public void save(Proyectos proyectos) {
        proRepo.save(proyectos);
    }

 }
