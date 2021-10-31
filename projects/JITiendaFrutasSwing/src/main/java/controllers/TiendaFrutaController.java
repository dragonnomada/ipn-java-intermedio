package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class TiendaFrutaController {
        
    //TiendaFrutaModel tiendaModel;
    
    public void handleAddFrutaButton(JButton addFrutaButton) {
        ActionListener handleClick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: El botón agregar fruta ha sido pulsado
                String nombre = JOptionPane.showInputDialog(
                    addFrutaButton, "Nombre:"
                );
                double precio = Double.parseDouble(
                    JOptionPane.showInputDialog(addFrutaButton, "Precio:")
                );
                double cantidad = Double.parseDouble(
                    JOptionPane.showInputDialog(addFrutaButton, "Cantidad:")
                );
                
                JOptionPane.showMessageDialog(
                    addFrutaButton,
                    String.format(
                        "%s | $%.2f | %.2f kg", 
                        nombre, 
                        precio, 
                        cantidad
                    )
                );
                // TODO: Agregar los datos a la lista de frutas
            }
        }; // inline-implent-class
        // Implementa la clase en línea
        
        addFrutaButton.addActionListener(handleClick);
    }
        
}
