package ipn.cic.jis5tables;

import ipn.cic.jis5tables.controllers.FrutasTableController;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        FrutasTableController tableModel = new FrutasTableController();

        JTable table = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setSize(400, 400);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
