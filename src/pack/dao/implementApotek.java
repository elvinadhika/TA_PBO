/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.dao;
import java.util.List;
import pack.model.m_apotek;

/**
 *
 * @author elvina
 */
public interface implementApotek {
    public void TampilData(m_apotek a);
    public void UbahData(m_apotek a);
    public void SimpanData(m_apotek a);
    public void HapusData(String kode);
    public List<m_apotek> getCariJenis(String jenis);
    public List<m_apotek> getAll();
}
