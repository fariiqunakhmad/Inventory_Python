<%-- 
    Document   : daftarbahanBaku
    Created on : Oct 10, 2014, 6:50:06 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.BahanBakuQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.BahanBaku"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tabel BahanBaku</title>

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
                            Tabel BahanBaku
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Bahan Baku
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabel Bahan Baku</h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Id Jenis Bahan Baku</th>
                                        <th>Nama</th>
                                        <th>Harga</th>
                                        <th>Stock</th>
                                        <th>Stock Min</th>
                                        <th>Control</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%!
                public List <BahanBaku> lbahanBaku= new ArrayList <BahanBaku>();
                %>
                <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    BahanBakuQuery bahanBakuq = new BahanBakuQuery(dbc.getCon());
                    lbahanBaku=bahanBakuq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lbahanBaku.size()>row; row++){
                    BahanBaku bahanBaku=lbahanBaku.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td>"+bahanBaku.getIdBahanBaku()+"</td>"+
                                        "<td>"+bahanBaku.getIdJenisBahanBaku()+"</td>"+
                                        "<td>"+bahanBaku.getNamaBahanBaku()+"</td>"+
                                        "<td>"+bahanBaku.getHargaBahanBaku()+"</td>"+
                                        "<td>"+bahanBaku.getStockBahanBaku()+"</td>"+
                                        "<td>"+bahanBaku.getStockMinBahanBaku()+"</td>"+
                                        "<td><a href='formbahanbaku.jsp?idbahanBaku="+bahanBaku.getIdBahanBaku()+"'>Edit</a> | <a href='deletebahanbaku?idbahanBaku="+bahanBaku.getIdBahanBaku()+"'>Delete</a></td>"+
                                    "</tr>");
                    
                }
                //out.print(lbahanBaku.size());
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
