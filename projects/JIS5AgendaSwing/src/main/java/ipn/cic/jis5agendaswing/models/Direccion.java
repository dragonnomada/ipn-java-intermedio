package ipn.cic.jis5agendaswing.models;

import ipn.cic.jis5agendaswing.enums.TipoDireccion;
import ipn.cic.jis5agendaswing.enums.TipoPais;

public class Direccion {
    
    private TipoDireccion tipo;
    private String calle;
    private String numExt;
    private String numInt;
    private String colonia;
    private String ciudad;
    private String estado;
    private TipoPais pais;
    private String codigoPostal;

    public Direccion(String calle, String num_ext, String num_int, String colonia, String codigoPostal) {
        this.tipo = TipoDireccion.OTRO;
        this.calle = calle;
        this.numExt = num_ext;
        this.numInt = num_int;
        this.colonia = colonia;
        this.ciudad = "Álvaro Obregón";
        this.estado = "Ciudad de México";
        this.pais = TipoPais.MEXICO;
        this.codigoPostal = codigoPostal;
    }
    
    /**
     * @return the tipo
     */
    public TipoDireccion getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoDireccion tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pais
     */
    public TipoPais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(TipoPais pais) {
        this.pais = pais;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the numExt
     */
    public String getNumExt() {
        return numExt;
    }

    /**
     * @param numExt the numExt to set
     */
    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    /**
     * @return the numInt
     */
    public String getNumInt() {
        return numInt;
    }

    /**
     * @param numInt the numInt to set
     */
    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }
    
    
    
}
