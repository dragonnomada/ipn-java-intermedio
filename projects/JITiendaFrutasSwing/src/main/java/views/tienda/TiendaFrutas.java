package views.tienda;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import views.tienda.frutas.TiendaFrutasLista;
import views.tienda.frutas.TiendaFrutasListaTitle;

public class TiendaFrutas extends JPanel {
    
    TiendaFrutasListaTitle listaFrutasTitle;
    TiendaFrutasLista listaFrutas;
    
    public TiendaFrutas() {
        super();
        
        this.listaFrutasTitle = new TiendaFrutasListaTitle();
        this.listaFrutas = new TiendaFrutasLista();
        
        this.add(this.listaFrutasTitle, BorderLayout.NORTH);
        this.add(this.listaFrutas, BorderLayout.SOUTH);
    }
    
}
