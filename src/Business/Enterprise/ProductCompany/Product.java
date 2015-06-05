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
public class Product {
 
    private String name;
    private double targetPrice;
    private int productID =0;
    //private int price; 
    private ProductType ptype;
    //private BidDirectory bidDirectory;
    private Bid bid;
    
    public Product(){
        productID++;
        //bidDirectory = new BidDirectory();
    }
    public enum ProductType{
        Food("Product Financer"),
        Drink("customer"),
       Book("book"),
       Health("health"),
       Toy("toy");

        private String value;
        private ProductType(String value){
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

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

   
    public ProductType getPtype() {
        return ptype;
    }

    public void setPtype(ProductType ptype) {
        this.ptype = ptype;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    
    public Bid createBid(){
        Bid bid = new Bid();
        this.bid = bid;
        return bid;
    }
//    public BidDirectory getBidDirectory() {
//        return bidDirectory;
//    }
//
//    public void setBidDirectory(BidDirectory bidDirectory) {
//        this.bidDirectory = bidDirectory;
//    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
}
