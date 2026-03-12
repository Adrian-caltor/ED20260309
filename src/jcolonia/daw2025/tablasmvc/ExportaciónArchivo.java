package jcolonia.daw2025.tablasmvc;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase para guardar los métodos de la exportación de los archivos.
 */

public class ExportaciónArchivo {

	/**
	 * Exprorta la tabla de multiplicar con un nombre y ruta específicos
	 * 
	 * @param ruta para exportar el archivo
	 * @param archivo exportado
	 * @return Verdadero o falso en el boolean
	 */
	
	public static boolean guardar(String ruta, String archivo) {
		try{
			FileWriter exportar = new FileWriter(ruta);
			exportar.write(archivo);
			exportar.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}