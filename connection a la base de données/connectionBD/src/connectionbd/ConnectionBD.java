
package connectionbd;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
public class ConnectionBD {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Produit");
            while (rs.next()) {
                System.out.println(rs.getString("Nom"));
                
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
}
