package ipn.cic.s5herencia;

// Herencia Simple
public class ContadorNombrado extends Contador {
    
    // lo del padre más ...
    
    String nombre;
    
    // Polimorfismo PARÁMETRICO +1 (Dentro de la misma clase)
    ContadorNombrado(String nombre) {
        // Herencia | Constructor Padre (Sobrecarga +1)
        super(); // Contador()
        this.nombre = nombre;
    }
    
    // Polimorfismo PARÁMETRICO +2 (Dentro de la misma clase)
    ContadorNombrado(String nombre, int valor) {
        // Herencia | Constructor Padre (Sobrecarga +2)
        super(valor); // Contador(int valor)
        this.nombre = nombre;
    }
    
    // Polimorfismo SOBRECARGA +3 (Carga está en el hijo)
    public void incrementar(int base, int multiplo) {
        this.incrementar(base * multiplo);
    }
    
    // Polimorfismo SOBRECARGA +3 (Carga está en el hijo)
    public void decrementar(int base, int multiplo) {
        this.decrementar(base * multiplo);
    }
    
    // Polimorfismo INCLUSIÓN -1 (Inclusión está en el hijo)
    @Override
    public void describir() {
        System.out.printf("| #%-6s | %6d |\n", this.nombre, this.getConteo());
    }
    
}
