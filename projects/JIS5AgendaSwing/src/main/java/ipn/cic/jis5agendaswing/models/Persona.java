package ipn.cic.jis5agendaswing.models;

import ipn.cic.jis5agendaswing.enums.TipoMonth;
import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String aPaterno;
    private String aMaterno;
    
    private int dobYear;
    private TipoMonth dobMonth;
    private int dobDay;
    
    private ArrayList<Direccion> direcciones;
    private ArrayList<Telefono> telefonos;
    
    // RECESO DE 15:35 A 16:05 CDMX

    public Persona(String nombre, String aPaterno, String aMaterno) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        
        this.dobYear = 1900;
        this.dobMonth = TipoMonth.JANUARY;
        this.dobDay = 1;
        
        this.direcciones = new ArrayList<Direccion>();
        this.telefonos = new ArrayList<Telefono>();
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aPaterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno the aPaterno to set
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    /**
     * @return the aMaterno
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * @param aMaterno the aMaterno to set
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    /**
     * @return the dobYear
     */
    public int getDobYear() {
        return dobYear;
    }

    /**
     * @param dobYear the dobYear to set
     */
    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    /**
     * @return the dobDay
     */
    public int getDobDay() {
        return dobDay;
    }

    /**
     * @param dobDay the dobDay to set
     */
    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    /**
     * @return the direcciones
     */
    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * @param direcciones the direcciones to set
     */
    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    /**
     * @return the telefonos
     */
    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    /**
     * @param telefonos the telefonos to set
     */
    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    /**
     * @return the dobMonth
     */
    public TipoMonth getDobMonth() {
        return dobMonth;
    }

    /**
     * @param dobMonth the dobMonth to set
     */
    public void setDobMonth(TipoMonth dobMonth) {
        this.dobMonth = dobMonth;
    }
    
    
    
}
