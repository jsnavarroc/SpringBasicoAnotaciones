package co.com.ias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.ias.model.Persona;
import co.com.ias.services.PersonaServicesImpl;

@Configuration
public class AppConfig {
	@Bean(name="persona")
	public Persona persona() {
		return new Persona();
	}
	@Bean(name="personaServices")
	public PersonaServicesImpl personaServeces() {
		return new PersonaServicesImpl();
	}
}
