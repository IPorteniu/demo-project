package goingto.com.Repository;

import goingto.com.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
