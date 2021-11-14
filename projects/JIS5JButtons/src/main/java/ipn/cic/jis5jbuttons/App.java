package ipn.cic.jis5jbuttons;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); // frame -> VENTANA
        
        JPanel panel = new JPanel(); // panel -> LIENZO/CAJA
        
        JButton button1 = new JButton("Botón 1"); // buttonX -> Botón
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");
        JButton button4 = new JButton("Botón 4");
        JButton button5 = new JButton("Botón 5");
        JButton button6 = new JButton("Botón 6");
        
        JPanel panelG1 = new JPanel(); // panelY -> LIENZO/CAJA
        JPanel panelG2 = new JPanel();
        JPanel panelG3 = new JPanel();
        
        // LAYOUTS: La forma de organizar los componentes dentro del PANEL
        // * BorderLayout() -> EXPANDIR ELEMENTOS Y ORIENTARLOS 
        //       AL NORTE/SUR/ESTE/OESTE o CENTRO (EXPANDE)
        // * BoxLayout(panel, ORIENTACIÓN) -> DISPONER LOS ELEMENTOS
        //       HORIZONTAL (X-AXIS) O VERTICAL (Y-AXIS)
        
        BorderLayout layout1 = new BorderLayout(); // ESTE-OESTE
        
        panelG1.setLayout(layout1);
        
        panelG1.add(button1, BorderLayout.WEST); // OESTE -> IZQUIERDA
        panelG1.add(button2, BorderLayout.EAST); // ESTE -> DERECHA
        
        BoxLayout layout2 = new BoxLayout(panelG2, BoxLayout.X_AXIS);
        
        panelG2.setLayout(layout2);
        
        panelG2.add(button3);
        panelG2.add(button4);
        
        BorderLayout layout3 = new BorderLayout();
        
        panelG3.setLayout(layout3); // NORTE-CENTRO
        
        panelG3.add(button5, BorderLayout.NORTH);
        panelG3.add(button6, BorderLayout.CENTER);
        
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS); // ARRIBA HACIA ABAJO
        
        panel.setLayout(layout);
        
        JPanel sup1 = new JPanel();
        
        sup1.setLayout(new BorderLayout());
        
        sup1.add(panelG1, BorderLayout.SOUTH);
        
        panel.add(sup1);
        panel.add(panelG2);
        panel.add(panelG3);
        
        frame.add(panel);
        
        frame.setSize(400, 400);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
        
    }
    
}
