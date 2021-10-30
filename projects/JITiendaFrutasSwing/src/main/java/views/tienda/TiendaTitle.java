package views.tienda;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TiendaTitle extends JPanel {
    
    JLabel title;
    
    public TiendaTitle() {
        super();
        
        this.title = new JLabel("Tienda de Frutas");
        
        this.add(this.title);
        
    }
    
}
