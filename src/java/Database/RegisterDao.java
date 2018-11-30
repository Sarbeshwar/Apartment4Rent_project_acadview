package Database;
import java.sql.*;
public class RegisterDao {

 public boolean getRegistered(RegisterBean RR)
 {
     String Name10 = RR.getName();
     String Email10 = RR.getEmail();
     String Password10 = RR.getPassword();
     String Mobile10 = RR.getMobile();
     String Address10 = RR.getAddress();
     try
     {
         Connection conn=DBConnection.getConnection();
         String query="insert into login_signup values(?,?,?,?,?)";
         PreparedStatement pS = conn.prepareStatement(query);
         pS.setString(1, Name10);
         pS.setString(2, Email10);
         pS.setString(3, Password10);
         pS.setString(4, Mobile10);
         pS.setString(5, Address10);
         int i=pS.executeUpdate();
         
         if(i!=0)
         {
             System.out.println("Rows Affected:::"+i);
             return true;
         }
           else
             return false;
     }
     catch(Exception e)
     {
         System.out.println(e);
         return false;
     }
     
 }
}
