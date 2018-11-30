package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>SignUp Page</title>\r\n");
      out.write("<style>\r\n");
      out.write("         body {background-color:cornsilk;\r\n");
      out.write("         font-family: Arial, Helvetica, sans-serif;}\r\n");
      out.write("         * {box-sizing: border-box}\r\n");
      out.write("         input[type=text], input[type=password],input[type=email],input[type=tel] {\r\n");
      out.write("         width: 100%;\r\n");
      out.write("         padding: 10px;\r\n");
      out.write("         margin: 5px 0 22px 0;\r\n");
      out.write("         display: inline-block;\r\n");
      out.write("         border: none;\r\n");
      out.write("         background: #f1f1f1;\r\n");
      out.write("         }\r\n");
      out.write("\t#submit\r\n");
      out.write("         {\r\n");
      out.write("         background-color: grey;\r\n");
      out.write("         color: white;\r\n");
      out.write("         padding: 14px 20px;\r\n");
      out.write("         margin: 8px 0;\r\n");
      out.write("         border: none;\r\n");
      out.write("         cursor: pointer;\r\n");
      out.write("         width: 30%;\r\n");
      out.write("         opacity: 2.9;\r\n");
      out.write("         }\r\n");
      out.write("         hr {\r\n");
      out.write("         border: 1px solid #f1f1f1;\r\n");
      out.write("         margin-bottom: 25px;\r\n");
      out.write("         }\r\n");
      out.write("         .container\r\n");
      out.write("         {\r\n");
      out.write("         padding : 15px;}\r\n");
      out.write("      </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body background =\"premium_keklaguna-45.jpg\" alink=\"cyan\" vlink=\"cyan\"\\>\r\n");
      out.write("<button onclick=\"goBack()\">Go Back</button>\r\n");
      out.write("<script>\r\n");
      out.write("function goBack() {\r\n");
      out.write("    window.history.back();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<center><h1><b>SignUp</b></h1></center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><img src=\"vu-hp-takeover-desktop.jpg\"></center>\r\n");
      out.write("<form name=\"form\" style=\"border:1px solid #ccc\" action=\"InfoAdd\" method=\"post\">\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("            <center><h2>Sign Up</h2></center>\r\n");
      out.write("            <center><p>Please fill in this form to create an account.</p></center>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <label for=\"Name\" ><b>Name</b></label><br>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter your Name\"  name=\"Name\" minlength=4 required>\r\n");
      out.write("            <br><label for=\"email\" ><b>Email</b></label><br>\r\n");
      out.write("            <input type=\"email\" placeholder=\"Enter your Email\" name =\"email\" required>\r\n");
      out.write("            <br><label for=\"password\" ><b>Password</b></label><br>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"password\" minlength=6 required> \r\n");
      out.write("            <br><label for=\"confirm\"><b>Confirm Password</b></label><br>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Confirm Password\" name=\"confirm\">\r\n");
      out.write("            <br><label for=\"phone\" ><b>Mobile Number</b></label><br>\r\n");
      out.write("            <input type=\"tel\" placeholder=\"Enter your Mobile number\"  name=\"phone\" minlength=10 maxlength=10 required>\r\n");
      out.write("            <br><label for=\"address\" ><b>Address</b></label><br>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter your Address\" name=\"address\" required>\r\n");
      out.write("            <br>\r\n");
      out.write("            <center> <input type=\"submit\" id=\"submit\" value =\"Signup\" name=\"submit\"> </center>\r\n");
      out.write("         </div>\r\n");
      out.write("      </form></body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
