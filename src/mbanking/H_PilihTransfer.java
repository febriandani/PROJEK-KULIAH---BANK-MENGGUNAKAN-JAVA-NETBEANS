/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbanking;

/**
 *
 * @author Dani
 */
public class H_PilihTransfer extends javax.swing.JInternalFrame {

    /**
     * Creates new form H_PilihTransfer
     */
    public H_PilihTransfer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_tfAR = new javax.swing.JButton();
        btn_tfAB = new javax.swing.JButton();
        btn_daftarAntarBank = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(48, 52, 63));

        jLabel1.setBackground(new java.awt.Color(128, 237, 153));
        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 255, 108));
        jLabel1.setText("Transfer");

        btn_tfAR.setBackground(new java.awt.Color(134, 135, 180));
        btn_tfAR.setText("Antar Rekening                                          >");
        btn_tfAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tfARMouseClicked(evt);
            }
        });
        btn_tfAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tfARActionPerformed(evt);
            }
        });

        btn_tfAB.setText("Antar Bank                                                 >");
        btn_tfAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tfABActionPerformed(evt);
            }
        });

        btn_daftarAntarBank.setText("Daftar Rekening Baru Bank Lain                >");
        btn_daftarAntarBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarAntarBankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tfAB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tfAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btn_daftarAntarBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tfAR)
                .addGap(18, 18, 18)
                .addComponent(btn_tfAB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_daftarAntarBank)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tfARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tfARMouseClicked
        // TODO add your handling code here:
        H_Transfer HT = new H_Transfer();
        HT.setVisible(true);
        this.getDesktopPane().add(HT);
        this.dispose();
    }//GEN-LAST:event_btn_tfARMouseClicked

    private void btn_tfARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tfARActionPerformed
        
    }//GEN-LAST:event_btn_tfARActionPerformed

    private void btn_tfABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tfABActionPerformed
        H_TransferAntarBank HTAB = new H_TransferAntarBank();
        HTAB.setVisible(true);
        this.getDesktopPane().add(HTAB);
        this.dispose();
    }//GEN-LAST:event_btn_tfABActionPerformed

    private void btn_daftarAntarBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarAntarBankActionPerformed
        // TODO add your handling code here:
        H_DaftarBankLain hdb = new H_DaftarBankLain();
        hdb.setVisible(true);
        this.getDesktopPane().add(hdb);
        this.dispose();
    }//GEN-LAST:event_btn_daftarAntarBankActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daftarAntarBank;
    private javax.swing.JButton btn_tfAB;
    private javax.swing.JButton btn_tfAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}