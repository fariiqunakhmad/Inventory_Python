/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.BahanBaku;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface BahanBakuDAO {
   
    public void simpanBahanBaku(BahanBaku bahanBaku);
    public void deleteBahanBaku(String idBahanBaku);
    public void updateBahanBaku(String idBahanBaku, BahanBaku bahanBaku);
    public BahanBaku load(String idBahanBaku);
    public List<BahanBaku> getAll();
  
}