/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CityCommunity;

import System.CareCenterSystem;
import System.City.City;
import System.Community.Community;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author raunak
 */
public class CommunityJPanel extends JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem business;
    private City city;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CommunityJPanel(JPanel userProcessContainer, City city, CareCenterSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.city = city;
        this.business= business;
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model_1 = (DefaultTableModel) communityJTable.getModel();
        model_1.setRowCount(0);
        for(Community s:city.getCommunityArrayList()){
            Object[] row = new Object[1];
            row[0]=s.getName();
            model_1.addRow(row);
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

        backJButton = new JButton();
        jScrollPane2 = new JScrollPane();
        communityJTable = new JTable();
        refreshTestJButton = new JButton();
        saveJButton = new JButton();
        communityJLabel = new JLabel();
        communityJTextfield = new JTextField();
        addJButton = new JButton();


        setLayout(new AbsoluteLayout());

        communityJTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String [] {
                        "community"
                }
        ) {
            Class[] types = new Class [] {
                    String.class
            };
            boolean[] canEdit = new boolean [] {
                    true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(communityJTable);
        if (communityJTable.getColumnModel().getColumnCount() > 0) {
            communityJTable.getColumnModel().getColumn(0).setResizable(false);
        }
        add(jScrollPane2, new AbsoluteConstraints(40, 58, 375, 96));

        addJButton.setText("add");
        addJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton,new AbsoluteConstraints(150, 415, -1, -1));
        add(communityJLabel,new AbsoluteConstraints(50, 315, -1, -1));
        add(communityJTextfield,new AbsoluteConstraints(150, 315, 375, 30));
        communityJLabel.setText("community name");
        saveJButton.setText("save");
        saveJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton,new AbsoluteConstraints(50, 215, -1, -1));



        backJButton.setText("back");
        backJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton,new AbsoluteConstraints(100, 215, -1, -1));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new AbsoluteConstraints(150, 215, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CityJPanel dwjp = (CityJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(communityJTextfield.getText().equals("")){
            JOptionPane.showMessageDialog(this,"empty input");
            return;
        }
        String name= communityJTextfield.getText();
        for(int i=0;i<name.length();i++){
            if(Character.isDigit(name.charAt(i))){
                JOptionPane.showMessageDialog(this,"wrong input");
                return;
            }
        }
        Community community = new Community(name);
        city.getCommunityArrayList().add(community);
        JOptionPane.showMessageDialog(this,"success input");
        communityJTextfield.setText("");
        populateRequestTable();
    }

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)communityJTable.getModel();
        for(int i = 0; i<model.getRowCount(); i++) {
            city.getCommunityArrayList().get(i).setName((String) model.getValueAt(i,0));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable communityJTable;
    private JButton refreshTestJButton;
    private JButton saveJButton;
    private JTextField communityJTextfield;
    private JLabel communityJLabel;
    private JButton addJButton;

    // End of variables declaration//GEN-END:variables
}
