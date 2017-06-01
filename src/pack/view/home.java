/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controller;
import pack.model.m_apotek;

/**
 *
 * @author elvina
 */
public class home extends javax.swing.JFrame {
    
    controller capotek;
    List<m_apotek>listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        capotek = new controller(this);
        capotek.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        CbCariJenis = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        bersih = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vrinda", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("DATA OBAT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 60, 130, 40);
        getContentPane().add(txtharga);
        txtharga.setBounds(130, 260, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama Obat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 180, 90, 20);

        jLabel3.setText("Admin Apotek :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Kode Obat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 270, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Jenis Obat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 90, 20);

        txtadmin.setEditable(false);
        getContentPane().add(txtadmin);
        txtadmin.setBounds(100, 20, 110, 20);
        getContentPane().add(txtkode);
        txtkode.setBounds(130, 120, 200, 30);
        getContentPane().add(txtnama);
        txtnama.setBounds(130, 170, 200, 30);

        CbCariJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Kapsul", "Sirup" }));
        getContentPane().add(CbCariJenis);
        CbCariJenis.setBounds(240, 360, 56, 20);

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(320, 360, 90, 23);

        simpan.setBackground(new java.awt.Color(51, 255, 51));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(480, 110, 90, 23);

        ubah.setBackground(new java.awt.Color(255, 153, 51));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        getContentPane().add(ubah);
        ubah.setBounds(480, 150, 90, 23);

        bersih.setBackground(new java.awt.Color(0, 255, 0));
        bersih.setText("Bersihkan");
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });
        getContentPane().add(bersih);
        bersih.setBounds(480, 190, 90, 23);

        hapus.setBackground(new java.awt.Color(255, 153, 51));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(480, 230, 90, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Pencarian Berdasarkan Jenis Obat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 360, 200, 20);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Kapsul", "Sirup" }));
        getContentPane().add(cbjenis);
        cbjenis.setBounds(130, 220, 80, 20);

        keluar.setBackground(new java.awt.Color(255, 0, 0));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(480, 270, 90, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Obat", "Nama Obat", "Jenis", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 390, 570, 120);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 330);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(420, 0, 190, 330);

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 330, 610, 250);

        setBounds(0, 0, 628, 618);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        capotek.SimpanData();
        capotek.isiTable();
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        capotek.Ubah();
        capotek.isiTable();
    }//GEN-LAST:event_ubahActionPerformed

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
        capotek.Reset();
    }//GEN-LAST:event_bersihActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        capotek.Hapus();
        capotek.isiTable();
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        capotek.CariJenis();
        capotek.isiTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1 = login.user;
        txtadmin.setText(user1);
    }//GEN-LAST:event_formWindowOpened

    public JTextField getTxtKode(){
        return txtkode;
    }
    
    public JTextField getTxtNama(){
        return txtnama;
    }
    
    public JTextField getTxtHarga(){
        return txtharga;
    }
    
    public JComboBox getCbJenis(){
        return cbjenis;
    }
    
    public JComboBox getCbCariJenis(){
        return CbCariJenis;
    }
    
    public JButton getButtonHapus(){
        return hapus;
    }
    
    public JButton getButtonBersih(){
        return bersih;
    }
    
    public JButton getButtonSimpan(){
        return simpan;
    }
    
    public JButton getButtonUbah(){
        return ubah;
    }
    
    public JButton getButtonKeluar(){
        return keluar;
    }
    
    public JTable getTableData(){
        return jTable1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbCariJenis;
    private javax.swing.JButton bersih;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

}
