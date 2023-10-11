/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author DAVID MOLINA
 */
public class InterfazAgregar extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAgregar
     */
    public InterfazAgregar() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVAM = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jCElementos = new javax.swing.JComboBox<>();
        txPais = new javax.swing.JLabel();
        tfpais = new javax.swing.JTextField();
        txNombreV1 = new javax.swing.JLabel();
        tfNombreV = new javax.swing.JTextField();
        txCasaproductora = new javax.swing.JLabel();
        tfcasaproductora = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRadio1 = new javax.swing.JRadioButton();
        btnRadio2 = new javax.swing.JRadioButton();
        btnRadio3 = new javax.swing.JRadioButton();
        btnRadio4 = new javax.swing.JRadioButton();
        btnRadio5 = new javax.swing.JRadioButton();
        btnRadio6 = new javax.swing.JRadioButton();
        jLInformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVAM.setBackground(new java.awt.Color(102, 0, 0));
        btnVAM.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVAM.setForeground(new java.awt.Color(255, 255, 255));
        btnVAM.setText("Volver al menu");
        btnVAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVAMActionPerformed(evt);
            }
        });
        jPanel2.add(btnVAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 50));

        btnLimpiar.setBackground(new java.awt.Color(102, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 50));

        btnContinuar.setBackground(new java.awt.Color(255, 153, 0));
        btnContinuar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnContinuar.setText("Continuar");
        jPanel2.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 150, 50));

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 60, 50));

        jCElementos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Casa Productora", "Pais", "Color", "Edad", "Nivel de azucar", "Cepa de vinos", "Gas carbonico", "Crianza", "Metodo de elaboracion" }));
        jPanel2.add(jCElementos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 210, 560));

        txPais.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txPais.setForeground(new java.awt.Color(102, 0, 0));
        txPais.setText("Pais de origen del vino");
        jPanel1.add(txPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 210, 30));

        tfpais.setBackground(new java.awt.Color(228, 190, 78));
        tfpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpaisActionPerformed(evt);
            }
        });
        jPanel1.add(tfpais, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 220, 30));

        txNombreV1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txNombreV1.setForeground(new java.awt.Color(102, 0, 0));
        txNombreV1.setText("Nombre del vino");
        jPanel1.add(txNombreV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 210, 30));

        tfNombreV.setBackground(new java.awt.Color(228, 190, 78));
        tfNombreV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreVActionPerformed(evt);
            }
        });
        jPanel1.add(tfNombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 220, 30));

        txCasaproductora.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txCasaproductora.setForeground(new java.awt.Color(102, 0, 0));
        txCasaproductora.setText("Casa productora del vino");
        jPanel1.add(txCasaproductora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 210, 30));

        tfcasaproductora.setBackground(new java.awt.Color(228, 190, 78));
        tfcasaproductora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcasaproductoraActionPerformed(evt);
            }
        });
        jPanel1.add(tfcasaproductora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 220, 30));

        titulo.setFont(new java.awt.Font("Brush Script MT", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Wine APP");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 310, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("<html><body>Para poder ingresar un nuevo vino, completa los datos que se solicitaran a continuacion, ten en cuenta seleccionar la caracteristica.<html><body>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 440, 100));

        btnRadio1.setBackground(new java.awt.Color(204, 153, 0));
        btnRadio1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRadio1.setText("Opcion1");
        btnRadio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRadio1MouseClicked(evt);
            }
        });
        btnRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 40));

        btnRadio2.setBackground(new java.awt.Color(204, 153, 0));
        btnRadio2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRadio2.setText("Opcion2");
        jPanel1.add(btnRadio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 200, 40));

        btnRadio3.setBackground(new java.awt.Color(204, 153, 0));
        btnRadio3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRadio3.setText("Opcion3");
        jPanel1.add(btnRadio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 40));

        btnRadio4.setBackground(new java.awt.Color(204, 153, 0));
        btnRadio4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRadio4.setText("Opcion4");
        jPanel1.add(btnRadio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 200, 40));

        btnRadio5.setBackground(new java.awt.Color(204, 153, 0));
        btnRadio5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRadio5.setText("Opcion5");
        btnRadio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRadio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 200, 40));

        btnRadio6.setBackground(new java.awt.Color(204, 153, 0));
        btnRadio6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRadio6.setText("Opcion6");
        btnRadio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRadio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 200, 40));

        jLInformacion.setFont(new java.awt.Font("Source Sans Pro SemiBold", 0, 24)); // NOI18N
        jLInformacion.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jLInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 530, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVAMActionPerformed

    private void tfpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpaisActionPerformed

    private void tfNombreVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreVActionPerformed

    private void tfcasaproductoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcasaproductoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcasaproductoraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio1ActionPerformed

    private void btnRadio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio5ActionPerformed

    private void btnRadio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRadio1MouseClicked
        
    }//GEN-LAST:event_btnRadio1MouseClicked

    private void btnRadio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio6ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAgregar().setVisible(true);
            }
        });
    }
    public void cambios(int paso){
        switch (paso){
            case 0: {
                btnRadio1.setVisible(false);
                btnRadio2.setVisible(false);
                btnRadio3.setVisible(false);
                btnRadio4.setVisible(false);
                btnRadio5.setVisible(false);
                btnRadio6.setVisible(false);
//                tadescripcion.setVisible(false);
                txCasaproductora.setVisible(true);
                txNombreV1.setVisible(true);
                txPais.setVisible(true);
                tfNombreV.setVisible(true);
                tfcasaproductora.setVisible(true);
                tfpais.setVisible(true);
                break;
            }
            case 1: {
                btnRadio1.setVisible(true);
                btnRadio1.setText("Tinto");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Blanco");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Rosado");
                btnRadio4.setVisible(false);
                btnRadio5.setVisible(false);
                btnRadio6.setVisible(false);
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break;
            }
            case 2:{
                btnRadio1.setVisible(true);
                btnRadio1.setText("Joven");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Crianza");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Reserva");
                btnRadio4.setVisible(true);
                btnRadio4.setText("Gran reserva");
                btnRadio5.setVisible(false);
                btnRadio6.setVisible(false);
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break;
                
            }
            case 3:{
                btnRadio1.setVisible(true);
                btnRadio1.setText("Seco");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Semiseco");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Abocados");
                btnRadio4.setVisible(true);
                btnRadio4.setText("Dulces");
                btnRadio5.setVisible(true);
                btnRadio5.setText("Muy dulces");
                btnRadio6.setVisible(false);
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break;
            }
            case 4:{
                btnRadio1.setVisible(true);
                btnRadio1.setText("Cabernet Sauvignon");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Pinot noir");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Riesling");
                btnRadio4.setVisible(true);
                btnRadio4.setText("Merlot");
                btnRadio5.setVisible(true);
                btnRadio5.setText("Chardonnay");
                btnRadio6.setVisible(true);
                btnRadio6.setText("Sauvignon blanc");
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break; 
            }
            case 5:{
                btnRadio1.setVisible(true);
                btnRadio1.setText("Tranquilos");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Aguja");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Gasificada");
                btnRadio4.setVisible(true);
                btnRadio4.setText("Espumosos");
                btnRadio5.setVisible(true);
                btnRadio5.setText("Champenoise");
                btnRadio6.setVisible(true);
                btnRadio6.setText("Charmat");
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break;
            }
            case 6:{
                btnRadio1.setVisible(true);
                btnRadio1.setText("Noble");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Añejo");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Viejo");
                btnRadio4.setVisible(false);
                btnRadio5.setVisible(false);
                btnRadio6.setVisible(false);
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break;
            }
            case 7:{
                btnRadio1.setVisible(true);
                btnRadio1.setText("Maceración carbónica");
                btnRadio2.setVisible(true);
                btnRadio2.setText("Vendimia tardía");
                btnRadio3.setVisible(true);
                btnRadio3.setText("Vendimia seleccionada");
                btnRadio4.setVisible(true);
                btnRadio4.setText("Vinos especiales");
                btnRadio5.setVisible(false);
                btnRadio6.setVisible(false);
                txCasaproductora.setVisible(false);
                txNombreV1.setVisible(false);
                txPais.setVisible(false);
                tfNombreV.setVisible(false);
                tfcasaproductora.setVisible(false);
                tfpais.setVisible(false);
                break;
            }
        }
    }
        
    public void verificadorNull(){
        if(jLInformacion.getText()==null){
            jLInformacion.setText("Selecciona una de las opciones en pantalla");
        }
    }
    
    public void mostrarMensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    public void limpiarDatos(){
        jLInformacion.setText("");
        tfNombreV.setText("");
        tfcasaproductora.setText("");
        tfpais.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnContinuar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JRadioButton btnRadio1;
    public javax.swing.JRadioButton btnRadio2;
    public javax.swing.JRadioButton btnRadio3;
    public javax.swing.JRadioButton btnRadio4;
    public javax.swing.JRadioButton btnRadio5;
    public javax.swing.JRadioButton btnRadio6;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVAM;
    public javax.swing.JComboBox<String> jCElementos;
    public javax.swing.JLabel jLInformacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField tfNombreV;
    public javax.swing.JTextField tfcasaproductora;
    public javax.swing.JTextField tfpais;
    private javax.swing.JLabel titulo;
    public javax.swing.JLabel txCasaproductora;
    public javax.swing.JLabel txNombreV1;
    public javax.swing.JLabel txPais;
    // End of variables declaration//GEN-END:variables
}
