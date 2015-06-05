/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Adpublisher;

import Business.Enterprise.ProductCompany.Product;

/**
 *
 * @author anna
 */
public class AdSpace {
    private String name;
    private SizeType sizeType;
    private LocationType locationType;
    private double basePrice;
    private Product product;
    
    public enum SizeType{
        Big("Big Size"), Small("Small Size");
        private String value;
        
        private SizeType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }     
    }
    public enum LocationType{
        UpLeft("up left"), UpRight("up right "),
        BelowLeft("below left"), BelowRight("below right");
        private String value;
        
        private LocationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        } 
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SizeType getSizeType() {
        return sizeType;
    }

    public void setSizeType(SizeType sizeType) {
        this.sizeType = sizeType;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
 
    
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
