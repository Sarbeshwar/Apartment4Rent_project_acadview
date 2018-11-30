package Database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/SearchServlet"})
public class SearchServlet extends HttpServlet {
    
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException 
    {
            String state = req.getParameter("state");
        String size = req.getParameter("Size");
        SearchBean SB=new SearchBean();
        SB.setSize(size);
        SB.setState(state);
            SearchDao SD=new SearchDao();
            Boolean check=SD.searchcheck(SB);
        if(check==true)
        {
            HttpSession session=req.getSession(true);
            session.setAttribute("abc",state);
            session.setAttribute("xyz",size);
            req.getRequestDispatcher("search_main").forward(req,res);
        }
        else
        {
            req.setAttribute("errMessage",check);
            req.getRequestDispatcher("/mainprogram.jsp").forward(req,res);
        }
           
    }
    }

    

