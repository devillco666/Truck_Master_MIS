/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package truck_master_mis;

/**
 * Clase controlador para manejar la lógica de la aplicación.
 *
 * @Ioan Sorin Muntean
 */
public class controlador_Truck_Master_MIS {

    /**
     * Método para iniciar y mostrar la ventana principal.
     * Crea una instancia de la clase principal_Vista y la muestra.
     */
    public void arrancarVentana() {
        // Crea una instancia de la ventana principal de la aplicación
        principal_Vista_Truck_master_MIS pv = new principal_Vista_Truck_master_MIS();
        
        // Hace visible la ventana principal
        pv.setVisible(true);
    }
}
