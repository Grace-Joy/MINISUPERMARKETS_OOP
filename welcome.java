/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcomePg;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import welcomePg.Admin;
import welcomePg.Employee;
import welcomePg.Supplier; 
import welcomePg.SignUp;

/**
 *
 * @author GraceJoy Kanyanya
 */
public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    public welcome() {
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

        jPanel1 = new javax.swing.JPanel();
        jbtnAdmin = new javax.swing.JButton();
        jbtnEmployee = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbtnSignUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnSupplier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnAdmin.setText("Admin");
        jbtnAdmin.setPreferredSize(new java.awt.Dimension(60, 30));
        jbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 109, -1));

        jbtnEmployee.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnEmployee.setText("Employee");
        jbtnEmployee.setPreferredSize(new java.awt.Dimension(60, 30));
        jbtnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 109, -1));

        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setPreferredSize(new java.awt.Dimension(60, 30));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 470, 109, 33));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jbtnSignUp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnSignUp.setText("Sign Up");
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DUKA NDOGO.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, 45));

        jbtnSupplier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnSupplier.setText("Supplier");
        jbtnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\GraceJoy Kanyanya\\Downloads\\1280x720-data_out_88_164796499-store-wallpapers (1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 950, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdminActionPerformed
        Admin info = new Admin ();
        info.setVisible (true);
    }//GEN-LAST:event_jbtnAdminActionPerformed

    private void jbtnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmployeeActionPerformed
        Employee info = new Employee ();
        info.setVisible (true);
    }//GEN-LAST:event_jbtnEmployeeActionPerformed

    private void jbtnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSupplierActionPerformed
        Supplier info = new Supplier ();
        info.setVisible (true);
    }//GEN-LAST:event_jbtnSupplierActionPerformed

    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
        SignUp info = new SignUp ();
        info.setVisible (true);
    }//GEN-LAST:event_jbtnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnAdmin;
    private javax.swing.JButton jbtnEmployee;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JButton jbtnSupplier;
    // End of variables declaration//GEN-END:variables
}
