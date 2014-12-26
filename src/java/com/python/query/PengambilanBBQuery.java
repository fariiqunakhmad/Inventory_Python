/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.PengambilanBBDAO;
import com.python.model.PengambilanBB;
import java.sql.Connection;
import java.sql.Date;
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
public class PengambilanBBQuery implements PengambilanBBDAO{
    private Connection conn=null;
    public PengambilanBBQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanPengambilanBB(PengambilanBB pengambilanBB) {
        String sql = "INSERT INTO PENGAMBILAN_BAHAN_BAKU(ID_PENGAMBILAN_BB, id_peg, peg_id_peg, tgl_pengambilan_bb) VALUES(?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, pengambilanBB.getIdPBB());
        st.setString(2, pengambilanBB.getIdPetugasPBB());
        st.setString(3, pengambilanBB.getIdPengambilPBB());
        st.setString(4, String.valueOf(pengambilanBB.getTglPBB()));
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(PengambilanBBDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePengambilanBB(String idPengambilanBB) {
        String sql = "DELETE FROM `pengambilan_bahan_baku` WHERE `ID_PENGAMBILAN_BB`=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idPengambilanBB);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(PengambilanBBDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updatePengambilanBB(String idPengambilanBB, PengambilanBB pengambilanBB) {
        String sql = "UPDATE `pengambilan_bahan_baku` SET `ID_PEG`=?,`PEG_ID_PEG`=?,`TGL_PENGAMBILAN_BB`=? WHERE `ID_PENGAMBILAN_BB`=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, pengambilanBB.getIdPetugasPBB());
        st.setString(2, pengambilanBB.getIdPengambilPBB());
        st.setString(3, String.valueOf(pengambilanBB.getTglPBB()));
        st.setString(4, idPengambilanBB);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(PengambilanBBDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public PengambilanBB load(String idPengambilanBB) {
        PengambilanBB pengambilanBB = null;
        String sql = "SELECT * FROM pengambilan_bahan_baku WHERE id_pengambilan_bb=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idPengambilanBB);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        pengambilanBB = new PengambilanBB();
        pengambilanBB.setIdPBB(rs.getString(1));
        pengambilanBB.setIdPetugasPBB(rs.getString(2));
        pengambilanBB.setIdPengambilPBB(rs.getString(3));
        pengambilanBB.setTglPBB(Date.valueOf(rs.getString(4)));
        }
        } catch (SQLException ex) {
        Logger.getLogger(PengambilanBBDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pengambilanBB;
    }

    @Override
    public List<PengambilanBB> getAll() {
        String sql = "SELECT * FROM pengambilan_bahan_baku";
        List<PengambilanBB> list = new ArrayList<PengambilanBB>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                PengambilanBB pengambilanBB = new PengambilanBB();
                pengambilanBB.setIdPBB(rs.getString(1));
                pengambilanBB.setIdPetugasPBB(rs.getString(2));
                pengambilanBB.setIdPengambilPBB(rs.getString(3));
                pengambilanBB.setTglPBB(Date.valueOf(rs.getString(4)));
                list.add(pengambilanBB);
            }
        } catch (SQLException ex) {
        Logger.getLogger(PengambilanBBDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    

   
    
}
