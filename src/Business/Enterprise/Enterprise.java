/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType{
        HOSPITAL("Hospital"),AdPublisher("Ad Publisher"),MarketPlace("Market Place"),ProductCompany("Product Company");
        
        private String type;

        private EnterpriseType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
        
        public String toString(){
            return type;
        }
    }
    
    private EnterpriseType enterpriseType;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
