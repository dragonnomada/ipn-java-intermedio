package ipn.cic.jis5agendaswing.models;

import ipn.cic.jis5agendaswing.enums.TipoTelefono;

// MODELO LÓGICO/DATOS (*M*VC)
public class Telefono {

    private TipoTelefono tipo = TipoTelefono.OTRO;
    private String numero = "DESCONOCIDO";
    
    public String getDisplay() {
        return String.format("[%s] %s", this.getTipo(), this.getNumero());
    }

    public TipoTelefono getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefono tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
