package ipn.cic.s5herencia;

public class App2 {

    public static void main(String[] args) {
    
        ContadorNombrado contadorUno = new ContadorNombrado("uno");
        ContadorNombrado contadorDos = new ContadorNombrado("dos", 100);
        
        contadorUno.describir(); // Hijo
        contadorDos.describir(); // Hijo
        
        contadorUno.incrementar(5, 10); // Hijo
        contadorDos.incrementar(20); // Padre
        
        contadorUno.describir(); // Hijo
        contadorDos.describir(); // Hijo
        
    }
    
}
