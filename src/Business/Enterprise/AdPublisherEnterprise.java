/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Adpublisher.AdSpace;
import Business.Enterprise.Adpublisher.AdSpaceList;
import Business.Role.AdminAdPublisherRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class AdPublisherEnterprise extends Enterprise{

    private AdSpaceList adSpaceList;
    
    
    public AdPublisherEnterprise(String name){
        super(name, EnterpriseType.AdPublisher);
        adSpaceList = new AdSpaceList();
    }

    public AdSpaceList getAdSpaceList() {
        return adSpaceList;
    }

    public void setAdSpaceList(AdSpaceList adSpaceList) {
        this.adSpaceList = adSpaceList;
    }
    
    
    public double setAdPrice(AdSpace as){
        Double price = 0.00;
         return price;
         
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminAdPublisherRole());
        return roles;   
    }
    
}
