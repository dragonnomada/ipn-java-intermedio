package ipn.cic.interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

public class TanqueSimpleUI extends TanqueSimple {

    private JPanel panel;
    private JLabel label;
    private JToggleButton button;
    private JProgressBar progressbar;
    
    public TanqueSimpleUI(double capMax, double capAct, double flujo) {
        super(capMax, capAct, flujo);
        
        this.panel = new JPanel();
        
        this.label = new JLabel("0,00 / 0,00 (0,00%) | DESCONOCIDO");
        
        this.button = new JToggleButton("ABRIR");
        
        this.progressbar = new JProgressBar(0, (int)capMax);
        
        this.progressbar.setStringPainted(true);
        
        this.panel.setLayout(new BorderLayout());
        
        this.panel.add(this.progressbar, BorderLayout.CENTER);
        this.panel.add(this.label, BorderLayout.EAST);
        this.panel.add(this.button, BorderLayout.WEST);
        
        TanqueSimpleUI tanque = this;
        
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tanque.isAbierto()) {
                    tanque.cerrar();
                    button.setText("Abrir");
                } else {
                    tanque.abrir();
                    button.setText("Cerrar");
                }
                tanque.update();
            }
        });
        
        this.update();
    }
    
    @Override
    public void cicloBalance(double tiempoTranscurrido) {
        super.cicloBalance(tiempoTranscurrido);
        this.update();
    }
    
    private void update() {
        String estado = this.isAbierto() ? "ABIERTO" : "CERRADO";
        
        String text = String.format("%.2f / %.2f | %s", 
                this.getCapacidadActual(),
                this.getCapacidadMaxima(),
                estado);
        
        this.label.setText(text);
        
        this.progressbar.setValue((int)this.capacidadActual);
    }
    
    public JPanel getPanel() {
        return this.panel;
    }
    
}
