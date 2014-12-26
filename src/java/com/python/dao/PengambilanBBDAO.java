/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.dao;

import com.python.model.PengambilanBB;
import java.util.List;

/**
 *
 * @author Akhmad Fariiqun Awwa
 */
public interface PengambilanBBDAO {
    public void simpanPengambilanBB(PengambilanBB pengambilanBB);
    public void deletePengambilanBB(String idPengambilanBB);
    public void updatePengambilanBB(String idPengambilanBB, PengambilanBB pengambilanBB);
    public PengambilanBB load(String idPengambilanBB);
    public List<PengambilanBB> getAll();
}
