/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integral;

/**
 *
 * @author BABOSHITAS
 */
public class e3 extends javax.swing.JFrame {

    /**
     * Creates new form e3
     */
    public e3() {
        initComponents();
        this.setLocationRelativeTo(null); 
        RES.setVisible(true);
        RES2.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        E5 = new javax.swing.JButton();
        E55 = new javax.swing.JButton();
        E555 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        E6 = new javax.swing.JButton();
        E66 = new javax.swing.JButton();
        E = new javax.swing.JButton();
        RES = new javax.swing.JButton();
        RES2 = new javax.swing.JButton();
        btnREGRESA1 = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1240, 950));
        setMinimumSize(new java.awt.Dimension(1240, 950));
        setPreferredSize(new java.awt.Dimension(1240, 950));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EJERCICIO 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/5.PNG"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Resuelve la integral y elige la opción correcta.");

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/5.1.PNG"))); // NOI18N
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        E55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/5.2.PNG"))); // NOI18N
        E55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E55ActionPerformed(evt);
            }
        });

        E555.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/5.3.PNG"))); // NOI18N
        E555.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E555ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(E55, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(E555, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(208, 208, 208)
                            .addComponent(E555, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(E55, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(32, 24, 813, 365);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EJERCICIO 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/6.PNG"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setText("Resuelve la integral y elige la opción correcta.");

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/6.1.PNG"))); // NOI18N

        E66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/6.2.PNG"))); // NOI18N

        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/6.3.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(204, 204, 204))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(E66, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(E6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E66, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(30, 410, 813, 362);

        RES.setText("VER RESPUESTA");
        RES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESActionPerformed(evt);
            }
        });
        getContentPane().add(RES);
        RES.setBounds(950, 220, 160, 60);

        RES2.setText("VER RESPUESTA");
        RES2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RES2ActionPerformed(evt);
            }
        });
        getContentPane().add(RES2);
        RES2.setBounds(950, 630, 160, 60);

        btnREGRESA1.setBackground(new java.awt.Color(255, 255, 255));
        btnREGRESA1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btnREGRESA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/flechar.png"))); // NOI18N
        btnREGRESA1.setText("REGRESAR");
        btnREGRESA1.setContentAreaFilled(false);
        btnREGRESA1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnREGRESA1.setName(""); // NOI18N
        btnREGRESA1.setPreferredSize(new java.awt.Dimension(151, 171));
        btnREGRESA1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/flechar2.png"))); // NOI18N
        btnREGRESA1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/flechar.png"))); // NOI18N
        btnREGRESA1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnREGRESA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGRESA1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnREGRESA1);
        btnREGRESA1.setBounds(20, 740, 350, 160);

        SALIR.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/tache.png"))); // NOI18N
        SALIR.setText("SALIR");
        SALIR.setContentAreaFilled(false);
        SALIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SALIR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/tache2.png"))); // NOI18N
        SALIR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicios/tache.png"))); // NOI18N
        SALIR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        SALIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR);
        SALIR.setBounds(940, 740, 200, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RESActionPerformed

    private void RES2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RES2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RES2ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
       E55.setEnabled(false);
       E555.setEnabled(false);
    }//GEN-LAST:event_E5ActionPerformed

    private void E55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E55ActionPerformed
       E5.setEnabled(false);
       E555.setEnabled(false);
    }//GEN-LAST:event_E55ActionPerformed

    private void E555ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E555ActionPerformed
       E5.setEnabled(false);
       E55.setEnabled(false);
    }//GEN-LAST:event_E555ActionPerformed

    private void btnREGRESA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGRESA1ActionPerformed
        menu abrir = new menu();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_btnREGRESA1ActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        dispose();
    }//GEN-LAST:event_SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(e3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(e3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(e3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(e3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new e3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton E;
    private javax.swing.JButton E5;
    private javax.swing.JButton E55;
    private javax.swing.JButton E555;
    private javax.swing.JButton E6;
    private javax.swing.JButton E66;
    private javax.swing.JButton RES;
    private javax.swing.JButton RES2;
    private javax.swing.JButton SALIR;
    private javax.swing.JButton btnREGRESA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
