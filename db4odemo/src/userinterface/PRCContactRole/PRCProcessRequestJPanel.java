/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PRCContactRole;

import System.BabyNurse.BabyNurse;
import System.CareCenterSystem;
import System.GODNurse.GODNurse;
import System.InRequest.InRequest;
import System.InRequest.InRequestList;
import System.PRC.PRC;
import System.PRCContact.PRCContact;
import System.PRC_GO.PRC_GO;
import System.PRC_PED.PRC_PED;
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
public class PRCProcessRequestJPanel extends JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem system;
    private UserAccount userAccount;
    private PRCContact prccontact;
    private PRC prc;
    private InRequestList inrequestList;
    private PRC_GO GOdocList;
    private PRC_PED PEDdocList;
    private ArrayList<Pregnant> pregnantArrayList;
    //private Pregnant pregnant;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PRCProcessRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, CareCenterSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount=userAccount;
        this.prccontact = system.getPRCcontactDirectory().searchContact(userAccount.getUsername());
        this.system = system;
        this.prc=system.getPRCDirectory().searchPRC(prccontact.getPrc().getName());
        this.PEDdocList=prc.getPRC_PED();
        this.GOdocList=prc.getPRC_GO();
        this.inrequestList=prc.getInrequestDirectory();
        
        
        populateTable();
    }
    
    public void populateTable(){
        pregnantArrayList = new ArrayList<>();
        DefaultTableModel model1 = (DefaultTableModel) RequestJTable.getModel();
        model1.setRowCount(0);
        if (inrequestList==null){
            Object[] row = new Object[3];
            model1.addRow(row);
        }
        else {
            for (InRequest s : inrequestList.getRequestList()) {
                if (s.getStatus().equals("Requesting")) {
                    Object[] row = new Object[3];
                    row[0] = s;
                    row[1] = s.getPrePeriod();
                    row[2] = s.getStatus();
                    model1.addRow(row);
                    pregnantArrayList.add(system.getPregnantDirectory().searchPregnant(s.getSender().getUsername()));
                }

            }
            for (InRequest s : inrequestList.getRequestList()) {
                if (!s.getStatus().equals("Requesting")) {
                    Object[] row = new Object[3];
                    row[0] = s;
                    row[1] = s.getPrePeriod();
                    row[2] = s.getStatus();
                    model1.addRow(row);
                    pregnantArrayList.add(system.getPregnantDirectory().searchPregnant(s.getSender().getUsername()));
                }

            }
        }


        DefaultTableModel model2 = (DefaultTableModel) GOJTable.getModel();
        model2.setRowCount(0);
        for(GODNurse go:GOdocList.getGODNurseList()){
            Object[] row = new Object[2];
            row[0]=go;
            row[1]=go.getStatu();
            model2.addRow(row);
        }
        
        DefaultTableModel model3 = (DefaultTableModel) PEDJTable.getModel();
        model3.setRowCount(0);
        for(BabyNurse ped:PEDdocList.getBabyNurseList()){
            Object[] row = new Object[2];
            row[0]=ped;
            row[1]=ped.getStatu();
            model3.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        RequestJTable = new JTable();
        choosePED = new JButton();
        chooseGO = new JButton();
        refreshJButton = new JButton();
        jScrollPane2 = new JScrollPane();
        GOJTable = new JTable();
        jScrollPane3 = new JScrollPane();
        PEDJTable = new JTable();
        Process_btn = new JButton();
        reject_btn = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        Submit_btn = new JButton();
        jLabel3 = new JLabel();
        Backbtn = new JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RequestJTable.setModel(new DefaultTableModel(
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
                "Request", "Pregnant Name", "Statu"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 670, 110));

        choosePED.setText("Choose BabyNurse");
        choosePED.setEnabled(false);
        choosePED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePEDActionPerformed(evt);
            }
        });
        add(choosePED, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        chooseGO.setText("Choose PRC Doctor");
        chooseGO.setEnabled(false);
        chooseGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseGOActionPerformed(evt);
            }
        });
        add(chooseGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        GOJTable.setModel(new DefaultTableModel(
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
                "PRCDoctor", "Statu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(GOJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 110));

        PEDJTable.setModel(new DefaultTableModel(
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
                "BabyNurse", "Statu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PEDJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 310, 110));

        Process_btn.setText("Process");
        Process_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Process_btnActionPerformed(evt);
            }
        });
        add(Process_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        reject_btn.setText("Reject");
        reject_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reject_btnActionPerformed(evt);
            }
        });
        add(reject_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 290, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 250, 30));

        Submit_btn.setText("Submit");
        Submit_btn.setEnabled(false);
        Submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_btnActionPerformed(evt);
            }
        });
        add(Submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 20));

        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void choosePEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePEDActionPerformed

        int selectedRow = PEDJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        
        jLabel2.setText(PEDdocList.getBabyNurseList().get(selectedRow).getName());
        
    }//GEN-LAST:event_choosePEDActionPerformed

    private void chooseGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseGOActionPerformed
        int selectedRow=GOJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        
        jLabel1.setText(GOdocList.getGODNurseList().get(selectedRow).getName());

    }//GEN-LAST:event_chooseGOActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void reject_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reject_btnActionPerformed
        // TODO add your handling code here:
        int selectedRow=RequestJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }        
        inrequestList.getRequestList().get(selectedRow).setStatus("Reject");
    }//GEN-LAST:event_reject_btnActionPerformed

    private void Process_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Process_btnActionPerformed
        // TODO add your handling code here:
        int selectedRow=RequestJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel) RequestJTable.getModel();
        if((String)model1.getValueAt(selectedRow,2)==null){
            JOptionPane.showMessageDialog(this,"no request");
            return;
        }
        
        Submit_btn.setEnabled(true);
        chooseGO.setEnabled(true);
        choosePED.setEnabled(true);
        reject_btn.setEnabled(false);
        Process_btn.setEnabled(false);
        jLabel3.setText(inrequestList.getRequestList().get(selectedRow).getSender().getUsername());
    }//GEN-LAST:event_Process_btnActionPerformed

    private void Submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_btnActionPerformed
        // TODO add your handling code.getRequestList();
        int selectedRow=RequestJTable.getSelectedRow();
        GOdocList.searchGODoc(jLabel1.getText()).setStatu("Busy");
        PEDdocList.searchPEDoc(jLabel2.getText()).setStatu("Busy");
        GOdocList.searchGODoc(jLabel1.getText()).setPregnant(pregnantArrayList.get(selectedRow));
        PEDdocList.searchPEDoc(jLabel2.getText()).setPregnant(pregnantArrayList.get(selectedRow));
        system.getUserAccountDirectory().searchUserAccount(jLabel3.getText()).getPRCinRequestList().searchPRCRequest(prc).setStatus("In prc");
        
        
        
    }//GEN-LAST:event_Submit_btnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PRCContactMain dwjp = (PRCContactMain) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton Backbtn;
    private JTable GOJTable;
    private JTable PEDJTable;
    private JButton Process_btn;
    private JTable RequestJTable;
    private JButton Submit_btn;
    private JButton chooseGO;
    private JButton choosePED;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JButton refreshJButton;
    private JButton reject_btn;
    // End of variables declaration//GEN-END:variables
}
