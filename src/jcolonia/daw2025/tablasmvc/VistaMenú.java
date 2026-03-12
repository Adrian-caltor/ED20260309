package jcolonia.daw2025.tablasmvc;
import java.util.Arrays;
import java.util.List;

/**
 * Clase encargada de mostrar un menú en consola.
 * 
 * Permite presentar una lista de opciones numeradas
 * y solicitar al usuario que seleccione una opción.
 */

public class VistaMenú {
	
    /**
     * Título del menú
     */

    private String titulo;

    /** 
     * Lista de opciones disponibles
     */

    private List<String> opciones; // ahora usamos List

    /**
     * Constructor del menú.
     * 
     * @param titulo que se muestra
     * @param opciones lista de opciones disponibles como array
     */

    public VistaMenú(String titulo, String[] opciones) {
        this.titulo = titulo;
        this.opciones = Arrays.asList(opciones);
    }

    /**
     * Muestra el título y las opciones.
     */
    
    public void mostrarOpciones() {

        System.out.println();
        System.out.println(titulo);

        for (int i = 0; i < titulo.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < opciones.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, opciones.get(i));
        }
        System.out.println("0. Salir");    
    }



    /**
     * Solicita al usuario que elija una opción.
     * 
     * @return opción seleccionada
     */

    public int pedirOpcion() {

        return VistaGeneral.pedirNúmero("Elija una opción");

    }

}