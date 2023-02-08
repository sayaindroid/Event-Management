package org.apache.jsp.Event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/AEvent.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"quaries.css\">\n");
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
      out.write("    <section class=\"section-login\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"cta\">\n");
      out.write("                <div class=\"cta-text-box\">\n");
      out.write("                    <h2 class=\"heading-login\"> Add Results </h2>\n");
      out.write("                    <p class=\"cta-text\">\n");
      out.write("                        Welcome, Please Add your Event.\n");
      out.write("                    </p>                \n");
      out.write("<!--                    <div>\n");
      out.write("                    <div><a class=\"btn\" href=\"AEvent.jsp\"> Add Event</a></div>\n");
      out.write("                    </div>-->\n");
      out.write("\n");
      out.write("                    <form class=\"cta-form\" name=\"F\" action=\"Addevent.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"Etype\">Event Type</label>\n");
      out.write("                            <input class=\"input\" id=\"Etype\" type=\"text\" name=\"Etype\" placeholder=\"Event Type\" required />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"Ename\"> Event Name </label>\n");
      out.write("                            <input class=\"input\" id=\"Ename\" type=\"text\" name=\"Ename\" required placeholder=\"Event name\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"Edate\"> Event Date </label>\n");
      out.write("                            <input class=\"input\" id=\"Edate\" type=\"date\" name=\"Edate\" required/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"Estart\"> Start Time</label>\n");
      out.write("                            <input class=\"input\" id=\"Estart\" type=\"time\" name=\"Estart\" placeholder=\"John Smith\" required />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"Eend\"> End Time</label>\n");
      out.write("                            <input class=\"input\" id=\"Eend\" type=\"time\" name=\"Eend\" placeholder=\"John Smith\" required />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"price1\"> Price1</label>\n");
      out.write("                            <input class=\"input\" id=\"price1\" type=\"number\" name=\"price1\" placeholder=\"price1\" required />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"price2\"> Price2</label>\n");
      out.write("                            <input class=\"input\" id=\"price2\" type=\"number\" name=\"price2\" placeholder=\"pric2\" required />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"price3\"> Price3 </label>\n");
      out.write("                            <input class=\"input\" id=\"price3\" type=\"number\" name=\"price3\" placeholder=\"price3\" required />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"OrgBy\"> Organised By </label>\n");
      out.write("                            <input class=\"input\" id=\"OrgBy\" type=\"text\" name=\"OrgBy\" placeholder=\"Robert\" required />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- <label for=\"password\"> Password </label>\n");
      out.write("                            <input id=\"password\" type=\"password\" required />\n");
      out.write("                        </div> -->\n");
      out.write("                        <!-- <button class=\"btn-login\"> Login </button> -->\n");
      out.write("                        <!-- <div>\n");
      out.write("                            <label for=\"message\">Massage</label>\n");
      out.write("                            <textarea name=\"Massage\" id=\"massage\" cols=\"1\" rows=\"1\" placeholder=\"Write here\">\n");
      out.write("                    </textarea> -->\n");
      out.write("                        <!-- <input\n");
      out.write("                      id=\"Message\"\n");
      out.write("                      type=\"me\"\n");
      out.write("                      placeholder=\"me@example.com\"\n");
      out.write("                      required\n");
      out.write("                    /> -->\n");
      out.write("                        <!-- </div> -->\n");
      out.write("\n");
      out.write("                        <!-- <div>\n");
      out.write("                    <label for=\"select-where\">Where did you hear from us?</label>\n");
      out.write("                    <select id=\"select-where\" required>\n");
      out.write("                        <option value=\"\">Please choose one option:</option>\n");
      out.write("                        <option value=\"friends\">Friends and family</option>\n");
      out.write("                        <option value=\"youtube\">YouTube video</option>\n");
      out.write("                        <option value=\"podcast\">LinkedIn</option>\n");
      out.write("                        <option value=\"ad\">Facebook ad</option>\n");
      out.write("                        <option value=\"others\">Others</option>\n");
      out.write("                    </select>\n");
      out.write("                </div> -->\n");
      out.write("\n");
      out.write("                        <!-- <div class=\"rem\">\n");
      out.write("                            <label for=\"chechbox\">\n");
      out.write("                                <input class=\"ckechbox\" type=\"checkbox\"> I agree all statements in\n");
      out.write("                                <a href=\"#\" style=\" text-decoration: none; color: inherit;\">\n");
      out.write("                                    <u>Term & Condition</u></a>\n");
      out.write("                            </label>\n");
      out.write("                        </div> -->\n");
      out.write("                        <button class=\"btn-login\"> Save </button>\n");
      out.write("<!--                        <a href=\"login.html\" style=\"font-size: 1.6rem; text-decoration: none; color: inherit;\"> I am\n");
      out.write("                            already\n");
      out.write("                            in.</a>-->\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cta-img-box\" role=\"img\" aria-label=\"Woman enjoying food\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("\n");
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
