package ipn.cic.jis6arboles;

import java.util.ArrayList;

public class Canasta {

    String nombre;
    ArrayList<Fruta> frutas = new ArrayList<>();
    
    public Canasta(String nombre) {
        this.nombre = nombre;
    }
    
    public void addFruta(Fruta fruta) {
        frutas.add(fruta);
    }
    
    public void addFruta(String nombre) {
        frutas.add(new Fruta(nombre));
    }
    
    public String toString() {
        return this.nombre;
    }
    
}
