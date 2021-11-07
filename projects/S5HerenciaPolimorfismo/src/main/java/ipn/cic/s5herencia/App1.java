package ipn.cic.s5herencia;

public class App1 {

    public static void main(String[] args) {
        
        Contador contador1 = new Contador();
        Contador contador2 = new Contador(100);
        
        contador1.describir();
        contador2.describir();
        
        contador1.incrementar();
        contador2.incrementar(20);
        
        contador1.describir();
        contador2.describir();
        
    }
    
}
