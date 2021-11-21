package ipn.cic.jis6menus;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ItemArchivoNuevoController implements ActionListener {
    
    Component root;
    
    ItemArchivoNuevoController(Component root) {
        this.root = root;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JOptionPane.showMessageDialog(
                this.root, // Componente padre dónde se posicionará el mensaje
                "Hola mundo", // Mensaje
                "Este un mensaje", // Título
                JOptionPane.INFORMATION_MESSAGE // Ícono
        );
        
    }    
    
}
