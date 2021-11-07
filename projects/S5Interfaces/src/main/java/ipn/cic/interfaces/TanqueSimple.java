package ipn.cic.interfaces;

public class TanqueSimple implements ITanque {

    double capacidadMaxima;
    double capacidadActual;
    
    ITanque tanqueConectado;
    
    boolean abierto;
    
    double flujo;
    
    public TanqueSimple(double capMax, double capAct, double flujo) {
        this.capacidadMaxima = capMax;
        this.capacidadActual = capAct;
        this.flujo = flujo;
        this.abierto = false;
        this.tanqueConectado = null;
    }
    
    public void conectarTanque(ITanque tanque) {
        this.tanqueConectado = tanque;
    }
    
    public void desconectarTanque() {
        this.tanqueConectado = null;
    }
    
    @Override
    public double getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    @Override
    public double getCapacidadActual() {
        return this.capacidadActual;
    }

    @Override
    public boolean isLleno() {
        return this.getCapacidadActual() >= this.getCapacidadMaxima();
    }

    @Override
    public ITanque getTanqueConectado() {
        return this.tanqueConectado;
    }
    
    @Override
    public boolean isTanqueConectado() {
        return this.tanqueConectado != null;
    }

    @Override
    public void abrir() {
        if (this.isCerrado()) {
            this.abierto = true;
        } else {
            System.out.println("El tanque ya está abierto");
        }
    }

    @Override
    public void cerrar() {
        if (this.isAbierto()) {
            this.abierto = false;
        } else {
            System.out.println("El tanque ya está cerrado");
        }
    }

    @Override
    public void cicloBalance(double tiempoTranscurrido) {
        if (this.isAbierto()) {
            double cantidad = this.flujo * tiempoTranscurrido;
            this.capacidadActual -= cantidad;
            if (this.capacidadActual < 0) {
                this.capacidadActual = 0;
                this.cerrar();
            }
            if (this.isTanqueConectado()) {
                this.tanqueConectado.llenar(cantidad);
            }
        }
    }

    @Override
    public boolean isAbierto() {
        return this.abierto;
    }

    @Override
    public boolean isCerrado() {
        return !this.abierto;
    }

    @Override
    public void describir() {
        double porcentaje = 100 * this.getCapacidadActual() / this.getCapacidadMaxima();
        String estado = "DESCONOCIDO";
        if (this.isAbierto()) {
            estado = "ABIERTO";
        } else {
            estado = "CERRADO";
        }
        System.out.printf("| %.2f / %.2f (%.2f%%) | %s |\n",
                this.getCapacidadActual(),
                this.getCapacidadMaxima(),
                porcentaje,
                estado);
    }

    @Override
    public void llenar(double cantidad) {
        if (this.isLleno()) {
            this.cerrar();
            return;
        }
        this.capacidadActual += cantidad;
    }
    
}
