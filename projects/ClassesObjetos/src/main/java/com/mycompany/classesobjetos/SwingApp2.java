package com.mycompany.classesobjetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingApp2 implements ActionListener {
 
    int contador = 0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.printf("HOLA %d\n", contador++);
    }
    
    public static void main(String[] args) {
        
        SwingApp2 app = new SwingApp2();
        
        JFrame frame = new JFrame();
        
        JButton button1 = new JButton("Hola");
        
        button1.setBounds(100, 100, 100, 40);
        
        button1.addActionListener(app);
        
        frame.add(button1);
        
        frame.setSize(400, 400);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
