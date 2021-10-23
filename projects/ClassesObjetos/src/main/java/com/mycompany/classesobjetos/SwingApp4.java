package com.mycompany.classesobjetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingApp4 {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        JFrame frame = new JFrame();
        
        JLabel primaryDisplayLabel = new JLabel(calc.getPrimaryDisplay());
        primaryDisplayLabel.setBounds(10, 0, 260, 50);
        primaryDisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JLabel secondaryDisplayLabel = new JLabel(calc.getSecondaryDisplay());
        secondaryDisplayLabel.setBounds(10, 150, 260, 50);
        secondaryDisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        
        JButton button0 = new JButton("0");
        button0.setBounds(0, 50, 100, 50);
        
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.pushButton0();
                primaryDisplayLabel.setText(calc.getPrimaryDisplay());
            }
        });
        
        JButton button1 = new JButton("1");
        button1.setBounds(100, 50, 100, 50);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.pushButton1();
                primaryDisplayLabel.setText(calc.getPrimaryDisplay());
            }
        });
        
        JButton buttonReset = new JButton("RESET");
        buttonReset.setBounds(200, 50, 100, 50);
        
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.reset();
                primaryDisplayLabel.setText(calc.getPrimaryDisplay());
                secondaryDisplayLabel.setText(calc.getSecondaryDisplay());
            }
        });
        
        JButton buttonDec = new JButton("DEC");
        buttonDec.setBounds(0, 100, 100, 50);
        
        buttonDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.pushButtonDec();
                secondaryDisplayLabel.setText(calc.getSecondaryDisplay());
            }
        });
        
        JButton buttonHex = new JButton("HEX");
        buttonHex.setBounds(100, 100, 100, 50);
        
        buttonHex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.pushButtonHex();
                secondaryDisplayLabel.setText(calc.getSecondaryDisplay());
            }
        });
        
        JButton buttonOct = new JButton("OCT");
        buttonOct.setBounds(200, 100, 100, 50);
        
        buttonOct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.pushButtonOct();
                secondaryDisplayLabel.setText(calc.getSecondaryDisplay());
            }
        });
        
        frame.add(primaryDisplayLabel);
        frame.add(secondaryDisplayLabel);
        
        frame.add(button0);
        frame.add(button1);
        
        frame.add(buttonReset);
        
        frame.add(buttonDec);
        frame.add(buttonHex);
        frame.add(buttonOct);
        
        frame.setSize(300, 250);
        
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
