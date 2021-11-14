package ipn.cic.jis5jbuttonshandlers;

public class Contador {

    int conteo;
    
    public void incrementar() {
        this.conteo++;
    }
    
    public void decrementar() {
        this.conteo--;
    }
    
    public String getDisplay() {
        return String.format("Conteo: %d", this.conteo);
    }
    
}
