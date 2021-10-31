package views.tienda;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import views.tienda.venta.TiendaVentaLista;
import views.tienda.venta.TiendaVentaListaTitle;
import views.tienda.venta.TiendaVentaPago;
import views.tienda.venta.TiendaVentaTotal;

public class TiendaVenta extends JPanel {
    
    TiendaVentaListaTitle titleVenta;
    TiendaVentaLista listaVenta;
    TiendaVentaTotal totalVenta;
    TiendaVentaPago pagoVenta;
    
    public TiendaVenta() {
        super();
        
        this.titleVenta = new TiendaVentaListaTitle();
        this.listaVenta = new TiendaVentaLista();
        this.totalVenta = new TiendaVentaTotal();
        this.pagoVenta = new TiendaVentaPago();
        
        //BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        BorderLayout layout = new BorderLayout();
        
        this.setLayout(layout);
        
        this.add(this.titleVenta, BorderLayout.NORTH);
        this.add(this.listaVenta, BorderLayout.CENTER);
        
        JPanel groupBottom = new JPanel();
        
        BorderLayout groupBottomLayout = new BorderLayout();
        
        groupBottom.setLayout(groupBottomLayout);
        
        groupBottom.add(this.totalVenta, BorderLayout.NORTH);
        groupBottom.add(this.pagoVenta, BorderLayout.SOUTH);
        
        this.add(groupBottom, BorderLayout.SOUTH);
    }
    
}
