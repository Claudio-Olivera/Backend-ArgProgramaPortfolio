package claudioServer.controller;



import claudioServer.model.Educacion;
import claudioServer.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EducacionController {
    @Autowired
    private IEducacionService educacionService;

    @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu) {
        educacionService.crearEducacion(edu);
    }

    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion () {
        return educacionService.verEducacion();
    }

    @DeleteMapping ("/borrarEducacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
    }

    @PutMapping("/modEducacion/{id}")
    public List<Educacion>actualizarEducacion(@PathVariable Long id , @RequestBody @Valid Educacion edu){
        Educacion educ= educacionService.buscarEducacion(id);
        educ.setNivelEducativo(edu.getNivelEducativo());
        educ.setTitulo(edu.getTitulo());
        educ.setInstitucion(edu.getInstitucion());

        educacionService.save(educ);
        return null;
    }




}
