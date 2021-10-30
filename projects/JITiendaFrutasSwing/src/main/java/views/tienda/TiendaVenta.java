package views.tienda;

import javax.swing.JPanel;
import views.tienda.venta.TiendaVentaListaTitle;

public class TiendaVenta extends JPanel {
    
    TiendaVentaListaTitle titleVenta;
    
    public TiendaVenta() {
        super();
        
        this.titleVenta = new TiendaVentaListaTitle();
        
        this.add(this.titleVenta);
    }
    
}
