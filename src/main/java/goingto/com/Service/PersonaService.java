package goingto.com.Service;

import goingto.com.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    public List<Persona> listarPersona();
    public void guardar(Persona persona);
    public void eliminar(Long id);
    public Persona encontrarPersona(Persona persona);
    Optional<Persona> encontrarPersona2(Long id);

}
