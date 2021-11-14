package ipn.cic.jis5jbuttonshandlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ButtonDecController implements ActionListener {

    Contador contador;
    JLabel label;
    
    public ButtonDecController(Contador contador, JLabel label) {
        this.contador = contador;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.contador.decrementar();
        this.label.setText(this.contador.getDisplay());
    }
    
}
