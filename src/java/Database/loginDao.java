package Database;
import java.sql.*;
public class loginDao {
  public boolean getLogIn(LoginBean LG)
  {
      String Email10=LG.getEmail();
      String Password10=LG.getPassword();
      String userEmailDB = "";
      String passwordDB = "";
      try
      {
          Connection conn =DBConnection.getConnection();
         Statement  statement = conn.createStatement();
         ResultSet resultSet = statement.executeQuery("select Email,Password from login_signup");
          while(resultSet.next())
          {
          userEmailDB = resultSet.getString("Email");
          passwordDB = resultSet.getString("Password");
 
   if(Email10.equals(userEmailDB) && Password10.equals(passwordDB))
   {
      return true; 
   }
 }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return false;
  }
}
