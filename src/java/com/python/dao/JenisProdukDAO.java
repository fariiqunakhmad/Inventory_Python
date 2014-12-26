/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.JenisProduk;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface JenisProdukDAO {
   
    public void simpanJenisProduk(JenisProduk jenisProduk);
    public void deleteJenisProduk(String idJenisProduk);
    public void updateJenisProduk(String idJenisProduk, JenisProduk jenisProduk);
    public JenisProduk load(String idJenisProduk);
    public List<JenisProduk> getAll();
  
}