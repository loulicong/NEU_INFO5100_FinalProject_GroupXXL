/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;
import userinterface.Government.GovernmentJPanel;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class GovernmentAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new GovernmentJPanel(userProcessContainer,account,business);
    }



}

