package ipn.cic.testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        Connection conn = null;

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"
                    + "user=root&password=password");
            
            System.out.println("Conectado a MySQL");
            
            conn.close();
        } catch (Exception ex) {
            // handle the error
            System.out.println("ERROR");
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
    }

}
