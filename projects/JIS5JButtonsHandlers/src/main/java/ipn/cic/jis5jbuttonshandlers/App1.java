package ipn.cic.jis5jbuttonshandlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App1 {

    public static void main(String[] args) {
        
        Contador contador = new Contador();
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        JLabel labelDisplay = new JLabel(contador.getDisplay());
        
        JButton buttonInc = new JButton("inc");
        JButton buttonDec = new JButton("dec");
        
        buttonInc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador.incrementar();
                labelDisplay.setText(contador.getDisplay());
            }
        });
        
        buttonDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador.decrementar();
                labelDisplay.setText(contador.getDisplay());
            }
        });
        
        panel.add(labelDisplay);
        panel.add(buttonInc);
        panel.add(buttonDec);
        
        frame.add(panel);
        
        frame.setSize(300, 300);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
