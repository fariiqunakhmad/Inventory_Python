<%-- 
    Document   : formjenisbahanbaku
    Created on : Sep 26, 2014, 9:33:58 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.model.JenisProduk"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.query.JenisProdukQuery"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FORM JENIS BAHAN BAKU</title>
    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>
    

</head>

<body>
<% 
        String idJenisProduk="", namaJenisProduk="", action;
        if(request.getParameter("idjenisProduk")!=null){
            idJenisProduk=request.getParameter("idjenisProduk");
            DBConnection conn = DBConnection.getInstance();
            JenisProdukQuery jenisProdukq= new JenisProdukQuery(conn.getCon());
            JenisProduk jenisProduk=new JenisProduk();
            jenisProduk=jenisProdukq.load(idJenisProduk);
            namaJenisProduk=jenisProduk.getNamaJenisProduk();
            action="updatejenisProduk";
            
        } else  action="insertjenisProduk";
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
                            Form JenisProduk
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Beranda</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> JenisProduk
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                        <form role="formjenisbahanbaku" onSubmit="" action="<% out.print(action); %>" method="POST">

                            <div class="form-group">
                                <label>ID</label>
                                <input class="form-control" placeholder="Masukkan ID JENIS BAHAN BAKU" name="txtidjenisProduk" value="<% out.print(idJenisProduk); %>">
                            </div>
							
                            <div class="form-group">
                                <label>NAMA</label>
                                <input class="form-control" placeholder="Masukkan NAMA JENIS BAHAN BAKU" name="txtnamajenisProduk" value="<% out.print(namaJenisProduk); %>">
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
