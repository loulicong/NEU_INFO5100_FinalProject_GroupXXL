/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.EcoSystem;

import System.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer,account,business);
    }

    
    
}
