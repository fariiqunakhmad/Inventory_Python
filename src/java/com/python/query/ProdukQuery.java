/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.ProdukDAO;
import com.python.model.Produk;
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
public class ProdukQuery implements ProdukDAO{
    private Connection conn=null;
    public ProdukQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanProduk(Produk produk) {
        String sql = "INSERT INTO produk(ID_PRO,NAMA_PRO) VALUES(?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, produk.getIdProduk());
        st.setString(2, produk.getNamaProduk());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteProduk(String idProduk) {
        String sql = "DELETE FROM produk WHERE id_pro=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idProduk);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateProduk(String idProduk, Produk produk) {
        String sql = "UPDATE produk SET NAMA_PRO=? WHERE ID_PRO=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, produk.getNamaProduk());
        st.setString(2, idProduk);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Produk load(String idProduk) {
        Produk produk = null;
        String sql = "SELECT * FROM produk WHERE id_pro=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idProduk);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        produk = new Produk();
        produk.setIdProduk(rs.getString(1));
        produk.setNamaProduk(rs.getString(2));
        }
        } catch (SQLException ex) {
        Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produk;
    }

    @Override
    public List<Produk> getAll() {
        String sql = "SELECT * FROM produk";
        List<Produk> list = new ArrayList<Produk>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Produk produk = new Produk();
                produk.setIdProduk(rs.getString(1));
                produk.setNamaProduk(rs.getString(2));
                list.add(produk);
            }
        } catch (SQLException ex) {
        Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<Produk> getAllS(int id) {
        String sql = "SELECT * FROM `produk` WHERE `ID_PRO`=? UNION\n" +
"SELECT * FROM `produk` WHERE `ID_PRO`!=? ";
        List<Produk> list = new ArrayList<Produk>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(2, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Produk produk = new Produk();
                produk.setIdProduk(rs.getString(1));
                produk.setNamaProduk(rs.getString(2));
                list.add(produk);
            }
        } catch (SQLException ex) {
        Logger.getLogger(ProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    

   
    
}
