package goingto.com.Service.impl;

import goingto.com.Repository.PersonaRepository;
import goingto.com.Service.PersonaService;
import goingto.com.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersona() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public void guardar(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminar(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        return personaRepository.findById(persona.getId_persona()).orElse(null);
    }

    @Override
    public Optional<Persona> encontrarPersona2(Long id) {
        return personaRepository.findById(id);
    }
}
