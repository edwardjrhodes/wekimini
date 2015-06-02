/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekimini.gui.path;

import java.util.logging.Level;
import java.util.logging.Logger;
import wekimini.learning.LearningAlgorithmRegistry;
import wekimini.learning.ModelBuilder;
import wekimini.learning.ModelBuilderEditorPanel;

/**
 *
 * @author rebecca
 */
public class ModelEditorFrame extends javax.swing.JFrame {
    private ModelBuilderReceiver receiver = null;
    private ModelBuilder originalModelBuilder = null;
    private int originalModelComboIndex = 0;
    private ModelBuilder[] candidateModelBuilders = null;
    private static final Logger logger = Logger.getLogger(ModelEditorFrame.class.getName());
    private ModelBuilderEditorPanel currentEditorPanel = null;
    
    /**
     * Creates new form ModelEditorFrame
     */
    public ModelEditorFrame() {
        initComponents();
    }
    
    /**
     * Creates new form ModelEditorFrame
     */
    public ModelEditorFrame(ModelBuilder mb, ModelBuilderReceiver r, boolean isClassifier) {
        initComponents();
        initializeFromCurrent(mb, isClassifier);
        originalModelBuilder = mb;
        this.receiver = r;
    }
    
    private void initializeFromCurrent(ModelBuilder mb, boolean isClassifier) {
        populateCombo(mb, isClassifier);
        //showOriginalModelEditor(); shouldn't need this
        //parentPanel.remove(1);
        //parentPanel.add(mb.getEditorPanel(), 1);
        //repaint();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboModelType = new javax.swing.JComboBox();
        panelModelEditor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setLayout(new javax.swing.BoxLayout(parentPanel, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Model type:");

        comboModelType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboModelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModelTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboModelType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboModelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentPanel.add(jPanel1);

        panelModelEditor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelModelEditorLayout = new javax.swing.GroupLayout(panelModelEditor);
        panelModelEditor.setLayout(panelModelEditorLayout);
        panelModelEditorLayout.setHorizontalGroup(
            panelModelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelModelEditorLayout.setVerticalGroup(
            panelModelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        parentPanel.add(panelModelEditor);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(0, 0, 0)
                .addComponent(jButton1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parentPanel.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (currentEditorPanel.validateForm()) {
            ModelBuilder mb = currentEditorPanel.buildFromPanel();
            receiver.modelBuilderReady(mb);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        receiver.modelBuilderCancelled();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboModelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModelTypeActionPerformed
        showModelEditor(comboModelType.getSelectedIndex());
    }//GEN-LAST:event_comboModelTypeActionPerformed

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
            java.util.logging.Logger.getLogger(ModelEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModelEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModelEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModelEditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelEditorFrame().setVisible(true);
            }
        });
    }

    private void populateCombo(ModelBuilder originalMb, boolean isClassifier) {
        if (isClassifier) {
            candidateModelBuilders = LearningAlgorithmRegistry.getClassificationModelBuilders();
        } else {
            candidateModelBuilders = LearningAlgorithmRegistry.getNumericModelBuilders();
        }
        
        String modelNames[] = new String[candidateModelBuilders.length];
        
        for (int i = 0; i < candidateModelBuilders.length; i++) {
            modelNames[i] = candidateModelBuilders[i].getPrettyName();
            if (candidateModelBuilders[i].getClass().isInstance(originalMb)) {
                //TODO check this
                originalModelComboIndex = i;
                ModelBuilder copyBuilder = candidateModelBuilders[i].fromTemplate(originalMb);
                candidateModelBuilders[i] = copyBuilder;
            }
        }
        comboModelType.setModel(new javax.swing.DefaultComboBoxModel(modelNames));
        if (originalModelComboIndex == -1) {
            logger.log(Level.WARNING, "Could not find matching ModelBuilder implementation class for modelbuilder {0}", originalMb.getClass().getCanonicalName());
            comboModelType.setSelectedIndex(0);
        } else {
            comboModelType.setSelectedIndex(originalModelComboIndex);
        }
    }

    private void showModelEditor(int selectedIndex) {
        ModelBuilderEditorPanel newPanel = candidateModelBuilders[selectedIndex].getEditorPanel();
        //panelModelEditor.removeAll();
        //panelModelEditor.add(newPanel);
        parentPanel.remove(1);
        parentPanel.add(newPanel, 1);
        currentEditorPanel = newPanel;
        pack(); //needed for form to display & resize properly
        repaint();
    }

    public interface ModelBuilderReceiver {
        void modelBuilderReady(ModelBuilder mb);
        void modelBuilderCancelled();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboModelType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelModelEditor;
    private javax.swing.JPanel parentPanel;
    // End of variables declaration//GEN-END:variables
}
