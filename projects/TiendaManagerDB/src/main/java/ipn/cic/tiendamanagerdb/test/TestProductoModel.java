package ipn.cic.tiendamanagerdb.test;

import ipn.cic.tiendamanagerdb.Producto;
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
        
        ProductoModel p3 = new ProductoModel(conn);
        
        p3.create("C773", "Gansito 3", 10);
        
        System.out.println(p3);
        
        Producto p4 = ProductoModel.create(conn, "X996", "Compaq 6", 14801.93);
        
        System.out.println(p4);
        
        if (p4.updateNombre("Compaq 6 MODIFICADO")) {
            System.out.println(p4);
        } else {
            System.out.println("Error al actualizar el nombre del producto 4");
        }
        
        conn.close();
        
    }
    
}
