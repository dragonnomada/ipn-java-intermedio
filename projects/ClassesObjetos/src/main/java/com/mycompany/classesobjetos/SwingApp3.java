package com.mycompany.classesobjetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingApp3 {
    
    int contador = 0;
    
    public static void main(String[] args) {
        
        SwingApp3 app = new SwingApp3();
        
        JFrame frame = new JFrame();
        
        JButton button1 = new JButton("Hola");
        
        button1.setBounds(100, 100, 200, 40);
        
        // new <Interfaz>() { @override <method> ... }
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText(String.format("Contador: %d", app.contador++));
            }
            
        });
        
        frame.add(button1);
        
        frame.setSize(400, 400);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
