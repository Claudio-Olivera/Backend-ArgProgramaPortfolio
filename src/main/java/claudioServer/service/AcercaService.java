package claudioServer.service;

import claudioServer.model.Acerca;
import claudioServer.repository.AcercaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcercaService implements IAcercaService {
    @Autowired
    public AcercaRepository acercaRepository;

    @Override
    public List<Acerca> verAcerca() {return acercaRepository.findAll();}

    @Override
    public void crearAcerca(Acerca ace) { acercaRepository.save(ace);}

    @Override
    public void borrarAcerca(Long id) {
        acercaRepository.deleteById(id);
    }

    @Override
    public Acerca buscarAcerca(Long id) {
        return acercaRepository.findById(id).orElse(null);
    }

    public void save(Acerca acerca) {
        acercaRepository.save(acerca);
    }

}
