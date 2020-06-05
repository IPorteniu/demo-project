package goingto.com.controller;

import goingto.com.Service.PersonaService;
import goingto.com.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;


    @GetMapping
    public List<Persona> listar(){
        return personaService.listarPersona();
    }

    @PostMapping public void agregar(@RequestBody Persona persona)
    {
        personaService.guardar(persona);
    }

    @PutMapping
    public void editar(@RequestBody Persona per){
        personaService.guardar(per);
    }

    @DeleteMapping(value ="/id_persona")
    public void eliminar(@PathVariable("id_persona") long id){
        personaService.eliminar(id);
    }

}
