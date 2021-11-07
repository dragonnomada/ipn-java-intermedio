package ipn.cic.s5herencia;

public class App4 {

    public static void main(String[] args) {
        
        ContadorAleatorio contadorX = new ContadorAleatorio(1, 6);
        ContadorAleatorio contadorY = new ContadorAleatorio(-5, 5, 100);
        
        contadorX.describir();
        contadorY.describir();
        
        contadorX.incrementar();
        contadorY.incrementar();
        
        contadorX.describir();
        contadorY.describir();
        
    }
    
}
