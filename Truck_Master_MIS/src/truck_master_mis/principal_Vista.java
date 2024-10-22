/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package truck_master_mis;

// Importación de librerías necesarias para manejar eventos
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @Ioan Sorin Muntean
 */
public class principal_Vista extends javax.swing.JFrame {

    /**
     * Constructor de la clase principal_Vista.
     * Crea un nuevo frame principal de la aplicación.
     */
    public principal_Vista() {
        initComponents(); // Inicializa los componentes gráficos

        // Crea instancias de los manejadores de eventos
        manejaComponetes mComponentes = new manejaComponetes();
        manejadorDeVentana manejaVentanas = new manejadorDeVentana();
         
        // Agrega los listeners a la ventana
        this.addComponentListener(mComponentes); // Maneja eventos de componentes
        this.addWindowListener(manejaVentanas); // Maneja eventos de la ventana
        
        // Crea un manejador para el botón y le asigna el ActionListener
        manejaClick mc = new manejaClick();
        btnHola.addActionListener(mc); // Asocia el evento de clic al botón
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHola.setText("HOLA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnHola)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnHola)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHola;
    // End of variables declaration//GEN-END:variables

}
// Clase que maneja el evento de clic en el botón
class manejaClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Muestra el comando de acción del evento en la consola
        System.out.println(e.getActionCommand());
        System.out.println("Se ha pulsado el botón"); // Mensaje indicando que se ha presionado el botón
    }
}

// Clase que maneja eventos de componentes de la ventana
class manejaComponetes implements ComponentListener {
    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println("La ventana cambió de tamaño"); // Mensaje al redimensionar la ventana
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        System.out.println("La ventana se movió de sitio"); // Mensaje al mover la ventana
    }

    @Override
    public void componentShown(ComponentEvent e) {
        System.out.println("Los controles aparecen"); // Mensaje cuando los controles se muestran
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println("Los controles se ocultan"); // Mensaje cuando los controles se ocultan
    }
}

// Clase que maneja eventos del ciclo de vida de la ventana
class manejadorDeVentana implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println(e.getNewState());
        System.out.println("Ventana abierta"); // Mensaje al abrir la ventana
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println(e.getNewState());
        System.out.println("Ventana cerrándose"); // Mensaje al cerrar la ventana
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println(e.getNewState());
        System.out.println("Ventana cerrada"); // Mensaje cuando la ventana ya está cerrada
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada"); // Mensaje al minimizar la ventana
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana maximizada"); // Mensaje al restaurar la ventana
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada"); // Mensaje cuando la ventana es activada
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana defocalizada"); // Mensaje cuando la ventana pierde el foco
    }
}