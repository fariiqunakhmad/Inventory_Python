/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.view;

/**
 *
 * @author Akhmad Fariiqun Awwa
 */
public class ViewTemplate {
        private String importCSS = 
               "<!-- Bootstrap Core CSS -->"+
               "<link href='css/bootstrap.min.css' rel='stylesheet'>"+

               "<!-- Custom CSS -->"+
               "<link href='css/sb-admin.css' rel='stylesheet'>"+

               "<!-- Custom Fonts -->"+
               "<link href='font-awesome-4.1.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>"+

               "<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->"+
               "<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->"+
               "<!--[if lt IE 9]>"+
                   "<script src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js'>"+"</script>"+
                   "<script src='https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js'>"+"</script>"+
               "<![endif]-->";
        private String importJS =
                    "<!-- jQuery Version 1.11.0 -->"+
                    "<script src='js/jquery-1.11.0.js'></script>"+

                    "<!-- Bootstrap Core JavaScript -->"+
                    "<script src='js/bootstrap.min.js'></script>"
                ;
        private String menu = "<!-- Navigation -->"+
                      "<nav class='navbar navbar-inverse navbar-fixed-top' role='navigation'>"+
                          "<!-- Brand and toggle get grouped for better mobile display -->"+
                          "<div class='navbar-header'>"+
                              "<button type='button' class='navbar-toggle' data-toggle='collapse' data-target='.navbar-ex1-collapse'>"+
                                  "<span class='sr-only'>"+"Toggle navigation"+"</span>"+
                                  "<span class='icon-bar'>"+"</span>"+
                                  "<span class='icon-bar'>"+"</span>"+
                                  "<span class='icon-bar'>"+"</span>"+
                              "</button>"+
                              "<a class='navbar-brand' href='index.jsp'>"+"PYTHON INVENTORY"+"</a>"+
                          "</div>"+
                          "<!-- Top Menu Items -->"+
                          "<ul class='nav navbar-right top-nav'>"+
                              "<li class='dropdown'>"+
                                  "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>"+"<i class='fa fa-envelope'>"+"</i>"+ "<b class='caret'>"+"</b>"+"</a>"+
                                  "<ul class='dropdown-menu message-dropdown'>"+
                                      "<li class='message-preview'>"+
                                          "<a href='#'>"+
                                              "<div class='media'>"+
                                                  "<span class='pull-left'>"+
                                                      "<img class='media-object' src='http://placehold.it/50x50' alt=''>"+
                                                  "</span>"+
                                                  "<div class='media-body'>"+
                                                      "<h5 class='media-heading'>"+"<strong>"+"Admin"+"</strong>"+
                                                      "</h5>"+
                                                      "<p class='small text-muted'>"+"<i class='fa fa-clock-o'>"+"</i>"+ "Yesterday at 4:32 PM"+"</p>"+
                                                      "<p>"+"Lorem ipsum dolor sit amet, consectetur..."+"</p>"+
                                                  "</div>"+
                                              "</div>"+
                                          "</a>"+
                                      "</li>"+
                                      "<li class='message-preview'>"+
                                          "<a href='#'>"+
                                              "<div class='media'>"+
                                                  "<span class='pull-left'>"+
                                                      "<img class='media-object' src='http://placehold.it/50x50' alt=''>"+
                                                  "</span>"+
                                                  "<div class='media-body'>"+
                                                      "<h5 class='media-heading'>"+"<strong>"+"Admin"+"</strong>"+
                                                      "</h5>"+
                                                      "<p class='small text-muted'>"+"<i class='fa fa-clock-o'>"+"</i>"+ "Yesterday at 4:32 PM"+"</p>"+
                                                      "<p>"+"Lorem ipsum dolor sit amet, consectetur..."+"</p>"+
                                                  "</div>"+
                                              "</div>"+
                                          "</a>"+
                                      "</li>"+
                                      "<li class='message-preview'>"+
                                          "<a href='#'>"+
                                              "<div class='media'>"+
                                                  "<span class='pull-left'>"+
                                                      "<img class='media-object' src='http://placehold.it/50x50' alt=''>"+
                                                  "</span>"+
                                                  "<div class='media-body'>"+
                                                      "<h5 class='media-heading'>"+"<strong>"+"Admin"+"</strong>"+
                                                      "</h5>"+
                                                      "<p class='small text-muted'>"+"<i class='fa fa-clock-o'>"+"</i>"+ "Yesterday at 4:32 PM"+"</p>"+
                                                      "<p>"+"Lorem ipsum dolor sit amet, consectetur..."+"</p>"+
                                                  "</div>"+
                                              "</div>"+
                                          "</a>"+
                                      "</li>"+
                                      "<li class='message-footer'>"+
                                          "<a href='#'>"+"Read All New Messages"+"</a>"+
                                      "</li>"+
                                  "</ul>"+
                              "</li>"+
                              "<li class='dropdown'>"+
                                  "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>"+"<i class='fa fa-bell'>"+"</i>"+ "<b class='caret'>"+"</b>"+"</a>"+
                                  "<ul class='dropdown-menu alert-dropdown'>"+
                                      "<li>"+
                                          "<a href='#'>"+"Alert Name "+"<span class='label label-default'>"+"Alert Badge"+"</span>"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"Alert Name "+"<span class='label label-primary'>"+"Alert Badge "+"</span>"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"Alert Name "+"<span class='label label-success'>"+"Alert Badge "+"</span>"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"Alert Name "+"<span class='label label-info'>"+"Alert Badge "+"</span>"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"Alert Name "+"<span class='label label-warning'>"+"Alert Badge "+"</span>"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"Alert Name "+"<span class='label label-danger'>"+"Alert Badge "+"</span>"+"</a>"+
                                      "</li>"+
                                      "<li class='divider'>"+"</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"View All"+"</a>"+
                                      "</li>"+
                                  "</ul>"+
                              "</li>"+
                              "<li class='dropdown'>"+
                                  "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>"+"<i class='fa fa-user'>"+"</i>"+ "Admin "+"<b class='caret'>"+"</b>"+"</a>"+
                                  "<ul class='dropdown-menu'>"+
                                      "<li>"+
                                          "<a href='#'>"+"<i class='fa fa-fw fa-user'>"+"</i>"+ "Profile"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"<i class='fa fa-fw fa-envelope'>"+"</i>"+ "Inbox"+"</a>"+
                                      "</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"<i class='fa fa-fw fa-gear'>"+"</i>"+ "Settings"+"</a>"+
                                      "</li>"+
                                      "<li class='divider'>"+"</li>"+
                                      "<li>"+
                                          "<a href='#'>"+"<i class='fa fa-fw fa-power-off'>"+"</i>"+" Log Out"+"</a>"+
                                      "</li>"+
                                  "</ul>"+
                              "</li>"+
                          "</ul>"+
                          "<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->"+
                          "<div class='collapse navbar-collapse navbar-ex1-collapse'>"+
                              "<ul class='nav navbar-nav side-nav'>"+
                                  "<li>"+
                                      "<a href='index.jsp'>"+"<i class='fa fa-fw fa-dashboard'>"+"</i>"+" Beranda"+"</a>"+
                                  "</li>"+

