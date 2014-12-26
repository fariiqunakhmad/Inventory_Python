<%-- 
    Document   : formpengambilanBB
    Created on : Sep 26, 2014, 9:33:58 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.query.JenisProdukQuery"%>
<%@page import="com.python.model.JenisProduk"%>
<%@page import="com.python.query.ProdukQuery"%>
<%@page import="com.python.model.Produk"%>
<%@page import="com.python.model.DetailTargetProduk"%>
<%@page import="com.python.query.DetailTargetProdukQuery"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@page import="com.python.query.PegawaiQuery"%>
<%@page import="com.python.model.Pegawai"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.python.view.ViewTemplate"%>
<%@page import="com.python.model.PengambilanBB"%>
<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.query.PengambilanBBQuery"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>FORM DETAIL PENGAMBILAN BAHAN BAKU</title>
    <% 
    ViewTemplate viewTemplate=new ViewTemplate();
    out.print(viewTemplate.getImportCSS()); 
    %>
    

</head>

<body>
<% 
        String idPBB="", idProduk="",namaProduk="", idJenisProduk="", namaJenisProduk="", qtyTargetProduk="", satuanTargetProduk="",  action;
        if(request.getParameter("idPengambilanBB")!=null && request.getParameter("idProduk")!=null && request.getParameter("idJenisProduk")!=null){
            idPBB=request.getParameter("idPengambilanBB");
            idProduk=request.getParameter("idProduk");
            idJenisProduk=request.getParameter("idJenisProduk");
            DBConnection conn = DBConnection.getInstance();
            DetailTargetProdukQuery detailTPQ= new DetailTargetProdukQuery(conn.getCon());
            DetailTargetProduk detailTP=new DetailTargetProduk();
            detailTP=detailTPQ.load(idPBB,Integer.parseInt(idProduk), Integer.parseInt(idJenisProduk));
            namaProduk=detailTP.getNamaProduk();
            namaJenisProduk=detailTP.getNamaJenisProduk();
            qtyTargetProduk=detailTP.getQtyTargetProduk();
            satuanTargetProduk=detailTP.getSatuanProdukTarget();
            action="updateDPBB";
            
        } else{
            if(request.getParameter("idPengambilanBB")!=null){
                idPBB=request.getParameter("idPengambilanBB");
                action="insertDPBB";

            }
            else action="";
            
        }
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
                            Form Detail Pengambilan Bahan Baku
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Beranda</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-edit"></i> PengambilanBB
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    <div class="col-lg-6">

                        <form role="formpengambilanbb" onSubmit="" action="<% out.print(action); %>" method="POST">

                            <div class="form-group">
                                <label>ID Pengambilan</label>
                                <input class="form-control" placeholder="Masukkan ID " name="txtidpbb" readonly value="<% out.print(idPBB); %>">
                            </div>
                            <div class="form-group">
                                <label>Produk </label>
                                <select class="form-control"  name="txtIdProduk" id="txtIdProduk" >
                            
							
                            <%!
                            public List <Produk> lProduk= new ArrayList <Produk>();
                            %>
                            <%
                            DBConnection dbc = DBConnection.getInstance();
                            
                            try{
                                ProdukQuery produkQ = new ProdukQuery(dbc.getCon());
                                if(idProduk!=""){
                                    lProduk=produkQ.getAllS(Integer.parseInt(idProduk));
                                } else{
                                    lProduk=produkQ.getAll();
                                }
                                System.out.println("Load Sukses");
                            } catch (Exception e){
                                System.out.println("Gagal karena : "+ e);
                            }
                            %>
                            <%
                            //out.println("<option value=''>Pilih Produk</option>");

                            for (int row=0; this.lProduk.size()>row; row++){
                                Produk produk=lProduk.get(row);
                                if(produk.getIdProduk()==idProduk){
                                    out.println("<option value='"+ produk.getIdProduk()+"' selected>"+produk.getNamaProduk()+"</option>");
                                }
                                else{
                                    out.println("<option value='"+ produk.getIdProduk()+"'>"+produk.getNamaProduk()+"</option>");
                                }
                            }
                            %>
                                </select>
                            </div>
                            <div class="form-group">
                            <label>Jenis Produk</label>
                            <select class="form-control"  name="txtIdJenisProduk" id="txtIdJenisProduk" >
                                    
                            <%!
                            public List <JenisProduk> lJenisProduk= new ArrayList <JenisProduk>();
                            %>
                            <%

                            try{
                                JenisProdukQuery jenisProdukQ = new JenisProdukQuery(dbc.getCon());
                                if(idJenisProduk!=""){
                                    lJenisProduk=jenisProdukQ.getAllS(Integer.parseInt(idJenisProduk));
                                } else{
                                    lJenisProduk=jenisProdukQ.getAll();
                                }
                                System.out.println("Load Sukses");
                            } catch (Exception e){
                                System.out.println("Gagal karena : "+ e);
                            }
                            //out.println("<option value=''>Pilih Jenis Produk</option>");
                            for (int row=0; this.lJenisProduk.size()>row; row++){
                                JenisProduk jenisProduk=lJenisProduk.get(row);
                                if(jenisProduk.getIdJenisProduk()==idProduk){
                                    out.println("<option value='"+ jenisProduk.getIdJenisProduk()+"' selected>"+jenisProduk.getNamaJenisProduk()+"</option>");
                                }
                                else{
                                    out.println("<option value='"+ jenisProduk.getIdJenisProduk()+"'>"+jenisProduk.getNamaJenisProduk()+"</option>");
                                }
                            }
                            %>
                            </select>
                            </div> 
                            <div class="form-group">
                                <label>Kuantitas Target Produk</label>
                                <input class="form-control" placeholder="Masukkan Kuantitas " name="txtQtyTargetProduk" value="<% out.print(qtyTargetProduk); %>">
                            </div>
                            <div class="form-group">
                                <label>Satuan Target Produk</label>
                                <input class="form-control" placeholder="Masukkan Satuan " name="txtSatuanTargetProduk" value="<% out.print(satuanTargetProduk); %>">
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
