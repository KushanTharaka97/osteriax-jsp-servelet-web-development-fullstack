package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>AdminSignup -OsteriaX</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("     <script>\n");
      out.write("           function Submit(){\n");
      out.write("                var p=sp.pass.value;\n");
      out.write("                var cp=sp.cpass.value;\n");
      out.write("            //using else if\n");
      out.write("            if(p==cp)\n");
      out.write("                alert(\"Password and Confirmation are similer! Press submit\")\n");
      out.write("            else\n");
      out.write("                alert(\"Mismatch , re-type the password!\")\n");
      out.write("           \n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           function check(){\n");
      out.write("               var i=user.psw.value;\n");
      out.write("               var j=user.cpsw.value;\n");
      out.write("               //using else if\n");
      out.write("               if(i==j)\n");
      out.write("                    alert(\"Password and Confirmation are similer! Press submit\")\n");
      out.write("                else\n");
      out.write("                alert(\"Mismatch , re-type the password!\")\n");
      out.write("            \n");
      out.write("           }\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headers.jsp", out, false);
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("         <section class=\"jumbotron text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1 class=\"jumbotron-heading\">\n");
      out.write("            <strong>\n");
      out.write("                <font color=\"red\">SignUp!</font>\n");
      out.write("            </strong>\n");
      out.write("        </h1>\n");
      out.write("      <p class=\"lead text-muted\">You can sign up as new clinic by filling this form , use the procedure.</p>\n");
      out.write("      <div align=\"center\">\n");
      out.write("          <form action=\"../adminSignup\" method=\"POST\"  name=\"ad\">        \n");
      out.write("           <input type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Admin User Name\" name=\"uname\" required=\"required\">\n");
      out.write("          <br>\n");
      out.write("           <input type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Admin's NIC\" name=\"nic\" required=\"required\">\n");
      out.write("          <br>\n");
      out.write("           <input type=\"text\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Admin's Contact Number\" name=\"tnum\" required=\"required\">\n");
      out.write("          <br>\n");
      out.write("          <input type=\"email\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Official Email of the Admin \" name=\"email\" required=\"required\">\n");
      out.write("          <br>\n");
      out.write("           <input type=\"password\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"password\" name=\"pass\" required=\"required\">\n");
      out.write("          <br>\n");
      out.write("           <input type=\"password\" class=\"form-control\" aria-label=\"Sizing example input\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Confirm Password\" name=\"cpass\" onchange=\"Submit()\">\n");
      out.write("          <br>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-success\" value=\"submit\">Insert new admin</button>\n");
      out.write("           </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
