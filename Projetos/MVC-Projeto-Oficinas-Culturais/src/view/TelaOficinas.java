
package view;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.Oficina;
import controller.OficinaController;
/**
 *
 * @author selva
 */
public class TelaOficinas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaOficinas.class.getName());
    private ArrayList<Oficina> listaOficinas; 
   
    public TelaOficinas() {
    initComponents();

    OficinaController controller = new OficinaController();
    this.listaOficinas = controller.buscarOficinas();

    atualizarTabela();
}
    
    
    

   public void atualizarTabela() {
       
      /* 1. BUSCAR A LISTA DE OFICINAS DO CONTROLLER
    this. = controller.buscarOficinas();*/

    DefaultTableModel model = (DefaultTableModel) tblOficinas.getModel();

    model.setRowCount(0);

   if (this.listaOficinas != null) {
        for (Oficina oficina : this.listaOficinas) {
            model.addRow(new Object[]{
                oficina.getNome(),
                oficina.getArea(),
                oficina.getData(),
                oficina.getStatus()
        });
    }

   }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOficinas = new javax.swing.JTable();
        ObtnSalvar = new javax.swing.JButton();
        btnAusencia = new javax.swing.JButton();
        btnPresenca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblOficinas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOficinas);

        ObtnSalvar.setText("Salvar");
        ObtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtnSalvarActionPerformed(evt);
            }
        });

        btnAusencia.setText("Marcar Ausencia");
        btnAusencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAusenciaActionPerformed(evt);
            }
        });

        btnPresenca.setText("Marcar Presença");
        btnPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresencaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAusencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPresenca)
                    .addComponent(ObtnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPresenca)
                        .addGap(105, 105, 105)
                        .addComponent(btnAusencia)
                        .addGap(100, 100, 100)
                        .addComponent(ObtnSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresencaActionPerformed
       
    int linhaSelecionada = tblOficinas.getSelectedRow();

    if (linhaSelecionada != -1) {
        Oficina oficinaSelecionada = this.listaOficinas.get(linhaSelecionada);

        oficinaSelecionada.setStatus("presente");

        atualizarTabela();

    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma oficina para marcar a presença.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_btnPresencaActionPerformed

    private void btnAusenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusenciaActionPerformed
       
    int linhaSelecionada = tblOficinas.getSelectedRow();

    if (linhaSelecionada != -1) {
        Oficina oficinaSelecionada = this.listaOficinas.get(linhaSelecionada);

        oficinaSelecionada.setStatus("ausente");

        atualizarTabela();

    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma oficina para marcar a ausencia.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_btnAusenciaActionPerformed

    private void ObtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtnSalvarActionPerformed
        

    OficinaController controller = new OficinaController();

    controller.salvarAlteracoes(this.listaOficinas);

    javax.swing.JOptionPane.showMessageDialog(this, "Alterações salvas com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_ObtnSalvarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaOficinas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ObtnSalvar;
    private javax.swing.JButton btnAusencia;
    private javax.swing.JButton btnPresenca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOficinas;
    // End of variables declaration//GEN-END:variables
}
