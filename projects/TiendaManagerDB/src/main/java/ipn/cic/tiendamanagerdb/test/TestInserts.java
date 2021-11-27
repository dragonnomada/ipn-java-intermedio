package ipn.cic.tiendamanagerdb.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInserts {

    public static void main(String[] args) throws SQLException {
        
        // Definimos la conexión
        String url = String.format("jdbc:mysql://%s/%s?user=%s&password=%s",
                "localhost",
                "Tienda",
                "root",
                "password");

        // Abrimos la conexión
        Connection conn = DriverManager.getConnection(url);
        
        // TODO: Hacer algo con la conexión
        System.out.println("Conectado a MySQL :D");
        System.out.println(conn);
        
        String sql = "INSERT INTO Productos "
                + "(Codigo, Nombre, Precio) "
                + "VALUES (?, ?, ?)";
        
        PreparedStatement statement = conn.prepareStatement(sql);
        
        statement.setString(1, "A123");
        statement.setString(2, "Coca Cola 600 ml");
        statement.setDouble(3, 17.5);
        
        statement.executeUpdate();
        
        // Cerramos la conexión
        conn.close();
        
    }
    
}
