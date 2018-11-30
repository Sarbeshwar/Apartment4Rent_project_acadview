package Database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/search_main"})
public class search_main extends HttpServlet 
{

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
            HttpSession session=request.getSession(false);
            String state=(String) session.getAttribute("abc");
            String size=(String) session.getAttribute("xyz");
            Connection con=DBConnection.getConnection();
            String que="select * from rentin where state=(?) and size=(?);";
            PreparedStatement stmt=con.prepareStatement(que);
            stmt.setString(1,state);
            stmt.setString(2, size);
            ResultSet rs=stmt.executeQuery();
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            ArrayList<SearchBean> Arr=new ArrayList<SearchBean>();
            while(rs.next())
            {
                Arr.add(new SearchBean(rs.getString("firstname"),rs.getString("lastname"),rs.getString("email"),rs.getString("address"),rs.getString("state"),rs.getString("size"),rs.getString("zip")));
            }
            request.setAttribute("Sarbi",Arr);
            request.getRequestDispatcher("/show.jsp").include(request, response);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
