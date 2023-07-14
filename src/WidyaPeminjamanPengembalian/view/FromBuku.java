/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WidyaPeminjamanPengembalian.view;

import WidyaPeminjamanPengembalian.controller.BukuController;


/**
 *
 * @author HP
 */
public class FromBuku extends javax.swing.JFrame {

    /**
     * Creates new form FromBuku
     */
    BukuController controller;
    public FromBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.clearForm();
        controller.tampil();
    }

    public javax.swing.JTextField gettxtkode(){
        return txtkode;
    }
     public javax.swing.JTextField gettxtjudul(){
        return txtjudul;
    }
      public javax.swing.JTextField gettxtpengarang(){
        return txtpengarang;
    }
       public javax.swing.JTextField gettxtpenerbit(){
        return txtpenerbit;
    }
     
    public javax.swing.JTable gettabelbuku(){
        return tabelbuku;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtjudul = new javax.swing.JTextField();
        txtpengarang = new javax.swing.JTextField();
        txtpenerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbuku = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(27, 28, 57, 16);

        jLabel2.setText("Judul Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(27, 68, 58, 16);

        jLabel3.setText("Pengarang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(27, 108, 57, 16);

        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 44, 16);

        txtkode.setText("jTextField1");
        getContentPane().add(txtkode);
        txtkode.setBounds(167, 25, 136, 22);

        txtjudul.setText("jTextField2");
        txtjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudulActionPerformed(evt);
            }
        });
        getContentPane().add(txtjudul);
        txtjudul.setBounds(167, 65, 136, 22);

        txtpengarang.setText("jTextField3");
        txtpengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpengarangActionPerformed(evt);
            }
        });
        getContentPane().add(txtpengarang);
        txtpengarang.setBounds(167, 105, 136, 22);

        txtpenerbit.setText("jTextField4");
        txtpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(txtpenerbit);
        txtpenerbit.setBounds(170, 150, 136, 22);

        tabelbuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit"
            }
        ));
        tabelbuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 245, 373, 131);

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        getContentPane().add(btninsert);
        btninsert.setBounds(15, 187, 72, 23);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(105, 187, 72, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(195, 187, 72, 23);

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(285, 187, 72, 23);

        setSize(new java.awt.Dimension(414, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        controller.saveBuku();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        controller.updateBuku();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        controller.deleteBuku();
        controller.tampil();
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        controller.clearForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void tabelbukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbukuMouseClicked
        controller.getBuku();
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelbukuMouseClicked

    private void txtpengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpengarangActionPerformed

    private void txtjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudulActionPerformed

    private void txtpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenerbitActionPerformed

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
            java.util.logging.Logger.getLogger(FromBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelbuku;
    private javax.swing.JTextField txtjudul;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtpenerbit;
    private javax.swing.JTextField txtpengarang;
    // End of variables declaration//GEN-END:variables
}