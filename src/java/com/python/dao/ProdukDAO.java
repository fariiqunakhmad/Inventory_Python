/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.Produk;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface ProdukDAO {
   
    public void simpanProduk(Produk produk);
    public void deleteProduk(String idProduk);
    public void updateProduk(String idProduk, Produk produk);
    public Produk load(String idProduk);
    public List<Produk> getAll();
  
}