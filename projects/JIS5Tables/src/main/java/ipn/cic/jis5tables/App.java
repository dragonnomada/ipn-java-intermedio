package ipn.cic.jis5tables;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class App {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        
        JScrollPane scrollPane = new JScrollPane();
        
        JTable table = new JTable();
        
        scrollPane.add(table);
        
        panel.add(scrollPane);
        
        frame.add(panel);
        
        frame.setSize(400, 400);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
