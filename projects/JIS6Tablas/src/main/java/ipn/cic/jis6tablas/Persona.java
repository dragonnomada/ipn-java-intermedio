package ipn.cic.jis6tablas;

public class Persona {

    String nombre;
    int edad;
    double peso;
    boolean esCasado;
    boolean estaVivo;
    
    public Persona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.esCasado = false;
        this.estaVivo = true;
    }
    
}
