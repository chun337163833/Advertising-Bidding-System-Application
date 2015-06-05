/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ViewerRole.ViewerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author anna
 */
public class ViewerRole extends Role{

   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
     //return new ViewerWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
       return new ViewerWorkAreaJPanel(userProcessContainer,system,account);
    }
    
}
