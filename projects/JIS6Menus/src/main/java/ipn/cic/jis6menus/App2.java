package ipn.cic.jis6menus;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class App2 {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        AppMenu menuBar = new AppMenu();
        
        frame.setLayout(new BorderLayout());
        
        frame.add(menuBar, BorderLayout.NORTH);
        
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
