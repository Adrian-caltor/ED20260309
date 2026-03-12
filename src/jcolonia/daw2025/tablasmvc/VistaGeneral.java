package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VistaGeneral {

	private String título;

	private List<String> opciones;

	private static Scanner scIn;
	
	static {
		scIn = new Scanner(System.in);
	}
	
	public VistaGeneral (String título, List<String> opciones) {
		this.título = título;
		this.opciones= new Vector<String>();
		
		for (int i = 0; i < opciones.size(); i++) {
			this.opciones.add(opciones.get(i));
		}
		
	}
	
	public void mostrarTitulo1(String texto) {
		System.out.printf("%s \n", texto);
		for (int i=0; i < título.length(); i++) {
		System.out.printf("-");
		}
		System.out.println();
	}
	
	public void mostrarTitulo2(String texto) {
		System.out.printf("%s \n", texto);
		for (int i=0; i < título.length(); i++) {
		System.out.printf("=");
		}
		System.out.println();
	}
	
	public void mostrarOpciones(String texto) {
		for (int i = 0; i < opciones.size(); i++) {
			System.out.printf("%d. %s \n", i+1, opciones.get(i));
		}
		System.out.printf("0. Salir \n");
	}
	
	public static void mostrarAviso(String texto) {
		System.out.printf("\n %s", texto);
	}
	
	public static int pedirNúmero(String texto) {
		int opcion = -1;

	    while (opcion < 0 || opcion > opciones.size()) {
	        System.out.print("Escribe una opción (0-4): ");
	        
	        if (scIn.hasNextInt()) {
	            opcion = scIn.nextInt();
	        } else {
	            throw new ExcepcionES("No válido");
	            scIn.next();
	        }
	    }

	    return opcion;
	}
	
	public void pausa(String texto) {
	
	}
}
