
package truck_master_mis;

/**
 * Clase principal que inicia la aplicación.
 * 
 * @author IOAN SORIN MUNTEAN
 */
public class main_Truck_Master_MIS {

    public static void main(String[] args) {
        // Mensaje de prueba en consola
        System.out.println("Hola por fin lo conseguimos");

        // Crea una instancia de la clase controlador_Truck_Master_MIS
        controlador_Truck_Master_MIS ventana = new controlador_Truck_Master_MIS();
        
        // Llama al método que inicia la ventana
        ventana.arrancarVentana();
    }
}