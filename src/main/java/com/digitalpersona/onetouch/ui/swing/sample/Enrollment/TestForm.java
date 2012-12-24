/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalpersona.onetouch.ui.swing.sample.Enrollment;

import com.digitalpersona.onetouch.DPFPGlobal;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author cecheverria
 */
public class TestForm extends javax.swing.JFrame {

    /**
     * Creates new form TestForm
     */
    public TestForm() {
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

        capture = new com.digitalpersona.onetouch.ui.swing.sample.Enrollment.CaptureBean();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prompt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        capture.addSensorListener(new com.digitalpersona.onetouch.capture.event.DPFPSensorListener() {
            public void fingerTouched(com.digitalpersona.onetouch.capture.event.DPFPSensorEvent evt) {
                captureFingerTouched(evt);
            }
            public void imageAcquired(com.digitalpersona.onetouch.capture.event.DPFPSensorEvent evt) {
            }
            public void fingerGone(com.digitalpersona.onetouch.capture.event.DPFPSensorEvent evt) {
                captureFingerGone(evt);
            }
        });
        capture.addReaderStatusListener(new com.digitalpersona.onetouch.capture.event.DPFPReaderStatusListener() {
            public void readerConnected(com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent evt) {
                captureReaderConnected(evt);
            }
            public void readerDisconnected(com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent evt) {
                captureReaderDisconnected(evt);
            }
        });
        capture.addDataListener(new com.digitalpersona.onetouch.capture.event.DPFPDataListener() {
            public void dataAcquired(com.digitalpersona.onetouch.capture.event.DPFPDataEvent evt) {
                captureDataAcquired(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/digitalpersona/onetouch/ui/swing/sample/Enrollment/Bundle"); // NOI18N
        jLabel2.setText(bundle.getString("TestForm.jLabel2.text")); // NOI18N

        prompt.setText(bundle.getString("TestForm.prompt.text")); // NOI18N

        jLabel3.setText(bundle.getString("TestForm.jLabel3.text")); // NOI18N

        log.setColumns(20);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prompt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prompt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel4.setText(bundle.getString("TestForm.jLabel4.text")); // NOI18N

        jButton1.setText(bundle.getString("TestForm.jButton1.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void captureReaderConnected(com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent evt) {//GEN-FIRST:event_captureReaderConnected
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                log.setText(log.getText() + "READER CONNECTED" + "\n");
            }
        });
    }//GEN-LAST:event_captureReaderConnected

    private void captureReaderDisconnected(com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent evt) {//GEN-FIRST:event_captureReaderDisconnected
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                log.setText(log.getText() + "READER DISCONNECTED" + "\n");
            }
        });
    }//GEN-LAST:event_captureReaderDisconnected

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        capture.startCapture();
    }//GEN-LAST:event_formComponentShown

    private void captureFingerGone(com.digitalpersona.onetouch.capture.event.DPFPSensorEvent evt) {//GEN-FIRST:event_captureFingerGone
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                log.setText(log.getText() + "FINGER GONE" + "\n");
            }
        });
    }//GEN-LAST:event_captureFingerGone

    private void captureFingerTouched(com.digitalpersona.onetouch.capture.event.DPFPSensorEvent evt) {//GEN-FIRST:event_captureFingerTouched
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                log.setText(log.getText() + "FINGER TOUCHED" + "\n");
            }
        });
    }//GEN-LAST:event_captureFingerTouched

    private void captureDataAcquired(com.digitalpersona.onetouch.capture.event.DPFPDataEvent evt) {//GEN-FIRST:event_captureDataAcquired
        final com.digitalpersona.onetouch.capture.event.DPFPDataEvent event = evt;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                log.setText(log.getText() + "DATA ACQUIRED" + "\n");
                Image image = DPFPGlobal.getSampleConversionFactory().createImage(event.getSample());
                BufferedImage bi = new BufferedImage(picture.getWidth(), picture.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
                Graphics2D g2d = (Graphics2D) bi.getGraphics();
                AffineTransform at = new AffineTransform();

                g2d.setTransform(null);
//                picture.setIcon(bi);
            }
        });
    }//GEN-LAST:event_captureDataAcquired

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
            java.util.logging.Logger.getLogger(TestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.digitalpersona.onetouch.ui.swing.sample.Enrollment.CaptureBean capture;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea log;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField prompt;
    // End of variables declaration//GEN-END:variables
}
