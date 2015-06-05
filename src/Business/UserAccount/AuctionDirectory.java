/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Enterprise.Adpublisher.AdSpace;
import Business.Enterprise.ProductCompany.Product;
import Business.Enterprise.ProductCompany.ProductCatalog;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class AuctionDirectory {
    private ArrayList<Auction> auctionDirectory;

    public AuctionDirectory(){
    auctionDirectory = new ArrayList<>();
    }
    
    public ArrayList<Auction> getAuctionDirectory() {
        return auctionDirectory;
    }

    public void setAuctionDirectory(ArrayList<Auction> auctionDirectory) {
        this.auctionDirectory = auctionDirectory;
    }
    
    public Auction createAuctionandFindWinnerProduct(EcoSystem system,Viewer viewer, AdSpace adSpace){
        Auction auction = new Auction();
        
        //int id = auction.getAuctionID();
        int id = Auction.id;
        Auction.id = id + 1;
        auction.setAuctionID(id);
        
        ProductCatalog pc = auction.AuctionProductCatalog(system,viewer, adSpace);
        
        Product winnerP = auction.findWinnerProduct(pc);
        auction.setWinnerProduct(winnerP);
        
        auctionDirectory.add(auction);
        return auction;
    }
    
}
