package Nueve;

public class Propietario {

	private String nombre;
	private Integer id;
	private String estadoCasa; // si la casa esta vendida, arrendada o en espera
	private String tiempoTrabajo; // Tiempo que lleva trabajando con la inmobiliaria
	private Inmueble casa;

	public Propietario(String nombre, Integer id, String estadoCasa, String tiempoTrabajo, Inmueble casa) {

		this.estadoCasa = estadoCasa;
		this.id = id;
		this.nombre = nombre;
		this.tiempoTrabajo = tiempoTrabajo;
		this.casa = casa;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstadoCasa() {
		return estadoCasa;
	}

	public void setEstadoCasa(String estadoCasa) {
		this.estadoCasa = estadoCasa;
	}

	public String getTiempoTrabajo() {
		return tiempoTrabajo;
	}

	public void setTiempoTrabajo(String tiempoTrabajo) {
		this.tiempoTrabajo = tiempoTrabajo;
	}

	public Inmueble getCasa() {
		return casa;
	}

	public void setCasa(Inmueble casa) {
		this.casa = casa;
	}

}
