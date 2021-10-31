package views.tienda;

import controllers.TiendaFrutaController;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class TiendaFrame extends JFrame {
    
    TiendaFrutaController controller;
    
    TiendaTitle tiendaTitle;
    TiendaFrutas tiendaFrutas;
    TiendaVenta tiendaVenta;
    JSplitPane split;
    
    TiendaFrame() {
        super();
        
        this.controller = new TiendaFrutaController();
        
        this.tiendaTitle = new TiendaTitle();
        
        this.tiendaFrutas = new TiendaFrutas(this.controller);
        
        this.tiendaVenta = new TiendaVenta();
        
        this.split = new JSplitPane(
            JSplitPane.HORIZONTAL_SPLIT, 
            this.tiendaFrutas, 
            this.tiendaVenta
        );
        
        this.add(this.tiendaTitle, BorderLayout.NORTH);
        this.add(this.split, BorderLayout.CENTER);
        
        this.setSize(600, 400);
        
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
