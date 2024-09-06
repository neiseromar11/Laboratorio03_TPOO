/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora_china;

/**
 *
 * @author NEISER
 */
public class Cal_China extends javax.swing.JFrame {

    
    /*boolean isSumando =false; 
    boolean isRestando =false; 
    boolean isMultiplicando =false; 
    boolean isDividiendo =false;
    double numero1 ; */
    private Operaciones operaciones;
    private String operacionA;
    
    public Cal_China() {
        initComponents();
        operaciones=new Operaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrespuesta = new javax.swing.JTextField();
        btnsumar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtrespuesta.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        txtrespuesta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtrespuesta.setText("89");
        txtrespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrespuestaActionPerformed(evt);
            }
        });

        btnsumar.setText("+");
        btnsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarActionPerformed(evt);
            }
        });

        btnrestar.setText("-");
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });

        btnmultiplicar.setText("x");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });

        btndividir.setText("/");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btnborrar.setText("CA");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndividir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtrespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsumar)
                    .addComponent(btnrestar)
                    .addComponent(btnigual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndividir)
                    .addComponent(btnmultiplicar)
                    .addComponent(btnborrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrespuestaActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        txtrespuesta.setText("");
        operacionA = null;
        operaciones = new Operaciones();
        
        /* txtrespuesta.setText("");
        isSumando=false;
        isMultiplicando=false;
        isDividiendo=false;
        isRestando=false;
        numero1=0;*/
    }//GEN-LAST:event_btnborrarActionPerformed
    private double convertirTexto(){
        return Double.parseDouble(txtrespuesta.getText());
    }
    
     private void prepararOperacion(String operacion) {
        operacionA = operacion;
        operaciones.setNumero1(convertirTexto());
        operaciones.setOperacion(operacion);
        txtrespuesta.setText("");
    }
    private void btnsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarActionPerformed
     prepararOperacion("suma");
        /*
     isSumando=true;
     
     String texto =txtrespuesta.getText();
     numero1=Double.parseDouble(texto);
     txtrespuesta.setText("");*/
     
    }//GEN-LAST:event_btnsumarActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
         if (operacionA != null) {
             operaciones.setNumero2(convertirTexto());
            double resultado = operaciones.calcular(); 
            // Formatear el resultado para mostrar siempre 2 decimales
            String resultadoFormateado = String.format("%.2f", resultado);
            txtrespuesta.setText(resultadoFormateado);
            operacionA = null;
        }
        
        
        /*    if(isSumando){
            String texto =txtrespuesta.getText();
            double numero2=Double.parseDouble(texto);
            txtrespuesta.setText((numero1 + numero2) + "");
            isSumando=false;
      }
      if(isRestando){
          String texto =txtrespuesta.getText();
            double numero2=Double.parseDouble(texto);
            txtrespuesta.setText((numero1 - numero2) + "");
            isRestando=false;
      
      
      }
      if(isMultiplicando){
       String texto =txtrespuesta.getText();
            double numero2=Double.parseDouble(texto);
            txtrespuesta.setText((numero1 * numero2) + "");
            isMultiplicando=false;
      }
       if(isDividiendo){
       String texto =txtrespuesta.getText();
            double numero2=Double.parseDouble(texto);
            txtrespuesta.setText((numero1 / numero2) + "");
            isDividiendo=false;
      }*/
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
      prepararOperacion("resta");
        /*  isRestando=true;
     
     String texto =txtrespuesta.getText();
     numero1=Double.parseDouble(texto);
     txtrespuesta.setText("");*/
     
    }//GEN-LAST:event_btnrestarActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
      prepararOperacion("multiplicacion");
        /*  isMultiplicando=true;
     
     String texto =txtrespuesta.getText();
     numero1=Double.parseDouble(texto);
     txtrespuesta.setText("");*/
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
    prepararOperacion("division");
        /*   isDividiendo=true;
     
     String texto =txtrespuesta.getText();
     numero1=Double.parseDouble(texto);
     txtrespuesta.setText("");*/
    }//GEN-LAST:event_btndividirActionPerformed

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
            java.util.logging.Logger.getLogger(Cal_China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal_China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal_China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal_China.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal_China().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnrestar;
    private javax.swing.JButton btnsumar;
    private javax.swing.JTextField txtrespuesta;
    // End of variables declaration//GEN-END:variables
}
