package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.python.view.ViewTemplate;

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
      out.write("    <title>PYTHON</title>\r\n");
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
      out.write("                           Beranda <small> STATISTIK INVENTORY PYTHON</small>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> Beranda\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <!--<div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <div class=\"alert alert-info alert-dismissable\">\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                            <i class=\"fa fa-info-circle\"></i>  <strong>Like SB Admin?</strong> Try out <a href=\"http://startbootstrap.com/template-overviews/sb-admin-2\" class=\"alert-link\">SB Admin 2</a> for additional features!\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>-->\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("               <!-- <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-primary\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-comments fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                        <div class=\"huge\">26</div>\r\n");
      out.write("                                        <div>New Comments!</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"panel-footer\">\r\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-green\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-tasks fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                        <div class=\"huge\">12</div>\r\n");
      out.write("                                        <div>New Tasks!</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"panel-footer\">\r\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-yellow\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-shopping-cart fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                        <div class=\"huge\">124</div>\r\n");
      out.write("                                        <div>New Orders!</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"panel-footer\">\r\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <div class=\"panel panel-red\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-3\">\r\n");
      out.write("                                        <i class=\"fa fa-support fa-5x\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-9 text-right\">\r\n");
      out.write("                                        <div class=\"huge\">13</div>\r\n");
      out.write("                                        <div>Support Tickets!</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div class=\"panel-footer\">\r\n");
      out.write("                                    <span class=\"pull-left\">View Details</span>\r\n");
      out.write("                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\r\n");
      out.write("                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h3 class=\"panel-title\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Grafik barang masuk</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <div id=\"morris-area-chart\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h3 class=\"panel-title\"><i class=\"fa fa-long-arrow-right fa-fw\"></i> Donut Chart</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <div id=\"morris-donut-chart\"></div>\r\n");
      out.write("                                <div class=\"text-right\">\r\n");
      out.write("                                    <a href=\"#\">View Details <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h3 class=\"panel-title\"><i class=\"fa fa-clock-o fa-fw\"></i> Tasks Panel</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <div class=\"list-group\">\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">just now</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-calendar\"></i> Calendar updated\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">4 minutes ago</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-comment\"></i> Commented on a post\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">23 minutes ago</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-truck\"></i> Order 392 shipped\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">46 minutes ago</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-money\"></i> Invoice 653 has been paid\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">1 hour ago</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-user\"></i> A new user has been added\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">2 hours ago</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-check\"></i> Completed task: \"pick up dry cleaning\"\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">yesterday</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-globe\"></i> Saved the world\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a href=\"#\" class=\"list-group-item\">\r\n");
      out.write("                                        <span class=\"badge\">two days ago</span>\r\n");
      out.write("                                        <i class=\"fa fa-fw fa-check\"></i> Completed task: \"fix error on sales page\"\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-right\">\r\n");
      out.write("                                    <a href=\"#\">View All Activity <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h3 class=\"panel-title\"><i class=\"fa fa-money fa-fw\"></i> Transactions Panel</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <div class=\"table-responsive\">\r\n");
      out.write("                                    <table class=\"table table-bordered table-hover table-striped\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>Order #</th>\r\n");
      out.write("                                                <th>Order Date</th>\r\n");
      out.write("                                                <th>Order Time</th>\r\n");
      out.write("                                                <th>Amount (USD)</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3326</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>3:29 PM</td>\r\n");
      out.write("                                                <td>$321.33</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3325</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>3:20 PM</td>\r\n");
      out.write("                                                <td>$234.34</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3324</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>3:03 PM</td>\r\n");
      out.write("                                                <td>$724.17</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3323</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>3:00 PM</td>\r\n");
      out.write("                                                <td>$23.71</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3322</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>2:49 PM</td>\r\n");
      out.write("                                                <td>$8345.23</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3321</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>2:23 PM</td>\r\n");
      out.write("                                                <td>$245.12</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3320</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>2:15 PM</td>\r\n");
      out.write("                                                <td>$5663.54</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td>3319</td>\r\n");
      out.write("                                                <td>10/21/2013</td>\r\n");
      out.write("                                                <td>2:13 PM</td>\r\n");
      out.write("                                                <td>$943.45</td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"text-right\">\r\n");
      out.write("                                    <a href=\"#\">View All Transactions <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
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
      out.write("    <!-- Morris Charts JavaScript -->\r\n");
      out.write("    <script src=\"js/plugins/morris/raphael.min.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins/morris/morris.min.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins/morris/morris-data.js\"></script>\r\n");
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