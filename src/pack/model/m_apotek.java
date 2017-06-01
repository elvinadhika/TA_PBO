/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;

/**
 *
 * @author elvina
 */
public class m_apotek {
    public String nama_obat, jenis, harga;
    public String kode_obat;
    
    public String getkode() {
        return kode_obat;
    }
    
    public String getnama() {
        return nama_obat;
    }
    
    public String getjenis() {
        return jenis;
    }
    
    public String getharga() {
        return harga;
    }
    
    public void setkode(String kode) {
        this.kode_obat= kode;
    }
    
    public void setnama(String nama) {
        this.nama_obat= nama;
    }
    
    public void setjenis(String jenis) {
        this.jenis= jenis;
    }
    
    public void setharga(String harga) {
        this.harga= harga;
    }
}
