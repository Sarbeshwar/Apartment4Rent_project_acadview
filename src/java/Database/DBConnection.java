package Database;
import java.sql.*;
public class DBConnection {
 static String url = "jdbc:mysql://localhost:3306/appartment4rent?user=root&password=@mik@ool&useSSL=false&verifyServerCertificate=false&allowMultiQueries=true"; 
// private static final String username = "root"; 
// private static final String password = "@mik@ool";
 
   public static Connection getConnection() throws ClassNotFoundException
   {
       Connection con =null;
        Class.forName("com.mysql.cj.jdbc.Driver");
       try{
           con = DriverManager.getConnection(url);
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       return con;
   }
}
