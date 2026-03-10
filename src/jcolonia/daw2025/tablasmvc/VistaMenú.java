package jcolonia.daw2025.tablasmvc;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * Clase que muestra el menú a los usuarios
 */

public class VistaMenú extends VistaGeneral {
	
	/**
	 * Título del menú
	 */
	
	private String título;
	
	/**
	 * Lista con todas las opciones del menú
	 */
	
	private List<String> opciones;
	
	/**
	 * Scanner para leer las opciones.
	 */
	
	private static Scanner scIn;
	
	static {
		scIn = new Scanner(System.in);
	}

	/**
	 * Constructor que añade las opciones a la lista de la clase y pone el título del
	 * programa igual al título que queremos.
	 * 
	 * @param título para mostrar
	 * @param opciones opciones para mostrar
	 */
	
	public VistaMenú (String título, List<String> opciones) {
		this.título = título;
		this.opciones= new Vector<String>();
		
		for (int i = 0; i < opciones.size(); i++) {
			this.opciones.add(opciones.get(i));
		}
		
	}
	
	/**
	 * Nos muestra el título del programa.
	 */
	
	public void mostrarTitulo() {
		System.out.printf("%s \n", título);
		for (int i=0; i < título.length(); i++) {
		System.out.printf("-");
		}
	}
	
	/**
	 * Nos muestran las opciones del menú y salir.
	 */
	
	public void mostrarOpciones() {
		for (int i = 0; i < opciones.size(); i++) {
			System.out.printf("%d. %s \n", i+1, opciones.get(i));
		}
		System.out.printf("0. Salir \n");
		
	}
	
	/**
	 * Lee la opción que solicitemos.
	 * @return opcion escrita.
	 */
	
	public int pedirOpción() {
	    int opcion = -1;

	    while (opcion < 0 || opcion > opciones.size()) {
	        System.out.print("Escribe una opción (0-4): ");
	        
	        if (scIn.hasNextInt()) {
	            opcion = scIn.nextInt();
	        } else {
	            System.out.println("No válido");
	            scIn.next();
	        }
	    }

	    return pedirOpción();
	}
	
	/**
	 * Nos devuelve el texto correspondiente a la opción.
	 * @param texto esperado
	 */
	public void mostrarTexto(String texto) {
		System.out.println(texto);
	}
}
