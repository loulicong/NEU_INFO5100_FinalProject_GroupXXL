/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CityCommunity;

import System.CareCenterSystem;

import System.City.City;
import System.Government.Government;
import System.Role.GovernmentAdmin;
import System.Role.Role;
import System.UserAccount.UserAccount;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CityJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem business;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CityJPanel(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business= business;
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model_1 = (DefaultTableModel) cityJTable.getModel();
        model_1.setRowCount(0);
        for(City s:business.getCityList().getCityArrayList()){
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

        enterJButton = new JButton();
        jScrollPane2 = new JScrollPane();
        cityJTable = new JTable();
        refreshTestJButton = new JButton();
        saveJButton = new JButton();
        cityJTable = new JTable();
        cityJTextfield = new JTextField();
        cityLabel = new JLabel();
        cityJTextfield = new JTextField();
        addJButton = new JButton();
        passwordJLabel = new JLabel();
        passwordJTextfield = new JTextField();


        setLayout(new AbsoluteLayout());

        cityJTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null},
                        {null},
                        {null},
                        {null}
                },
                new String [] {
                        "city"
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
        jScrollPane2.setViewportView(cityJTable);
        if (cityJTable.getColumnModel().getColumnCount() > 0) {
            cityJTable.getColumnModel().getColumn(0).setResizable(false);
        }
        add(jScrollPane2, new AbsoluteConstraints(40, 58, 375, 96));

        addJButton.setText("add");
        addJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton,new AbsoluteConstraints(150, 465, -1, -1));
        add(cityLabel,new AbsoluteConstraints(50, 315, -1, -1));
        add(cityJTextfield,new AbsoluteConstraints(150, 315, 375, 30));
        cityLabel.setText("city name(username)");

        add(passwordJLabel,new AbsoluteConstraints(50, 365, -1, -1));
        add(passwordJTextfield,new AbsoluteConstraints(150, 365, 375, 30));
        passwordJLabel.setText("password");

        saveJButton.setText("save");
        saveJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton,new AbsoluteConstraints(50, 215, -1, -1));

        enterJButton.setText("enter");
        enterJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                enterJButtonActionPerformed(evt);
            }
        });
        add(enterJButton,new AbsoluteConstraints(100, 215, -1, -1));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new AbsoluteConstraints(150, 215, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void enterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        int selectedRow = cityJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"please select a city");
            return;
        }
        City city= business.getCityList().getCityArrayList().get(selectedRow);
        CommunityJPanel s= new CommunityJPanel(userProcessContainer,city,business);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(s);
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(cityJTextfield.getText().equals("")||passwordJTextfield.equals("")){
            JOptionPane.showMessageDialog(this,"empty input");
            return;
        }
        String password = passwordJTextfield.getText();
        String name= cityJTextfield.getText();
        for(int i=0;i<name.length();i++){
            if(Character.isDigit(name.charAt(i))){
                JOptionPane.showMessageDialog(this,"wrong input");
                return;
            }
        }
        City city = new City(name);
        Role role = new GovernmentAdmin();
        Government government = new Government();
        government.setCity(city);
        government.setUsername(name);
        business.getCityList().getCityArrayList().add(city);
        business.getUserAccountDirectory().createUserAccount(name,password,role);
        JOptionPane.showMessageDialog(this,"success input");
        cityJTextfield.setText("");
    }


    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) cityJTable.getModel();
        for(int i = 0; i<model.getRowCount(); i++) {
            business.getCityList().getCityArrayList().get(i).setName((String) model.getValueAt(i,0));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable cityJTable;
    private JButton refreshTestJButton;
    private JButton saveJButton;
    private JLabel cityLabel;
    private JTextField cityJTextfield;
    private JLabel passwordJLabel;
    private JTextField passwordJTextfield;
    private JButton addJButton;
    // End of variables declaration//GEN-END:variables
}