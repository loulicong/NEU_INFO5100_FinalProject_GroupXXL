/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalContact;

import System.CareCenterSystem;
import System.GODoc.GODoc;
import System.GODoc.GODocDirectory;
import System.Hospital.Hospital;
import System.HospitalContact.HospitalContact;
import System.HospitalContact.HospitalContactDirectory;
import System.Hospital_GO.Hospital_GO;
import System.Hospital_PED.Hospital_PED;

import System.UserAccount.UserAccount;
import System.InRequest.InRequest;
import System.InRequest.InRequestList;
import System.PEDoc.PEDoc;
import System.PEDoc.PEDocDirectory;
import System.Pregnant.Pregnant;
import System.Pregnant.PregnantDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ProcessOutJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem system;
    private UserAccount userAccount;
    private HospitalContact hospitalcontact;
    private Hospital hospital;
    private ArrayList<InRequest> inrequestList;

    //private Pregnant pregnant;


    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public ProcessOutJPanel(JPanel userProcessContainer, UserAccount userAccount, CareCenterSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount=userAccount;
        HospitalContactDirectory hospitalContactDirectory = system.getHospitalContactDirectory();
        this.hospitalcontact = hospitalContactDirectory.searchContact(userAccount.getUsername());
        this.system = system;
        this.hospital=system.getHospitalDirectory().searchHospital(hospitalcontact.getHospital().getName());
        this.inrequestList=hospital.getInrequestDirectory().getRequestList();
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model1 = (DefaultTableModel) RequestJTable.getModel();
        model1.setRowCount(0);
        if(inrequestList==null){
            Object[] row = new Object[3];
            model1.addRow(row);
        }
        else {
            for (InRequest s : inrequestList) {
                if (s.getStatus().equals("Out")) {
                    Object[] row = new Object[3];
                    row[0] = s;
                    row[1] = s.getSender().getUsername();
                    row[2] = s.getStatus();
                    model1.addRow(row);
                }
            }
        }

        }

//        DefaultTableModel model2 = (DefaultTableModel) GOJTable.getModel();
//        model2.setRowCount(0);
//        for(GODoc go:GOdocList.getGODocList()){
//            Object[] row = new Object[2];
//            row[0]=go;
//            row[1]=go.getStatu();
//            model2.addRow(row);
//        }
//
//        DefaultTableModel model3 = (DefaultTableModel) PEDJTable.getModel();
//        model3.setRowCount(0);
//        for(PEDoc ped:PEDdocList.getPEDocList()){
//            Object[] row = new Object[2];
//            row[0]=ped;
//            row[1]=ped.getStatu();
//            model3.addRow(row);
//        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RequestJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Request ID", "Pregnant Name", "Statu"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 670, 290));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 20));

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalContactMain dwjp = (HospitalContactMain) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JTable RequestJTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
