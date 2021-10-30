package views.tienda.frutas;

import javax.swing.JList;
import javax.swing.JPanel;

public class TiendaFrutasLista extends JPanel {
    
    JList<String> listaFrutas;
    
    public TiendaFrutasLista() {
        super();
        
        this.listaFrutas = new JList<String>();
        
        this.listaFrutas.setPrototypeCellValue("asdf");
        
        this.add(this.listaFrutas);
    }
    
}
