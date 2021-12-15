/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import System.Role.PregnantRole;
import System.Role.Role;
import System.UserAccount.UserAccount;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import userinterface.CityCommunity.CityJPanel;
import System.CareCenterSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author raunak
 */
public class RegisterJPanel extends JPanel {

    private JPanel userProcessContainer;
    
    private CareCenterSystem system;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RegisterJPanel(JPanel userProcessContainer, CareCenterSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        
        this.system = system;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        nameJLabel = new JLabel();
        nameJTextField =new JTextField();
        submitJButton = new JButton();
        usernameJLabel = new JLabel();
        usernameJTextField = new JTextField();
        backJButton = new JButton();
        passwordJLabel = new JLabel();
        passwordAgainJLabel = new JLabel();
        passwordAgainJTextField = new JPasswordField();
        passwordJTextField = new JPasswordField();

        setLayout(new AbsoluteLayout());

        submitJButton.setText("submit");
        submitJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new AbsoluteConstraints(215, 238, -1, -1));

        passwordJLabel.setText("password");
        add(passwordJLabel, new AbsoluteConstraints(96, 90, -1, -1));
        add(passwordJTextField, new AbsoluteConstraints(180, 87, 89, -1));

        passwordAgainJLabel.setText("password again");
        add(passwordAgainJLabel, new AbsoluteConstraints(96, 140, -1, -1));
        add(passwordAgainJTextField, new AbsoluteConstraints(180, 137, 89, -1));

        nameJLabel.setText("name");
        add(nameJLabel, new AbsoluteConstraints(96, 190, -1, -1));
        add(nameJTextField, new AbsoluteConstraints(180, 187, 89, -1));

        usernameJLabel.setText("username");
        add(usernameJLabel, new AbsoluteConstraints(96, 40, -1, -1));
        add(usernameJTextField, new AbsoluteConstraints(180, 37, 89, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new AbsoluteConstraints(69, 238, -1, -1));

    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        if(usernameJTextField.getText().equals("")||nameJTextField.getText().equals("")||passwordJTextField.getPassword().equals("")||passwordAgainJTextField.getPassword().equals("")){
            JOptionPane.showMessageDialog(this,"have empty input");
            return;
        }
        if(!passwordJTextField.getText().equals(passwordAgainJTextField.getText())){
            JOptionPane.showMessageDialog(this,"the two input password are not same");
            return;
        }
        String username = usernameJTextField.getText();
        String name = nameJTextField.getText();
        String password = passwordJTextField.getText();
        JOptionPane.showMessageDialog(this,"text changed");
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        Role role = new PregnantRole();
        userAccount.setRole(role);
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        system.getUserDirectory().createCustomer(username,name);
        passwordJTextField.setText("");
        passwordAgainJTextField.setText("");
        usernameJTextField.setText("");
        nameJTextField.setText("");
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CityJPanel dwjp = (CityJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton backJButton;
    private JLabel usernameJLabel;
    private JTextField usernameJTextField;
    private JLabel passwordJLabel;
    private JPasswordField passwordJTextField;
    private JLabel passwordAgainJLabel;
    private JPasswordField passwordAgainJTextField;
    private JLabel nameJLabel;
    private JTextField nameJTextField;
    private JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
