package ipn.cic.interfaces;

public interface ITanque {

    public double getCapacidadMaxima();
    
    public double getCapacidadActual();
    
    public boolean isLleno();
    
    public ITanque getTanqueConectado();
    
    public boolean isTanqueConectado();
    
    public void abrir();
    
    public void cerrar();
    
    public void cicloBalance(double tiempoTranscurrido);
    
    public boolean isAbierto();
    
    public boolean isCerrado();
    
    public void describir();
    
    public void llenar(double cantidad);
    
}
