/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author elvina
 */
public class tableModelApotek extends AbstractTableModel{
    List<m_apotek>lt;
    public tableModelApotek(List<m_apotek> lt) {
        this.lt=lt;
    }     

    @Override
    public int getRowCount() {
        return lt.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    public String getColumnName(int column){
        switch (column){
            case 0 :
                return"kode_obat";
            case 1 :
                return"nama_obat";
            case 2 :
                return"jenis";
            case 3 :
                return"harga";
            default :
                return"null";
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column){
            case 0:
                return lt.get(row).getkode();
            case 1:
                return lt.get(row).getnama();
            case 2:
                return lt.get(row).getjenis();
            case 3:
                return lt.get(row).getharga();
            default:
                return null;
        }
    }
    
}
