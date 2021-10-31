package views.tienda.venta;

import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TiendaVentaLista extends JPanel {
    
    JList<String> listaVentas;
    JScrollPane scroll;
    
    public TiendaVentaLista() {
        super();
        
        this.listaVentas = new JList<String>();
        
        this.scroll = new JScrollPane(this.listaVentas);
        
        BorderLayout layout = new BorderLayout();
        
        this.setLayout(layout);
        
        this.add(this.scroll, BorderLayout.CENTER);
    }
    
}
