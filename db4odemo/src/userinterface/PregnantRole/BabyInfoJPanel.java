/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PregnantRole;

import System.Baby.Baby;
import System.BabyInfo.BabyInfo;
import System.CareCenterSystem;
import System.Pregnant.Pregnant;
import System.UserAccount.UserAccount;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class BabyInfoJPanel extends JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem system;
    private UserAccount userAccount;
    private Pregnant pregnant;
    private ArrayList<Baby> babyList;
    

    //private InRequest inRequest;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public BabyInfoJPanel(JPanel userProcessContainer, CareCenterSystem system,UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        this.userAccount = account;
        this.pregnant=system.getPregnantDirectory().searchPregnant(userAccount.getUsername());
        this.babyList=pregnant.getBabyArrayList();
        populateBabyCombo();
//this.inRequest = inRequest;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new JButton();
        enterpriseLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        Combo = new JComboBox<>();
        jButton1 = new JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Hospital Request:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 500, 160));

        Combo.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PregnantMain dwjp = (PregnantMain) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Combo.getSelectedItem()==null){
                JOptionPane.showMessageDialog(this,"Please select a baby");
                return;
        }
        populateRequestTable();
        populateBabyCombo();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JComboBox<String> Combo;
    private JButton backJButton;
    private JLabel enterpriseLabel;
    private JButton jButton1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(Baby baby:babyList){
            if(baby.getName().equals((String)Combo.getSelectedItem())){
                for(BabyInfo babyinfo:baby.getBabyinfoDirectory().getBabyInfoArrayList()){
                    Object[] row = new Object[2];
                    row[0]=babyinfo.getCheckdate();
                    row[1]=babyinfo.getDescription();
                    model.addRow(row);
                }
                
            }
            
        }
          
    }

    private void populateBabyCombo() {
        Combo.removeAllItems();
        
        for(Baby baby:babyList){
            Combo.addItem(baby.getName());
        }
    }
}