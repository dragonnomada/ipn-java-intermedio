package ipn.cic.jis5agendaswing.controllers;

import ipn.cic.jis5agendaswing.views.TelefonoUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelefonoEditButtonController implements ActionListener {
    
    private TelefonoUI telefonoUI;

    public TelefonoEditButtonController(TelefonoUI ui) {
        this.telefonoUI = ui;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Edita el Teléfono (muestra el modo edición)
        this.telefonoUI.updateEditNumero();
        this.telefonoUI.showEdit();
    }
    
}
