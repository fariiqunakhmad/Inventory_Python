<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.ProdukQuery"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.model.Produk"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FORM PRODUK</title>

    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>

</head>

<body>
<% 
        String idProduk="", namaProduk="", warnaProduk="",action;
        int hargaProduk=0, stockProduk=0, stockminProduk=0;
        if(request.getParameter("idproduk")!=null){
            idProduk=request.getParameter("idproduk");
            DBConnection conn = DBConnection.getInstance();
            ProdukQuery produkq= new ProdukQuery(conn.getCon());
            Produk produk=new Produk();
            produk=produkq.load(idProduk);
            namaProduk=produk.getNamaProduk();
            warnaProduk=produk.getWarnaProduk();
            hargaProduk=produk.getHargaProduk();
            stockProduk=produk.getStockProduk();
            stockminProduk=produk.getStockminProduk();
            
            action="updateproduk";
            
        } else  action="insertproduk";
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
                            Form Produk
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Beranda</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> Produk
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                        <form role="formprod" onSubmit="" action="<% out.print(action); %>" method="POST">

                            <div class="form-group">
                                <label>ID</label>
                                <input class="form-control" placeholder="Masukkan ID PRODUK" name="txtidproduk" value="<% out.print(idProduk); %>">
                            </div>
							
                            <div class="form-group">
                                <label>NAMA</label>
                                <input class="form-control" placeholder="Masukkan NAMA PRODUK" name="txtnamaproduk" value="<% out.print(namaProduk); %>">
                            </div>
                            
                            <div class="form-group">
                                <label>WARNA</label>
                                <input class="form-control" placeholder="Masukkan WARNA PRODUK" name="txtwarna" value="<% out.print(warnaProduk); %>">
                            </div>
                            
                             <div class="form-group">
                                <label>HARGA</label>
                                <input class="form-control" placeholder="Masukkan HARGA" name="txtharga" value="<% out.print(hargaProduk); %>">
                            </div>
                            
                            <div class="form-group">
                                <label>STOCK</label>
                                <input class="form-control" placeholder="Masukkan STOCK" name="txtstock" value="<% out.print(stockProduk); %>">
                            </div>
                            
                            <div class="form-group">
                                <label>STOCK MIN</label>
                                <input class="form-control" placeholder="Masukkan STOCKMIN" name="txtstockmin" value="<% out.print(stockminProduk); %>">
                            </div>
                            
                            <button type="submit" name="submit" value="submit" class="btn btn-sm btn-primary">Submit</button>
                            <button type="reset" name="reset" value="clear form" class="btn btn-sm btn-danger">Clear Field</button>

                           
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

    <!-- jQuery Version 1.11.0 -->
    <script src="js/jquery-1.11.0.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
