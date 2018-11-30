package Database;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/apartment_rentServlet"})
public class apartment_rentServlet extends HttpServlet {

    @Override
   public void service (javax.servlet.http.HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
       String firstname =req.getParameter("firstname");
       String lastname = req.getParameter("lastname");
       String email=req.getParameter("email");
       String address=req.getParameter("address");
       String state=req.getParameter("state");
       String zip=req.getParameter("zip");
       String size=req.getParameter("Size");
       String specification=req.getParameter("Specification");
       String rent=req.getParameter("rent");
       String tenure=req.getParameter("tenure");
       apartment_rent LB = new apartment_rent();
       LB.setFirstname(firstname);
       LB.setLastname(lastname);
       LB.setEmail(email);
       LB.setAddress(address);
       LB.setState(state);
       LB.setZip(zip);
       LB.setSize(size);
       LB.setSpecification(specification);
       LB.setRent(rent);
       LB.setTenure(tenure);
       apartment_rentDAO LDD = new apartment_rentDAO();
       Boolean check=LDD.insert(LB);
        if(check==true)
            req.getRequestDispatcher("/upload_or_search_prompt.jsp").forward(req, res);
        else
        {
            req.setAttribute("errMessage", check);
            req.getRequestDispatcher("/upload_or_search_prompt.jsp").forward(req, res);
        }
   }
}
