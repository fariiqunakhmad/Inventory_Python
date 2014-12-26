<%-- 
    Document   : daftarpegawai
    Created on : Oct 10, 2014, 6:50:06 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.PegawaiQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.Pegawai"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tabel Pegawai</title>

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
                            Tabel Pegawai
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Pegawai
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabel Pegawai</h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Id Kota</th>
                                        <th>Nama</th>
                                        <th>Alamat</th>
                                        <th>Tlp</th>
                                        <th>Control</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%!
                public List <Pegawai> lpegawai= new ArrayList <Pegawai>();
                %>
                <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    PegawaiQuery pegawaiq = new PegawaiQuery(dbc.getCon());
                    lpegawai=pegawaiq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lpegawai.size()>row; row++){
                    Pegawai pegawai=lpegawai.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td>"+pegawai.getIdPegawai()+"</td>"+
                                        "<td>"+pegawai.getIdKota()+"</td>"+
                                        "<td>"+pegawai.getNamaPegawai()+"</td>"+
                                        "<td>"+pegawai.getAlamatPegawai()+"</td>"+
                                        "<td>"+pegawai.getTlpPegawai()+"</td>"+
                                        "<td><a href='formpegawai.jsp?idpegawai="+pegawai.getIdPegawai()+"'>Edit</a> | <a href='deletepegawai?idpegawai="+pegawai.getIdPegawai()+"'>Delete</a></td>"+
                                    "</tr>");
                    
                }
                //out.print(lpegawai.size());
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
