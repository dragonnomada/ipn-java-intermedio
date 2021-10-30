package com.mycompany.jis3;

import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo2 extends JFrame {
    
    public void build() {
        JLabel label1 = new JLabel("UNO");
        JLabel label2 = new JLabel("DOS");
        JLabel label3 = new JLabel("TRES");
        
        JEditorPane paneCenter = new JEditorPane();
        paneCenter.setContentType("text/html");
        paneCenter.setText(
            "<h1>"
            + "Hola "
            + "<strong style='color: red;'>Java</strong>"
            + "</h1>"
        );
        
        JLabel label5 = new JLabel("CINCO");
        
        this.add(label1, BorderLayout.NORTH);
        this.add(label2, BorderLayout.EAST);
        this.add(label3, BorderLayout.WEST);
        this.add(paneCenter, BorderLayout.CENTER);
        this.add(label5, BorderLayout.SOUTH);
        
        this.setSize(400, 400);
        //this.setLayout(null);
    }
    
    public void launch() {
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingDemo2 app = new SwingDemo2();
        
        app.build();
        
        app.launch();
    }
    
}