                                  "<li>"+
                                     "<a href='javascript:;' data-toggle='collapse' data-target='#tabel'>"+"<i class='fa fa-fw fa-table'>"+"</i>"+"Tabel"+"<i class='fa fa-fw fa-caret-down'>"+"</i>"+"</a>"+
                                      "<ul id='tabel' class='collapse'>"+
                                          "<li>"+
                                              "<a href='daftarbahanbaku.jsp'>"+"Bahan Baku"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarcus.jsp'>"+"Customer"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarjenisbahanbaku.jsp'>"+"Jenis Bahan Baku"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                             "<a href='daftarkota.jsp'>"+"Kota  "+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarpegawai.jsp'>"+"Pegawai  "+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarprod.jsp'>"+"Produk"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarshi.jsp'>"+"Shipper"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarsup.jsp'>"+"Supplier"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='daftarpengambilanbb.jsp'>"+"Pengambilan Bahan Baku"+"</a>"+
                                          "</li>"+
                                      "</ul>"+
                                  "</li>"+

                                   "<li class='active'>"+
                                     "<a href='javascript:;' data-toggle='collapse' data-target='#form'>"+"<i class='fa fa-fw fa-edit'>"+"</i>"+"Form"+"<i class='fa fa-fw fa-caret-down'>"+"</i>"+"</a>"+
                                      "<ul id='form' class='collapse'>"+
                                              "<li>"+
                                              "<a href='formbahanbaku.jsp'>"+"Bahan Baku"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='formcustomer.jsp'>"+"Customer"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='formjenisbahanbaku.jsp'>"+"Jenis Bahan Baku"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                             "<a href='formkota.jsp'>"+"Kota"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                             "<a href='formpegawai.jsp'>"+"Pegawai  "+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='formsprod.jsp'>"+"Produk"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='formshiper.jsp'>"+"Shipper"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='formsupplier.jsp'>"+"Supplier"+"</a>"+
                                          "</li>"+
                                          "<li>"+
                                              "<a href='formpengambilanbb.jsp'>"+"Pengambilan Bahan Baku"+"</a>"+
                                          "</li>"+
                                      "</ul>"+
                                  "</li>"+

                              "</ul>"+
                          "</div>"+
                          "<!-- /.navbar-collapse -->"+
                      "</nav>";

    public void importCSS(){
    }

    /**
     * @return the importCSS
     */
    public String getImportCSS() {
        return importCSS;
    }

    /**
     * @param importCSS the importCSS to set
     */
    public void setImportCSS(String importCSS) {
        this.importCSS = importCSS;
    }

    /**
     * @return the menu
     */
    public String getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(String menu) {
        this.menu = menu;
    }

    /**
     * @return the importJS
     */
    public String getImportJS() {
        return importJS;
    }

    /**
     * @param importJS the importJS to set
     */
    public void setImportJS(String importJS) {
        this.importJS = importJS;
    }
    
}
