/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WidyaPeminjamanPengembalian.view;

import WidyaPeminjamanPengembalian.controller.PeminjamanController;

/**
 *
 * @author HP
 */
public class FromPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FromPeminjaman
     */
    PeminjamanController controller;
    public FromPeminjaman() {
        initComponents();
        controller = new PeminjamanController(this);
        controller.clearForm();
        controller.tampil();
    }
    
    public javax.swing.JTextField gettxtkodeanggota(){
        return txtkodeanggota;
    }
     public javax.swing.JTextField gettxtnamaanggota(){
        return txtnamaanggota;
    }
     public javax.swing.JTextField gettxtkodebuku(){
        return txtkodebuku;
    }
     public javax.swing.JTextField gettxtjudulbuku(){
        return txtjudulbuku;
    }
      public javax.swing.JTextField gettxttanggalkembali(){
        return txttanggalkembali;
    }
      public javax.swing.JTextField gettxttanggalpinjam(){
        return txttanggalpinjam;
    }
   
    public javax.swing.JTable gettabelpinjam(){
        return tabelpinjam;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkodeanggota = new javax.swing.JTextField();
        txtkodebuku = new javax.swing.JTextField();
        txtjudulbuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttanggalpinjam = new javax.swing.JTextField();
        txttanggalkembali = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpinjam = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        txtnamaanggota = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 100, 16);

        jLabel2.setText("Nama Anggota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 100, 16);

        jLabel3.setText("Kode Buku ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 100, 16);

        jLabel4.setText("Judul Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 100, 16);

        txtkodeanggota.setText("jTextField1");
        txtkodeanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeanggotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtkodeanggota);
        txtkodeanggota.setBounds(162, 15, 120, 22);

        txtkodebuku.setText("jTextField3");
        txtkodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodebukuActionPerformed(evt);
            }
        });
        getContentPane().add(txtkodebuku);
        txtkodebuku.setBounds(162, 95, 120, 22);

        txtjudulbuku.setText("jTextField4");
        getContentPane().add(txtjudulbuku);
        txtjudulbuku.setBounds(162, 135, 120, 22);

        jLabel5.setText("Tanggal Penjam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 178, 120, 16);

        jLabel6.setText("Tanggal Kembali");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 218, 110, 16);

        txttanggalpinjam.setText("jTextField5");
        txttanggalpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalpinjamActionPerformed(evt);
            }
        });
        getContentPane().add(txttanggalpinjam);
        txttanggalpinjam.setBounds(162, 175, 120, 22);

        txttanggalkembali.setText("jTextField6");
        txttanggalkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txttanggalkembali);
        txttanggalkembali.setBounds(162, 215, 120, 22);

        tabelpinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Anggota", "Nama Anggota", "Kode Buku", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali"
            }
        ));
        tabelpinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelpinjam);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 330, 401, 114);

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        getContentPane().add(btninsert);
        btninsert.setBounds(15, 269, 72, 23);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(110, 270, 72, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(220, 270, 72, 23);

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(70, 300, 72, 23);

        txtnamaanggota.setText("jTextField1");
        txtnamaanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaanggotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamaanggota);
        txtnamaanggota.setBounds(160, 60, 120, 22);

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch);
        btnsearch.setBounds(330, 270, 72, 23);

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(310, 300, 72, 23);

        setSize(new java.awt.Dimension(438, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttanggalpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalpinjamActionPerformed

    private void txttanggalkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalkembaliActionPerformed

    private void txtkodeanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeanggotaActionPerformed

    private void txtnamaanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaanggotaActionPerformed

    private void txtkodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodebukuActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        controller.savePeminjaman();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        controller.updatePeminjaman();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        controller.deletePeminjaman();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        
            // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void tabelpinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpinjamMouseClicked
        controller.getPeminjaman();
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelpinjamMouseClicked

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
            java.util.logging.Logger.getLogger(FromPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelpinjam;
    private javax.swing.JTextField txtjudulbuku;
    private javax.swing.JTextField txtkodeanggota;
    private javax.swing.JTextField txtkodebuku;
    private javax.swing.JTextField txtnamaanggota;
    private javax.swing.JTextField txttanggalkembali;
    private javax.swing.JTextField txttanggalpinjam;
    // End of variables declaration//GEN-END:variables
}