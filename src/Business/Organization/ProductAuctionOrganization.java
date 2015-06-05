/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProductAcutioneerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class ProductAuctionOrganization extends Organization{

    public ProductAuctionOrganization(){
        super(Organization.Type.ProductAuction.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProductAcutioneerRole());
        return roles;      
    }
    
}
