/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.DetailTargetProduk;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface DetailTargetProdukDAO {
   
    public void simpanDetailTargetProduk(DetailTargetProduk detailTargetProduk);
    public void deleteDetailTargetProduk(String idDetailTargetProduk);
    public void updateDetailTargetProduk(String idDetailTargetProduk, DetailTargetProduk detailTargetProduk);
    public DetailTargetProduk load(String idDetailTargetProduk);
    public List<DetailTargetProduk> getAll();
  
}