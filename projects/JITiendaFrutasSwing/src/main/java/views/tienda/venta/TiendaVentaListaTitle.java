package views.tienda.venta;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TiendaVentaListaTitle extends JPanel {
    
    JLabel titleLabel;
    JButton addFrutaButton;
    
    public TiendaVentaListaTitle() {
        super();
        
        this.titleLabel = new JLabel("Frutas por Vender");
        this.addFrutaButton = new JButton("Limpiar Venta");
        
        this.add(this.titleLabel, BorderLayout.EAST);
        this.add(this.addFrutaButton, BorderLayout.WEST);
    }
    
}
