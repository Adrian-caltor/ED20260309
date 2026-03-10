package jcolonia.daw2025.tablasmvc;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para generar y otras opciones de la tabla de multiplicar
 */

public class TablaMultiplicar {

	/**
	 * Número para usar
	 */
	
	private int número;
	
	/**
	 * Lista para llenar con las lineas de la tabla de multiplicar
	 */
	
	private List<String> listaTextos;
	
	/**
	 * Constructor para inicializar las variables
	 * @param número a multiplicar
	 */
	
	public TablaMultiplicar(int número) {
		this.número = número;
		listaTextos = new ArrayList<>();
	}
	
	/**
	 * Genearador de tabla mediante bucle
	 */
	
	public void generarTabla() {
		listaTextos.clear();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = número * i;
			String linea = número + " x " + i + " = " + resultado;
			listaTextos.add(linea);
		}
	}
	
	/**
	 * Devuelve una copia de la lista original
	 * @return Tabla de Multiplicar en formato de exportación
	 */
	
	public List<String> toListaExportación() {
		List<String> listaExportacion = new ArrayList<>();
		    
		for (String linea : listaTextos) {
			listaExportacion.add(linea);
		}
		    
		return listaExportacion;
	}
	
	/**
	 * Crea una tabla de multiplicar para mostrar por pantalla
	 * @return Tabla de multiplicar por pantalla
	 */
	public List<String> toListaPantalla() {
		List<String> listaPantalla = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = número * i;
			listaPantalla.add(número + " x " + i + " = " + resultado);
		}
		
		return listaPantalla;
	}	
	
	public String toString() {
		String texto = "";
		
		for (String linea : listaTextos) {
			texto += linea + "\n";
		}
		
		return texto;
	}
}