package ipn.cic.tiendamanagerdb.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) throws SQLException {
        
        // Definimos la conexión
        String url = String.format("jdbc:mysql://%s/%s?user=%s&password=%s",
                "localhost:3306",
                "Tienda",
                "root",
                "password");

        // Abrimos la conexión
        Connection conn = DriverManager.getConnection(url);
        
        // TODO: Hacer algo con la conexión
        System.out.println("Conectado a MySQL :D");
        System.out.println(conn);
        
        // Cerramos la conexión
        conn.close();
        
    }
    
}
