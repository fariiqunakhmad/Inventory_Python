<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.ProdukQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.model.Produk"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Tabel Produk</title>

    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>

</head>

<body>

    <div id="wrapper">

        <%
        out.print(viewTemplate.getMenu()); 
        %>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Tabel Produk
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Produk
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">
                        <h2>Tabel Produk</h2>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Id</th>
                                        <th>Nama</th>
                                        <th>Warna</th>
                                        <th>Harga</th>
                                        <th>Stock</th>
                                        <th>Stock Minimal</th>
                                        <th>Control</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%!
                public List <Produk> lproduk= new ArrayList <Produk>();
                %>
                <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    ProdukQuery produkq = new ProdukQuery(dbc.getCon());
                    lproduk=produkq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lproduk.size()>row; row++){
                    Produk produk=lproduk.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td>"+produk.getIdProduk()+"</td>"+
                                        "<td>"+produk.getNamaProduk()+"</td>"+
                                        "<td>"+produk.getWarnaProduk()+"</td>"+
                                        "<td>"+produk.getHargaProduk()+"</td>"+
                                        "<td>"+produk.getStockProduk()+"</td>"+
                                        "<td>"+produk.getStockminProduk()+"</td>"+
                                        "<td><a href='formsprod.jsp?idproduk="+produk.getIdProduk()+"'>Edit</a> | <a href='deleteproduk?idproduk="+produk.getIdProduk()+"'>Delete</a></td>"+
                                    "</tr>");
                    
                }
                //out.print(lproduk.size());
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

    <!-- jQuery Version 1.11.0 -->
    <script src="js/jquery-1.11.0.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
