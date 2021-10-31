package views.tienda.venta;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TiendaVentaTotal extends JPanel {
    
    JLabel leyenda;
    JLabel total;
    
    public TiendaVentaTotal() {
        super();
        
        this.leyenda = new JLabel("Total:");
        this.total = new JLabel("$ 0,00");
        
        BorderLayout layout = new BorderLayout();
        
        Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        
        this.setBorder(border);
        
        this.setLayout(layout);
        
        this.add(this.leyenda, BorderLayout.WEST);
        this.add(this.total, BorderLayout.EAST);
    }
    
}
