<%-- 
    Document   : formbahanBaku
    Created on : Sep 26, 2014, 9:33:58 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.query.JenisBahanBakuQuery"%>
<%@page import="com.python.model.JenisBahanBaku"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.model.BahanBaku"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.query.BahanBakuQuery"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FORM BAHAN BAKU</title>

    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>

</head>

<body>
<% 
        String idBahanBaku="", namaBahanBaku="",  action;
        int hargaBahanBaku=0, stockBahanBaku=0, stockMinBahanBaku=0;
        if(request.getParameter("idbahanBaku")!=null){
            idBahanBaku=request.getParameter("idbahanBaku");
            DBConnection conn = DBConnection.getInstance();
            BahanBakuQuery bahanBakuq= new BahanBakuQuery(conn.getCon());
            BahanBaku bahanBaku=new BahanBaku();
            bahanBaku=bahanBakuq.load(idBahanBaku);
            namaBahanBaku=bahanBaku.getNamaBahanBaku();
            hargaBahanBaku=bahanBaku.getHargaBahanBaku();
            stockBahanBaku=bahanBaku.getStockBahanBaku();
            stockMinBahanBaku=bahanBaku.getStockMinBahanBaku();
            action="updatebahanbaku";
            
        } else  action="insertbahanbaku";
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
                            Form BahanBaku
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Beranda</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> BahanBaku
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
                                <input class="form-control" placeholder="Masukkan ID BAHAN BAKU" name="txtidbahanbaku" value="<% out.print(idBahanBaku); %>">
                            </div>
                            <%!
                public List <JenisBahanBaku> ljenisbahanbaku= new ArrayList <JenisBahanBaku>();
                %>
                          

                            <div class="form-group">
                                <label>JENIS BAHAN BAKU</label>
                                <select class="form-control" placeholder="Pilih JENIS BAHAN BAKU" name="txtidjenisbahanbaku" id="txtidjenisbahanbaku">
                                    <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    JenisBahanBakuQuery jenisbahanbakuq = new JenisBahanBakuQuery(dbc.getCon());
                    ljenisbahanbaku=jenisbahanbakuq.getAll();
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.ljenisbahanbaku.size()>row; row++){
                    JenisBahanBaku jenisbahanbaku=ljenisbahanbaku.get(row);
                    out.println("<option value='"+ jenisbahanbaku.getIdJenisBahanBaku()+"'>"+jenisbahanbaku.getNamaJenisBahanBaku() +"</option>");
                                    
                    
                }
                //out.print(lbahanBaku.size());
                %>
                                    
                                </select>
                            </div>
							
                            <div class="form-group">
                                <label>NAMA</label>
                                <input class="form-control" placeholder="Masukkan NAMA BAHAN BAKU" name="txtnamabahanbaku" value="<% out.print(namaBahanBaku); %>">
                            </div>
                            
                            <div class="form-group">
                                <label>HARGA</label>
                                <input class="form-control" placeholder="Masukkan HARGA BAHAN BAKU" name="txthargabahanbaku" value="<% out.print(hargaBahanBaku); %>">
                            </div>
                            
                             <div class="form-group">
                                <label>STOCK</label>
                                <input class="form-control" placeholder="Masukkan STOCK BAHAN BAKU" name="txtstockbahanbaku" value="<% out.print(stockBahanBaku); %>">
                            </div>
                            <div class="form-group">
                                <label>STOCK MIN</label>
                                <input class="form-control" placeholder="Masukkan STOCK MIN BAHAN BAKU" name="txtstockminbahanbaku" value="<% out.print(stockBahanBaku); %>">
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
