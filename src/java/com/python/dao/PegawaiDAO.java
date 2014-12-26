/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.Pegawai;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface PegawaiDAO {
   
    public void simpanPegawai(Pegawai pegawai);
    public void deletePegawai(String idPegawai);
    public void updatePegawai(String idPegawai, Pegawai pegawai);
    public Pegawai load(String idPegawai);
    public List<Pegawai> getAll();
  
}