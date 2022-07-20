package claudioServer.controller;


import claudioServer.model.Experiencia;
import claudioServer.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController

public class ExperienciaController {

    @Autowired
    private IExperienciaService experienciaService;

    @PostMapping("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp) {
        experienciaService.crearExperiencia(exp);
    }

    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia () {
        return experienciaService.verExperiencia();
    }

    @DeleteMapping ("/borrarExperiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
    }

    @PutMapping("/modExp/{id}")
    public List<Experiencia>modExp(@PathVariable Long id , @RequestBody @Valid Experiencia exp){
        Experiencia expe= experienciaService.buscarExperiencia(id);
        expe.setEmpleo(exp.getEmpleo());
        expe.setDescripcionEmpleo(exp.getDescripcionEmpleo());

        experienciaService.save(expe);

        return null;
    }

}
