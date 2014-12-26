/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.servlet;

import com.python.model.PengambilanBB;
import com.python.query.PengambilanBBQuery;
import com.python.utils.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akhmad Fariiqun Awwa
 */
@WebServlet(name = "UpdatePengambilanBB", urlPatterns = {"/updatepengambilanbb"})
public class UpdatePengambilanBB extends HttpServlet {
    DBConnection dbc = DBConnection.getInstance();
    PengambilanBB pengambilanBB = new PengambilanBB();
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
        
        pengambilanBB.setIdPBB(request.getParameter("txtidpbb"));
        pengambilanBB.setTglPBB(Date.valueOf(request.getParameter("txttglpbb")));
        pengambilanBB.setIdPetugasPBB(request.getParameter("txtidpetugaspbb"));
        pengambilanBB.setIdPengambilPBB(request.getParameter("txtidpengambilpbb"));
        
        
        try{
            PengambilanBBQuery pengambilanBBq = new PengambilanBBQuery(dbc.getCon());
            pengambilanBBq.updatePengambilanBB(pengambilanBB.getIdPBB(), pengambilanBB);
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
            out.println("<title>Servlet UpdatePengambilanBB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><h1>Servlet UpdatePengambilanBB at " + request.getContextPath() + "</h1>");
            out.println("<br><a href='index.jsp'> Home </a>");
            out.println("<br><a href='daftarpengambilanBB.jsp'> Daftar PengambilanBB</a>");
            out.print(pengambilanBB.getIdPBB()+","+pengambilanBB.getIdPengambilPBB()+","+pengambilanBB.getIdPetugasPBB()+","+pengambilanBB.getTglPBB());
            out.println("</body>");
            out.println("</html>");
            response.sendRedirect("daftarpengambilanbb.jsp");
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
