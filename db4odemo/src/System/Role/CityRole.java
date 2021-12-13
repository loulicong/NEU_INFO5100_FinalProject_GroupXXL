package System.Role;

import System.CareCenterSystem;
import System.UserAccount.UserAccount;

import javax.swing.*;

import userinterface.CityCommunity.CityJPanel;


public class CityRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, CareCenterSystem business) {
        return new CityJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }

}
