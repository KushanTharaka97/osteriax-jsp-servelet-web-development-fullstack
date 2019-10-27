package org.apache.jsp.askQuestions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public final class ask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("        <meta name=\"generator\" content=\"Jekyll v3.8.5\">\n");
      out.write("        <title>Ask From Us OsterX</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headers.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--database creating-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 align=\"center\">Ask Question </h1>\n");
      out.write("             <form action=\"../comment\" method=\"POST\">\n");
      out.write("                 <hr>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("             <label for=\"formGroupExampleInput2\">User Name</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"formGroupExampleInput\" name=\"user\" placeholder=\"ex: John Laughfs\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("                 <hr>\n");
      out.write("           \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     <label for=\"formGroupExampleInput2\">Select category </label>\n");
      out.write("                     <br>\n");
      out.write("                     <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"category\" id=\"inlineRadio1\" value=\"1\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"inlineRadio1\">Ask Surgery</label>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"category\" id=\"inlineRadio2\" value=\"2\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"inlineRadio2\">Checkups </label>\n");
      out.write("                   </div>\n");
      out.write("                     \n");
      out.write("                       <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"category\" id=\"inlineRadio3\" value=\"3\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"inlineRadio3\">Ask About Foods</label>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"category\" id=\"inlineRadio4\" value=\"4\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"inlineRadio4\">Ask Vaccinations</label>\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <hr>\n");
      out.write("                 \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"formGroupExampleInput2\">Question</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"formGroupExampleInput2\" name=\"ques\" placeholder=\"ex: What is suitable way to Vaccination?\">\n");
      out.write("        </div>\n");
      out.write("                 <hr>\n");
      out.write("                 <label class=\"form-group\">Asking From</label>\n");
      out.write("                 <select class=\"form-group\" name=\"se\">\n");
      out.write("                  \n");
      out.write("                    <option value=\"Anyone\">Not Specific</option>\n");
      out.write("                       ");

                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/osteriax","root","");
                    String sql="SELECT * FROM clinic WHERE accept!='0'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){
                
      out.write("\n");
      out.write("                    <option value=\"");
out.println(rs.getString("clinicname")); 
      out.write('"');
      out.write('>');
out.println(rs.getString("clinicname")); 
      out.write("</option>\n");
      out.write("                         ");
 }  
      out.write("\n");
      out.write("                         ");

                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }    
                
      out.write("\n");
      out.write("                  </select>\n");
      out.write("                 <hr>\n");
      out.write("                 <div>\n");
      out.write("                     <input type=\"submit\" name=\"submit\" value=\"submit\">\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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
