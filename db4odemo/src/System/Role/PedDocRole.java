/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;
import userinterface.Doctor.PEDoctorJPanel;
import userinterface.HospitalContact.ProcessRequestJPanel;

import javax.swing.*;

/**
 *
 * @author raunak
 */
public class PedDocRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new PEDoctorJPanel(userProcessContainer,account,business);
    }



}
