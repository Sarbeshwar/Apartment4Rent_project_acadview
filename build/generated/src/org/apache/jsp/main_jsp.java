package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Apartment4rent</title>\r\n");
      out.write("<style>\r\n");
      out.write(".footer\r\n");
      out.write("{\r\n");
      out.write("  color:white;\r\n");
      out.write("  padding:20px;\r\n");
      out.write("}   \r\n");
      out.write("\r\n");
      out.write("#RI {\r\n");
      out.write("    width: 20em;  height: 2em;\r\n");
      out.write("}\r\n");
      out.write("#RO {\r\n");
      out.write("    width: 20em;  height: 2em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background =\"premium_keklaguna-45.jpg\">\r\n");
      out.write("<div style = \"text-align:right; float:right\">\r\n");
      out.write("</div>\r\n");
      out.write("<center><b><h1><p>Appartment4Rent</p></h1></b></center>\r\n");
      out.write("<h2><center>Luxury, Location and Convenience.</center></h2>\r\n");
      out.write("<center><h1><b>Discover Your Perfect Rental..</b></h1></center>\r\n");
      out.write("<center><img src=\"vu-hp-takeover-desktop.jpg\"style=\"margin-bottom: 20px;\"></center>\r\n");
      out.write("<center><h3><p>Find Your Perfect Apartment</p></h3></center>\r\n");
      out.write("<center><h3><p>OR</p></h3></center>\r\n");
      out.write("<center><h3><p>Rent Out Your Apartment</p></h3></center>\r\n");
      out.write("<form>\r\n");
      out.write("<center>\r\n");
      out.write("<input type=\"button\" id=\"RI\" value=\"Continue\" onclick=\"window.location.href='RI&RO.jsp'\"/>\r\n");
      out.write("</center>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("<div>\r\n");
      out.write("<div>Copyright 2018 © Appart4Rent. All rights reserved.\r\n");
      out.write("<a href=\"#\" style=\"float:right;\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
