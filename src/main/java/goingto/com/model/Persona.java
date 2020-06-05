package goingto.com.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name= "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @NotEmpty
    @Column(name = "nombre",length = 50)
    private String nombre;
}
