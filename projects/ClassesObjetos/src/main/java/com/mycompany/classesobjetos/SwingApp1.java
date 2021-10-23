package com.mycompany.classesobjetos;

import javax.swing.JFrame;
import javax.swing.JButton;

public class SwingApp1 {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        JButton button1 = new JButton("Hola");
        
        button1.setBounds(100, 100, 100, 40);
        
        frame.add(button1);
        
        frame.setSize(400, 400);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
