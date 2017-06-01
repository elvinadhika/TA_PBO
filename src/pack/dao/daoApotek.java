/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pack.control.c_koneksi;
import pack.model.m_apotek;
/**
 *
 * @author elvina
 */
public class daoApotek implements implementApotek {
    Connection connection;
    public String TampilData = "SELECT * FROM `obat`";
    public String UbahData = "UPDATE `obat` SET `nama_obat`=?, `harga`=?, `Jenis`=? Where `kode_obat`=?;";
    public String SimpanData = "INSERT INTO `obat` VALUES (?, ?, ?, ?, ?)";
    public String HapusData = "DELETE FROM `obat` WHERE kode_obat=?";
    public String CariJenis = "SELECT `kode_obat`, `nama_obat`, `jenis`, `harga` FROM `obat` WHERE jenis like ?";
    
    public daoApotek(){
        connection = c_koneksi.setKoneksi();
    }

    @Override
    public void TampilData(m_apotek a) {
        
    }

    @Override
    public void UbahData(m_apotek a) {
        PreparedStatement statement = null;
        try{
             statement = connection.prepareStatement(UbahData);
             statement.setString(4, a.getkode());
             statement.setString(1, a.getnama());
             statement.setString(2, a.getharga());
             statement.setString(3, a.getjenis());
             statement.executeUpdate();
        }  catch (SQLException ex) {
            Logger.getLogger(daoApotek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void SimpanData(m_apotek a) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SimpanData);
            statement.setString(1, a.getkode());
            statement.setString(2, a.getnama());
            statement.setString(3, a.getjenis());
            statement.setString(4, a.getharga());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                a.setkode(rs.getString(1));
            }
        } catch(SQLException ex){
            Logger.getLogger(daoApotek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void HapusData(String kode) {
         PreparedStatement statement = null;
         try {
             statement = connection.prepareStatement(HapusData);
             statement.setString(1, kode);
             statement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(daoApotek.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public void CariJenis(int kode){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CariJenis);
            statement.setInt(1, kode);
            statement.executeUpdate();
        } catch (SQLException ex){
            Logger.getLogger(daoApotek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<m_apotek> getCariJenis(String jenis) {
        List<m_apotek> lt=null;
        try {
            lt = new ArrayList<m_apotek>();
            PreparedStatement st=connection.prepareStatement(CariJenis);
            st.setString(1, "%"+jenis+"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                m_apotek apotek = new m_apotek();
                apotek.setkode(rs.getString("kode_obat"));
                apotek.setnama(rs.getString("nama_obat"));
                apotek.setjenis(rs.getString("jenis"));
                apotek.setharga(rs.getString("harga"));
                lt.add(apotek);
            }
        } catch(SQLException ex){
            Logger.getLogger(daoApotek.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lt;
    }

    @Override
    public List<m_apotek> getAll() {
         List<m_apotek> lt=null;
         try {
             lt = new ArrayList<m_apotek>();
             Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(TampilData);
             while (rs.next()){
                m_apotek apotek = new m_apotek();
                apotek.setkode(rs.getString("kode_obat"));
                apotek.setnama(rs.getString("nama_obat"));
                apotek.setjenis(rs.getString("jenis"));
                apotek.setharga(rs.getString("harga"));
                lt.add(apotek);
             }
         } catch(SQLException ex){
            Logger.getLogger(daoApotek.class.getName()).log(Level.SEVERE, null, ex);
        }
         return lt;
    }
    
}
