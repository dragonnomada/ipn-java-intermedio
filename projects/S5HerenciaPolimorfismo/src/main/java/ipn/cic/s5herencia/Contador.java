package ipn.cic.s5herencia;

public class Contador {

    private int conteo;
    
    // Polimorfismo PARÁMETRICO +1 (Dentro de la misma clase)
    public Contador() {
        this.conteo = 0;
    }
    
    // Polimorfismo PARÁMETRICO +2 (Dentro de la misma clase)
    public Contador(int valor) {
        this.conteo = valor;
    }
    
    public int getConteo() {
        return this.conteo;
    }
    
    // Polimorfismo PARÁMETRICO +1 (Dentro de la misma clase)
    public void incrementar() {
        this.conteo += 1; // this.conteo = this.conteo + 1
    }

    // Polimorfismo PARÁMETRICO +2 (Dentro de la misma clase)
    public void incrementar(int valor) {
        this.conteo += valor; // this.conteo = this.conteo + valor
    }

    // Polimorfismo PARÁMETRICO +1 (Dentro de la misma clase)
    public void decrementar() {
        this.conteo -= 1; // this.conteo = this.conteo + 1
    }

    // Polimorfismo PARÁMETRICO +2 (Dentro de la misma clase)
    public void decrementar(int valor) {
        this.conteo -= valor; // this.conteo = this.conteo + valor
    }
    
    // -1
    public void describir() {
        System.out.printf("| %16d |\n", this.conteo);
    }
    
}
