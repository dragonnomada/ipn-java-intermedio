package ipn.cic.jis6arboles;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class App2 {
    
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        
        CanastaNode canasta1 = new CanastaNode(new Canasta("Frutas"));
        
        canasta1.addFruta("Manzana");
        canasta1.addFruta("Mango");
        canasta1.addFruta("Pera");
        
        CanastaNode canasta2 = new CanastaNode(new Canasta("Tropicales"));
        
        canasta2.addFruta("Kiwi");
        canasta2.addFruta("Guanabana");
        canasta2.addFruta("Papaya");
        
        canasta1.add(canasta2);

        JTree tree = new JTree(canasta1);

        frame.setLayout(new BorderLayout());

        frame.add(tree, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
