package claudioServer.controller;

import claudioServer.model.Proyectos;
import claudioServer.service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProyectosController {

    @Autowired
    private IProyectosService ProyectosService;

    @PostMapping("/new/Proyectos")
    public void agregarProyectos (@RequestBody Proyectos pro) {
        ProyectosService.crearProyectos(pro);
    }

    @GetMapping("/ver/Proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos () {
        return ProyectosService.verProyectos();
    }

    @DeleteMapping ("/borrarProyectos/{id}")
    public void borrarProyectos(@PathVariable Long id){
        ProyectosService.borrarProyectos(id);
    }

    @PutMapping("/modProyectos/{id}")
    public List<Proyectos>actualizarProyecto(@PathVariable Long id , @RequestBody @Valid Proyectos pro){
        Proyectos pros= ProyectosService.buscarProyectos(id);
        pros.setProNombre(pro.getProNombre());
        pros.setProFecha(pro.getProFecha());
        pros.setProLink(pro.getProLink());
        pros.setProDescripcion(pro.getProDescripcion());
        ProyectosService.save(pros);
        return null;
    }

    @PutMapping("/modImgProyectos/{id}")
    public List<Proyectos>modImgProyectos(@PathVariable Long id , @RequestBody @Valid Proyectos pro){
        Proyectos pros= ProyectosService.buscarProyectos(id);
        pros.setProImg(pro.getProImg());
        ProyectosService.save(pros);
        return null;
    }


}
