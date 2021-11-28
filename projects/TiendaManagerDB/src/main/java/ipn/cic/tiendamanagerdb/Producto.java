package ipn.cic.tiendamanagerdb;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
describe Productos;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| ProductoID | int(11)      | NO   | PRI | NULL    | auto_increment |
| Codigo     | varchar(255) | NO   | UNI | NULL    |                |
| Nombre     | varchar(255) | NO   |     | NULL    |                |
| Precio     | double       | YES  |     | 0       |                |
| Activo     | tinyint(1)   | YES  |     | 1       |                |
+------------+--------------+------+-----+---------+----------------+
*/

public class Producto {
    
    protected int productoId;
    protected String codigo;
    protected String nombre;
    protected double precio;
    protected boolean activo;

    @Override
    public String toString() {
        return String.format("[%d] #%s %s $%.2f %B", 
                this.productoId,
                this.codigo,
                this.nombre,
                this.precio,
                this.activo);
    }
    
    public boolean updateNombre(String nombre) {
        return false;
    }
    
    public boolean updatePrecio(double precio) {
        return false;
    }
    
    public boolean updateActivo(boolean activo) {
        return false;
    }
    
    public boolean delete() {
        return false;
    }
    
    public int getProductoId() {
        return productoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isActivo() {
        return activo;
    }
    
}
