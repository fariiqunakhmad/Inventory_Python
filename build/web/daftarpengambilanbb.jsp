<%-- 
    Document   : daftarpengambilanBB
    Created on : Oct 10, 2014, 6:50:06 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.PengambilanBBQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.PengambilanBB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tabel Pengambilan Bahan Baku</title>

    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>

</head>

<body>

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
                            Tabel Pengambilan Bahan Baku
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> PengambilanBB
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabel Pengambilan Bahan Baku</h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Tanggal</th>
                                        <th>Nama Pengambil</th>
                                        <th>Control</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%!
                public List <PengambilanBB> lpengambilanBB= new ArrayList <PengambilanBB>();
                %>
                <%
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
                %>
                                </tbody>
                            </table>
                        </div>
                    </div>
                   

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
