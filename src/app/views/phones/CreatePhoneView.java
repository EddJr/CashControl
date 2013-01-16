/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.views.phones;

import app.views.AppView;
import app.controllers.PhonesController;
/**
 *
 * @author Eduardo Jr
 */
public class CreatePhoneView extends AppView {

    /**
     * Creates new form CreateView
     */
    public CreatePhoneView() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        createLabel1 = new javax.swing.JLabel();
        createTabPhone = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        phone = new javax.swing.JTextField();
        createLabelPhone = new javax.swing.JLabel();
        createCancelButtonPhone = new javax.swing.JButton();
        createOkButtonPhone = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cell = new javax.swing.JTextField();
        createLabel2 = new javax.swing.JLabel();
        createCancelButtonCell = new javax.swing.JButton();
        createOkButtonCell = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Adcionar Telefone");

        createTabPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        createLabelPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createLabelPhone.setText("Tel:");

        createCancelButtonPhone.setText("Cancelar");
        createCancelButtonPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCancelButtonPhoneActionPerformed(evt);
            }
        });

        createOkButtonPhone.setText("OK");
        createOkButtonPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOkButtonPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(createLabelPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createOkButtonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createCancelButtonPhone)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCancelButtonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createOkButtonPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        createTabPhone.addTab("Fixo", jPanel2);

        cell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellActionPerformed(evt);
            }
        });

        createLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createLabel2.setText("Cell:");

        createCancelButtonCell.setText("Cancelar");
        createCancelButtonCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCancelButtonCellActionPerformed(evt);
            }
        });

        createOkButtonCell.setText("OK");
        createOkButtonCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOkButtonCellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(createOkButtonCell, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createCancelButtonCell)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(createLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cell, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cell, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCancelButtonCell, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createOkButtonCell, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        createTabPhone.addTab("Celular", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createTabPhone)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createLabel1)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(createLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createTabPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createCancelButtonCellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCancelButtonCellActionPerformed
           dispose();
    }//GEN-LAST:event_createCancelButtonCellActionPerformed

    private void createOkButtonCellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOkButtonCellActionPerformed
           PhonesController tmp = new PhonesController();
           if(tmp.validaPhone(cell.getText())){
                if ( ! cell.getText().equals("")) {
                     data.add("phone", cell.getText());
                     dispose();
                }
           }
           else{
                System.out.println("Telefone invalido!");
           }
    }//GEN-LAST:event_createOkButtonCellActionPerformed

    private void createCancelButtonPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCancelButtonPhoneActionPerformed
           dispose();
    }//GEN-LAST:event_createCancelButtonPhoneActionPerformed

    private void createOkButtonPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOkButtonPhoneActionPerformed
        PhonesController tmp = new PhonesController();
           if(tmp.validaPhone(phone.getText())){
                if ( ! phone.getText().equals("")) {
                     data.add("phone", phone.getText());
                     dispose();
                }
           }
           else{
                System.out.println("Telefone invalido!");
           }
    }//GEN-LAST:event_createOkButtonPhoneActionPerformed

    private void cellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cell;
    private javax.swing.JButton createCancelButtonCell;
    private javax.swing.JButton createCancelButtonPhone;
    private javax.swing.JLabel createLabel1;
    private javax.swing.JLabel createLabel2;
    private javax.swing.JLabel createLabelPhone;
    private javax.swing.JButton createOkButtonCell;
    private javax.swing.JButton createOkButtonPhone;
    private javax.swing.JTabbedPane createTabPhone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
