/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Adpublisher;

import java.util.ArrayList;

/**
 *
 * @author anna
 */
public class AdSpaceList {
    private ArrayList<AdSpace> adSpaceList;

    public AdSpaceList() {
       adSpaceList = new ArrayList<>();
    }

    public ArrayList<AdSpace> getAdSpaceList() {
        return adSpaceList;
    }

    public void setAdSpaceList(ArrayList<AdSpace> adSpaceList) {
        this.adSpaceList = adSpaceList;
    }
    
    public AdSpace createAdSpace(){
        AdSpace as = new AdSpace();
        adSpaceList.add(as);
        return as;
    }
    
    public void add(AdSpace adSpace){
        adSpaceList.add(adSpace);
    }
}
