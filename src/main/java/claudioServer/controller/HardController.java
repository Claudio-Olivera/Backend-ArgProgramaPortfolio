package claudioServer.controller;

import claudioServer.model.Hard;
import claudioServer.service.IHardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HardController {

    @Autowired
    private IHardService HardService;

    @PostMapping("/new/Hard")
    public void agregarSkills (@RequestBody Hard skl) {
        HardService.crearHard(skl);
    }

    @GetMapping("/ver/Hard")
    @ResponseBody
    public List<Hard> verSkills () {
        return HardService.verHard();
    }

    @DeleteMapping ("/borrarHard/{id}")
    public void borrarSkills(@PathVariable Long id){
        HardService.borrarHard(id);
    }

    @PutMapping("/modHard/{id}")
    public List<Hard>modSkills(@PathVariable Long id , @RequestBody @Valid Hard skl){
        Hard skill= HardService.buscarHard(id);
        skill.setCirculo(skl.getCirculo());
        skill.setIcono(skl.getIcono());
        skill.setNombre(skl.getNombre());
        skill.setColor(skl.getColor());
        HardService.save(skill);

        return null;
    }


}
