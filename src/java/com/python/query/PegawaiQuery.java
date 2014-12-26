/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.PegawaiDAO;
import com.python.model.Pegawai;
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
public class PegawaiQuery implements PegawaiDAO{
    private Connection conn=null;
    public PegawaiQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanPegawai(Pegawai pegawai) {
        String sql = "INSERT INTO pegawai(id_peg, id_kota, nama_peg, alamat_peg, tlp_peg) VALUES(?,?,?,?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, pegawai.getIdPegawai());
        st.setString(2, pegawai.getIdKota());
        st.setString(3, pegawai.getNamaPegawai());
        st.setString(4, pegawai.getAlamatPegawai());
        st.setString(5, pegawai.getTlpPegawai());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deletePegawai(String idPegawai) {
        String sql = "DELETE FROM pegawai WHERE id_peg=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idPegawai);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updatePegawai(String idPegawai, Pegawai pegawai) {
        String sql = "UPDATE pegawai SET id_kota=?,nama_peg=?,alamat_peg=?,tlp_peg=? WHERE id_peg=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, pegawai.getIdKota());
        st.setString(2, pegawai.getNamaPegawai());
        st.setString(3, pegawai.getAlamatPegawai());
        st.setString(4, pegawai.getTlpPegawai());
        st.setString(5, idPegawai);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Pegawai load(String idPegawai) {
        Pegawai pegawai = null;
        String sql = "SELECT * FROM pegawai WHERE id_peg=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idPegawai);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        pegawai = new Pegawai();
        pegawai.setIdPegawai(rs.getString(1));
        pegawai.setIdKota(rs.getString(2));
        pegawai.setNamaPegawai(rs.getString(3));
        pegawai.setAlamatPegawai(rs.getString(4));
        pegawai.setTlpPegawai(rs.getString(5));
        }
        } catch (SQLException ex) {
        Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pegawai;
    }

    @Override
    public List<Pegawai> getAll() {
        String sql = "SELECT * FROM pegawai";
        List<Pegawai> list = new ArrayList<Pegawai>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pegawai pegawai = new Pegawai();
                pegawai.setIdPegawai(rs.getString(1));
                pegawai.setIdKota(rs.getString(2));
                pegawai.setNamaPegawai(rs.getString(3));
                pegawai.setAlamatPegawai(rs.getString(4));
                pegawai.setTlpPegawai(rs.getString(5));
                list.add(pegawai);
            }
        } catch (SQLException ex) {
        Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<Pegawai> getAllS(String id) {
        String sql = "SELECT * FROM `pegawai` WHERE `ID_PEG`=? UNION\n" +
"SELECT * FROM `pegawai` WHERE `ID_PEG`!=? ";
        List<Pegawai> list = new ArrayList<Pegawai>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, id);
            st.setString(2, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pegawai pegawai = new Pegawai();
                pegawai.setIdPegawai(rs.getString(1));
                pegawai.setIdKota(rs.getString(2));
                pegawai.setNamaPegawai(rs.getString(3));
                pegawai.setAlamatPegawai(rs.getString(4));
                pegawai.setTlpPegawai(rs.getString(5));
                list.add(pegawai);
            }
        } catch (SQLException ex) {
        Logger.getLogger(PegawaiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    

   
    
}
