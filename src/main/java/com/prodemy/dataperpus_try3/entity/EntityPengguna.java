package com.prodemy.dataperpus_try3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_pengguna")
public class EntityPengguna {
    @Id
    @Column(name = "id_pengguna", length = 11, nullable = false)
    private int id_pengguna;
    @Column(name = "kode_pengguna", length = 9, nullable = false)
    private int k_pengguna;
    @Column(name = "nama_pengguna", length = 100, nullable = false)
    private String n_pengguna;
    @Column(name = "no_telp_pengguna", length = 13)
    private String telp_pengguna;
    @Column(name = "alamat_pengguna")
    private String al_pengguna;

    public int getId_pengguna() {
        return id_pengguna;
    }

    public void setId_pengguna(int id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    public int getK_pengguna() {
        return k_pengguna;
    }

    public void setK_pengguna(int k_pengguna) {
        this.k_pengguna = k_pengguna;
    }

    public String getN_pengguna() {
        return n_pengguna;
    }

    public void setN_pengguna(String n_pengguna) {
        this.n_pengguna = n_pengguna;
    }

    public String getTelp_pengguna() {
        return telp_pengguna;
    }

    public void setTelp_pengguna(String telp_pengguna) {
        this.telp_pengguna = telp_pengguna;
    }

    public String getAl_pengguna() {
        return al_pengguna;
    }

    public void setAl_pengguna(String al_pengguna) {
        this.al_pengguna = al_pengguna;
    }
}
