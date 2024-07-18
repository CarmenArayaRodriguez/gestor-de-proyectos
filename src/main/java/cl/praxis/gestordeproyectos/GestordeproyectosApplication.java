package cl.praxis.gestordeproyectos;

import cl.praxis.gestordeproyectos.model.Persona;
import cl.praxis.gestordeproyectos.service.PersonaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GestordeproyectosApplication {

	public static void main(String[] args) {
		// Aquí se inicia el contexto de la aplicación
		ConfigurableApplicationContext contexto = SpringApplication.run(GestordeproyectosApplication.class, args);

		// Obteniendo el servicio del contexto de Spring
		PersonaService personaService = contexto.getBean(PersonaService.class);
		Persona persona = personaService.crearPersona();

		// Impresión de los datos de la persona
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Apellido: " + persona.getApellido());
		System.out.println("Edad: " + persona.getEdad());
	}
}

