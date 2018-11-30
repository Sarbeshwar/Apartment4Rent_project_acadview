package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Search Apartment</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("#RI {\r\n");
      out.write("    width: 20em;  height: 2em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body background =\"premium_keklaguna-45.jpg\" alink=\"cyan\" vlink=\"cyan\"\\>\r\n");
      out.write("<button onclick=\"goBack()\">Go Back</button>\r\n");
      out.write("<script>\r\n");
      out.write("function goBack() {\r\n");
      out.write("    window.history.back();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<center><h1><b>Search Your Desired Apartment</b></h1></center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><img src=\"vu-hp-takeover-desktop.jpg\"></center>\r\n");
      out.write("<br>\r\n");
      out.write("<center><p><h2><b>Please Fill This Form</b></h2></p></center>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<form method=\"post\" action=\"SearchServlet\">\r\n");
      out.write("<center>\r\n");
      out.write("<b>State:</b> \r\n");
      out.write("<input type=\"text\" name=\"state\" value=\"Enter State\">\r\n");
      out.write("<b>Size:</b>\r\n");
      out.write("<select name=\"Size\">\r\n");
      out.write("    <option value=\"1BHK\">1BHK</option>\r\n");
      out.write("    <option value=\"2BHK\">2BHK</option>\r\n");
      out.write("    <option value=\"3BHK\">3BHK</option>\r\n");
      out.write("    <option value=\"4BHK\">4BHK</option>\r\n");
      out.write("  </select>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write(" <button type=\"submit\" class=\"registerbtn\">Submit\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
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
