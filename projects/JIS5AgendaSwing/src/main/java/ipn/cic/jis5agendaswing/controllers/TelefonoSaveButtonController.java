package ipn.cic.jis5agendaswing.controllers;

import ipn.cic.jis5agendaswing.views.TelefonoUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelefonoSaveButtonController implements ActionListener {

    TelefonoUI telefonoUI;
    
    public TelefonoSaveButtonController(TelefonoUI ui) {
        this.telefonoUI = ui;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Guarda el Teléfono editado (regresa a modo normal)
        this.telefonoUI.updateSaveNumero();
        
        this.telefonoUI.showNormal();
    }
    
}
