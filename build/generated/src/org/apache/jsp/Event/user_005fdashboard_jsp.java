package org.apache.jsp.Event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title> user_dashboard </title>\n");
      out.write("\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Rubik:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons+Outlined\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/user_dashboard.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"quaries.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <menu>\n");
      out.write("        <p class=\"heading-pri\"> User Dashboard </p>\n");
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
      out.write("            <a href=\"user_dsahboard.jsp\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"home-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"user_dashboard.jsp\" class=\"index-item\">Home</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"myResult.jsp\">\n");
      out.write("                <ion-icon class='icons' name=\"golf-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"myResult.jsp\" class=\"index-item\"> My Results</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <a href=\"my Event.jsp\">\n");
      out.write("                <ion-icon class=\"icons\" name=\"calendar-clear-outline\"></ion-icon>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"myEvent.jsp\" class=\"index-item\"> My Event</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- <div class=\"index-flex\">\n");
      out.write("            <ion-icon class=\"icons\" name=\"people-outline\"></ion-icon>\n");
      out.write("            <a href=\"#\" class=\"index-item\"> Users</a>\n");
      out.write("        </div> -->\n");
      out.write("\n");
      out.write("        <div class=\"index-flex\">\n");
      out.write("            <ion-icon class=\"icons\" name=\"log-out-outline\"></ion-icon>\n");
      out.write("            <a href=\"login.html\" class=\"index-item\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("        <!-- <img src=\"a.png\" alt=\"\" height=\"700\" width=\"170\"> -->\n");
      out.write("    </section>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"main_box\">\n");
      out.write("        <h1 id=\"main-h1\" class=\"heading-pri\"> Hello ");
      out.print( session.getAttribute("na") );
      out.write(" </h1>\n");
      out.write("        <p class=\"sub-heading\"> Welcom Back! </p>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"img\" role=\"img\" aria-label=\"Woman enjoying food\"><img src=\"Sandy_Bus-37_Single-08.jpg\" width=\"300\"></div>\n");
      out.write("            <div class=\"box\"></div>\n");
      out.write("<!--            <div class=\"box\"></div>\n");
      out.write("            <div class=\"box\"></div>-->\n");
      out.write("        </div>\n");
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
