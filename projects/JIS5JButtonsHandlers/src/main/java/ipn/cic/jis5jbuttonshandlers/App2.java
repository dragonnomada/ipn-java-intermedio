package ipn.cic.jis5jbuttonshandlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App2 {

public static void main(String[] args) {
        
        Contador contador = new Contador();
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        JLabel labelDisplay = new JLabel(contador.getDisplay());
        
        JButton buttonInc = new JButton("inc");
        JButton buttonDec = new JButton("dec");
        
        ButtonIncController controllerInc = new ButtonIncController(contador, labelDisplay);
        ButtonDecController controllerDec = new ButtonDecController(contador, labelDisplay);
        
        buttonInc.addActionListener(controllerInc);
        
        buttonDec.addActionListener(controllerDec);
        
        panel.add(labelDisplay);
        panel.add(buttonInc);
        panel.add(buttonDec);
        
        frame.add(panel);
        
        frame.setSize(300, 300);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
