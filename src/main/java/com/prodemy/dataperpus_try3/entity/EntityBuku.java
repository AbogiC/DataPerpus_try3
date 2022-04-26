package com.prodemy.dataperpus_try3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_buku")
public class EntityBuku {
    @Id
    @Column(name = "id_buku", length = 11, nullable = false)
    private int id_buku;
    @Column(name = "kode_buku",length = 5, nullable = false)
    private int k_buku;
    @Column(name = "judul_buku", length = 50, nullable = false)
    private String j_buku;
    @Column(name = "penulis_buku", length = 50, nullable = false)
    private String lis_buku;
    @Column(name = "penerbit_buku", length = 50)
    private String bit_buku;
    @Column(name = "tahun_terbit", length = 4)
    private String t_terbit;
    @Column(name = "stok", length = 11)
    private int stok;

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public int getK_buku() {
        return k_buku;
    }

    public void setK_buku(int k_buku) {
        this.k_buku = k_buku;
    }

    public String getJ_buku() {
        return j_buku;
    }

    public void setJ_buku(String j_buku) {
        this.j_buku = j_buku;
    }

    public String getLis_buku() {
        return lis_buku;
    }

    public void setLis_buku(String lis_buku) {
        this.lis_buku = lis_buku;
    }

    public String getBit_buku() {
        return bit_buku;
    }

    public void setBit_buku(String bit_buku) {
        this.bit_buku = bit_buku;
    }

    public String getT_terbit() {
        return t_terbit;
    }

    public void setT_terbit(String t_terbit) {
        this.t_terbit = t_terbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
