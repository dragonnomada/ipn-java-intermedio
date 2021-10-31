package views.tienda;

import controllers.TiendaFrutaController;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import views.tienda.frutas.TiendaFrutasLista;
import views.tienda.frutas.TiendaFrutasListaTitle;

public class TiendaFrutas extends JPanel {
    
    TiendaFrutasListaTitle listaFrutasTitle;
    TiendaFrutasLista listaFrutas;
    
    public TiendaFrutas(TiendaFrutaController controller) {
        super();
        
        this.listaFrutasTitle = new TiendaFrutasListaTitle(controller);
        this.listaFrutas = new TiendaFrutasLista();
        
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        
        this.setLayout(layout);
        
        this.add(this.listaFrutasTitle);
        this.add(this.listaFrutas);
    }
    
}
