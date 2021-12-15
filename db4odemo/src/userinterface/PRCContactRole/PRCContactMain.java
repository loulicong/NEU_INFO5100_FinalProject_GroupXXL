/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PRCContactRole;

import System.CareCenterSystem;
import System.PRCContact.PRCContact;
import System.UserAccount.UserAccount;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author raunak
 */
public class PRCContactMain extends JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem system;
    private UserAccount userAccount;
    private PRCContact prccontact;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PRCContactMain(JPanel userProcessContainer, UserAccount userAccount,CareCenterSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.prccontact = prccontact;
        this.system= system;
        valueLabel.setText(prccontact.getUsername());
//        for(InRequest inRequest :system.getRequestInList().getWorkRequestList()){
//            if(inRequest.getSender().getPassword().equals(userAccount.getPassword())&& inRequest.getSender().getUsername().equals(userAccount.getUsername())){
//                userAccount.getRequestInList().getWorkRequestList().add(inRequest);
//            }
//        }
//        populateRequestTable();
    }
    
    public void populateRequestTable(){
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        model.setRowCount(0);
//        for(InRequest s:system.getRequestInList().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0]=s.getMessage();
//            row[1]=s.getSender();
//            row[2]=s.getStatus();
//            row[3]=s.getResult();
//            model.addRow(row);
//        }
//        DefaultTableModel model_1 = (DefaultTableModel) orderJTable.getModel();
//        model_1.setRowCount(0);
//        for(Hospital s:system.getRestaurantDirectory().getRestaurantArrayList()){
//            Object[] row = new Object[2];
//            row[0]=s.getName();
//            model_1.addRow(row);
//        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new JLabel();
        valueLabel = new JLabel();
        ProcessRequest = new JButton();
        ProcessOutbtn = new JButton();
        ManageDoctorbtn = new JButton();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("PRC Contact:");

        valueLabel.setText("<value>");

        ProcessRequest.setText("Process Request");
        ProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessRequestActionPerformed(evt);
            }
        });

        ProcessOutbtn.setText("Process Out Pregnant");
        ProcessOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessOutbtnActionPerformed(evt);
            }
        });

        ManageDoctorbtn.setText("Manage Employers");
        ManageDoctorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDoctorbtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ProcessOutbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(ManageDoctorbtn))
                    .addComponent(ProcessRequest, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ProcessRequest)
                    .addComponent(ManageDoctorbtn))
                .addGap(34, 34, 34)
                .addComponent(ProcessOutbtn)
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessRequestActionPerformed
        // TODO add your handling code here:
        PRCProcessRequestJPanel request=new PRCProcessRequestJPanel(userProcessContainer,userAccount,system);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(request);
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_ProcessRequestActionPerformed

    private void ProcessOutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessOutbtnActionPerformed
        // TODO add your handling code here:
        PRCProcessOutJPanel request=new PRCProcessOutJPanel(userProcessContainer,userAccount,system);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(request);
        crdLyt.next(userProcessContainer);
//        Pregnant pregnant=system.getPregnantDirectory().searchPregnant(userAccount.getUsername());
//        pregnant.setHospitalstatu("Out");
//        JOptionPane.showMessageDialog(this,"Out Succesfully!");



    }//GEN-LAST:event_ProcessOutbtnActionPerformed

    private void ManageDoctorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDoctorbtnActionPerformed
        // TODO add your handling code here:
        ManagePRCerJPanel request=new ManagePRCerJPanel(userProcessContainer,userAccount,system);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(request);
        crdLyt.next(userProcessContainer);
//        PregnantInfoJPanel pregnantinfo=new PregnantInfoJPanel(userProcessContainer,system,userAccount);
//        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
//        userProcessContainer.add(pregnantinfo);
//        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_ManageDoctorbtnActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton ManageDoctorbtn;
    private JButton ProcessOutbtn;
    private JButton ProcessRequest;
    private JLabel enterpriseLabel;
    private JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
