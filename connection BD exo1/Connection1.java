
package connection1;

import  java.sql.*;

public class Connection1 {

   
    public static void main(String[] args) {
        System.out.println("hhhh");
        
        
    }
    public static Connection connecterDB(){
       
         try{
             Class.forName("com.mysql.jdbc.Driver");
             System.out.println("Driver oki");
             String url ="jdbc:mysql://localhost:3306;databasename=bd;user=root;password=";
             Connection con=null;
             Statement st = null;
             ResultSet rs = null;
             con = DriverManager.getConnection(url);
             
             String sql = "SELECT * FROM `produit` WHERE 1";
             st = con.createStatement();
             rs = st.executeQuery(sql);
             
             while (rs.next()){
                 System.out.println(rs.getString(1));
             }
             
             con.getClientInfo().size();
             System.out.println(con.getClientInfo().size());
         }catch (Exception e){
            e.printStackTrace();}
              return null;
   }
}
