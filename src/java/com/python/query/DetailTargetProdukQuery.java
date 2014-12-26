/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.DetailTargetProdukDAO;
import com.python.model.DetailTargetProduk;
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
public class DetailTargetProdukQuery implements DetailTargetProdukDAO{
    private Connection conn=null;
    public DetailTargetProdukQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanDetailTargetProduk(DetailTargetProduk detailTargetProduk) {
        String sql = "INSERT INTO `detail_target_produk`(`ID_JENIS_PRO`, `ID_PRO`, `ID_PENGAMBILAN_BB`, `QTY_TARGET_PRODUK`, `SATUAN_PRODUK_TARGET`) VALUES(?,?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, detailTargetProduk.getIdJenisProduk());
        st.setInt(2, detailTargetProduk.getIdProduk());
        st.setString(3, detailTargetProduk.getIdPengambilanBB());
        st.setString(4, detailTargetProduk.getQtyTargetProduk());
        st.setString(5, detailTargetProduk.getSatuanProdukTarget());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(DetailTargetProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteDetailTargetProduk(String idPengambilanBB, int idProduk, int idJenisProduk) {
        String sql = "DELETE FROM detail_target_produk WHERE ID_PENGAMBILAN_BB=? and id_pro=? and id_jenis_pro=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idPengambilanBB);
        st.setInt(2, idProduk);
        st.setInt(3, idJenisProduk);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(DetailTargetProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    public void updateDetailTargetProduk(String idPengambilanBB, int idProduk, int idJenisProduk, DetailTargetProduk detailTargetProduk) {
        String sql = "UPDATE `detail_target_produk` SET `QTY_TARGET_PRODUK`=?,`SATUAN_PRODUK_TARGET`=? WHERE `ID_JENIS_PRO`=? AND `ID_PRO`=? AND `ID_PENGAMBILAN_BB`=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, detailTargetProduk.getQtyTargetProduk());
        st.setString(2, detailTargetProduk.getSatuanProdukTarget());
        st.setInt(3, idJenisProduk);
        st.setInt(4, idProduk);
        st.setString(5, idPengambilanBB);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(DetailTargetProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    public DetailTargetProduk load(String idPengambilanBB, int idProduk, int idJenisProduk) {
        DetailTargetProduk detailTargetProduk = null;
        String sql = "SELECT  p.`NAMA_PRO`, j.`JENIS_PRO`, dt.`QTY_TARGET_PRODUK`, dt.`SATUAN_PRODUK_TARGET`\n" +
"FROM `produk` p, `jenis_produk` j, `detail_target_produk` dt\n" +
"WHERE p.`ID_PRO`=dt.`ID_PRO` AND j.`ID_JENIS_PRO`=dt.`ID_JENIS_PRO` AND dt.`ID_PENGAMBILAN_BB`=? and dt.`ID_PRO`=? and dt.`ID_JENIS_PRO`=? ";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idPengambilanBB);
        st.setInt(2, idProduk);
        st.setInt(3, idJenisProduk);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        detailTargetProduk = new DetailTargetProduk();
        detailTargetProduk.setIdProduk(idProduk);
        detailTargetProduk.setNamaProduk(rs.getString(1));
        detailTargetProduk.setIdJenisProduk(idJenisProduk);
        detailTargetProduk.setNamaJenisProduk(rs.getString(2));
        detailTargetProduk.setQtyTargetProduk(rs.getString(3));
        detailTargetProduk.setSatuanProdukTarget(rs.getString(4));
        detailTargetProduk.setIdPengambilanBB(idPengambilanBB);
        }
        } catch (SQLException ex) {
        Logger.getLogger(DetailTargetProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return detailTargetProduk;
    }

    @Override
    public List<DetailTargetProduk> getAll() {
        String sql = "SELECT * FROM detailTargetProduk";
        List<DetailTargetProduk> list = new ArrayList<DetailTargetProduk>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DetailTargetProduk detailTargetProduk = new DetailTargetProduk();
//                detailTargetProduk.setIdDetailTargetProduk(rs.getString(1));
//                detailTargetProduk.setIdKota(rs.getString(2));
//                detailTargetProduk.setNamaDetailTargetProduk(rs.getString(3));
//                detailTargetProduk.setAlamatDetailTargetProduk(rs.getString(4));
//                detailTargetProduk.setTlpDetailTargetProduk(rs.getString(5));
                list.add(detailTargetProduk);
            }
        } catch (SQLException ex) {
        Logger.getLogger(DetailTargetProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<DetailTargetProduk> getByTrans(String idPengambilanBB) {
        String sql = "SELECT dt.`ID_PRO`, p.`NAMA_PRO`, dt.`ID_JENIS_PRO`, j.`JENIS_PRO`, dt.`QTY_TARGET_PRODUK`, dt.`SATUAN_PRODUK_TARGET`\n" +
"FROM `produk` p, `jenis_produk` j, `detail_target_produk` dt\n" +
"WHERE p.`ID_PRO`=dt.`ID_PRO` AND j.`ID_JENIS_PRO`=dt.`ID_JENIS_PRO` AND dt.`ID_PENGAMBILAN_BB`=?";
        
        List<DetailTargetProduk> list = new ArrayList<DetailTargetProduk>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, idPengambilanBB);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DetailTargetProduk detailTargetProduk = new DetailTargetProduk();
                detailTargetProduk.setIdProduk(rs.getInt(1));
                detailTargetProduk.setNamaProduk(rs.getString(2));
                detailTargetProduk.setIdJenisProduk(rs.getInt(3));
                detailTargetProduk.setNamaJenisProduk(rs.getString(4));
                detailTargetProduk.setQtyTargetProduk(rs.getString(5));
                detailTargetProduk.setSatuanProdukTarget(rs.getString(6));
                detailTargetProduk.setIdPengambilanBB(idPengambilanBB);
                list.add(detailTargetProduk);
            }
        } catch (SQLException ex) {
        Logger.getLogger(DetailTargetProdukDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void deleteDetailTargetProduk(String idDetailTargetProduk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetailTargetProduk load(String idDetailTargetProduk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDetailTargetProduk(String idDetailTargetProduk, DetailTargetProduk detailTargetProduk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

    

   
    
}
