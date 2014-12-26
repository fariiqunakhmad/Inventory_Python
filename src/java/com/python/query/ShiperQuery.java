/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.ShiperDAO;
import com.python.model.Shiper;
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
public class ShiperQuery implements ShiperDAO{
    private Connection conn=null;
    public ShiperQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanShiper(Shiper shiper) {
        
        String sql = "INSERT INTO shiper(ID_SHIPER,ID_KOTA,NAMA_SHIPER,ALAMAT_SHIPER,TELP_SHIPER) VALUES(?,?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
            
        st.setString(1, shiper.getIdShiper());
        st.setString(2, shiper.getIdKota());
        st.setString(3, shiper.getNamaShiper());
        st.setString(4, shiper.getAlamatShiper());
        st.setString(5, shiper.getTlpShiper());
        st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ShiperDAO.class.getName()).log(Level.SEVERE, null, ex+shiper.getIdShiper());
            System.out.println();
        }
    }

    @Override
    public void deleteShiper(String idShiper) {
        String sql = "DELETE FROM shiper WHERE ID_SHIPER=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idShiper);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(ShiperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateShiper(String idShiper, Shiper shiper) {
        String sql = "UPDATE shiper SET NAMA_SHIPER=?,ALAMAT_SHIPER=?,TELP_SHIPER=?,ID_KOTA=? WHERE ID_SHIPER=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, shiper.getNamaShiper());
        st.setString(2, shiper.getAlamatShiper());
        st.setString(3, shiper.getTlpShiper());
        st.setString(4, shiper.getIdKota());
        st.setString(5, shiper.getIdShiper());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(ShiperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Shiper load(String idShiper) {
        Shiper shiper = null;
        String sql = "SELECT * FROM shiper WHERE ID_SHIPER=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idShiper);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        shiper = new Shiper();
        shiper.setIdShiper(rs.getString(1));
        shiper.setIdKota(rs.getString(2));
        shiper.setNamaShiper(rs.getString(3));
        shiper.setAlamatShiper(rs.getString(4));
        shiper.setTlpShiper(rs.getString(5));
      
        }
        } catch (SQLException ex) {
        Logger.getLogger(ShiperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shiper;
    }

    @Override
    public List<Shiper> getAll() {
        String sql = "SELECT * FROM shiper";
        List<Shiper> list = new ArrayList<Shiper>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Shiper shiper = new Shiper();
                shiper.setIdShiper(rs.getString(1));
                shiper.setIdKota(rs.getString(2));
                 shiper.setNamaShiper(rs.getString(3));
                shiper.setAlamatShiper(rs.getString(4));
                shiper.setTlpShiper(rs.getString(5));
                list.add(shiper);
            }
        } catch (SQLException ex) {
        Logger.getLogger(ShiperDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    
}
