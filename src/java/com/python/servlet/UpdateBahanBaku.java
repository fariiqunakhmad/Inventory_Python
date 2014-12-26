/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.servlet;

import com.python.model.BahanBaku;
import com.python.query.BahanBakuQuery;
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
@WebServlet(name = "UpdateBahanBaku", urlPatterns = {"/updatebahanbaku"})
public class UpdateBahanBaku extends HttpServlet {
    DBConnection dbc = DBConnection.getInstance();
    BahanBaku bahanBaku = new BahanBaku();
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
        int hargaBahanBaku = -1,stockBahanBaku= -1,stockMinBahanBaku = -1; 

        bahanBaku.setIdBahanBaku(request.getParameter("txtidbahanbaku"));
        bahanBaku.setIdJenisBahanBaku(request.getParameter("txtidjenisbahanbaku"));
        bahanBaku.setNamaBahanBaku(request.getParameter("txtnamabahanbaku"));
        try {
           hargaBahanBaku = Integer.parseInt(request.getParameter("txthargabahanbaku"));
        } catch(Exception ex){
           out.println("Gagal karena : "+ ex);
        }
        if(hargaBahanBaku  != -1) {
           bahanBaku.setHargaBahanBaku(hargaBahanBaku);
        }
        
        try {
           stockBahanBaku = Integer.parseInt(request.getParameter("txtstockbahanbaku"));
        } catch(Exception ex){
           out.println("Gagal karena : "+ ex);
        }
        if(stockBahanBaku  != -1) {
           bahanBaku.setStockBahanBaku(stockBahanBaku);
        }
        
        try {
           stockMinBahanBaku = Integer.parseInt(request.getParameter("txtstockminbahanbaku"));
        } catch(Exception ex){
           out.println("Gagal karena : "+ ex);
        }
        if(stockMinBahanBaku  != -1) {
           bahanBaku.setStockMinBahanBaku(stockMinBahanBaku);
        }
        
        
        try{
            BahanBakuQuery bahanBakuq = new BahanBakuQuery(dbc.getCon());
            bahanBakuq.updateBahanBaku(request.getParameter("txtidbahanbaku"), bahanBaku);
            System.out.println("Update Sukses");
            
        } catch (Exception e){
            System.out.println("Gagal karena : "+ e);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateBahanBaku</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><h1>Servlet UpdateBahanBaku at " + request.getContextPath() + "</h1>");
            out.println("<br><a href='index.jsp'> Home </a>");
            out.println("<br><a href='daftarbahanBaku.jsp'> Daftar BahanBaku</a>");
            out.println("</body>");
            out.println("</html>");
            response.sendRedirect("daftarbahanbaku.jsp");
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
