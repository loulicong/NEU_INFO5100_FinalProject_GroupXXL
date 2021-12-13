/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;
import userinterface.Government.GovernmentFacultyJPanel;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class PRCAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new GovernmentFacultyJPanel(userProcessContainer,account,business);
    }



}
