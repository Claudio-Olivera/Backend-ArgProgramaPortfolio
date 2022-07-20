package claudioServer.controller;
import claudioServer.model.Soft;
import claudioServer.service.ISoftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class SoftController {
    @Autowired
    private ISoftService SoftService;

    @PostMapping("/new/Soft")
    public void agregarSoft (@RequestBody Soft skl) {
        SoftService.crearSoft(skl);
    }

    @GetMapping("/ver/Soft")
    @ResponseBody
    public List<Soft> verSoft () {
        return SoftService.verSoft();
    }

    @DeleteMapping ("/borrarSoft/{id}")
    public void borrarSoft(@PathVariable Long id){
        SoftService.borrarSoft(id);
    }

    @PutMapping("/modSoft/{id}")
    public List<Soft>modSoft(@PathVariable Long id , @RequestBody @Valid Soft skl){
        Soft skill= SoftService.buscarSoft(id);
        skill.setSoftTitulo(skl.getSoftTitulo());
        skill.setSoftDescripcion(skl.getSoftDescripcion());
        skill.setIcono(skl.getIcono());
        SoftService.save(skill);
        return null;
    }



}
