package co.com.ias.model;

import org.springframework.beans.factory.annotation.Value;

public class Persona {
	@Value("1")
	private int id;
	@Value("Johan")
	private String Nombres;
	@Value("Navarro")
	private String Apellindos;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellindos() {
		return Apellindos;
	}
	public void setApellindos(String apellindos) {
		Apellindos = apellindos;
	} 
	
}
