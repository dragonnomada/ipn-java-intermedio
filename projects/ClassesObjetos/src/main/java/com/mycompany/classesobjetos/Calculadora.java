package com.mycompany.classesobjetos;

import java.util.ArrayList;

public class Calculadora {
    
    private String primaryDisplay;
    private String secondaryDisplay;
    
    private ArrayList<Integer> buffer;
    
    Calculadora() {
        this.primaryDisplay = "0";
        this.secondaryDisplay = "0";
        
        this.buffer = new ArrayList<Integer>();
    }
    
    public String getPrimaryDisplay() {
        return this.primaryDisplay;
    }
    
    public String getSecondaryDisplay() {
        return this.secondaryDisplay;
    }
    
    private void updatePrimaryDisplay() {
        this.primaryDisplay = "";
        for (Integer valor : this.buffer) {
            this.primaryDisplay += valor;
        }
    }
    
    public void pushButton1() {
        // Insertar a la izquierda por el ArrayList [1 0 1 1 0] -> "10110"
        this.buffer.add(1);
        this.updatePrimaryDisplay();
    }
    
    public void pushButton0() {
        this.buffer.add(0);
        this.updatePrimaryDisplay();
    }
    
    private int bufferToDec() {
        int dec = 0;
        int pot = 0;
        
        // Last index: this.buffer.size() - 1
        // First index: 0
        for (int i = this.buffer.size() - 1; i >= 0; i--) {
            int b = this.buffer.get(i);
            
            dec += b * Math.pow(2, pot);
            
            pot++;
        }
        
        return dec;
    }
    
    public void pushButtonDec() {
        this.secondaryDisplay = String.format("DEC %16d", this.bufferToDec());
    }
    
    public void pushButtonHex() {
        this.secondaryDisplay = String.format("HEX %16X", this.bufferToDec());
    }
    
    public void pushButtonOct() {
        this.secondaryDisplay = String.format("OCT %16o", this.bufferToDec());
    }
    
    public void showPrimaryDisplay() {
        System.out.printf("+-----Binary Calc------+\n");
        System.out.printf("| %20s |\n", this.getPrimaryDisplay());
    }
    
    public void showSecondaryDisplay() {
        System.out.printf("|----------------------|\n");
        System.out.printf("| %20s |\n", this.getSecondaryDisplay());
        System.out.printf("+----------------------+\n");
    }
    
    public void show() {
        this.showPrimaryDisplay();
        this.showSecondaryDisplay();
    }
    
    public void reset() {
        this.primaryDisplay = "0";
        this.secondaryDisplay = "0";
        
        this.buffer.clear();
    }
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        calc.show();
        
        calc.pushButton1();
        calc.pushButton0();
        calc.pushButton1();
        calc.pushButton1();
        calc.pushButton0();
        calc.pushButton1();
        calc.pushButton1();
        calc.pushButton1();
        
        calc.pushButtonDec();
        
        calc.show();
        
        calc.pushButtonHex();
        
        calc.show();
        
        calc.pushButtonOct();
        
        calc.show();
        
        calc.reset();
        
        calc.pushButton1();
        calc.pushButton0();
        calc.pushButton1();
        calc.pushButton1();
        
        calc.pushButtonHex();
        
        calc.show();
                        
    }
        
}
