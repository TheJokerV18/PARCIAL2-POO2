package Nueve;

import java.util.Scanner;

public class Persona {

	private String nombre;
	private Integer edad;
	private Integer id;
	private Inmueble casa;

	public Persona(String nombre, Integer edad, Integer id, Inmueble casa) {
		// TODO Auto-generated constructor stub

		this.casa = casa;
		this.edad = edad;
		this.id = id;
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Inmueble getCasa() {
		return casa;
	}

	public void setCasa(Inmueble casa) {
		this.casa = casa;
	}



}
