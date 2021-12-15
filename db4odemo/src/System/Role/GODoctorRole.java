/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.EcoSystem;
import System.UserAccount.UserAccount;

import javax.swing.*;

import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class GODoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
    
}
