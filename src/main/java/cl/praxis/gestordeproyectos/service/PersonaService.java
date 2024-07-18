package cl.praxis.gestordeproyectos.service;

import cl.praxis.gestordeproyectos.model.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    public Persona crearPersona() {
        return new Persona("Carmen", "Araya", 42);
    }
}
