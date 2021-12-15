/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.EcoSystem;

import System.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class PregnantRole extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CustomerAreaJPanel(userProcessContainer,account,business);
    }
    
    
}
