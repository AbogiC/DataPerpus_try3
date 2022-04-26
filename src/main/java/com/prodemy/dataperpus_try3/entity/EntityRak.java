package com.prodemy.dataperpus_try3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rak")
public class EntityRak {
    @Id
    @Column(name = "id_rak", length = 11, nullable = false)
    private int id_rak;
    @Column(name = "nama_rak", length = 50, nullable = false)
    private String n_rak;
    @Column(name = "lokasi_rak", length = 50, nullable = false)
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
