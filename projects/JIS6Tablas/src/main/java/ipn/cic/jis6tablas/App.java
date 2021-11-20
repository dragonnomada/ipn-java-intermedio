package ipn.cic.jis6tablas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class App {
    
    public static void main(String[] args) {
        
        JFrame app = new JFrame();
        
        CustomTableModel model = new CustomTableModel(100);
        NombresTableModel model2 = new NombresTableModel();
        
        model2.nombres.add("Pepe");
        model2.nombres.add("Paco");
        model2.nombres.add("Luis");
        model2.nombres.add("Pedro");
        
        NombreEdadPesoTableModel model3 = new NombreEdadPesoTableModel();
        
        model3.addRecord("Pepe", 23, 78.5);
        model3.addRecord("Ana", 28, 48.5);
        model3.addRecord("Beto", 36, 88.2);
        
        PersonaTableModel model4 = new PersonaTableModel();
        
        model4.addPersona("Pepe", 23, 78.5);
        model4.addPersona("Ana", 28, 48.5);
        model4.addPersona("Beto", 36, 88.2);
        model4.addPersona(new Persona("Dany", 31, 65.2));
        
        JTable table = new JTable(model4);
        
        JScrollPane scroll = new JScrollPane(table);
        
        app.add(scroll);
        
        app.setSize(400, 400);
        
        app.setVisible(true);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
