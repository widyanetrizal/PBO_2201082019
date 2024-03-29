/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WidyaPeminjamanPengembalian.view;

import WidyaPeminjamanPengembalian.controller.PengembalianController;

/**
 *
 * @author HP
 */
public class FromPengembalian extends javax.swing.JFrame {

    /**
     * Creates new form FromPengembalian
     */
    PengembalianController controller;
    public FromPengembalian() {
        initComponents();
        controller = new PengembalianController(this);
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
    public javax.swing.JTextField gettxttanggaldikembalikan(){
        return txtdikembalikan;
    }
    public javax.swing.JTextField gettxttelat(){
        return txttelat;
    }
    public javax.swing.JTextField gettxtdenda(){
        return txtdenda;
    }
    
   
    public javax.swing.JTable gettabelkembali(){
        return tabelkembali;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtkodeanggota = new javax.swing.JTextField();
        txtnamaanggota = new javax.swing.JTextField();
        txtkodebuku = new javax.swing.JTextField();
        txtjudulbuku = new javax.swing.JTextField();
        txttanggalpinjam = new javax.swing.JTextField();
        txttanggalkembali = new javax.swing.JTextField();
        txtdikembalikan = new javax.swing.JTextField();
        txttelat = new javax.swing.JTextField();
        txtdenda = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelkembali = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(16, 9, 94, 16);

        jLabel2.setText("Nama Anggota");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(16, 37, 94, 16);

        jLabel3.setText("Kode Buku");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(16, 65, 76, 16);

        jLabel4.setText("Judul Buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(16, 93, 76, 16);

        jLabel5.setText("Tanggal Pinjam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(16, 121, 94, 16);

        jLabel6.setText("Tanggal Kembali");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(16, 149, 103, 16);

        jLabel7.setText("Tanggal Dikembalikan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(16, 177, 117, 16);

        jLabel8.setText("Terlambat");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(16, 205, 79, 16);

        jLabel9.setText("Denda");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(16, 233, 79, 16);

        txtkodeanggota.setText("jTextField1");
        getContentPane().add(txtkodeanggota);
        txtkodeanggota.setBounds(197, 6, 144, 22);

        txtnamaanggota.setText("jTextField2");
        getContentPane().add(txtnamaanggota);
        txtnamaanggota.setBounds(197, 34, 144, 22);

        txtkodebuku.setText("jTextField3");
        getContentPane().add(txtkodebuku);
        txtkodebuku.setBounds(197, 62, 144, 22);

        txtjudulbuku.setText("jTextField4");
        getContentPane().add(txtjudulbuku);
        txtjudulbuku.setBounds(197, 90, 144, 22);

        txttanggalpinjam.setText("jTextField5");
        getContentPane().add(txttanggalpinjam);
        txttanggalpinjam.setBounds(197, 118, 144, 22);

        txttanggalkembali.setText("jTextField6");
        txttanggalkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(txttanggalkembali);
        txttanggalkembali.setBounds(197, 146, 144, 22);

        txtdikembalikan.setText("jTextField7");
        txtdikembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdikembalikanActionPerformed(evt);
            }
        });
        getContentPane().add(txtdikembalikan);
        txtdikembalikan.setBounds(197, 174, 144, 22);

        txttelat.setText("jTextField8");
        txttelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelatActionPerformed(evt);
            }
        });
        getContentPane().add(txttelat);
        txttelat.setBounds(197, 202, 144, 22);

        txtdenda.setText("jTextField9");
        getContentPane().add(txtdenda);
        txtdenda.setBounds(197, 230, 144, 22);

        tabelkembali.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Anggota", "Nama Anggota", "Kode Buku", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali", "Tanggal Dikembalikan", "Terlambat", "Denda"
            }
        ));
        tabelkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkembaliMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelkembali);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(6, 324, 513, 174);

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        getContentPane().add(btninsert);
        btninsert.setBounds(6, 270, 72, 23);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(99, 270, 72, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(201, 270, 72, 23);

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(296, 270, 72, 23);

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(407, 270, 72, 23);

        setSize(new java.awt.Dimension(541, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttanggalkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalkembaliActionPerformed

    private void txtdikembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdikembalikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdikembalikanActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        controller.savePengembalian();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        controller.updatepengembalian();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        controller.deletePengembalian();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void tabelkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkembaliMouseClicked
        controller.getPengembalian();
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelkembaliMouseClicked

    private void txttelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelatActionPerformed

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
            java.util.logging.Logger.getLogger(FromPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable tabelkembali;
    private javax.swing.JTextField txtdenda;
    private javax.swing.JTextField txtdikembalikan;
    private javax.swing.JTextField txtjudulbuku;
    private javax.swing.JTextField txtkodeanggota;
    private javax.swing.JTextField txtkodebuku;
    private javax.swing.JTextField txtnamaanggota;
    private javax.swing.JTextField txttanggalkembali;
    private javax.swing.JTextField txttanggalpinjam;
    private javax.swing.JTextField txttelat;
    // End of variables declaration//GEN-END:variables
}
