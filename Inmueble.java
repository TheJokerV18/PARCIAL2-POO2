package Nueve;

public class Inmueble {

	private Integer valor;
	private String direccion;
	private String estado;

	public Inmueble(Integer valor, String direccion, String estado) {
		// TODO Auto-generated constructor stub

		this.valor = valor;
		this.direccion = direccion;
		this.estado = estado;

	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
