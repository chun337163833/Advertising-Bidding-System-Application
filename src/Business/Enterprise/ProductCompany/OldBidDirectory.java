/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.ProductCompany;

import Business.Enterprise.Adpublisher.AdSpace;
import Business.UserAccount.Viewer;
import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class OldBidDirectory {
    private ArrayList<Bid> bidList;
    
    public OldBidDirectory(){
        bidList = new ArrayList<>();
    }

    public ArrayList<Bid> getBidList() {
        return bidList;
    }

    public void setBidList(ArrayList<Bid> bidList) {
        this.bidList = bidList;
    }
    
    public Bid createBid(Viewer viewer, AdSpace adSpace){
    Bid bid = new Bid();
    bid.setBidPrice(viewer, adSpace);
    bidList.add(bid);
    return bid;
    }
    
    public void add(Bid b){
        bidList.add(b);
    }
    
}
