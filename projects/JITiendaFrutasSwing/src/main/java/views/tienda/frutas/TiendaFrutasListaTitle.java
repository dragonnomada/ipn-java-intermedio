package views.tienda.frutas;

import controllers.TiendaFrutaController;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TiendaFrutasListaTitle extends JPanel {
    
    JLabel titleLabel;
    JButton addFrutaButton;
    
    public TiendaFrutasListaTitle(TiendaFrutaController controller) {
        super();
        
        this.titleLabel = new JLabel("Frutas en Venta");
        this.addFrutaButton = new JButton("Nueva Fruta");
        
        this.add(this.titleLabel, BorderLayout.EAST);
        this.add(this.addFrutaButton, BorderLayout.WEST);
        
        controller.handleAddFrutaButton(addFrutaButton);
    }
    
}
