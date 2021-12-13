/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;
import userinterface.Government.GovernmentFacultyJPanel;
import userinterface.HospitalContact.HospitalContactMain;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new HospitalContactMain(userProcessContainer,account,business);
    }



}
