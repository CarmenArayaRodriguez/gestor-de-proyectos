package cl.praxis.gestordeproyectos.controller;

import cl.praxis.gestordeproyectos.model.Persona;
import cl.praxis.gestordeproyectos.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PersonaController {

        @Autowired
        private PersonaService personaService;

        // Manejar la ruta base con valores predeterminados
        @GetMapping("/persona")
        public String saludoPersonaBase(Model model) {
            // Obtiene los valores predeterminados de la persona
            Persona persona = personaService.crearPersona();
            model.addAttribute("nombre", persona.getNombre());
            model.addAttribute("apellido", persona.getApellido());
            model.addAttribute("edad", persona.getEdad());

            // Imprime la información en la consola
            System.out.println("Accediendo a la informacion de: " + persona.getNombre() + " " +
                    persona.getApellido() + " de " + persona.getEdad() + " anios");


            return "index";
        }

        // Método original con parámetros
        @GetMapping("/persona/{nombre}/{apellido}/{edad}")
        public String saludoPersona(@PathVariable String nombre,
                                    @PathVariable String apellido,
                                    @PathVariable int edad,
                                    Model model) {
            model.addAttribute("nombre", nombre);
            model.addAttribute("apellido", apellido);
            model.addAttribute("edad", edad);
            System.out.println("Accediendo a la informacion de: " + nombre + " " + apellido + " de " + edad + " anios");
            return "index";
        }
    }


