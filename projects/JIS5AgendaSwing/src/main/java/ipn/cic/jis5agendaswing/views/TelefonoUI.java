package ipn.cic.jis5agendaswing.views;

import ipn.cic.jis5agendaswing.controllers.TelefonoComboController;
import ipn.cic.jis5agendaswing.controllers.TelefonoEditButtonController;
import ipn.cic.jis5agendaswing.controllers.TelefonoSaveButtonController;
import ipn.cic.jis5agendaswing.enums.TipoTelefono;
import ipn.cic.jis5agendaswing.models.Telefono;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// VISTA (M*V*C)
public class TelefonoUI {
    
    Telefono telefono = new Telefono();
    
    JPanel panelNormal = new JPanel(); // Panel en modo Normal
    JLabel labelNormal = new JLabel();
    JButton buttonEdit = new JButton("Editar");
    
    TelefonoEditButtonController buttonEditController;
    
    JPanel panelEdit = new JPanel(); // Panel en modo Edición
    JComboBox<String> comboTelefonoTipo = new JComboBox<String>();
    JTextField textFieldNumero = new JTextField();
    JButton buttonSave = new JButton("Aceptar");
    
    TelefonoComboController comboController;
    
    TelefonoSaveButtonController buttonSaveController;
    
    JPanel panel = new JPanel(); // Panel principal del UI
    
    public TelefonoUI() {
        
        this.labelNormal.setText(telefono.getDisplay());
        
        this.panel.setLayout(new BorderLayout());
        
        this.panelNormal.setLayout(new BorderLayout());
        
        this.panelNormal.add(this.labelNormal, BorderLayout.CENTER);
        this.panelNormal.add(this.buttonEdit, BorderLayout.EAST);
        
        this.panelEdit.setLayout(new BorderLayout());
        
        this.panelEdit.add(this.comboTelefonoTipo, BorderLayout.WEST);
        this.panelEdit.add(this.textFieldNumero, BorderLayout.CENTER);
        this.panelEdit.add(this.buttonSave, BorderLayout.EAST);
        
        this.comboTelefonoTipo.addItem("OTRO");
        this.comboTelefonoTipo.addItem("CASA");
        this.comboTelefonoTipo.addItem("CELULAR");
        this.comboTelefonoTipo.addItem("TRABAJO");
        
        this.comboController = new TelefonoComboController(this);
        
        this.comboTelefonoTipo.addItemListener(comboController);
        
        this.buttonEditController = new TelefonoEditButtonController(this);
        
        this.buttonEdit.addActionListener(this.buttonEditController);
        
        this.buttonSaveController = new TelefonoSaveButtonController(this);
        
        this.buttonSave.addActionListener(this.buttonSaveController);
        
        this.showNormal();
        
    }
    
    public JPanel getPanel() {
        return this.panel;
    }
    
    public void showNormal() {
        this.panel.removeAll();
        this.panel.add(this.panelNormal, BorderLayout.NORTH);
        this.panel.revalidate();
        this.panel.repaint();
    }
    
    public void showEdit() {
        this.panel.removeAll();
        this.panel.add(this.panelEdit, BorderLayout.NORTH);
        this.panel.revalidate();
        this.panel.repaint();
    }
    
    public void updateEditNumero() {
        // Actualiza el TextField con el teléfono
        this.textFieldNumero.setText(this.telefono.getNumero());
    }
    
    public void updateSaveNumero() {
        // Actualiza el Teléfono con el TextField
        this.telefono.setNumero(this.textFieldNumero.getText());
        this.labelNormal.setText(this.telefono.getDisplay());
    }
    
    public void updateComboTipo(TipoTelefono tipo) {
        this.telefono.setTipo(tipo);
    }
    
    public static void main(String[] args) {
        
        TelefonoUI ui = new TelefonoUI();
        
        JFrame frame = new JFrame();
        
        frame.add(ui.getPanel());
        
        frame.setSize(400, 400);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    
}
