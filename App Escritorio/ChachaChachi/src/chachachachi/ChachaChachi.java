/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chachachachi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author dam205
 */
public class ChachaChachi extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    JPanel panelActual;
    Principal principal;
    AddTareas at;
    AddEmpleado addEmpleado;
    AddSala addSala;

    /**
     * Metodo que cambia el icono del proyecto
     *
     * @return retValue
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("img/cleaner.png"));

        return retValue;
    }

    public ChachaChachi() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        //iconosDeBotones();
        
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        this.setTitle("ChachaChachi - Planificador de labores del hogar");
        principal = new Principal(this);
        at = new AddTareas();
        addEmpleado = new AddEmpleado();
        addSala = new AddSala();

        panelActual = principal;
        panelActual.setVisible(true);
        
        setVisible(true);
        this.add(panelActual, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        btnEstancias = new javax.swing.JLabel();
        btnTareas = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setName("pantallaPrincipal"); // NOI18N

        pnMenu.setBackground(new java.awt.Color(241, 110, 148));
        pnMenu.setPreferredSize(new java.awt.Dimension(250, 400));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cleaner128.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnEstancias.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnEstancias.setForeground(new java.awt.Color(255, 255, 255));
        btnEstancias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door.png"))); // NOI18N
        btnEstancias.setText("GESTIÓN ESTANCIAS");
        btnEstancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstanciasMouseClicked(evt);
            }
        });

        btnTareas.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnTareas.setForeground(new java.awt.Color(255, 255, 255));
        btnTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flow-chart.png"))); // NOI18N
        btnTareas.setText("GESTIÓN TAREAS");
        btnTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTareasMouseClicked(evt);
            }
        });

        btnEmpleados.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/network.png"))); // NOI18N
        btnEmpleados.setText("GESTIÓN EMPLEADOS");
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(68, 68, 68))
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnEstancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(btnTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnEstancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnTareas)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(pnMenu, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTareasMouseClicked
        // TODO add your handling code here:
        setPanelActual(at);
    }//GEN-LAST:event_btnTareasMouseClicked

    public void setPanelActual (JPanel nuevoPanel){
        panelActual.setVisible(false);
        this.remove(panelActual);
        nuevoPanel.setVisible(true);
        panelActual = nuevoPanel;
        this.add(panelActual, BorderLayout.CENTER);
        panelActual.repaint();
        this.repaint();
    }
    private void btnEstanciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstanciasMouseClicked
        // TODO add your handling code here:
        setPanelActual(addSala);
       
    }//GEN-LAST:event_btnEstanciasMouseClicked

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked
       setPanelActual(addEmpleado);
    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        setPanelActual(principal);
    }//GEN-LAST:event_btnHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChachaChachi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChachaChachi().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                    Logger.getLogger(ChachaChachi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEmpleados;
    private javax.swing.JLabel btnEstancias;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnTareas;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables
}
