/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.BahanBakuDAO;
import com.python.model.BahanBaku;
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
public class BahanBakuQuery implements BahanBakuDAO{
    private Connection conn=null;
    public BahanBakuQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanBahanBaku(BahanBaku bahanBaku) {
        String sql = "INSERT INTO bahan_baku(id_bb, id_jenis_bb, nama_bb, harga_bb, stock_bb, stock_min_bb) VALUES(?,?,?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, bahanBaku.getIdBahanBaku());
        st.setString(2, bahanBaku.getIdJenisBahanBaku());
        st.setString(3, bahanBaku.getNamaBahanBaku());
        st.setInt(4, bahanBaku.getHargaBahanBaku());
        st.setInt(5, bahanBaku.getStockBahanBaku());
        st.setInt(6, bahanBaku.getStockMinBahanBaku());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(BahanBakuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteBahanBaku(String idBahanBaku) {
        String sql = "DELETE FROM bahan_baku WHERE id_bb=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idBahanBaku);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(BahanBakuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateBahanBaku(String idBahanBaku, BahanBaku bahanBaku) {
        String sql = "UPDATE bahan_baku SET id_jenis_bb=?,nama_bb=?,harga_bb=?,stock_bb=?,stock_min_bb=? WHERE id_bb=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, bahanBaku.getIdJenisBahanBaku());
        st.setString(2, bahanBaku.getNamaBahanBaku());
        st.setInt(3, bahanBaku.getHargaBahanBaku());
        st.setInt(4, bahanBaku.getStockBahanBaku());
        st.setInt(5, bahanBaku.getStockMinBahanBaku());
        st.setString(6, idBahanBaku);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(BahanBakuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public BahanBaku load(String idBahanBaku) {
        BahanBaku bahanBaku = null;
        String sql = "SELECT * FROM bahan_baku WHERE id_bb=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idBahanBaku);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        bahanBaku = new BahanBaku();
        bahanBaku.setIdBahanBaku(rs.getString(1));
        bahanBaku.setIdJenisBahanBaku(rs.getString(2));
        bahanBaku.setNamaBahanBaku(rs.getString(3));
        bahanBaku.setHargaBahanBaku(rs.getInt(4));
        bahanBaku.setStockBahanBaku(rs.getInt(5));
        bahanBaku.setStockMinBahanBaku(rs.getInt(6));

        }
        } catch (SQLException ex) {
        Logger.getLogger(BahanBakuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bahanBaku;
    }

    @Override
    public List<BahanBaku> getAll() {
        String sql = "SELECT * FROM bahan_baku";
        List<BahanBaku> list = new ArrayList<BahanBaku>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                BahanBaku bahanBaku = new BahanBaku();
                bahanBaku.setIdBahanBaku(rs.getString(1));
                bahanBaku.setIdJenisBahanBaku(rs.getString(2));
                bahanBaku.setNamaBahanBaku(rs.getString(3));
                bahanBaku.setHargaBahanBaku(rs.getInt(4));
                bahanBaku.setStockBahanBaku(rs.getInt(5));
                bahanBaku.setStockMinBahanBaku(rs.getInt(6));
                list.add(bahanBaku);
            }
        } catch (SQLException ex) {
        Logger.getLogger(BahanBakuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    

   
    
}
