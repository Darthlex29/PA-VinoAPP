/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID MOLINA
 */
public class Interfaz extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelprincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        Paneldelbuscador = new javax.swing.JPanel();
        btnAgregarVino = new javax.swing.JButton();
        btnMostrarVino = new javax.swing.JButton();
        btnEliminarVino = new javax.swing.JButton();
        btnmodificarVino = new javax.swing.JButton();
        btnBuscarVino1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Nota1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVinos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panelprincipal.setBackground(new java.awt.Color(204, 153, 0));
        Panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Brush Script MT", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Wine APP");
        Panelprincipal.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 310, 70));

        Paneldelbuscador.setBackground(new java.awt.Color(102, 0, 0));
        Paneldelbuscador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarVino.setBackground(new java.awt.Color(102, 0, 0));
        btnAgregarVino.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnAgregarVino.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVino.setText("Agregar Vino");
        btnAgregarVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVinoActionPerformed(evt);
            }
        });
        Paneldelbuscador.add(btnAgregarVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 50));

        btnMostrarVino.setBackground(new java.awt.Color(102, 0, 0));
        btnMostrarVino.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnMostrarVino.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarVino.setText("Mostrar Vinos");
        btnMostrarVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVinoActionPerformed(evt);
            }
        });
        Paneldelbuscador.add(btnMostrarVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 50));

        btnEliminarVino.setBackground(new java.awt.Color(102, 0, 0));
        btnEliminarVino.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEliminarVino.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVino.setText("Eliminar Vino");
        btnEliminarVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVinoActionPerformed(evt);
            }
        });
        Paneldelbuscador.add(btnEliminarVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, 50));

        btnmodificarVino.setBackground(new java.awt.Color(102, 0, 0));
        btnmodificarVino.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnmodificarVino.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificarVino.setText("Modificar Vino");
        Paneldelbuscador.add(btnmodificarVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 50));

        btnBuscarVino1.setBackground(new java.awt.Color(102, 0, 0));
        btnBuscarVino1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnBuscarVino1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVino1.setText("Buscar Vinos");
        btnBuscarVino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVino1ActionPerformed(evt);
            }
        });
        Paneldelbuscador.add(btnBuscarVino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 130, 50));

        Panelprincipal.add(Paneldelbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 580));

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Panelprincipal.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 60, 50));

        Nota1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Nota1.setText("<html><body>Esta aplicacion tiene como utilidad almacenar  datos sobre vinos, aquí podras agregar, buscar modificar y elminar los vinos que quieras.<html><body> ");
        Panelprincipal.add(Nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 550, 90));

        tablaVinos.setBackground(new java.awt.Color(255, 204, 51));
        tablaVinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Casa productora", "Pais", "Color", "Edad", "Nivel de azucar", "Cepa de Vinos", "Nivel de gas carbónico", "Crianza", "Método de elaboración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVinos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaVinos.setRowHeight(40);
        jScrollPane2.setViewportView(tablaVinos);
        if (tablaVinos.getColumnModel().getColumnCount() > 0) {
            tablaVinos.getColumnModel().getColumn(0).setMinWidth(100);
            tablaVinos.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaVinos.getColumnModel().getColumn(1).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(1).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(2).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(2).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(3).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(3).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(4).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(4).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(5).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(5).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(6).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(6).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(7).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(7).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(8).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(8).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(9).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(9).setMaxWidth(200);
            tablaVinos.getColumnModel().getColumn(10).setMinWidth(200);
            tablaVinos.getColumnModel().getColumn(10).setMaxWidth(200);
        }

        Panelprincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 580, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelprincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVinoActionPerformed

    private void btnAgregarVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarVinoActionPerformed

    private void btnMostrarVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarVinoActionPerformed

    private void btnBuscarVino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarVino1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    

    public void actualizarTabla(Object[] vino) {
        tabla = (DefaultTableModel) tablaVinos.getModel();
        tabla.addRow(vino);
        tablaVinos.setModel(tabla);
    }
    
    public void limpiarTablav1(){
        int fila = tablaVinos.getRowCount();
        for(int i = fila-1; i>=0; i--){
            tabla.removeRow(i);
            tablaVinos.setModel(tabla);
        }
    }
    
    
    public void cerrar(){
        dispose();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
//    public void invisible(boolean verificador){
//        if(verificador){
//            btnRadio1.setVisible(false);
//            btnRadio2.setVisible(false);
//            btnRadio3.setVisible(false);
//            btnRadio4.setVisible(false);
//            btnRadio5.setVisible(false);
//            btnRadio6.setVisible(false);
//            jTextPane1.setEnabled(false);
//            jTextPane1.setVisible(false);
//        }else{
//            NombreVino.setVisible(false);
//            Casa.setVisible(false);
//            Pais.setVisible(false);
//        }  
//    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nota1;
    private javax.swing.JPanel Paneldelbuscador;
    private javax.swing.JPanel Panelprincipal;
    public javax.swing.JButton btnAgregarVino;
    public javax.swing.JButton btnBuscarVino1;
    public javax.swing.JButton btnEliminarVino;
    public javax.swing.JButton btnMostrarVino;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnmodificarVino;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaVinos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    
}
