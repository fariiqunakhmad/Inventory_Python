<%-- 
    Document   : daftarpegawai
    Created on : Oct 10, 2014, 6:50:06 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.query.DetailTargetProdukQuery"%>
<%@page import="com.python.model.DetailTargetProduk"%>
<%@page import="com.python.model.PengambilanBB"%>
<%@page import="com.python.query.PengambilanBBQuery"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
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
    <% 
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.util.Date utilDate = cal.getTime();
        
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());

        String idPBB="", idPetugasPBB="", namaPetugasPBB="", idPengambilPBB="", namaPengambilPBB="", action;
        
        java.sql.Date tglPBB= new java.sql.Date(utilDate.getTime());
        if(request.getParameter("idpengambilanbb")!=null){
            idPBB=request.getParameter("idpengambilanbb");
            DBConnection dbc = DBConnection.getInstance();
            PengambilanBBQuery pengambilanBBq= new PengambilanBBQuery(dbc.getCon());
            PengambilanBB pengambilanBB=new PengambilanBB();
            pengambilanBB=pengambilanBBq.load(idPBB);
            idPetugasPBB=pengambilanBB.getIdPetugasPBB();
            idPengambilPBB=pengambilanBB.getIdPengambilPBB();
            PegawaiQuery pegawaiq= new PegawaiQuery(dbc.getCon());
            Pegawai pegawai=new Pegawai();
            pegawai=pegawaiq.load(idPetugasPBB);
            namaPetugasPBB=pegawai.getNamaPegawai();
            pegawai=pegawaiq.load(idPengambilPBB);
            namaPengambilPBB=pegawai.getNamaPegawai();
            tglPBB=pengambilanBB.getTglPBB();
            action="updatepengambilanbb";
            
        } else  action="insertpengambilanbb";
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
                            Detail Pengambilan Bahan Baku
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
                        
                        <table>
                            <tr>
                                <td>Id Pengambilan Bahan Baku</td>
                                <td><% out.print(": "+idPBB); %></td>
                            </tr>
                            <tr>
                                <td>Nama Petugas</td>
                                <td><% out.print(": "+namaPetugasPBB); %></td>
                            </tr>
                            <tr>
                                <td>Nama Pengambil</td>
                                <td><% out.print(": "+namaPengambilPBB); %></td>
                            </tr>
                            <tr>
                                <td>Tanggal Pengambilan</td>
                                <td><% out.print(": "+tglPBB); %></td>
                            </tr>
                        </table>
                            <a href="formdetailpbb.jsp?idPengambilanBB=<% out.print(idPBB); %>">Tambah Produk</a>
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>No</th>
                                        <th>Produk</th>
                                        <th>Jenis</th>
                                        <th>Qty</th>
                                        <th>Satuan</th>
                                        <th>Control</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%!
                public List <DetailTargetProduk> lDetailTargetProduk= new ArrayList <DetailTargetProduk>();
                %>
                <%
                DBConnection dbc = DBConnection.getInstance();
                int row=0;
                try{
                    DetailTargetProdukQuery detailTargetProdukq = new DetailTargetProdukQuery(dbc.getCon());
                    lDetailTargetProduk=detailTargetProdukq.getByTrans(idPBB);
                    System.out.println("Load Sukses");
                } catch (Exception e){
                    System.out.println("Gagal karena : "+ e);
                }
                for (row=0; this.lDetailTargetProduk.size()>row; row++){
                    DetailTargetProduk detailTargetProduk=lDetailTargetProduk.get(row);
                    out.println(
                                    "<tr>"+
                                        "<td>"+(row+1)+"</td>"+
                                        "<td>"+detailTargetProduk.getNamaProduk()+"</td>"+
                                        "<td>"+detailTargetProduk.getNamaJenisProduk()+"</td>"+
                                        "<td>"+detailTargetProduk.getQtyTargetProduk()+"</td>"+
                                        "<td>"+detailTargetProduk.getSatuanProdukTarget()+"</td>"+
                                        
                                        "<td><a href='formdetailpbb.jsp?idPengambilanBB="+detailTargetProduk.getIdPengambilanBB()+"&idProduk="+detailTargetProduk.getIdProduk()+"&idJenisProduk="+detailTargetProduk.getIdJenisProduk()+"'>Edit</a> | <a href='deleteDPBB?idPengambilanBB="+detailTargetProduk.getIdPengambilanBB()+"&idProduk="+detailTargetProduk.getIdProduk()+"&idJenisProduk="+detailTargetProduk.getIdJenisProduk()+"'>Delete</a></td>"+
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
