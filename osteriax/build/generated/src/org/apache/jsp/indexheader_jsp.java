package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>OsteriaX | Home</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">   \n");
      out.write("    <!-- Slick slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/slick.css\">    \n");
      out.write("    <!-- Date Picker -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap-datepicker.css\">   \n");
      out.write("     <!-- Gallery Lightbox -->\n");
      out.write("    <link href=\"assets/css/magnific-popup.css\" rel=\"stylesheet\"> \n");
      out.write("    <!-- Theme color -->\n");
      out.write("    <link id=\"switcher\" href=\"assets/css/theme-color/default-theme.css\" rel=\"stylesheet\">     \n");
      out.write("\n");
      out.write("    <!-- Main style sheet -->\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\">    \n");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("\n");
      out.write("    <!-- Prata for body  -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Prata' rel='stylesheet' type='text/css'>\n");
      out.write("    <!-- Tangerine for small title -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Tangerine' rel='stylesheet' type='text/css'>   \n");
      out.write("    <!-- Open Sans for title -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header id=\"mu-header\">  \n");
      out.write("    <nav class=\"navbar navbar-default mu-main-navbar\" role=\"navigation\">  \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <!-- LOGO -->       \n");
      out.write("\n");
      out.write("           <!--  Text based logo  -->\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.html\">Osteria<span>X</span></a> \n");
      out.write("\n");
      out.write("\t\t      <!--  Image based logo  -->\n");
      out.write("          <!-- <a class=\"navbar-brand\" href=\"index.html\"><img src=\"assets/img/logo.png\" alt=\"Logo img\"></a>  -->\n");
      out.write("         \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right mu-main-nav\">\n");
      out.write("            <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("            <li><a href=\"#mu-about-us\">ABOUT US</a></li>                       \n");
      out.write("            <li><a href=\"#mu-restaurant-menu\">MENU</a></li>                       \n");
      out.write("            <li><a href=\"#mu-reservation\">RESERVATION</a></li>                       \n");
      out.write("          \n");
      out.write("               <li><a href=\"#mu-contact\">CONTACT</a></li> \n");
      out.write("            <li><a href=\"#mu-chef\">Register Your Clinic Here</a></li> \n");
      out.write("         \n");
      out.write("          </ul>                            \n");
      out.write("        </div><!--/.nav-collapse -->       \n");
      out.write("      </div>          \n");
      out.write("    </nav> \n");
      out.write("  </header>\n");
      out.write("  <!-- End header section -->\n");
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
