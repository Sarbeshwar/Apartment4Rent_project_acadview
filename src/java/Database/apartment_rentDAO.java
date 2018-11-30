package Database;
import java.sql.*;
public class apartment_rentDAO 
{
    public boolean insert(apartment_rent a)
    {
      String firstname=a.getFirstname();
      String lastname=a.getLastname();
      String email=a.getEmail();
      String address=a.getAddress();
      String state=a.getState();
      String zip=a.getZip();
      String size=a.getSize();
      String specification=a.getSpecification();
      String rent=a.getRent();
      String tenure=a.getTenure();
        try
        {
            Connection conn =DBConnection.getConnection();
            String query="INSERT INTO rentin VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pS = conn.prepareStatement(query);
            pS.setString(1,firstname);
            pS.setString(2,lastname);
            pS.setString(3,email);
            pS.setString(4,address);
            pS.setString(5,state);
            pS.setString(6,zip);
            pS.setString(7,size);
            pS.setString(8,specification);
            pS.setString(9,rent);
            pS.setString(10,tenure);
            int i=pS.executeUpdate();
             if(i!=0)
                    {
                        System.out.println("Rows Affected:::"+i);
                        return true;
                    }
             else
             {
                 
             return false;
             }
        }
        catch(Exception e)
        {
            System.out.println(a);
            return false;
        }
    }
}
