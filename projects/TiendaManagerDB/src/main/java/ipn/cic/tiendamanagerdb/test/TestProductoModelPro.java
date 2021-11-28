package ipn.cic.tiendamanagerdb.test;

import ipn.cic.tiendamanagerdb.Producto;
import ipn.cic.tiendamanagerdb.ProductoModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestProductoModelPro {
    
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda?user=root&password=password");
        
        Producto p1 = ProductoModel.findById(conn, 4);
        
        System.out.println(p1);
        
        System.out.println("-------------------------------");
        
        ArrayList<Producto> productos = ProductoModel.findAll(conn);
        
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
        System.out.println("-------------------------------");
        
        ArrayList<Producto> productosRebajados = ProductoModel.findByPrecio(conn, 8, 15);
        
        for (Producto producto : productosRebajados) {
            System.out.println(producto);
        }
        
        System.out.println("-------------------------------");
        
        ArrayList<Producto> productosM = ProductoModel.findByNombre(conn, "%ml%");
        
        for (Producto producto : productosM) {
            System.out.println(producto);
        }
        
        System.out.println("-------------------------------");
        
        conn.close();
                
    }
    
}
