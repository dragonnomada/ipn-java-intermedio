package ipn.cic.tiendamanagerdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductoModel extends Producto {
    
    private final Connection conn;
    
    public ProductoModel(Connection conn) {
        super();
        
        this.conn = conn;
    }
    
    public void create(String codigo, String nombre, double precio) throws SQLException {
        String sql = "INSERT INTO Productos (Codigo, Nombre, Precio) "
                + "VALUES (?, ?, ?)";
        
        PreparedStatement statement = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        statement.setString(1, codigo);
        statement.setString(2, nombre);
        statement.setDouble(3, precio);
        
        statement.executeUpdate();
        
        ResultSet resultSet = statement.getGeneratedKeys();
        
        if (resultSet.next()) {
            int id = resultSet.getInt(1);
            this.fetchById(id);
        }
    }
    
    public void fetchById(int id) throws SQLException {
        // 1. Buscar el producto en la base de datos
        String sql = "SELECT * FROM Productos WHERE ProductoID=?";
        
        PreparedStatement statement = this.conn.prepareStatement(sql);
        
        statement.setInt(1, id);
        
        ResultSet resultSet = statement.executeQuery();

        // 2. Ajustar las propiedades (Codigo, Nombre, Precio, Activo)
        //    a los resultados de la base de datos
        resultSet.next();
        
        this.productoId = resultSet.getInt("ProductoID");
        this.codigo = resultSet.getString("Codigo");
        this.nombre = resultSet.getString("Nombre");
        this.precio = resultSet.getDouble("Precio");
        this.activo = resultSet.getBoolean("Activo");
    }
    
    public void fetchByCodigo(String codigo) throws SQLException {
        // 1. Buscar el producto en la base de datos
        String sql = "SELECT * FROM Productos WHERE Codigo=?";
        
        PreparedStatement statement = this.conn.prepareStatement(sql);
        
        statement.setString(1, codigo);
        
        ResultSet resultSet = statement.executeQuery();

        // 2. Ajustar las propiedades (Codigo, Nombre, Precio, Activo)
        //    a los resultados de la base de datos
        resultSet.next();
        
        this.productoId = resultSet.getInt("ProductoID");
        this.codigo = resultSet.getString("Codigo");
        this.nombre = resultSet.getString("Nombre");
        this.precio = resultSet.getDouble("Precio");
        this.activo = resultSet.getBoolean("Activo");
    }
    
}
