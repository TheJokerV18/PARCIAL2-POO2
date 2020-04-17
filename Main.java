package Nueve;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Persona> clientes = new ArrayList<>();

	static ArrayList<Propietario> propietarios = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i;

		Inmueble c1 = new Inmueble(200000, "calle 1 N# 31", "vendida");
		Inmueble c2 = new Inmueble(4000, "calle 34 N# 1556", "arrendada");
		Inmueble c3 = new Inmueble(10000, "calle 56 N# 7786", "en espera");
		Inmueble c4 = new Inmueble(5000000, "calle 120 N# 34651", "vendida");

		Persona p1 = new Persona("Andres", 26, 11, c1);
		Persona p2 = new Persona("Daniel", 26, 11, c2);
		Persona p3 = new Persona("Roberto", 26, 11, c3);
		Persona p4 = new Persona("Luis", 26, 11, c4);

		Propietario pro1 = new Propietario("Juan", 1100, "comprada", "2 años", c1);
		Propietario pro2 = new Propietario("Juan", 1100, "arrendando", "3 seamanas", c2);
		Propietario pro3 = new Propietario("Juan", 1100, "Esperando", "5 dias", c3);
		Propietario pro4 = new Propietario("Juan", 1100, "comprada", "1 año", c4);

		clientes.add(p1);
		clientes.add(p2);
		clientes.add(p3);
		clientes.add(p4);

		propietarios.add(pro1);
		propietarios.add(pro2);
		propietarios.add(pro3);
		propietarios.add(pro4);

		System.out.println("¿Que lista desea llamar?");
		System.out.println("1. Clientes.");
		System.out.println("2. Propietarios.");

		System.out.println(" ");

		i = sc.nextInt();

		System.out.println(" ");

		try {

			registros(i);

		} catch (

		Excepcion ex) {
			System.out.println("Invalid Operation Exception");
			System.out.println(ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception");
		} finally {
			System.out.println("End of transaction");
		}

	}

	public static void registros(int i) throws Excepcion {

		if (i == 1) {

			System.out.println("Registro de clientes: ");

			System.out.println(" ");

			for (Persona c : clientes) {

				System.out.println("Nombre: " + c.getNombre() + " ; " + "Edad: " + c.getEdad() + " ; " + "ID: "
						+ c.getId() + " ; " + "Valor, direccion y estado de la casa: " + " ; " + c.getCasa().getValor()
						+ " ; " + c.getCasa().getDireccion() + " ; " + c.getCasa().getEstado());

			}

		} else {

			if (i == 2) {

				System.out.println("Registro de propietarios: ");

				System.out.println(" ");

				for (Propietario p : propietarios) {

					System.out.println("Nombre: " + p.getNombre() + " ; " + "ID: " + p.getId() + " ; " + "Estado casa: "
							+ p.getEstadoCasa() + " ; " + "Tiempo que lleva trabajando: " + p.getTiempoTrabajo() + " ; "
							+ "Valor y direccion de la casa: " + p.getCasa().getValor() + " ; "
							+ p.getCasa().getDireccion());

				}

			} else {

				throw new Excepcion("La opcion no existe.");

			}

		}

	}

}
