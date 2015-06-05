/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.ProductCompany;

import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class ProductCatalog {
    private ArrayList<Product> productcatalog;

    public ProductCatalog( ) {
        productcatalog = new ArrayList<>();
    }

    
    public ArrayList<Product> getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ArrayList<Product> productcatalog) {
        this.productcatalog = productcatalog;
    }
    
    public Product createProduct(String name, Double targetPrice, Product.ProductType ptype){
    Product p = new Product();
    productcatalog.add(p);
    p.setName(name);
    p.setTargetPrice(targetPrice);
    p.setPtype(ptype);
    int id = p.getProductID();
    p.setProductID(id+1);
    
    return p;
    
    }

    public void add(Product p) {
        productcatalog.add(p);
    }

 
    
    
    
}
