/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;
import userinterface.Doctor.BabyNurseJPanel;
import userinterface.PRCContactRole.PRCProcessRequestJPanel;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class BabyNurseRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new BabyNurseJPanel(userProcessContainer,account,business);
    }

    
    
}
