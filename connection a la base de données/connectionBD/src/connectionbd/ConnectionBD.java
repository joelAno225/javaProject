
package connectionbd;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBD {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_test", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Produit");
            while (rs.next()) {
                System.out.println(rs.getString("Nom"));
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
