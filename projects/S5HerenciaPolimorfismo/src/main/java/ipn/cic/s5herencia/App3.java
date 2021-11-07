package ipn.cic.s5herencia;

public class App3 {
    
    public static void main(String[] args) {
        
        Contador contadorA = new ContadorNombrado("A"); // Downcasting
        Contador contadorB = new Contador();
        
        contadorA.describir();
        contadorB.describir();
        
        ((ContadorNombrado)contadorA).incrementar(4, 3); // Conversiones entre Padre e Hijo
        contadorB.incrementar(12);
        
        contadorA.describir();
        contadorB.describir();
        
    }
    
}
