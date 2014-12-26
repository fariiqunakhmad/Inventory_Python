/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.servlet;

import com.python.model.Produk;
import com.python.query.ProdukQuery;
import com.python.utils.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akhmad Fariiqun Awwa
 */
@WebServlet(name = "UpdateProduk", urlPatterns = {"/updateproduk"})
public class UpdateProduk extends HttpServlet {
    DBConnection dbc = DBConnection.getInstance();
    Produk produk = new Produk();
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        int hargaProduk = -1,stockProduk= -1,stockminProduk = -1;
        produk.setIdProduk(request.getParameter("txtidproduk"));
        produk.setNamaProduk(request.getParameter("txtnamaproduk"));
        
        try{
            ProdukQuery produkq = new ProdukQuery(dbc.getCon());
            produkq.updateProduk(request.getParameter("txtidproduk"), produk);
            out.println("Update Sukses");
            out.println(request.getParameter("txtidproduk"));
            out.println(request.getParameter("txtnamaproduk"));
            out.println(request.getParameter("txtwarna"));
            out.println(request.getParameter("txtharga"));
            out.println(request.getParameter("txtstock"));
            out.println(request.getParameter("txtstockmin"));
        } catch (Exception e){
            System.out.println("Gagal karena : "+ e);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateProduk</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><h1>Servlet UpdateProduk at " + request.getContextPath() + "</h1>");
            out.println("<br><a href='index.jsp'> Home </a>");
            out.println("<br><a href='daftarprod.jsp'> Daftar Produk</a>");
            out.println("</body>");
            out.println("</html>");
             response.sendRedirect("daftarprod.jsp");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
