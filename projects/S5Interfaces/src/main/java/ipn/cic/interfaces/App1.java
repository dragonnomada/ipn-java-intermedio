package ipn.cic.interfaces;

public class App1 {

    public static void main(String[] args) {
        
        ITanque tanque1 = new TanqueSimple(100, 20, 0.5);
        ITanque tanque2 = new TanqueSimple(200, 150, 1);
        ITanque tanque3 = new TanqueSimple(50, 0, 0.2);
        
        ((TanqueSimple)tanque1).conectarTanque(tanque2);
        ((TanqueSimple)tanque2).conectarTanque(tanque3);
        
        System.out.println("+---------------------------------+");
        
        tanque1.describir();
        tanque2.describir();
        tanque3.describir();
        System.out.println("+---------------------------------+");
        
        tanque1.abrir();
        
        tanque1.cicloBalance(2);
        tanque2.cicloBalance(2);
        tanque3.cicloBalance(2);
        
        tanque1.describir();
        tanque2.describir();
        tanque3.describir();
        System.out.println("+---------------------------------+");
        
        tanque1.cicloBalance(2);
        tanque2.cicloBalance(2);
        tanque3.cicloBalance(2);
        
        tanque1.describir();
        tanque2.describir();
        tanque3.describir();
        System.out.println("+---------------------------------+");
        
        tanque2.abrir();
        
        tanque1.cicloBalance(2);
        tanque2.cicloBalance(2);
        tanque3.cicloBalance(2);
        
        tanque1.describir();
        tanque2.describir();
        tanque3.describir();
        System.out.println("+---------------------------------+");
        
    }
    
}
