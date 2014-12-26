/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.python.model;

/**
 *
 * @author Akhmad Fariiqun
 */
public class DetailTargetProduk {
    private int idJenisProduk, idProduk;
    private String namaJenisProduk, namaProduk, idPengambilanBB, qtyTargetProduk, satuanProdukTarget;

    /**
     * @return the idJenisProduk
     */
    public int getIdJenisProduk() {
        return idJenisProduk;
    }

    /**
     * @param idJenisProduk the idJenisProduk to set
     */
    public void setIdJenisProduk(int idJenisProduk) {
        this.idJenisProduk = idJenisProduk;
    }

    /**
     * @return the idProduk
     */
    public int getIdProduk() {
        return idProduk;
    }

    /**
     * @param idProduk the idProduk to set
     */
    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }

    /**
     * @return the namaJenisProduk
     */
    public String getNamaJenisProduk() {
        return namaJenisProduk;
    }

    /**
     * @param namaJenisProduk the namaJenisProduk to set
     */
    public void setNamaJenisProduk(String namaJenisProduk) {
        this.namaJenisProduk = namaJenisProduk;
    }

    /**
     * @return the namaProduk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaProduk the namaProduk to set
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the idPengambilanBB
     */
    public String getIdPengambilanBB() {
        return idPengambilanBB;
    }

    /**
     * @param idPengambilanBB the idPengambilanBB to set
     */
    public void setIdPengambilanBB(String idPengambilanBB) {
        this.idPengambilanBB = idPengambilanBB;
    }

    /**
     * @return the qtyTargetProduk
     */
    public String getQtyTargetProduk() {
        return qtyTargetProduk;
    }

    /**
     * @param qtyTargetProduk the qtyTargetProduk to set
     */
    public void setQtyTargetProduk(String qtyTargetProduk) {
        this.qtyTargetProduk = qtyTargetProduk;
    }

    /**
     * @return the satuanProdukTarget
     */
    public String getSatuanProdukTarget() {
        return satuanProdukTarget;
    }

    /**
     * @param satuanProdukTarget the satuanProdukTarget to set
     */
    public void setSatuanProdukTarget(String satuanProdukTarget) {
        this.satuanProdukTarget = satuanProdukTarget;
    }

}
