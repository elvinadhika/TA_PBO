/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pack.dao.daoApotek;
import pack.model.m_apotek;
import pack.view.home;
import pack.model.tableModelApotek; 
import pack.dao.implementApotek;
/**
 *
 * @author elvina
 */
public class controller {
    home hm;
    implementApotek impApotek;
    List<m_apotek> lt;
    
    public controller(home hm) {
        this.hm = hm;
        impApotek = new daoApotek();
        lt = impApotek.getAll(); 
    }
    
    public void Reset(){
         hm.getTxtKode().setText("");
         hm.getTxtNama().setText("");
         hm.getTxtHarga().setText("");
         hm.getCbJenis().setSelectedItem(null);
    }
    
    public void Hapus(){
        if (hm.getTxtKode().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(hm, "Masukkan kode obat");
        } else {
            String kode = (hm.getTxtKode().getText());
            impApotek.HapusData(kode);
            JOptionPane.showMessageDialog(hm, "Data berhasil dihapus");
        }
    }
    
    public void SimpanData(){
         m_apotek apotek = new m_apotek();
         apotek.setkode(hm.getTxtKode().getText());
         apotek.setnama(hm.getTxtNama().getText());
         apotek.setharga(hm.getTxtHarga().getText());
         
         apotek.setjenis(hm.getCbJenis().getSelectedItem().toString());
         impApotek.SimpanData(apotek);
    }
    
    public void Ubah(){
        m_apotek apotek = new m_apotek();
        apotek.setkode(hm.getTxtKode().getText());
        apotek.setnama(hm.getTxtNama().getText());
        apotek.setharga(hm.getTxtHarga().getText());
         
        apotek.setjenis(hm.getCbJenis().getSelectedItem().toString());
        impApotek.UbahData(apotek);
    }
    
    public void isiTable(){
        lt =impApotek.getAll();
         tableModelApotek tma = new tableModelApotek(lt);
         hm.getTableData().setModel(tma);
    }
    
    public void isiField(int row){
        hm.getTxtKode().setText(lt.get(row).getkode().toString());
        hm.getTxtNama().setText(lt.get(row).getnama().toString());
        hm.getCbJenis().setSelectedItem(lt.get(row).getjenis().toString());
        hm.getTxtHarga().setText(lt.get(row).getharga().toString());
    }
    
    public void CariJenis(){
        if(!hm.getCbCariJenis().getSelectedItem().toString().isEmpty()){
            isiTableCariJenis(); 
        } else {
            JOptionPane.showMessageDialog(hm, "Silahkan Pilih Jenis");
        }
    }
    
    private void isiTableCariJenis(){
         String item = hm.getCbCariJenis().getSelectedItem().toString();
         lt =impApotek.getCariJenis(item);
         tableModelApotek tmt = new tableModelApotek(lt);
         hm.getTableData().setModel(tmt);
    }
}
