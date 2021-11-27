package ipn.cic.tiendamanagerdb.test;

import ipn.cic.tiendamanagerdb.ProductoModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestProductoModel {

    public static void main(String[] args) throws SQLException {
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda?user=root&password=password");
     
        ProductoModel p1 = new ProductoModel(conn);
        
        p1.fetchById(1);
        
        System.out.println(p1);
        
        ProductoModel p2 = new ProductoModel(conn);
        
        p2.fetchByCodigo("A123");
        
        System.out.println(p2);
        
        conn.close();
        
    }
    
}
