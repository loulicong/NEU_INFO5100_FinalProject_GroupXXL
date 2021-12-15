/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;

import javax.swing.*;

import userinterface.HospitalContact.ProcessRequestJPanel;

/**
 *
 * @author harold
 */
public class GONurseRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new ProcessRequestJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }

}
