/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.SupplierDAO;
import com.python.model.Supplier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akhmad Fariiqun
 */
public class SupplierQuery implements SupplierDAO{
    private Connection conn=null;
    public SupplierQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanSupplier(Supplier supplier) {
        
        String sql = "INSERT INTO supplier(ID_SUP,ID_KOTA,NAMA_SUP,ALAMAT_SUP,TLP_SUP) VALUES(?,?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
            
        st.setString(1, supplier.getIdSupplier());
        st.setString(2, supplier.getIdKota());
        st.setString(3, supplier.getNamaSupplier());
        st.setString(4, supplier.getAlamatSupplier());
        st.setString(5, supplier.getTlpSupplier());
        st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex+supplier.getIdSupplier());
            System.out.println();
        }
    }

    @Override
    public void deleteSupplier(String idSupplier) {
        String sql = "DELETE FROM supplier WHERE ID_SUP=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idSupplier);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateSupplier(String idSupplier, Supplier supplier) {
        String sql = "UPDATE supplier SET NAMA_SUP=?,ALAMAT_SUP=?,TLP_SUP=?,ID_KOTA=? WHERE ID_SUP=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, supplier.getNamaSupplier());
        st.setString(2, supplier.getAlamatSupplier());
        st.setString(3, supplier.getTlpSupplier());
        st.setString(4, supplier.getIdKota());
        st.setString(5, supplier.getIdSupplier());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Supplier load(String idSupplier) {
        Supplier supplier = null;
        String sql = "SELECT * FROM supplier WHERE ID_SUP=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idSupplier);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        supplier = new Supplier();
        supplier.setIdSupplier(rs.getString(1));
        supplier.setIdKota(rs.getString(2));
        supplier.setNamaSupplier(rs.getString(3));
        supplier.setAlamatSupplier(rs.getString(4));
        supplier.setTlpSupplier(rs.getString(5));
      
        }
        } catch (SQLException ex) {
        Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return supplier;
    }

    @Override
    public List<Supplier> getAll() {
        String sql = "SELECT * FROM supplier";
        List<Supplier> list = new ArrayList<Supplier>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Supplier supplier = new Supplier();
                supplier.setIdSupplier(rs.getString(1));
                supplier.setIdKota(rs.getString(2));
                 supplier.setNamaSupplier(rs.getString(3));
                supplier.setAlamatSupplier(rs.getString(4));
                supplier.setTlpSupplier(rs.getString(5));
                list.add(supplier);
            }
        } catch (SQLException ex) {
        Logger.getLogger(SupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    
}
