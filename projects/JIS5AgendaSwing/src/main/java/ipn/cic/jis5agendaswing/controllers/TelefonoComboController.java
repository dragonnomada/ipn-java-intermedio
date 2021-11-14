package ipn.cic.jis5agendaswing.controllers;

import ipn.cic.jis5agendaswing.enums.TipoTelefono;
import ipn.cic.jis5agendaswing.views.TelefonoUI;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

// CONTROLLER (MV*C*)
public class TelefonoComboController implements ItemListener {

    TelefonoUI telefonoUI;
    
    public TelefonoComboController(TelefonoUI ui) {
        this.telefonoUI = ui;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        JComboBox<String> comboTelefonoTipo = (JComboBox<String>)e.getSource();
        String text = (String)comboTelefonoTipo.getSelectedItem();
        TipoTelefono tipo = TipoTelefono.valueOf(text);
        this.telefonoUI.updateComboTipo(tipo);
    }
    
}
