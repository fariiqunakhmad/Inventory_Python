<%-- 
    Document   : detailtarget
    Created on : Dec 16, 2014, 1:26:58 AM
    Author     : Akhmad Fariiqun Awwa
--%>

<%@page import="com.python.utils.DBConnection"%>
<%@page import="com.python.query.JenisProdukQuery"%>
<%@page import="com.python.query.ProdukQuery"%>
<%@page import="com.python.model.JenisProduk"%>
<%@page import="com.python.model.Produk"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--
        <%!
        public List <Produk> lproduk= new ArrayList <Produk>();
        public List <JenisProduk> ljenisproduk= new ArrayList <JenisProduk>();
        %>
        <%
        DBConnection dbc = DBConnection.getInstance();
        int row=0;
        try{
            ProdukQuery produkq = new ProdukQuery(dbc.getCon());
            lproduk=produkq.getAll();
            JenisProdukQuery jenisprodukq = new JenisProdukQuery(dbc.getCon());
            ljenisproduk=jenisprodukq.getAll();
            System.out.println("Load Sukses");
        } catch (Exception e){
            System.out.println("Gagal karena : "+ e);
        }
        %>
        --%>
        <div class="form-group">
        <label>Produk</label>
        <select class="form-control" placeholder="Pilih Produk" name="txtidproduk[]" id="txtidproduk">

        <%
        for (row=0; this.lproduk.size()>row; row++){
            Produk produk=lproduk.get(row);
            out.println("<option value='"+ produk.getIdProduk()+"'>"+produk.getNamaProduk()+"</option>");
        }
        %>
        </select>
        </div> 
        <div class="form-group">
        <label>JenisProduk</label>
        <select class="form-control" placeholder="Pilih Jenis Produk" name="txtidjenisproduk[]" id="txtidjenisproduk">

        <%
        for (row=0; this.ljenisproduk.size()>row; row++){
            JenisProduk jenisproduk=ljenisproduk.get(row);
            out.println("<option value='"+ jenisproduk.getIdJenisProduk()+"'>"+jenisproduk.getNamaJenisProduk()+"</option>");
        }
        %>
        </select>
        </div>
        <div class="form-group">
            <label>Qty</label>
            <input class="form-control" placeholder="Masukkan Jumlah Produk " name="txtqtytp[]" value="">
        </div>
    </body>
</html>
