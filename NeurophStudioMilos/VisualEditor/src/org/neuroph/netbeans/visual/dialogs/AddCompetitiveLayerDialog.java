package org.neuroph.netbeans.visual.dialogs;

import java.util.ArrayList;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.input.*;
import org.neuroph.core.transfer.TransferFunction;
import org.neuroph.netbeans.visual.NeuralNetworkEditor;
import org.neuroph.netbeans.visual.widgets.NeuralNetworkScene;
import org.neuroph.nnet.comp.layer.CompetitiveLayer;
import org.neuroph.nnet.comp.neuron.CompetitiveNeuron;
import org.neuroph.util.NeuronProperties;
import org.neuroph.util.Neuroph;
import org.openide.util.Exceptions;

/**
 *
 * @author Djordje
 */
public class AddCompetitiveLayerDialog extends javax.swing.JDialog {

    NeuralNetwork neuralNet;
    NeuralNetworkScene scene;
    NeuralNetworkEditor editor;
    int neuralNetWidgetChildrenSize;
    /**
     * Creates new form AddCompetitiveLayerDialog
     */
    public AddCompetitiveLayerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillCombos();
    }
    
    
    public AddCompetitiveLayerDialog(java.awt.Frame parent, boolean modal, NeuralNetwork neuralNet, NeuralNetworkScene scene,int size) {
        super(parent, modal);
        this.neuralNet = neuralNet;
        this.scene = scene;
        this.neuralNetWidgetChildrenSize = size;
        editor = scene.getNeuralNetworkEditor();
        initComponents();
        fillCombos();
    }
    
    

    public final void fillCombos() {
        ArrayList inputFuncs = Neuroph.getInstance().getInputFunctions();
        javax.swing.DefaultComboBoxModel inputFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(inputFuncs.toArray()));
        comboBoxInputFunction.setModel(inputFunctionComboBoxModel);
        
        ArrayList transferFuncs = Neuroph.getInstance().getTransferFunctions();
        javax.swing.DefaultComboBoxModel transferFunctionComboBoxModel = (new javax.swing.DefaultComboBoxModel(transferFuncs.toArray()));
        comboBoxTransferFunction.setModel(transferFunctionComboBoxModel);        

//        ArrayList neuronClasses = Neuroph.getInstance().getNeurons();
//        javax.swing.DefaultComboBoxModel neuronsComboBoxModel = (new javax.swing.DefaultComboBoxModel(neuronClasses.toArray()));
//        comboBoxNeuronType.setModel(neuronsComboBoxModel);          

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxTransferFunction = new javax.swing.JComboBox();
        comboBoxInputFunction = new javax.swing.JComboBox();
        txtFieldNumberOfneurons = new javax.swing.JTextField();
        btnCreateCompetetiveLayer = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.title")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.jLabel3.text")); // NOI18N

        comboBoxInputFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxInputFunctionActionPerformed(evt);
            }
        });

        txtFieldNumberOfneurons.setText(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.txtFieldNumberOfneurons.text")); // NOI18N

        btnCreateCompetetiveLayer.setText(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.btnCreateCompetetiveLayer.text")); // NOI18N
        btnCreateCompetetiveLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCompetetiveLayerActionPerformed(evt);
            }
        });

        btnCancel.setText(org.openide.util.NbBundle.getMessage(AddCompetitiveLayerDialog.class, "AddCompetitiveLayerDialog.btnCancel.text")); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxTransferFunction, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxInputFunction, 0, 110, Short.MAX_VALUE)
                            .addComponent(txtFieldNumberOfneurons)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnCreateCompetetiveLayer)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxInputFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxTransferFunction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldNumberOfneurons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCompetetiveLayer)
                    .addComponent(btnCancel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateCompetetiveLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCompetetiveLayerActionPerformed
        try {
//            Class<? extends Neuron> someNeuron = ((String)comboBoxNeuronType.getSelectedItem()).equals("Neuron")
//                    ? (Class<? extends Neuron>) Class.forName("org.neuroph.core."+ ((String)comboBoxNeuronType.getSelectedItem()).trim())
//                    : (Class<? extends Neuron>) Class.forName("org.neuroph.nnet.comp.neuron."+ ((String)comboBoxNeuronType.getSelectedItem()).trim());
             Class<? extends TransferFunction> tfClass = (Class<? extends TransferFunction>) Class.forName("org.neuroph.core.transfer." + ((String) comboBoxTransferFunction.getSelectedItem()).trim());        
             
             Class<? extends InputFunction> ifClass = (Class<? extends InputFunction>) Class.forName("org.neuroph.core.input." + ((String)comboBoxInputFunction.getSelectedItem()).trim());

             NeuronProperties neuronProperties = new NeuronProperties(CompetitiveNeuron.class, ifClass, tfClass);
             
             int numberOfNeurons = Integer.parseInt(txtFieldNumberOfneurons.getText().trim());
             
             editor.addCompetitiveLayer(numberOfNeurons, neuronProperties, neuralNetWidgetChildrenSize);
             
             
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnCreateCompetetiveLayerActionPerformed

    private void comboBoxInputFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxInputFunctionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxInputFunctionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCompetitiveLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCompetitiveLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCompetitiveLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCompetitiveLayerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                AddCompetitiveLayerDialog dialog = new AddCompetitiveLayerDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateCompetetiveLayer;
    private javax.swing.JComboBox comboBoxInputFunction;
    private javax.swing.JComboBox comboBoxTransferFunction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtFieldNumberOfneurons;
    // End of variables declaration//GEN-END:variables
}
