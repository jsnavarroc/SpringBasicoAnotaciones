package co.com.ias;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import co.com.ias.model.Persona;
import co.com.ias.services.PersonaServicesImpl;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Persona per = (Persona) context.getBean("persona");
		System.out.println(">>"+per.getNombres());
		
		PersonaServicesImpl services = (PersonaServicesImpl) context.getBean("personaServices");
		services.crear();
		
		context.close();
	}
}
