package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import Database.SearchBean;
import java.util.ArrayList;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
 ArrayList<SearchBean> ar=(ArrayList<SearchBean>)request.getAttribute("Sarbi");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search_Output</title>\n");
      out.write("        <style>\n");
      out.write(".footer\n");
      out.write("{\n");
      out.write("  color:white;\n");
      out.write("  padding:20px;\n");
      out.write("}   \n");
      out.write("\n");
      out.write("#RI {\n");
      out.write("    width: 20em;  height: 2em;\n");
      out.write("}\n");
      out.write("#RO {\n");
      out.write("    width: 20em;  height: 2em;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body background =\"premium_keklaguna-45.jpg\">\n");
      out.write("        <div style = \"text-align:right; float:right\">\n");
      out.write("        </div>\n");
      out.write("        <center><b><h1><p>Results as per your Request</p></h1></b></center>\n");
      out.write("        <center><img src=\"vu-hp-takeover-desktop.jpg\"style=\"margin-bottom: 20px;\"></center>\n");
      out.write("        ");
 if(!ar.isEmpty())
        {
            for(int i=0;i<ar.size();i++)
            {
        
      out.write("\n");
      out.write("        <p>");
      out.print(ar.get(i).getFirstname());
      out.write("</p>  \n");
      out.write("        <p>");
      out.print(ar.get(i).getLastname());
      out.write("</p>\n");
      out.write("        <p>");
      out.print(ar.get(i).getAddress());
      out.write("</p>\n");
      out.write("        <p>");
      out.print(ar.get(i).getState());
      out.write("</p>\n");
      out.write("        <p>");
      out.print(ar.get(i).getSize());
      out.write("</p>\n");
      out.write("        <p>");
      out.print(ar.get(i).getEmail());
      out.write("</p>\n");
      out.write("        <p>");
      out.print(ar.get(i).getZip());
      out.write("</p>\n");
      out.write("        ");
}}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
