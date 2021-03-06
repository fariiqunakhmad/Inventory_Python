package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.python.query.ProdukQuery;
import com.python.utils.DBConnection;
import com.python.model.Produk;

public final class formsprod_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>FORM PRODUK</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
 
        String idProduk="", namaProduk="", warnaProduk="",action;
        int hargaProduk=0, stockProduk=0, stockminProduk=0;
        if(request.getParameter("idproduk")!=null){
            idProduk=request.getParameter("idproduk");
            DBConnection conn = DBConnection.getInstance();
            ProdukQuery produkq= new ProdukQuery(conn.getCon());
            Produk produk=new Produk();
            produk=produkq.load(idProduk);
            namaProduk=produk.getNamaProduk();
            warnaProduk=produk.getWarnaProduk();
            hargaProduk=produk.getHargaProduk();
            stockProduk=produk.getStockProduk();
            stockminProduk=produk.getStockminProduk();
            
            action="updateproduk";
            
        } else  action="insertproduk";
        
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">PYTHON INVENTORY</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Top Menu Items -->\r\n");
      out.write("            <ul class=\"nav navbar-right top-nav\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu message-dropdown\">\r\n");
      out.write("                        <li class=\"message-preview\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"media\">\r\n");
      out.write("                                    <span class=\"pull-left\">\r\n");
      out.write("                                        <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h5 class=\"media-heading\"><strong>Admin</strong>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"message-preview\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"media\">\r\n");
      out.write("                                    <span class=\"pull-left\">\r\n");
      out.write("                                        <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h5 class=\"media-heading\"><strong>Admin</strong>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"message-preview\">\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"media\">\r\n");
      out.write("                                    <span class=\"pull-left\">\r\n");
      out.write("                                        <img class=\"media-object\" src=\"http://placehold.it/50x50\" alt=\"\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body\">\r\n");
      out.write("                                        <h5 class=\"media-heading\"><strong>Admin</strong>\r\n");
      out.write("                                        </h5>\r\n");
      out.write("                                        <p class=\"small text-muted\"><i class=\"fa fa-clock-o\"></i> Yesterday at 4:32 PM</p>\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"message-footer\">\r\n");
      out.write("                            <a href=\"#\">Read All New Messages</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu alert-dropdown\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Alert Name <span class=\"label label-default\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Alert Name <span class=\"label label-primary\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Alert Name <span class=\"label label-success\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Alert Name <span class=\"label label-info\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Alert Name <span class=\"label label-warning\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Alert Name <span class=\"label label-danger\">Alert Badge</span></a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">View All</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Admin <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-user\"></i> Profile</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-envelope\"></i> Inbox</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-gear\"></i> Settings</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-fw fa-power-off\"></i> Log Out</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav side-nav\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"index.jsp\"><i class=\"fa fa-fw fa-dashboard\"></i> Beranda</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  \r\n");
      out.write("                    <li>\r\n");
      out.write("                       <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#tabel\"><i class=\"fa fa-fw fa-table\"></i>Tabel<i class=\"fa fa-fw fa-caret-down\"></i></a>\r\n");
      out.write("                        <ul id=\"tabel\" class=\"collapse\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarbb.jsp\">Bahan Baku</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarcus.jsp\">Customer</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarjbb.jsp\">Jenis Bahan Baku</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                               <a href=\"daftarproduk.jsp\">Produk  </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarpeg.jsp\">Pegawai</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarprod.jsp\">Produk</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarshiper.jsp\">Shipper</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"daftarsupp.jsp\">Supplier</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                     <li class=\"active\">\r\n");
      out.write("                       <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#form\"><i class=\"fa fa-fw fa-edit\"></i>Form<i class=\"fa fa-fw fa-caret-down\"></i></a>\r\n");
      out.write("                        <ul id=\"form\" class=\"collapse\">\r\n");
      out.write("                        \t<li>\r\n");
      out.write("                                <a href=\"formbb.jsp\">Bahan Baku</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"formcus.jsp\">Customer</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"formjenisbahanbaku.jsp\">Jenis Bahan Baku</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                               <a href=\"formsprod.jsp\">Produk  </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"formpeg.jsp\">Pegawai</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"formprod.jsp\">Produk</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"formshiper.jsp\">Shipper</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"formsupp.jsp\">Supplier</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Page Heading -->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <h1 class=\"page-header\">\r\n");
      out.write("                            Form Produk\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>  <a href=\"index.jsp\">Beranda</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <i class=\"fa fa-edit\"></i> Produk\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("\r\n");
      out.write("                        <form role=\"formprod\" onSubmit=\"\" action=\"");
 out.print(action); 
      out.write("\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>ID</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan ID PRODUK\" name=\"txtidproduk\" value=\"");
 out.print(idProduk); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>NAMA</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan NAMA PRODUK\" name=\"txtnamaproduk\" value=\"");
 out.print(namaProduk); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>WARNA</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan WARNA PRODUK\" name=\"txtwarna\" value=\"");
 out.print(warnaProduk); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                <label>HARGA</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan HARGA\" name=\"txtharga\" value=\"");
 out.print(hargaProduk); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>STOCK</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan STOCK\" name=\"txtstock\" value=\"");
 out.print(stockProduk); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>STOCK MIN</label>\r\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Masukkan STOCKMIN\" name=\"txtstockmin\" value=\"");
 out.print(stockminProduk); 
      out.write("\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <button type=\"submit\" name=\"submit\" value=\"submit\" class=\"btn btn-sm btn-primary\">Submit</button>\r\n");
      out.write("                            <button type=\"reset\" name=\"reset\" value=\"clear form\" class=\"btn btn-sm btn-danger\">Clear Field</button>\r\n");
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
      out.write("    <!-- jQuery Version 1.11.0 -->\r\n");
      out.write("    <script src=\"js/jquery-1.11.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
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
