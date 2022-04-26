package com.prodemy.dataperpus_try3.dto;

public class DtoTransaksi {
    private int id_transaksi;
    private String t_pinjam;
    private String t_kembali;
    private int id_buku;
    private int id_anggota;
    private int id_petugas;

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getT_pinjam() {
        return t_pinjam;
    }

    public void setT_pinjam(String t_pinjam) {
        this.t_pinjam = t_pinjam;
    }

    public String getT_kembali() {
        return t_kembali;
    }

    public void setT_kembali(String t_kembali) {
        this.t_kembali = t_kembali;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public int getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(int id_petugas) {
        this.id_petugas = id_petugas;
    }
}
