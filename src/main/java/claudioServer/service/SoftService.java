package claudioServer.service;

import claudioServer.model.Soft;
import claudioServer.repository.SoftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SoftService implements ISoftService{
    @Autowired
    public SoftRepository softRepo;

    @Override
    public List<Soft> verSoft() {
        return softRepo.findAll();
    }

    @Override
    public void crearSoft(Soft skl) {
        softRepo.save(skl);
    }

    @Override
    public void borrarSoft(Long id) {
        softRepo.deleteById(id);
    }

    @Override
    public Soft buscarSoft(Long id) {
        return softRepo.findById(id).orElse(null);
    }
    public void save(Soft skl) {softRepo.save(skl); }

}
