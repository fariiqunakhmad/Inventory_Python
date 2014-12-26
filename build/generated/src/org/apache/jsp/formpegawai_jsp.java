package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.python.view.ViewTemplate;
import com.python.query.KotaQuery;
import com.python.model.Kota;
import java.util.ArrayList;
import java.util.List;
import com.python.model.Pegawai;
import com.python.utils.DBConnection;
import com.python.query.PegawaiQuery;

public final class formpegawai_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                public List <Kota> lkota= new ArrayList <Kota>();
                
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
      out.write("    <title>FORM PEGAWAI</title>\r\n");
      out.write("\r\n");
      out.write("    ");
 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 
        String idPegawai="", namaPegawai="", alamatPegawai="", tlpPegawai="", action;
        if(request.getParameter("idpegawai")!=null){
            idPegawai=request.getParameter("idpegawai");
            DBConnection conn = DBConnection.getInstance();
            PegawaiQuery pegawaiq= new PegawaiQuery(conn.getCon());
            Pegawai pegawai=new Pegawai();
            pegawai=pegawaiq.load(idPegawai);
            namaPegawai=pegawai.getNamaPegawai();
            alamatPegawai=pegawai.getAlamatPegawai();
            tlpPegawai=pegawai.getTlpPegawai();
            action="updatepegawai";
            
        } else  action="insertpegawai";
        
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        ");

        out.print(viewTemplate.getMenu()); 
        
      out.write("\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Page Heading -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <h1 class=\"page-header\">\r\n");
      out.write("                            Form Pegawai\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.jsp\">Beranda</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <i class=\"fa fa-edit\"></i> Pegawai\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("                        <form role=\"formpeg\" onSubmit=\"\" action=\"");
 out.print(action); 
      out.write("\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>ID</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan ID PEGAWAI\" name=\"txtidpegawai\" value=\"");
 out.print(idPegawai); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>NAMA</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan NAMA PEGAWAI\" name=\"txtnamapegawai\" value=\"");
 out.print(namaPegawai); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>ALAMAT</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan ALAMAT PEGAWAI\" name=\"txtalamatpegawai\" value=\"");
 out.print(alamatPegawai); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>KOTA</label>\r\n");
      out.write("                                <select class=\"form-control\" placeholder=\"Pilih KOTA\" name=\"txtidkota\" id=\"txtidkota\">\r\n");
      out.write("                                    ");

                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    KotaQuery kotaq = new KotaQuery(dbc.getCon());
                    lkota=kotaq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lkota.size()>row; row++){
                    Kota kota=lkota.get(row);
                    out.println("<option value='"+ kota.getIdKota()+"'>"+kota.getNamaKota() +"</option>");
                                    
                    
                }
                //out.print(lpegawai.size());
                
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                <label>TELP</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan TELP PEGAWAI\" name=\"txttlppegawai\" value=\"");
 out.print(tlpPegawai); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <button type=\"submit\" name=\"submit\" value=\"submit\" class=\"btn btn-sm btn-primary\">Submit</button>\r\n");
      out.write("                            <button type=\"reset\" name=\"reset\" value=\"clear form\" class=\"btn btn-sm btn-danger\" >Clear Field</button>\r\n");
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
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
