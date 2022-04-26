package com.prodemy.dataperpus_try3.dto;

import javax.persistence.Column;

public class DtoRak {
    private int id_rak;
    private String n_rak;
    private String l_rak;
//    foreign key id_buku
//    @Column(name = "id_buku")

    public int getId_rak() {
        return id_rak;
    }

    public void setId_rak(int id_rak) {
        this.id_rak = id_rak;
    }

    public String getN_rak() {
        return n_rak;
    }

    public void setN_rak(String n_rak) {
        this.n_rak = n_rak;
    }

    public String getL_rak() {
        return l_rak;
    }

    public void setL_rak(String l_rak) {
        this.l_rak = l_rak;
    }
}
