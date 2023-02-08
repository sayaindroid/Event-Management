package org.apache.jsp.Event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title> event_management </title>\n");
      out.write("\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Rubik:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons+Outlined\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin_dashboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/event_management.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/quaries.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <menu>\n");
      out.write("        <p class=\"heading-pri\"> Admin Dashboard </p>\n");
      out.write("        <div>\n");
      out.write("            <ion-icon class=\"search-icon\" name=\"search\"></ion-icon>\n");
      out.write("            <input class=\"input\" type=\"text\" placeholder=\"Search\" required />\n");
      out.write("            <!-- <ion-icon name=\"chatbubble-outline\"></ion-icon>\n");
      out.write("            <ion-icon name=\"notifications-outline\"></ion-icon>\n");
      out.write("            <div class=\"profile\"><img src=\"customer-5.jpg\" alt=\"\"></div> -->\n");
      out.write("        </div>\n");
      out.write("    </menu>\n");
      out.write("    <section class=\"index\">\n");
      out.write("        <h1 class=\"admin-logo\"> YOY </h1>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"admin_dashboard.html\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"home\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"admin_dashboard.html\" class=\"index-item\">Home</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"event_management.html\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"stats-chart\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"Event_management.jsp\" class=\"index-item\">Event Management</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"person\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"index-item\"> Team Members</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"people\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"Users.jsp\" class=\"index-item\"> Users</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"chatbox-ellipses\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"index-item\"> Message </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"log-out\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"index-item\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <main>\n");
      out.write("        <style>\n");
      out.write("            .main-box{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                gap: 48rem;\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                border: none;\n");
      out.write("                padding: 1rem 3.2rem;\n");
      out.write("                border-radius: 9px;\n");
      out.write("            }\n");
      out.write("            .btn:link,\n");
      out.write("            .btn:visited {\n");
      out.write("              background-color: #ee7ad3;\n");
      out.write("              color: #333;\n");
      out.write("              transition: 0.3s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover,\n");
      out.write("            .btn:active {\n");
      out.write("              background-color: #b33295;\n");
      out.write("              color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn{\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-family: 'Rubik', sans-serif;\n");
      out.write("                font-size: 1.36rem;\n");
      out.write("                line-height: 1;\n");
      out.write("                color: #555;\n");
      out.write("                font-weight: 600;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("        <div class=\"main-box\">\n");
      out.write("        <div>\n");
      out.write("        <h1 id=\"main-h1\" class=\"heading-pri\"> Event Management </h1>\n");
      out.write("        <p class=\"sub-heading\"> Manage your events and there schedule </p>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <div><a class=\"btn\" href=\"AEvent.jsp\"> Add Event</a></div>\n");
      out.write("        </div>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            \n");
      out.write("            \n");

   try
{
response.setContentType("text/html");
Class.forName("com.mysql.jdbc.Driver");

Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/event","root","");

PreparedStatement pst=con.prepareStatement("select * from contact");

ResultSet rs=pst.executeQuery();
out.print("<table style='border:0px solid #333; font-size: 1.4rem; padding: 1rem 4rem; width: 100%; height: 50vh;"
        + " margin-left: auto; margin-right: auto; padding-left: 10px; padding-right: 10px; "
        + "background-color: #fff; border-radius: .25rem; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2); "
        + "text-align: left; border-radius: 9px;'><tr><th>Event ID</th><th>Event Type</th><th>Event Name</th><th>Event Date</th>"
        + "<th> Start Time</th><th> End Time</th><th> Price1</th><th> Price2</th><th> Price3</th><th> Organized By</th></tr>");

while(rs.next())
{
    out.print("<tr>");
    out.print("<td>"+rs.getString(1)+"</td>");
    out.print("<td>"+rs.getString(2)+"</td>");
    out.print("<td>"+rs.getString(3)+"</td>");
    out.print("<td>"+rs.getString(4)+"</td>");
    out.print("<td>"+rs.getString(5)+"</td>");
    out.print("<td>"+rs.getString(6)+"</td>");
    out.print("<td>"+rs.getString(7)+"</td>");
    out.print("<td>"+rs.getString(8)+"</td>");
    out.print("<td>"+rs.getString(9)+"</td>");
    out.print("<td>"+rs.getString(10)+"</td>");
    out.print("</tr>");

}
out.print("</table>");

}
catch(Exception ett)
{
out.print(ett);
}


      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("\n");
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
