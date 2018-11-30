package Database;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/InfoAdd"})
public class InfoAdd extends HttpServlet {

    @Override
   public void service (javax.servlet.http.HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
        String name = req.getParameter("Name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("phone");
        String address = req.getParameter("address");
        RegisterBean Reg = new RegisterBean();
        Reg.setName(name);
        Reg.setEmail(email);
        Reg.setPassword(password);
        Reg.setMobile(mobile);
        Reg.setAddress(address);
        RegisterDao rDao = new RegisterDao();
        Boolean check=rDao.getRegistered(Reg);
        if(check==true)
            req.getRequestDispatcher("/login.jsp").forward(req, res);
        else
        {
            req.setAttribute("errMessage", check);
            req.getRequestDispatcher("/Signup.jsp").forward(req, res);
        }
    }
    
}
