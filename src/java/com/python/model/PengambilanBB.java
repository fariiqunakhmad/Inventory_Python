/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.python.model;

import java.sql.Date;

/**
 *
 * @author Akhmad Fariiqun Awwa
 */
public class PengambilanBB {
    private String idPBB, idPetugasPBB, idPengambilPBB;
    private Date tglPBB;

    /**
     * @return the idPBB
     */
    public String getIdPBB() {
        return idPBB;
    }

    /**
     * @param idPBB the idPBB to set
     */
    public void setIdPBB(String idPBB) {
        this.idPBB = idPBB;
    }

    /**
     * @return the idPetugasPBB
     */
    public String getIdPetugasPBB() {
        return idPetugasPBB;
    }

    /**
     * @param idPetugasPBB the idPetugasPBB to set
     */
    public void setIdPetugasPBB(String idPetugasPBB) {
        this.idPetugasPBB = idPetugasPBB;
    }

    /**
     * @return the idPengambilPBB
     */
    public String getIdPengambilPBB() {
        return idPengambilPBB;
    }

    /**
     * @param idPengambilPBB the idPengambilPBB to set
     */
    public void setIdPengambilPBB(String idPengambilPBB) {
        this.idPengambilPBB = idPengambilPBB;
    }

    /**
     * @return the tglPBB
     */
    public Date getTglPBB() {
        return tglPBB;
    }

    /**
     * @param tglPBB the tglPBB to set
     */
    public void setTglPBB(Date tglPBB) {
        this.tglPBB = tglPBB;
    }
    
    
    
}
