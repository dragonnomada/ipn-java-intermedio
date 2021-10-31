package views.tienda.venta;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TiendaVentaPago extends JPanel {
    
    JButton pagoButton;
    
    public TiendaVentaPago() {
        super();
        
        this.pagoButton = new JButton("Cobrar");
        
        BorderLayout layout = new BorderLayout();
        
        this.setLayout(layout);
        
        this.add(this.pagoButton, BorderLayout.CENTER);
    }
    
}
