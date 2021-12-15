/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import System.Baby.Baby;
import System.BabyInfo.BabyInfo;
import System.CareCenterSystem;
import System.UserAccount.UserAccount;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class BabyNurseJPanel extends JPanel {

    /**
     * Creates new form DoctorJPanel
     */

    JFileChooser fc;
    private JPanel userProcessContainer;
    private CareCenterSystem system;
    private UserAccount userAccount;
    //MimetypesFileTypeMap mtftp;



    public BabyNurseJPanel(JPanel userProcessContainer, UserAccount account, CareCenterSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        this.userAccount = account;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDescri = new javax.swing.JLabel();
        lbBUltraImage = new javax.swing.JLabel();
        btnupload = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDes = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        lbImage1 = new javax.swing.JLabel();
        txtImagePath = new javax.swing.JTextField();
        lbDescri1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        lbDescri.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescri.setText("Description:");

        lbBUltraImage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBUltraImage.setText("B-Ultra Image:");

        btnupload.setText("UPLOAD");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        lbImage.setText("Submit Image Area");

        tbDes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Check Date", "Pregnant Name", "Description"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDes);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lbImage1.setText("Display Image Area");

        txtImagePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagePathActionPerformed(evt);
            }
        });

        lbDescri1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbDescri1.setText("Image Path:");

        jButton1.setText("Show image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pregnant Name:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText(">> Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnSubmit)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lbDescri1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lbBUltraImage)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnupload, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addComponent(lbDescri)
                                                                                                .addGap(18, 18, 18))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel1)
                                                                                                .addGap(18, 18, 18)))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jTextField2)
                                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap(32, Short.MAX_VALUE)
                                                                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                                        .addComponent(lbImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbDescri))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(136, 136, 136)
                                                                .addComponent(btnSubmit))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnupload)
                                                                        .addComponent(lbBUltraImage))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbDescri1))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1)
                                                .addGap(10, 10, 10)
                                                .addComponent(lbImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Have empty info!");
            return;
        }
        BabyInfo p = new BabyInfo();
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        if (system.getBabyDirectory().search(jTextField2.getText())==null){
            JOptionPane.showMessageDialog(this,"No such baby");
            return;
        }
        p.setCheckdate(sdf.format(date));
        p.setDescription(jTextField1.getText());
        p.setBirth(system.getBabyDirectory().search(jTextField2.getText()).getBirth());
        p.setMom(system.getBabyNurseDirectory().search(userAccount.getUsername()).getPregnant());
        p.setName(jTextField1.getText());
        p.setBaby(system.getBabyDirectory().search(jTextField2.getText()));
        system.getBabyDirectory().search(jTextField2.getText()).getBabyinfoDirectory().getBabyInfoArrayList().add(p);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tbDes.getModel();
        model.setRowCount(0);
        if (system.getBabyNurseDirectory().search(userAccount.getUsername()) == null || system.getBabyNurseDirectory().search(userAccount.getUsername()).getPregnant() == null || system.getBabyNurseDirectory().search(userAccount.getUsername()).getPregnant().getBabyArrayList() == null) {
            Object[] row = new Object[2];
            model.addRow(row);
        } else {
            for (Baby baby : system.getBabyNurseDirectory().search(userAccount.getUsername()).getPregnant().getBabyArrayList()) {
                {
                    for (BabyInfo babyInfo : baby.getBabyinfoDirectory().getBabyInfoArrayList()) {
                        if (babyInfo==null){
                            Object[] row = new Object[2];
                            model.addRow(row);
                            return;
                        }
                        Object[] row = new Object[2];
                        row[0] = babyInfo;
                        row[1] = babyInfo.getBaby().getName();
                        row[2] = babyInfo.getDescription();
                        model.addRow(row);
                    }
                }
            }
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnupload;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbBUltraImage;
    private javax.swing.JLabel lbDescri;
    private javax.swing.JLabel lbDescri1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbImage1;
    private javax.swing.JTable tbDes;
    private javax.swing.JTextField txtImagePath;
    // End of variables declaration//GEN-END:variables
}
