/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chachachachi;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Principal extends javax.swing.JPanel {
ChachaChachi padre;
    /**
     * Creates new form Principal
     */
    public Principal(ChachaChachi padre) {
        initComponents();
        this.setBackground(Color.WHITE);
        this.padre=padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBotones = new javax.swing.JLayeredPane();
        btnPlanning = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnPlanificar = new javax.swing.JButton();

        btnPlanning.setBackground(new java.awt.Color(255, 204, 204));
        btnPlanning.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnPlanning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visibility.png"))); // NOI18N
        btnPlanning.setText("VER PLANNING");
        btnPlanning.setToolTipText("");
        btnPlanning.setMaximumSize(new java.awt.Dimension(200, 200));
        btnPlanning.setMinimumSize(new java.awt.Dimension(200, 100));
        btnPlanning.setPreferredSize(new java.awt.Dimension(200, 200));
        btnPlanning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlanningMouseClicked(evt);
            }
        });
        btnPlanning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanningActionPerformed(evt);
            }
        });

        btnPagos.setBackground(new java.awt.Color(255, 204, 204));
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payment.png"))); // NOI18N
        btnPagos.setText("PAGOS");
        btnPagos.setMaximumSize(new java.awt.Dimension(200, 200));
        btnPagos.setMinimumSize(new java.awt.Dimension(200, 100));
        btnPagos.setPreferredSize(new java.awt.Dimension(200, 200));
        btnPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagosMouseClicked(evt);
            }
        });

        btnPlanificar.setBackground(new java.awt.Color(255, 204, 204));
        btnPlanificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tasks.png"))); // NOI18N
        btnPlanificar.setText("PLANIFICAR");
        btnPlanificar.setMaximumSize(new java.awt.Dimension(200, 200));
        btnPlanificar.setMinimumSize(new java.awt.Dimension(200, 100));
        btnPlanificar.setPreferredSize(new java.awt.Dimension(200, 200));
        btnPlanificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanificarActionPerformed(evt);
            }
        });

        pBotones.setLayer(btnPlanning, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pBotones.setLayer(btnPagos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pBotones.setLayer(btnPlanificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pBotonesLayout = new javax.swing.GroupLayout(pBotones);
        pBotones.setLayout(pBotonesLayout);
        pBotonesLayout.setHorizontalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPlanificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pBotonesLayout.setVerticalGroup(
            pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlanificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pBotones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pBotones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlanningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlanningActionPerformed

    private void btnPlanningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlanningMouseClicked
        padre.setPanelActual(new VerPlanning());
    }//GEN-LAST:event_btnPlanningMouseClicked

    private void btnPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagosMouseClicked
         padre.setPanelActual(new GestionPagos());
    }//GEN-LAST:event_btnPagosMouseClicked

    private void btnPlanificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanificarActionPerformed

        padre.setPanelActual(new Planificar());

    }//GEN-LAST:event_btnPlanificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnPlanificar;
    private javax.swing.JButton btnPlanning;
    private javax.swing.JLayeredPane pBotones;
    // End of variables declaration//GEN-END:variables
}
