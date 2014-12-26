/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.JenisProdukDAO;
import com.python.model.JenisProduk;
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
public class JenisProdukQuery implements JenisProdukDAO{
    private Connection conn=null;
    public JenisProdukQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanJenisProduk(JenisProduk jenisProduk) {
        String sql = "INSERT INTO jenis_produk(id_jenis_pro,jenis_pro) VALUES(?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, jenisProduk.getIdJenisProduk());
        st.setString(2, jenisProduk.getNamaJenisProduk());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(JenisProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteJenisProduk(String idJenisProduk) {
        String sql = "DELETE FROM jenis_produk WHERE id_jenis_pro=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idJenisProduk);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(JenisProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateJenisProduk(String idJenisProduk, JenisProduk jenisProduk) {
        String sql = "UPDATE jenis_produk SET jenis_pro=? WHERE id_jenis_pro=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, jenisProduk.getNamaJenisProduk());
        st.setString(2, idJenisProduk);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(JenisProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public JenisProduk load(String idJenisProduk) {
        JenisProduk jenisProduk = null;
        String sql = "SELECT * FROM jenis_produk WHERE id_jenis_pro=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idJenisProduk);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        jenisProduk = new JenisProduk();
        jenisProduk.setIdJenisProduk(rs.getString(1));
        jenisProduk.setNamaJenisProduk(rs.getString(2));
        }
        } catch (SQLException ex) {
        Logger.getLogger(JenisProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jenisProduk;
    }

    @Override
    public List<JenisProduk> getAll() {
        String sql = "SELECT * FROM jenis_produk";
        List<JenisProduk> list = new ArrayList<JenisProduk>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                JenisProduk jenisProduk = new JenisProduk();
                jenisProduk.setIdJenisProduk(rs.getString(1));
                jenisProduk.setNamaJenisProduk(rs.getString(2));
                list.add(jenisProduk);
            }
        } catch (SQLException ex) {
        Logger.getLogger(JenisProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<JenisProduk> getAllS(int id) {
        String sql = "SELECT * FROM `jenis_produk` WHERE `ID_JENIS_PRO`=? UNION\n" +
"SELECT * FROM `jenis_produk` WHERE `ID_JENIS_PRO`!=? ";
        List<JenisProduk> list = new ArrayList<JenisProduk>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(2, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                JenisProduk jenisProduk = new JenisProduk();
                jenisProduk.setIdJenisProduk(rs.getString(1));
                jenisProduk.setNamaJenisProduk(rs.getString(2));
                list.add(jenisProduk);
            }
        } catch (SQLException ex) {
        Logger.getLogger(JenisProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    

   
    
}
