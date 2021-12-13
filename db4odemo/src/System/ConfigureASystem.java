package System;

import System.PEDoc.PEDoc;
import System.Role.SystemAdminRole;
import System.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static CareCenterSystem configure(){
        
        CareCenterSystem system = CareCenterSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        

        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        
        return system;
    }
    
}
