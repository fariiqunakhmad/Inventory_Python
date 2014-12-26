<%-- 
    Document   : daftarsupplier
    Created on : Oct 10, 2014, 6:50:06 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.SupplierQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.Supplier"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tabel Supplier</title>

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
                            Tabel Supplier
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Supplier
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabel Supplier</h2>
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
                public List <Supplier> lsupplier= new ArrayList <Supplier>();
                %>
                <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    SupplierQuery supplierq = new SupplierQuery(dbc.getCon());
                    lsupplier=supplierq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lsupplier.size()>row; row++){
                    Supplier supplier=lsupplier.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td>"+supplier.getIdSupplier()+"</td>"+
                                        "<td>"+supplier.getIdKota()+"</td>"+
                                        "<td>"+supplier.getNamaSupplier()+"</td>"+
                                        "<td>"+supplier.getAlamatSupplier()+"</td>"+
                                        "<td>"+supplier.getTlpSupplier()+"</td>"+
                                        "<td><a href='formsupplier.jsp?idsupplier="+supplier.getIdSupplier()+"'>Edit</a> | <a href='deletesupplier?idsupplier="+supplier.getIdSupplier()+"'>Delete</a></td>"+
                                    "</tr>");
                    
                }
                //out.print(lsupplier.size());
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
