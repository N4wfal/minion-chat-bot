package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <title>minion bot</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        \n");
      out.write("        <div class=\"page1\">\n");
      out.write("            <div class=\"inPg1\">\n");
      out.write("                <div class=\"page1Title\">hi <br>\n");
      out.write("                    im minion bot</div>\n");
      out.write("        \n");
      out.write("                <img class=\"img1\" src=\"./imgs/img1.png\" alt=\"\">\n");
      out.write("                <div class=\"page1body\">\n");
      out.write("                    im a chat bot and \n");
      out.write("                    i can talk to you in whatever topic you want.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"letsStartBtn\">lets talk</button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"pageSlider\">\n");
      out.write("            <div class=\"page2\">\n");
      out.write("\n");
      out.write("                <div class=\"page2Nav\">\n");
      out.write("                    <div class=\"navLeft\">\n");
      out.write("                        <div class=\"nfLeft\"><img src=\"./imgs/logoImg.png\" alt=\"\"></div>\n");
      out.write("        \n");
      out.write("                        <div class=\"nfRight\">\n");
      out.write("                            <div class=\"p1\">minion bot</div>\n");
      out.write("                            <div class=\"p2\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navRight\">\n");
      out.write("                        <div class=\"threeCircles\">\n");
      out.write("                            <div class=\"c c1\"></div>\n");
      out.write("                            <div class=\"c c2\"></div>\n");
      out.write("                            <div class=\"c c3\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"settingsContainer\">\n");
      out.write("\n");
      out.write("                    <div class=\"set\">\n");
      out.write("                        <div class=\"setTitle\">Settings</div>\n");
      out.write("                        <div class=\"devs\">\n");
      out.write("                            <div class=\"dev devs1\" onclick=\"changeBackground()\">change background</div>\n");
      out.write("                            <div class=\"dev devs2\" onclick=\"clearMsgs()\">clear masseges</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"set\">\n");
      out.write("                        <div class=\"setTitle\">Developers</div>\n");
      out.write("                        <div class=\"devs\">\n");
      out.write("                            <div class=\"dev\">frontend : omar chatin</div>\n");
      out.write("                            <div class=\"dev\">backend :  Naoufal EL ALLALI</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("                <div class=\"msgsContainer\"></div>\n");
      out.write("        \n");
      out.write("                <div class=\"page2Bottom\">\n");
      out.write("                    <input type=\"text\"  name=\"textLine\" placeholder=\"write to minion bot\" class=\"newMsgInput\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </main>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"./app.js\"></script>\n");
      out.write("     \n");
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
