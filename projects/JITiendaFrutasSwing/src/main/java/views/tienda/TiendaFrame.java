package views.tienda;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class TiendaFrame extends JFrame {
    
    TiendaTitle tiendaTitle;
    TiendaFrutas tiendaFrutas;
    TiendaVenta tiendaVenta;
    
    TiendaFrame() {
        super();
        
        this.tiendaTitle = new TiendaTitle();
        
        this.tiendaFrutas = new TiendaFrutas();
        
        this.tiendaVenta = new TiendaVenta();
        
        this.add(this.tiendaTitle, BorderLayout.NORTH);
        this.add(this.tiendaFrutas, BorderLayout.EAST);
        this.add(this.tiendaVenta, BorderLayout.WEST);
        
        this.setSize(600, 800);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
    public void launch() {
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        TiendaFrame tienda = new TiendaFrame();
        
        tienda.launch();
    }
    
}
