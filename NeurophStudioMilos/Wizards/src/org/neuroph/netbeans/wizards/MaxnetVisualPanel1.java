/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neuroph.netbeans.wizards;

import javax.swing.JPanel;
import javax.swing.JTextField;

public final class MaxnetVisualPanel1 extends JPanel {

    private static MaxnetVisualPanel1 instance;

    /** Creates new form MaxnetVisualPanel1 */
    private MaxnetVisualPanel1() {
        initComponents();
    }

    public static MaxnetVisualPanel1 getInstance(){
        if(instance==null){
            instance = new MaxnetVisualPanel1();
        }
        return instance;
    }

    @Override
    public String getName() {
        return "Number of neurons";
    }

    public JTextField getNeuronsNumField() {
        return neuronsNumField;
    }

    public void clearForm(){
        neuronsNumField.setText("");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        neuronsNumField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(MaxnetVisualPanel1.class, "MaxnetVisualPanel1.jLabel1.text")); // NOI18N

        neuronsNumField.setText(org.openide.util.NbBundle.getMessage(MaxnetVisualPanel1.class, "MaxnetVisualPanel1.neuronsNumField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(neuronsNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(neuronsNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField neuronsNumField;
    // End of variables declaration//GEN-END:variables
}

