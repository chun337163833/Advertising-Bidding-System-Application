/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.ProductCompany.Product;
import Business.Enterprise.ProductCompany.ProductCatalog;
import Business.Role.AdminProductCompanyRole;
import Business.Role.Role;
import Business.UserAccount.Viewer;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class ProductCompanyEnterprise extends Enterprise{

    private ProductCatalog productCatalog;
    
    public ProductCompanyEnterprise(String name){
        super(name, EnterpriseType.ProductCompany);
        productCatalog = new ProductCatalog();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
   
    
    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminProductCompanyRole());
        return roles;   
    }
    
    
}
