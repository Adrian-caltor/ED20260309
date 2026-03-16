package jcolonia.daw2025.tablasmvc;
/**
* Núcleo de aplicación de consola de texto con menús. Aplicación
* de texto usando tablas de multiplicar infantiles clásicas. 
*/
public class ControlTablaMultiplicar {
	/** Formato tipo «printf» para el nombre del archivo de
	* exportación.
	*/
	public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN=
		"tabla del %02d.txt";

	public static final String[] OPCIONES_MENÚ_PRINCIPAL = { "Mostrar tabla", "Cambiar tabla", "Exportar tabla"};
	
	/** Tabla de multiplicar activa. */
	private TablaMultiplicar tabla;

	/**
	 * Inicia el método init para pedirnos un número al iniciar el programa.
	 * @throws ExcepcionES 
	 */
	
	public ControlTablaMultiplicar() throws ExcepcionES{
		init();
	}


	/**
	* Pide al usuario un número y prepara la primera
	* tabla activa.
	 * @throws ExcepcionES 
	*/
	public void init() throws ExcepcionES{
		cambiarTabla();
	}

	/**
	* Gestión del menú principal. Desde este menú
	* se ejecutan las opciones disponibles a elección del usuario.
	* A la salida del menú se finaliza el programa.
	 * @throws ExcepcionES 
	*/
	public void buclePrincipal() throws ExcepcionES{
		VistaMenú menú;
		int opción;
		
		menú=new VistaMenú("Tablas de multiplicar",OPCIONES_MENÚ_PRINCIPAL);
		
		do{
			menú.mostrarOpciones();
			opción=menú.pedirOpcion();
			
			switch(opción){
			case 1: // Mostrar tabla
				mostrarTabla();
				break;
			case 2: //Cambiar tabla
				cambiarTabla();
				break;
			case 3: // Exportar tabla
				exportarTabla();
				break;
			case 0: // Salir
				break;
			default: // Opciones no implementadas
				opciónNoDisponible();
				break;
			}
			
		} while (opción!=0);
		
		VistaGeneral.mostrarAviso("FIN");
		
	}
	
	/**
	* Muestra por pantalla -envía a la salida estándar-
	* los productos correspondientes a la tabla activa.
	*/
	private void mostrarTabla(){
		TablaMultiplicar.toListaPantalla();
	}
	
	/**
	* Cambia la tabla activa por otra elegida por el usuario.
	 * @throws ExcepcionES 
	*/
	private void cambiarTabla() throws ExcepcionES{
		int n = 0;
		
		VistaGeneral.pedirNumero("Introduzca el número para la tabla");
		
		tabla=new TablaMultiplicar(n);
		tabla.generarTabla();
	}

	
	/**
	* Envía a un archivo
	* los productos correspondientes a la tabla activa.
	*/
	private void exportarTabla() {
		boolean ok = tabla.toListaExportación(String.format(FORMATO_RUTA_ARCHIVO_EXPORTACIÓN, tabla.getnumero()));

		if (ok) {
		VistaGeneral.mostrarAviso("Exportación completada correctamente.");
		} else {
		VistaGeneral.mostrarAviso("Error al exportar la tabla.");
		}
		}
	
	/**
	 * Muestra un mensaje de aviso indicando que 
	 * la opción elegida no está disponible.
	*/
	private void opciónNoDisponible() {
		VistaGeneral.mostrarAviso("Opción no disponible");
	}




}