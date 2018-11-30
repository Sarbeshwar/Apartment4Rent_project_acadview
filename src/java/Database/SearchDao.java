package Database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/SearchDao"})
public class SearchDao extends HttpServlet 
{
    public boolean searchcheck(SearchBean SB)
    {
        String State10=SB.getState();
        String Size10=SB.getSize();
        String size20="";
        String state20="";
        try
        {
            Connection con=DBConnection.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select state,size from rentin;");
            while(rs.next())
            {
                state20=rs.getString("state");
                size20=rs.getString("size");
                if(State10.equals(state20) && Size10.equals(size20))
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
