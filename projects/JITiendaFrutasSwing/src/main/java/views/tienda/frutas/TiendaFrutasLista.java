package views.tienda.frutas;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TiendaFrutasLista extends JPanel {

    JList<String> listaFrutas;
    JScrollPane scroll;

    public TiendaFrutasLista() {
        super();

        this.listaFrutas = new JList<String>();

        this.scroll = new JScrollPane(this.listaFrutas);

        BorderLayout layout = new BorderLayout();
        
        this.setLayout(layout);

        this.add(this.scroll, BorderLayout.CENTER);
    }

}
