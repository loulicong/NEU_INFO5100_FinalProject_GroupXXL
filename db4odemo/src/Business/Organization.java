/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.PEDoc.PEDocDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.InRequest.InRequestList;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private InRequestList inRequestList;
    private PEDocDirectory PEDocDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        inRequestList = new InRequestList();
        PEDocDirectory = new PEDocDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PEDocDirectory getEmployeeDirectory() {
        return PEDocDirectory;
    }
    
    public String getName() {
        return name;
    }

    public InRequestList getWorkQueue() {
        return inRequestList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(InRequestList inRequestList) {
        this.inRequestList = inRequestList;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
