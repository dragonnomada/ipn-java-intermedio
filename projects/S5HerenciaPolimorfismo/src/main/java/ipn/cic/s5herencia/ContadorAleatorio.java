package ipn.cic.s5herencia;

public class ContadorAleatorio extends Contador {

    int rangoInferior;
    int rangoSuperior;
    
    ContadorAleatorio(int inf, int sup) {
        super();
        this.rangoInferior = inf;
        this.rangoSuperior = sup;
    }
    
    ContadorAleatorio(int inf, int sup, int valor) {
        super(valor);
        this.rangoInferior = inf;
        this.rangoSuperior = sup;
    }
    
    @Override
    public void incrementar() {
        int valor = (int)(Math.random() * 
                (this.rangoSuperior - this.rangoInferior) + 
                this.rangoInferior);
        this.incrementar(valor);
    }
    
    @Override
    public void decrementar() {
        int valor = (int)(Math.random() * 
                (this.rangoSuperior - this.rangoInferior) + 
                this.rangoInferior);
        this.decrementar(valor);
    }
    
    @Override
    public void describir() {
        System.out.printf("| (%3d %3d) | %9d |\n", this.rangoInferior, this.rangoSuperior, this.getConteo());
    }
    
}
