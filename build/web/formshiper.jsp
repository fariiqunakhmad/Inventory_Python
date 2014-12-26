<%-- 
    Document   : formshiper
    Created on : Sep 26, 2014, 9:33:58 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.KotaQuery"%>
<%@page import="com.python.model.Kota"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.Shiper"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.query.ShiperQuery"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FORM SHIPER</title>

    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>

</head>

<body>
<% 
        String idShiper="", namaShiper="", alamatShiper="", tlpShiper="", action;
        if(request.getParameter("idshiper")!=null){
            idShiper=request.getParameter("idshiper");
            DBConnection conn = DBConnection.getInstance();
            ShiperQuery shiperq= new ShiperQuery(conn.getCon());
            Shiper shiper=new Shiper();
            shiper=shiperq.load(idShiper);
            namaShiper=shiper.getNamaShiper();
            alamatShiper=shiper.getAlamatShiper();
            tlpShiper=shiper.getTlpShiper();
            action="updateshiper";
            
        } else  action="insertshiper";
        %>
    <div id="wrapper">

        <!-- Navigation -->
        <%
        out.print(viewTemplate.getMenu()); 
        %>
        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Form Shiper
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Beranda</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Shiper
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                        <form role="formpeg" onSubmit="" action="<% out.print(action); %>" method="POST">

                            <div class="form-group">
                                <label>ID</label>
                                <input class="form-control" placeholder="Masukkan ID SHIPER" name="txtidshiper" value="<% out.print(idShiper); %>">
                            </div>
							
                            <div class="form-group">
                                <label>NAMA</label>
                                <input class="form-control" placeholder="Masukkan NAMA SHIPER" name="txtnamashiper" value="<% out.print(namaShiper); %>">
                            </div>
                            
                            <div class="form-group">
                                <label>ALAMAT</label>
                                <input class="form-control" placeholder="Masukkan ALAMAT SHIPER" name="txtalamatshiper" value="<% out.print(alamatShiper); %>">
                            </div>
                            <%!
                public List <Kota> lkota= new ArrayList <Kota>();
                %>
                          

                            <div class="form-group">
                                <label>KOTA</label>
                                <select class="form-control" placeholder="Pilih KOTA" name="txtidkota" id="txtidkota">
                                    <%
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
                //out.print(lshiper.size());
                %>
                                    
                                </select>
                            </div>
                             <div class="form-group">
                                <label>TELP</label>
                                <input class="form-control" placeholder="Masukkan TELP SHIPER" name="txttlpshiper" value="<% out.print(tlpShiper); %>">
                            </div>
                            
                            <button type="submit" name="submit" value="submit" class="btn btn-sm btn-primary">Submit</button>
                            <button type="reset" name="reset" value="clear form" class="btn btn-sm btn-danger" >Clear Field</button>

                           
                        </form>
                    </div>
                    
                </div>
                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <%
    out.print(viewTemplate.getImportJS()); 
    %>

</body>

</html>
