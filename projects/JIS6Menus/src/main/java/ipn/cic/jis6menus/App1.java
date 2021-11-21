package ipn.cic.jis6menus;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;

public class App1 {

    public static void main(String[] args) {
        
        JFrame app = new JFrame();
        
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menu1 = new JMenu("Opciones");
        JMenu menu2 = new JMenu("Ayuda");
        
        JMenuItem item1 = new JMenuItem("Salir");
        JMenuItem item2 = new JMenuItem("Abrir Ayuda");
        JMenuItem item3 = new JMenuItem("Acerca de");
        
        menu1.add(item1);
        
        menu2.add(item2);
        menu2.add(item3);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        
        app.setLayout(new BorderLayout());
        
        app.add(menuBar, BorderLayout.NORTH);
        
        app.setSize(400, 400);
        
        app.setVisible(true);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
