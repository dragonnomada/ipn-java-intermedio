package ipn.cic.jis6arboles;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class App1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        DefaultMutableTreeNode nodeA = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode nodeB = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode nodeC = new DefaultMutableTreeNode("C");

        DefaultMutableTreeNode nodeA1 = new DefaultMutableTreeNode("1");
        DefaultMutableTreeNode nodeA2 = new DefaultMutableTreeNode("2");
        DefaultMutableTreeNode nodeA3 = new DefaultMutableTreeNode("3");

        DefaultMutableTreeNode nodeB1 = new DefaultMutableTreeNode("Uno");
        DefaultMutableTreeNode nodeB2 = new DefaultMutableTreeNode("Dos");
        DefaultMutableTreeNode nodeB3 = new DefaultMutableTreeNode("Tres");

        DefaultMutableTreeNode nodeC1 = new DefaultMutableTreeNode("One");
        DefaultMutableTreeNode nodeC2 = new DefaultMutableTreeNode("Two");

        nodeA.add(nodeA1);
        nodeA.add(nodeA2);
        nodeA.add(nodeA3);

        nodeB.add(nodeB1);
        nodeB.add(nodeB2);
        nodeB.add(nodeB3);

        nodeB2.add(nodeC);

        nodeC.add(nodeC1);
        nodeC.add(nodeC2);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode();

        root.add(nodeA);
        root.add(nodeB);

        JTree tree = new JTree(root);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode
                        = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                
                JOptionPane.showMessageDialog(
                        tree, 
                        String.format("Nodo: %s > %s", 
                                selectedNode.getParent().toString(), 
                                selectedNode.toString()), 
                        "Nodo Seleccionado", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        frame.setLayout(new BorderLayout());

        frame.add(tree, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
