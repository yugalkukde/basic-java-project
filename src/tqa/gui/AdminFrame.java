/*
 * Created By Yugal Kukde
 */
package tqa.gui;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import tqa.pojo.UserProfile;

/**
 *
 * @author YUGAL
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit t = Toolkit.getDefaultToolkit();
        this.setIconImage(t.getImage(getClass().getResource("/images/admin_icon.png")));
        this.setTitle("Admin's Panel");
        this.lblAdminName.setText("Hello "+UserProfile.getUserid());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblAdminName = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jrbSetppr = new javax.swing.JRadioButton();
        jrbEditppr = new javax.swing.JRadioButton();
        jrbViewScore = new javax.swing.JRadioButton();
        jrbRegister = new javax.swing.JRadioButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblAdminName.setBackground(new java.awt.Color(0, 0, 0));
        lblAdminName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(255, 255, 255));

        lbl1.setBackground(new java.awt.Color(0, 0, 0));
        lbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        lbl2.setBackground(new java.awt.Color(0, 0, 0));
        lbl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("MAKE A CHOICE");

        jrbSetppr.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbSetppr);
        jrbSetppr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbSetppr.setForeground(new java.awt.Color(255, 255, 255));
        jrbSetppr.setText("Set Paper");
        jrbSetppr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbSetppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSetpprActionPerformed(evt);
            }
        });

        jrbEditppr.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbEditppr);
        jrbEditppr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditppr.setForeground(new java.awt.Color(255, 255, 255));
        jrbEditppr.setText("Edit Paper");
        jrbEditppr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbEditppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditpprActionPerformed(evt);
            }
        });

        jrbViewScore.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbViewScore);
        jrbViewScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewScore.setForeground(new java.awt.Color(255, 255, 255));
        jrbViewScore.setText("View Scores");
        jrbViewScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbViewScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbViewScoreActionPerformed(evt);
            }
        });

        jrbRegister.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbRegister);
        jrbRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRegister.setForeground(new java.awt.Color(255, 255, 255));
        jrbRegister.setText("Register Student");
        jrbRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRegisterActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbViewScore)
                    .addComponent(jrbEditppr)
                    .addComponent(jrbSetppr)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbRegister))
                .addGap(511, 511, 511))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(358, 358, 358))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jrbSetppr)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEditppr)
                        .addGap(18, 18, 18)
                        .addComponent(jrbRegister)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScore)
                        .addGap(114, 114, 114))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Logout", "Are You Sure?", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            LoginFrame lf = new LoginFrame();
            this.dispose();
            lf.setVisible(true);

        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jrbSetpprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSetpprActionPerformed
        SetPaperFrame spf=new SetPaperFrame();
        this.dispose();
        spf.setVisible(true);
    }//GEN-LAST:event_jrbSetpprActionPerformed

    private void jrbEditpprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditpprActionPerformed
       EditPaperFrame epf=new EditPaperFrame();
        this.dispose();
        epf.setVisible(true);
    }//GEN-LAST:event_jrbEditpprActionPerformed

    private void jrbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRegisterActionPerformed
        RegisterStudentFrame rsf=new RegisterStudentFrame();
        this.dispose();
        rsf.setVisible(true);
    }//GEN-LAST:event_jrbRegisterActionPerformed

    private void jrbViewScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbViewScoreActionPerformed
        ViewScoresFrame vsf=new ViewScoresFrame();
        this.dispose();
        vsf.setVisible(true);
    }//GEN-LAST:event_jrbViewScoreActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbEditppr;
    private javax.swing.JRadioButton jrbRegister;
    private javax.swing.JRadioButton jrbSetppr;
    private javax.swing.JRadioButton jrbViewScore;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblAdminName;
    // End of variables declaration//GEN-END:variables

    
}