/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.Supplier;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface SupplierDAO {
   
    public void simpanSupplier(Supplier supplier);
    public void deleteSupplier(String idSupplier);
    public void updateSupplier(String idSupplier, Supplier supplier);
    public Supplier load(String idSupplier);
    public List<Supplier> getAll();
  
}