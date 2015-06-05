/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raunak
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
    System.out.print(system.getUserAccountDirectory().getViewerList());
        Employee employee = new Employee();
        employee.setName("Raunak Agarwal");
        
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setEmployee(employee);
        userAccount.setRole(new SystemAdminRole());

        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        
        
        return system;
    }
    
}
