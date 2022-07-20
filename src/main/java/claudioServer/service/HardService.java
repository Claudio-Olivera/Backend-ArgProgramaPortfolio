package claudioServer.service;

import claudioServer.model.Hard;
import claudioServer.repository.HardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HardService implements IHardService {
    @Autowired
    public HardRepository hardRepo;

    @Override
    public List<Hard> verHard() {
        return hardRepo.findAll();
    }

    @Override
    public void crearHard(Hard skl) {
        hardRepo.save(skl);
    }

    @Override
    public void borrarHard(Long id) {
        hardRepo.deleteById(id);
    }

    @Override
    public Hard buscarHard(Long id) {
        return hardRepo.findById(id).orElse(null);
    }
    public void save(Hard skl) {hardRepo.save(skl); }

}
