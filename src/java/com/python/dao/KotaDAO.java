/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.Kota;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface KotaDAO {
   
    public void simpanKota(Kota kota);
    public void deleteKota(String idKota);
    public void updateKota(String idKota, Kota kota);
    public Kota load(String idKota);
    public List<Kota> getAll();
  
}