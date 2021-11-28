package ipn.cic.tiendamanagerdb;

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

public abstract class Producto {
    
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
    
    public abstract boolean updateNombre(String nombre);
    
    public abstract boolean updatePrecio(double precio);
    
    public abstract boolean updateActivo(boolean activo);
    
    public abstract boolean delete();
    
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
