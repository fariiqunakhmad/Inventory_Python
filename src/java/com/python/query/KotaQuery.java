/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.query;

import com.python.dao.KotaDAO;
import com.python.model.Kota;
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
public class KotaQuery implements KotaDAO{
    private Connection conn=null;
    public KotaQuery(Connection conn){
        this.conn=conn;
    }
    

    @Override
    public void simpanKota(Kota kota) {
        String sql = "INSERT INTO kota(id_kota,nama_kota) VALUES(?,?)";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, kota.getIdKota());
        st.setString(2, kota.getNamaKota());
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(KotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteKota(String idKota) {
        String sql = "DELETE FROM kota WHERE id_kota=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idKota);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(KotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    @Override
    public void updateKota(String idKota, Kota kota) {
        String sql = "UPDATE kota SET nama_kota=? WHERE id_kota=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, kota.getNamaKota());
        st.setString(2, idKota);
        st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(KotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @Override
    public Kota load(String idKota) {
        Kota kota = null;
        String sql = "SELECT * FROM kota WHERE id_kota=?";
        try {
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, idKota);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
        kota = new Kota();
        kota.setIdKota(rs.getString(1));
        kota.setNamaKota(rs.getString(2));
        }
        } catch (SQLException ex) {
        Logger.getLogger(KotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kota;
    }

    @Override
    public List<Kota> getAll() {
        String sql = "SELECT * FROM kota";
        List<Kota> list = new ArrayList<Kota>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kota kota = new Kota();
                kota.setIdKota(rs.getString(1));
                kota.setNamaKota(rs.getString(2));
                list.add(kota);
            }
        } catch (SQLException ex) {
        Logger.getLogger(KotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    

    

   
    
}
