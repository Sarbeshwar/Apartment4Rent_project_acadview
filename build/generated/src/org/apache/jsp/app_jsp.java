package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Apartment for rent</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {box-sizing:border-box}\r\n");
      out.write("body {font-family: Verdana,sans-serif;}\r\n");
      out.write(".mySlides {display:none}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".slideshow-container {\r\n");
      out.write("  max-width: 1000px;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 15px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 8px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".numbertext {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".dot {\r\n");
      out.write("  height: 13px;\r\n");
      out.write("  width: 13px;\r\n");
      out.write("  margin: 0 2px;\r\n");
      out.write("  background-color: #bbb;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  transition: background-color 0.6s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("  background-color: #717171;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".fade {\r\n");
      out.write("  -webkit-animation-name: fade;\r\n");
      out.write("  -webkit-animation-duration: 0.5s;\r\n");
      out.write("  animation-name: fade;\r\n");
      out.write("  animation-duration: 0.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes fade {\r\n");
      out.write("  from {opacity: .4} \r\n");
      out.write("  to {opacity: 1}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fade {\r\n");
      out.write("  from {opacity: .4} \r\n");
      out.write("  to {opacity: 1}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media only screen and (max-width: 300px) {\r\n");
      out.write("  .text {font-size: 11px}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\r\n");
      out.write("</head>\r\n");
      out.write("<body background =\"premium_keklaguna-45.jpg\" alink=\"cyan\" vlink=\"cyan\"\\>\r\n");
      out.write("<div style = \"text-align:right; float:right\">\r\n");
      out.write("</div>\r\n");
      out.write("<div style = \"clear: right; float: right; text-align: right;\">\r\n");
      out.write("<a href = \"login.jsp\"><h4>Login</h4></a> <a href = \"Signup.jsp\"><h4>SignUp</h4></a>\r\n");
      out.write("</div>\r\n");
      out.write("<center><b><h1><p>Appartment4Rent</p></h1></b></center>\r\n");
      out.write("<h2><center>Luxury, Location and Convenience.</center></h2>\r\n");
      out.write("<div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">1 / 5</div>\r\n");
      out.write("  <img src=\"Beautiful_Luxury_House_with_Swiming_Pool_Wallpapers_for_Desktop.jpg\" style=\"width:100%\">\r\n");
      out.write("  <div class=\"text\">Appartment4Rent</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">2 / 5</div>\r\n");
      out.write("  <img src=\"best-indian-house-models-Photo6.jpg\" style=\"width:100%\">\r\n");
      out.write("  <div class=\"text\">Appartment4Rent</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">3 / 5</div>\r\n");
      out.write("  <img src=\"Simply_Amazing_Blue_and_White_Home_Interior_Wallpapers.jpg\" style=\"width:100%\">\r\n");
      out.write("  <div class=\"text\">Appartment4Rent</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">4 / 5</div>\r\n");
      out.write("  <img src=\"thumb-1920-435117.jpg\" style=\"width:100%\">\r\n");
      out.write("  <div class=\"text\">Appartment4Rent</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"mySlides fade\">\r\n");
      out.write("  <div class=\"numbertext\">5 / 5</div>\r\n");
      out.write("  <img src=\"indian-architectural-designs-house-plans.jpg\" style=\"width:100%\">\r\n");
      out.write("  <div class=\"text\">Appartment4Rent</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center\">\r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span> \r\n");
      out.write("  <span class=\"dot\"></span>\r\n");
      out.write("  <span class=\"dot\"></span>\r\n");
      out.write("  <span class=\"dot\"></span>   \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var slideIndex = 0;\r\n");
      out.write("showSlides();\r\n");
      out.write("\r\n");
      out.write("function showSlides() {\r\n");
      out.write("    var i;\r\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\r\n");
      out.write("    for (i = 0; i < slides.length; i++) {\r\n");
      out.write("       slides[i].style.display = \"none\";  \r\n");
      out.write("    }\r\n");
      out.write("    slideIndex++;\r\n");
      out.write("    if (slideIndex> slides.length) {slideIndex = 1}    \r\n");
      out.write("    for (i = 0; i < dots.length; i++) {\r\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \r\n");
      out.write("    dots[slideIndex-1].className += \" active\";\r\n");
      out.write("    setTimeout(showSlides, 2000);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\r\r\r\n");
      out.write("<center><h1><b>Discover Your Perfect Rental..</b></h1></center>\r\r\n");
      out.write("<div class=\"a\">\r\n");
      out.write("<div class=\"b\">\r\n");
      out.write("<div class=\"c\">\r\n");
      out.write("<div class=\"d\">\r\n");
      out.write("<center><img src=\"vu-hp-takeover-desktop.jpg\"style=\"margin-bottom: 20px;\"></center>\r\n");
      out.write("<div class=\"e\">\r\n");
      out.write("<center><p style=\"margin-bottom:5px;\">Find Your Dream Appartment Here!!</p></center>\r\n");
      out.write("<center><p style=\"margin-bottom:5px;\">OR</p></center>\r\n");
      out.write("<center><p class=\"f\">Rent out your Appartment for extra income</p></center>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<center><div class=\"g\"><a href = \"Signup.jsp\"><h4>SignUp</h4></a></div></center>\r\n");
      out.write("<center><p class=\"h\">Already have an account?</p><a href = \"login.jsp\">Login</a></div></center>\r\n");
      out.write("</div>\r\n");
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
