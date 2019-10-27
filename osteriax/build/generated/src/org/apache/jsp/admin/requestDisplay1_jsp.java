package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public final class requestDisplay1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Request Display -Admin OsteriaX</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headers.jsp", out, false);
      out.write("\n");
      out.write("        <h1 align=\"center\">Requests from Clinics!</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

                    try{
                    //Creating database connection in the .jsp page
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/osteriax","root","");
                    String sql="SELECT * FROM clinic WHERE accept!='1'";
                    Statement stmt=conn.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    while(rs.next()){

                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        <h1 align='center'>Request From Clinics</h1>\n");
      out.write("        <div class=\"album py-5 bg-light\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("                 <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <div class=\"card mb-4 shadow-sm\">\n");
      out.write("          \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <p class=\"card-text\">\n");
      out.write("                    Clinic Name:");
out.println(rs.getString("clinicname")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    Clinic Owner:");
out.println(rs.getString("username")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    Owner's NIC:");
out.println(rs.getString("nic")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    Email:");
out.println(rs.getString("email")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    City:");
out.println(rs.getString("city")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    Tel Num:");
out.println(rs.getString("telnum")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    Reg Date:");
out.println(rs.getString("regdate")); 
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                      <form method=\"POST\" action=\"../accept\">\n");
      out.write("                            <input type=\"hidden\" name=\"update\" value=\"");
out.println(rs.getString("email"));
      out.write("\" >\n");
      out.write("                            <input type=\"submit\" name=\"submit\" value=\"Add Clinic\" ID=\"button\" class=\"btn btn-primary btn-lg\" >\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                </p>\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                <div class=\"btn-group\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\n");
      out.write("                  <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\n");
      out.write("                </div>\n");
      out.write("                <small class=\"text-muted\">9 mins</small>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                            ");
 }
      out.write("     \n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("         ");
 
                    rs.close();
                    stmt.close();
                    conn.close();
                    }
                            catch(Exception e)
                            {
                            e.printStackTrace();
                            }

                    
                
      out.write("\n");
      out.write("        \n");
      out.write("        <!--bootstrap JS-->\n");
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
