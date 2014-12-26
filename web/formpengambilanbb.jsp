<%-- 
    Document   : formpengambilanBB
    Created on : Sep 26, 2014, 9:33:58 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.query.JenisProdukQuery"%>
<%@page import="com.python.model.JenisProduk"%>
<%@page import="com.python.query.ProdukQuery"%>
<%@page import="com.python.model.Produk"%>
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

    <title>FORM PENGAMBILAN BAHAN BAKU</title>
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

        String idPBB="PBB"+timeStamp, idPetugasPBB="PEG01", idPengambilPBB="", action;
        
        java.sql.Date tglPBB= new java.sql.Date(utilDate.getTime());
        if(request.getParameter("idpengambilanbb")!=null){
            idPBB=request.getParameter("idpengambilanbb");
            DBConnection conn = DBConnection.getInstance();
            PengambilanBBQuery pengambilanBBq= new PengambilanBBQuery(conn.getCon());
            PengambilanBB pengambilanBB=new PengambilanBB();
            pengambilanBB=pengambilanBBq.load(idPBB);
            idPetugasPBB=pengambilanBB.getIdPetugasPBB();
            idPengambilPBB=pengambilanBB.getIdPengambilPBB();
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
                            Form PengambilanBB
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
                                <label>ID</label>
                                <input class="form-control" placeholder="Masukkan ID " name="txtidpbb" readonly value="<% out.print(idPBB); %>">
                            </div>
                            <div class="form-group">
                                <label>TANGGAL PENGAMBILAN</label>
                                <input type="date" class="form-control" placeholder="Masukkan tanggal" name="txttglpbb" readonly value="<% out.print(tglPBB); %>">
                            </div>
							
                            <%!
                            public List <Pegawai> lpegawai= new ArrayList <Pegawai>();
                            %>
                            <%
                            DBConnection dbc = DBConnection.getInstance();
                            int row=0;
                            try{
                                PegawaiQuery pegawaiq = new PegawaiQuery(dbc.getCon());
                                if(idPengambilPBB!=""){
                                    lpegawai=pegawaiq.getAllS(idPengambilPBB);
                                } else{
                                    lpegawai=pegawaiq.getAll();
                                }
                                //lpegawai=pegawaiq.getAll();
                                System.out.println("Load Sukses");
                            } catch (Exception e){
                                System.out.println("Gagal karena : "+ e);
                            }
                            %>
                            <div class="form-group">
                            <label>PENGAMBIL</label>
                            <select class="form-control" placeholder="Pilih Pegawai" name="txtidpengambilpbb" id="txtidpegawai">
                                    
                            <%
                            for (row=0; this.lpegawai.size()>row; row++){
                                Pegawai pegawai=lpegawai.get(row);
                                out.println("<option value='"+ pegawai.getIdPegawai()+"'>"+pegawai.getNamaPegawai()+"</option>");
                            }
                            %>
                            </select>
                            </div> 
                            <div class="form-group">
                                <label>PETUGAS</label>
                                <input class="form-control" placeholder="Masukkan ID " name="txtidpetugaspbb" readonly value="<% out.print(idPetugasPBB); %>">
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
