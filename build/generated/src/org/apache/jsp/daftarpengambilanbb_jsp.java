package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.python.view.ViewTemplate;
import com.python.query.PengambilanBBQuery;
import com.python.utils.DBConnection;
import java.util.ArrayList;
import java.util.List;
import com.python.model.PengambilanBB;

public final class daftarpengambilanbb_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                public List <PengambilanBB> lpengambilanBB= new ArrayList <PengambilanBB>();
                
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Tabel Pengambilan Bahan Baku</title>\r\n");
      out.write("\r\n");
      out.write("    ");
 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        ");

        out.print(viewTemplate.getMenu()); 
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Page Heading -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <h1 class=\"page-header\">\r\n");
      out.write("                            Tabel Pengambilan Bahan Baku\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.jsp\">Dashboard</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <i class=\"fa fa-table\"></i> PengambilanBB\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                        <h2>Tabel Pengambilan Bahan Baku</h2>\r\n");
      out.write("                        <div class=\"table-responsive\">\r\n");
      out.write("                            <table class=\"table table-bordered table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Id</th>\r\n");
      out.write("                                        <th>Tanggal</th>\r\n");
      out.write("                                        <th>Nama Pengambil</th>\r\n");
      out.write("                                        <th>Control</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                ");

                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    PengambilanBBQuery pengambilanBBq = new PengambilanBBQuery(dbc.getCon());
                    lpengambilanBB=pengambilanBBq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lpengambilanBB.size()>row; row++){
                    PengambilanBB pengambilanBB=lpengambilanBB.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td><a href='daftardetailpbb.jsp?idpengambilanbb="+pengambilanBB.getIdPBB()+"'>"+pengambilanBB.getIdPBB()+"</a></td>"+
                                        "<td>"+pengambilanBB.getTglPBB()+"</td>"+
                                        "<td>"+pengambilanBB.getIdPengambilPBB()+"</td>"+
                                        "<td><a href='formpengambilanbb.jsp?idpengambilanbb="+pengambilanBB.getIdPBB()+"'>Edit</a> | <a href='deletepengambilanbb?idpengambilanbb="+pengambilanBB.getIdPBB()+"'>Delete</a></td>"+
                                    "</tr>");
                    
                }
                //out.print(lpengambilanBB.size());
                
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("    ");

    out.print(viewTemplate.getImportJS()); 
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
