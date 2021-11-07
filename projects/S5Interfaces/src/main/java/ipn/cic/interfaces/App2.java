package ipn.cic.interfaces;

import java.awt.BorderLayout;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App2 {

    public static void main(String[] args) {
        
        TanqueSimpleUI tanque1 = new TanqueSimpleUI(100, 20, 1);
        TanqueSimpleUI tanque2 = new TanqueSimpleUI(200, 150, 1);
        TanqueSimpleUI tanque3 = new TanqueSimpleUI(50, 0, 1);
        
        tanque1.conectarTanque(tanque2);
        tanque2.conectarTanque(tanque3);
        
        JFrame frame = new JFrame();
        
        frame.setLayout(new BorderLayout());
        
        JPanel container = new JPanel();
        
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        
        container.setLayout(layout);
        
        container.add(tanque1.getPanel());
        container.add(tanque2.getPanel());
        container.add(tanque3.getPanel());
        
        frame.add(container, BorderLayout.CENTER);
        
        frame.setSize(400, 150);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                tanque1.cicloBalance(1);
                tanque2.cicloBalance(1);
                tanque3.cicloBalance(1);
            }
        }, 0, 1000);
        
    } 
    
}
