/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Enterprise.AdPublisherEnterprise;
import Business.Enterprise.Adpublisher.AdSpace;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.ProductCompany.Bid;
import Business.Enterprise.ProductCompany.OldBidDirectory;
import Business.Enterprise.ProductCompany.Product;
import Business.Enterprise.ProductCompany.ProductCatalog;
import Business.Enterprise.ProductCompanyEnterprise;
import Business.Network.Network;

/**
 *
 * @author anna
 */
public class Auction {

    public static int id = 0;
    
    private int auctionID = 0;
    private ProductCatalog allBidproductCatalog = new ProductCatalog();
    private OldBidDirectory allBidDirectory = new OldBidDirectory();
    private Product winnerProduct;
    private Viewer theViewer;
    private AdSpace theadSpace;
    private ProductCompanyEnterprise theProductCompanyEnterprise;
    private AdPublisherEnterprise theAdPublisherEnterprise;

    public ProductCatalog AuctionProductCatalog(EcoSystem system, Viewer viewer, AdSpace adSpace) {
        //go throught all ProductCompany to get all Product, 
        // and save in allBidproductCatalog;
        for (Network network : system.getNetworkList()) {
            EnterpriseDirectory ed = network.getEnterpriseDirectory();
            for (Enterprise enterprise : ed.getEnterpriseList()) {
                if (enterprise instanceof ProductCompanyEnterprise) {
                    ProductCompanyEnterprise pce = (ProductCompanyEnterprise) enterprise;
                    for (Product p : pce.getProductCatalog().getProductcatalog()) {
                        allBidproductCatalog.add(p);
                    }
                }
            }
        }
        theViewer = viewer;
        theadSpace = adSpace;
        return allBidproductCatalog;
    }

    public Product findWinnerProduct(ProductCatalog productCatalog) {
        double maxBidPrice = 0.00;
        //go through allBidproductCatalog to get bid price
        for (Product p : productCatalog.getProductcatalog()) {
            if (p.getBid() != null) {
                Bid bid = p.getBid();
                bid.setBidPrice(theViewer, theadSpace);
                if (bid.getBidPrice() >= maxBidPrice) {
                    maxBidPrice = bid.getBidPrice();
                    winnerProduct = p;
                }
            }
        }
        return winnerProduct;
    }

    public int getAuctionID() {
        return auctionID;
    }

    public void setAuctionID(int auctionID) {
        this.auctionID = auctionID;
    }

    public ProductCatalog getProductCatalog() {
        return allBidproductCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.allBidproductCatalog = productCatalog;
    }

    public OldBidDirectory getBidDirectory() {
        return allBidDirectory;
    }

    public void setBidDirectory(OldBidDirectory bidDirectory) {
        this.allBidDirectory = bidDirectory;
    }

    public Product getWinnerProduct() {
        return winnerProduct;
    }

    public void setWinnerProduct(Product winnerProduct) {
        this.winnerProduct = winnerProduct;
    }

    public AdSpace getTheadSpace() {
        return theadSpace;
    }

    public void setTheadSpace(AdSpace theadSpace) {
        this.theadSpace = theadSpace;
    }

    public ProductCompanyEnterprise getTheProductCompanyEnterprise() {
        return theProductCompanyEnterprise;
    }

    public void setTheProductCompanyEnterprise(ProductCompanyEnterprise theProductCompanyEnterprise) {
        this.theProductCompanyEnterprise = theProductCompanyEnterprise;
    }

    public AdPublisherEnterprise getTheAdPublisherEnterprise() {
        return theAdPublisherEnterprise;
    }

    public void setTheAdPublisherEnterprise(AdPublisherEnterprise theAdPublisherEnterprise) {
        this.theAdPublisherEnterprise = theAdPublisherEnterprise;
    }

    

    
    
    
    @Override
    public String toString() {
        return  "auctionID=" + auctionID ;
    }
}
