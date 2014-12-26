<%-- 
    Document   : daftarshiper
    Created on : Oct 10, 2014, 6:50:06 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.ShiperQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.Shiper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tabel Shiper</title>

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
                            Tabel Shiper
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Shiper
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabel Shiper</h2>
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
                public List <Shiper> lshiper= new ArrayList <Shiper>();
                %>
                <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    ShiperQuery shiperq = new ShiperQuery(dbc.getCon());
                    lshiper=shiperq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lshiper.size()>row; row++){
                    Shiper shiper=lshiper.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td>"+shiper.getIdShiper()+"</td>"+
                                        "<td>"+shiper.getIdKota()+"</td>"+
                                        "<td>"+shiper.getNamaShiper()+"</td>"+
                                        "<td>"+shiper.getAlamatShiper()+"</td>"+
                                        "<td>"+shiper.getTlpShiper()+"</td>"+
                                        "<td><a href='formshiper.jsp?idshiper="+shiper.getIdShiper()+"'>Edit</a> | <a href='deleteshiper?idshiper="+shiper.getIdShiper()+"'>Delete</a></td>"+
                                    "</tr>");
                    
                }
                //out.print(lshiper.size());
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
