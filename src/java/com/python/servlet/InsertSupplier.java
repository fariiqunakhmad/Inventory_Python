/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.servlet;

import com.python.model.Supplier;
import com.python.query.SupplierQuery;
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
@WebServlet(name = "InsertSupplier", urlPatterns = {"/insertsupplier"})
public class InsertSupplier extends HttpServlet {
DBConnection dbc = DBConnection.getInstance();
Supplier supplier = new Supplier();
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
       
        supplier.setIdSupplier(request.getParameter("txtidsupplier"));
        supplier.setIdKota(request.getParameter("txtidkota"));
        supplier.setNamaSupplier(request.getParameter("txtnamasupplier"));
        supplier.setAlamatSupplier(request.getParameter("txtalamatsupplier"));
         supplier.setTlpSupplier(request.getParameter("txttlpsupplier"));      
         PrintWriter out = response.getWriter();
         
        try{
            SupplierQuery supplierq = new SupplierQuery(dbc.getCon());
            supplierq.simpanSupplier(supplier);
            out.println("Insert Sukses");
            out.println(supplier.getIdSupplier());
            out.println(supplier.getIdKota());
            out.println(supplier.getNamaSupplier());
            out.println(supplier.getAlamatSupplier());
            out.println(supplier.getTlpSupplier());
        } catch (Exception e){
            out.println("Gagal karena : "+ e);
        }
        response.setContentType("text/html;charset=UTF-8");
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertSupplier</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertSupplier at " + request.getContextPath() + "</h1>");
            out.println("<br><a href='index.jsp'> Home </a>");
            out.println("<br><a href='daftarsupplier.jsp'> Daftar Supplier</a>");
            out.println("</body>");
            out.println("</html>");
               response.sendRedirect("daftarsup.jsp");
        
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
