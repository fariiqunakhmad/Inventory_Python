/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.servlet;

import com.python.model.DetailTargetProduk;
import com.python.query.DetailTargetProdukQuery;
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
@WebServlet(name = "UpdateDPBB", urlPatterns = {"/updateDPBB"})
public class UpdateDPBB extends HttpServlet {
    DBConnection dbc = DBConnection.getInstance();
    DetailTargetProduk detailTargetProduk = new DetailTargetProduk();
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
        
        detailTargetProduk.setIdPengambilanBB(request.getParameter("txtidpbb"));
        detailTargetProduk.setIdProduk(Integer.parseInt(request.getParameter("txtIdProduk")));
        detailTargetProduk.setNamaProduk(request.getParameter(null));
        detailTargetProduk.setIdJenisProduk(Integer.parseInt(request.getParameter("txtIdJenisProduk")));
        detailTargetProduk.setNamaJenisProduk(request.getParameter(null));
        detailTargetProduk.setQtyTargetProduk(request.getParameter("txtQtyTargetProduk"));
        detailTargetProduk.setSatuanProdukTarget(request.getParameter("txtSatuanTargetProduk"));

        
        
        
        try{
            DetailTargetProdukQuery detailTargetProdukq = new DetailTargetProdukQuery(dbc.getCon());
            detailTargetProdukq.updateDetailTargetProduk(detailTargetProduk.getIdPengambilanBB(), detailTargetProduk.getIdProduk(), detailTargetProduk.getIdJenisProduk(), detailTargetProduk);
            System.out.println("Update Sukses");
        } catch (Exception e){
            System.out.println("Gagal karena : "+ e);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateDetailTargetProduk</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><h1>Servlet UpdateDetailTargetProduk at " + request.getContextPath() + "</h1>");
            out.println("<br><a href='index.jsp'> Home </a>");
            out.println("<br><a href='daftardetailTargetProduk.jsp'> Daftar DetailTargetProduk</a>");
            out.println("</body>");
            out.println("</html>");
            response.sendRedirect("daftardetailpbb.jsp?idpengambilanbb="+detailTargetProduk.getIdPengambilanBB());
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
