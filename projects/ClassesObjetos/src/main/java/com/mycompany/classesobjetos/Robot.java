package com.mycompany.classesobjetos;

public class Robot {
    
    double x;
    double y;
    
    void describe() {
        System.out.printf("Robot: (%.2f, %.2f)\n", this.x, this.y);
    }
    
    public static void main(String[] args) {
        
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        
        r1.x = 20;
        
        r2.y = 15;
        
        r1.describe();
        
        r2.describe();
        
    }
    
}
