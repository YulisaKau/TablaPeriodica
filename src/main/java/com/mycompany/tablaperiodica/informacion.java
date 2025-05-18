package com.mycompany.tablaperiodica;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class informacion extends javax.swing.JFrame {
    String paso="";
    public informacion() {
        initComponents();
        this.setLocationRelativeTo(this);
        texto.append(paso);
        transparenciaboton();
    }
    public void transparenciaboton(){
        jButton1.setOpaque(false);
        
        ImageIcon Img = new ImageIcon(getClass().getResource(""));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 640, 90, 90));

        jLabel4.setBackground(new java.awt.Color(248, 130, 91));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, 350, 120));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lakehurst Gothic Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("  Estado de agregacion:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 540, 50));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 540, 510));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 740));

        jScrollPane2.setBackground(new java.awt.Color(1, 1, 1));
        jScrollPane2.setForeground(new java.awt.Color(11, 11, 11));
        jScrollPane2.setToolTipText("");

        texto.setEditable(false);
        texto.setBackground(new java.awt.Color(0, 0, 0));
        texto.setFont(new java.awt.Font("Cantarell Extra Bold", 0, 18)); // NOI18N
        texto.setForeground(new java.awt.Color(254, 254, 254));
        texto.setRows(5);
        texto.setAutoscrolls(false);
        texto.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        texto.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        texto.setFocusable(false);
        texto.setSelectedTextColor(new java.awt.Color(99, 99, 99));
        texto.setSelectionColor(new java.awt.Color(28, 28, 28));
        jScrollPane2.setViewportView(texto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 400, 740));

        jLabel1.setText("jLabel1");
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        informacion window=new informacion();
        window.setVisible(false);
        dispose();
        //this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void rellena(String cadena){
        texto.append(cadena);
    }
    public void rellena2(String cadena){
        jLabel3.setIcon(new javax.swing.ImageIcon(cadena));
    }
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
            java.util.logging.Logger.getLogger(informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
    
}
