package claudioServer.controller;

import claudioServer.service.IAcercaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import claudioServer.model.Acerca;
import javax.validation.Valid;
import java.util.List;


@RestController
public class AcercaController {
    @Autowired
    private IAcercaService acercaService;

    @PostMapping("/new/persona")
    public void agregarPersona (@RequestBody Acerca ace) {
        acercaService.crearAcerca(ace);
    }

    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Acerca> verAcerca () {
        return acercaService.verAcerca();
    }

    @DeleteMapping ("/borrarPersona/{id}")
    public void borrarAcerca(@PathVariable Long id){
        acercaService.borrarAcerca(id);
    }

    @PutMapping("/actualizar/{id}")
    public List<Acerca>actualizarAcerca(@PathVariable Long id , @RequestBody @Valid Acerca ace){
        Acerca acer= acercaService.buscarAcerca(id);
        acer.setNombres(ace.getNombres());
        acer.setApellidos(ace.getApellidos());
        acer.setOcupacion(ace.getOcupacion());
        acer.setSobremi(ace.getSobremi());
        acer.setEmail(ace.getEmail());
        acer.setFechaNacimiento(ace.getFechaNacimiento());
        acercaService.save(acer);
        return null;
        }

    @PutMapping("/actualizarImgPerfil/{id}")
    public List <Acerca> actualizarImgPerfil(@PathVariable Long id , @RequestBody @Valid Acerca ace){
        Acerca acer = acercaService.buscarAcerca(id);
        acer.setImgPerfil(ace.getImgPerfil());
        acercaService.save(acer);
        return null;
        }

    @PutMapping("/actualizarImgRepresentativa/{id}")
    public List <Acerca> actualizarImgRepresentativa(@PathVariable Long id , @RequestBody @Valid Acerca ace){
        Acerca acer = acercaService.buscarAcerca(id);
        acer.setImgRepresentativa(ace.getImgRepresentativa());
        acercaService.save(acer);
        return null;
    }

}
