package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * Es la vista general del programa con los métodos
 */

public class VistaGeneral {
	
	/**
	 * Lista para guardar todas las opciones del menú
	 */
	
	private List<String> opciones;
	
	/**
	 * Scanner del programa
	 */
	
	private static Scanner scIn;

	static {
		scIn = new Scanner(System.in);
	}

	/**
	 * Constructor de la clase para añadir las opciones a la lista del programa
	 * 
	 * @param opciones del menu
	 */
	
	public VistaGeneral( List<String> opciones) {
		this.opciones = new Vector<String>();

		for (int i = 0; i < opciones.size(); i++) {
			this.opciones.add(opciones.get(i));
		}
	}

	/**
	 * Muestra el título del menú y coloca lineas debajo de los caracteres.
	 * @param texto título del menú
	 */
	
	public void mostrarTitulo1(String texto) {
		System.out.printf("%s\n", texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	/**
	 * Muestra el subTítulo del menú y coloca "=" debajo.
	 * @param texto subTítulo
	 */
	public void mostrarTitulo2(String texto) {
		System.out.printf("%s\n", texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	/**
	 * Muestra las opciones seleccionables del menú
	 */
	
	public void mostrarOpciones() {
		for (int i = 0; i < opciones.size(); i++) {
			System.out.printf("%d. %s\n", i + 1, opciones.get(i));
		}
		System.out.println("0. Salir");
	}

	/**
	 * Nos muestra un aviso
	 * @param texto
	 */
	
	public static void mostrarAviso(String texto) {
		System.out.printf("\n%s\n", texto);
	}

	/**
	 * Método que solicita un número para ejecutar otro método del programa y usar sus funcionalidades
	 * Usa Excepciones personalizadas para evitar 
	 * @param texto de pedir opción
	 * @return opcion seleccionada
	 * @throws ExcepcionES personalizada
	 */
	
	public static int pedirNumero(String texto) {
		int opcion;

		System.out.print(String.format("%s: ", texto));

		while (!scIn.hasNextInt()) {
		System.out.println("Número no válido.");
		scIn.next();
		System.out.print(String.format("%s: ", texto));
		}

		opcion = scIn.nextInt();
		return opcion;
		}

	/**
	 * Muestra un texto de pausa y para el programa
	 * @param texto de pausa
	 */
	
	public void pausa(String texto) {
		System.out.println(texto);
		scIn.nextLine();
	}
}