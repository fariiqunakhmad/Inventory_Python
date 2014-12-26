/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.dao;

import com.python.model.Shiper;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun
 */
public interface ShiperDAO {
   
    public void simpanShiper(Shiper shiper);
    public void deleteShiper(String idShiper);
    public void updateShiper(String idShiper, Shiper shiper);
    public Shiper load(String idShiper);
    public List<Shiper> getAll();
  
}