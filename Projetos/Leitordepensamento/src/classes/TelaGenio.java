/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;


public class TelaGenio extends javax.swing.JFrame {

    
    public TelaGenio() {
        initComponents();
        lblfrase.setText("<html>Vou pensar em um numero entre 1 e 5, tente adivinhar </html>");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblfrase = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtval = new javax.swing.JSpinner();
        btnpalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/a982f950440ab8e91d8796b09afa2837.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 46, 225, -1));

        lblfrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfrase.setText("FRASE");
        getContentPane().add(lblfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 90, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/70798bc435aa28dfb9651ed7f05f2fc7.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 16, 318, 201));

        jLabel4.setText("VALOR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        txtval.setModel(new javax.swing.SpinnerNumberModel(1, null, 5, 1));
        getContentPane().add(txtval, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        btnpalpite.setText("PALPITE");
        btnpalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnpalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpalpiteActionPerformed
      double n = 1 +  Math.random() * (6-1);
      int valor = (int) n;
      int num = Integer.parseInt(txtval.getValue().toString());
      
      String f1 = "<html> Acertou /<html>";
      String f2 = "<html> errou, pensei em " + valor + "</html>";
      String res = (num == valor)? f1:f2;
      
      lblfrase.setText(res);
      
      
      
        
        
        
      
      








        // TODO add your handling code here:
    }//GEN-LAST:event_btnpalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblfrase;
    private javax.swing.JSpinner txtval;
    // End of variables declaration//GEN-END:variables
}
