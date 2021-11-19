
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class helper {
    private static Connection cn;
   public static Connection ketnoi(){
        try {
            String user="admin";
            String password="admin";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url= "jdbc:sqlserver://localhost:1433;databaseName=QLSHOPQANHOM3";
         cn= DriverManager.getConnection(url, user, password);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
         return cn;
    }
   public static PreparedStatement prepare(String query) throws SQLException {
        return ketnoi().prepareStatement(query);
    }
}
