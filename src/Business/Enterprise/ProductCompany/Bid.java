/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.ProductCompany;

import Business.Enterprise.Adpublisher.AdSpace;
import Business.UserAccount.Viewer;

/**
 *
 * @author anna
 */
public class Bid {
    private double bidPrice;
    //private Viewer viewer;
    //private AdSpace adSpace;
    
    private double genderP;
    private double maleP;
    private double femaleP;
   
    private double educationP;
    private double pschP;
    private double hschP;
    private double bechP;
    private double masterP;
    private double phdP;
 
    private double locationP;
    private double neP;
    private double nwp;
    private double seP;
    private double swP;

    private double sizeP;
    private double bigP;
    private double smallP;
    
    private double locationAdP;
    private double ulP;
    private double urP;
    private double blP;
    private double brP;

    
//    public Bid(Viewer viewer, AdSpace adSpace){
//        this.viewer = viewer;
//        this.adSpace = adSpace;
//    }
    
    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Viewer viewer, AdSpace adSpace) {
       //genderType
        if (viewer.getGender().equals(Viewer.GenderType.Male)){
           genderP = maleP;
       }
       else if(viewer.getGender().equals(Viewer.GenderType.Female)){
           genderP = femaleP;
       }
       //educationType
       if (viewer.getEducation().equals(Viewer.EducationType.PrimarySchool)){
           educationP=pschP;
       }
       else if(viewer.getEducation().equals(Viewer.EducationType.HighSchool)){
           educationP = hschP;
       }
       else if(viewer.getEducation().equals(Viewer.EducationType.Bachelor)){
           educationP = bechP;
       }
       else if(viewer.getEducation().equals(Viewer.EducationType.Master)){
           educationP = masterP;
       }
       else if(viewer.getEducation().equals(Viewer.EducationType.Phd)){
           educationP = phdP;
       }
       
       //location type
       if (viewer.getLocation().equals(Viewer.LocationType.NorthEast)){
           locationP=neP;
       }
       else if (viewer.getLocation().equals(Viewer.LocationType.NorthWest)){
           locationP=nwp;
       }
       else if (viewer.getLocation().equals(Viewer.LocationType.SouthEast)){
           locationP=seP;
       }
       else if (viewer.getLocation().equals(Viewer.LocationType.SouthWest)){
           locationP=swP;
       }
       
       //size type
       if (adSpace.getSizeType().equals(AdSpace.SizeType.Big)){
           sizeP=bigP;
       }
       else if (adSpace.getSizeType().equals(AdSpace.SizeType.Small)){
           sizeP=smallP;
       }
       
       //location ad type
      if (adSpace.getLocationType().equals(AdSpace.LocationType.UpLeft)){
           locationAdP=ulP;
       }
      else if (adSpace.getLocationType().equals(AdSpace.LocationType.UpRight)){
           locationAdP=urP;
       }
      else if (adSpace.getLocationType().equals(AdSpace.LocationType.BelowLeft)){
           locationAdP=blP;
       }
      else if (adSpace.getLocationType().equals(AdSpace.LocationType.BelowRight)){
           locationAdP=brP;
       }
       
       bidPrice = genderP + educationP + locationP + sizeP + locationAdP;
    }
    
    
    
//    public Viewer getViewer() {
//        return viewer;
//    }
//
//    public void setViewer(Viewer viewer) {
//        this.viewer = viewer;
//    }

//    public AdSpace getAdSpace() {
//        return adSpace;
//    }
//
//    public void setAdSpace(AdSpace adSpace) {
//        this.adSpace = adSpace;
//    }


    public double getGenderP() {
        return genderP;
    }

    public void setGenderP(double genderP) {
        this.genderP = genderP;
    }

    public double getMaleP() {
        return maleP;
    }

    public void setMaleP(double maleP) {
        this.maleP = maleP;
    }

    public double getFemaleP() {
        return femaleP;
    }

    public void setFemaleP(double femaleP) {
        this.femaleP = femaleP;
    }

    public double getEducationP() {
        return educationP;
    }

    public void setEducationP(double educationP) {
        this.educationP = educationP;
    }

    public double getPschP() {
        return pschP;
    }

    public void setPschP(double pschP) {
        this.pschP = pschP;
    }

    public double getHschP() {
        return hschP;
    }

    public void setHschP(double hschP) {
        this.hschP = hschP;
    }

    public double getBechP() {
        return bechP;
    }

    public void setBechP(double bechP) {
        this.bechP = bechP;
    }

    public double getMasterP() {
        return masterP;
    }

    public void setMasterP(double masterP) {
        this.masterP = masterP;
    }

    public double getPhdP() {
        return phdP;
    }

    public void setPhdP(double phdP) {
        this.phdP = phdP;
    }

    public double getLocationP() {
        return locationP;
    }

    public void setLocationP(double locationP) {
        this.locationP = locationP;
    }

    public double getNeP() {
        return neP;
    }

    public void setNeP(double neP) {
        this.neP = neP;
    }

    public double getNwp() {
        return nwp;
    }

    public void setNwp(double nwp) {
        this.nwp = nwp;
    }

    public double getSeP() {
        return seP;
    }

    public void setSeP(double seP) {
        this.seP = seP;
    }

    public double getSwP() {
        return swP;
    }

    public void setSwP(double swP) {
        this.swP = swP;
    }

    public double getSizeP() {
        return sizeP;
    }

    public void setSizeP(double sizeP) {
        this.sizeP = sizeP;
    }

    public double getBigP() {
        return bigP;
    }

    public void setBigP(double bigP) {
        this.bigP = bigP;
    }

    public double getSmallP() {
        return smallP;
    }

    public void setSmallP(double smallP) {
        this.smallP = smallP;
    }

    public double getLocationAdP() {
        return locationAdP;
    }

    public void setLocationAdP(double locationAdP) {
        this.locationAdP = locationAdP;
    }

    public double getUlP() {
        return ulP;
    }

    public void setUlP(double ulP) {
        this.ulP = ulP;
    }

    public double getUrP() {
        return urP;
    }

    public void setUrP(double urP) {
        this.urP = urP;
    }

    public double getBlP() {
        return blP;
    }

    public void setBlP(double blP) {
        this.blP = blP;
    }

    public double getBrP() {
        return brP;
    }

    public void setBrP(double brP) {
        this.brP = brP;
    }

    //     public double getBidViewerPrice() {
    //        return bidViewerPrice;
    //    }
    //
    //    public void setBidViewerPrice(Viewer viewer) {
    //        bidViewerPrice = product.genderRulePrice(viewer.getGender())+
    //                product.educationRulePrice(viewer.getEducation())+
    //                product.locationRulePrice(viewer.getLocation());
    //    }
    //
    //    public double getBidAdSpacePrice() {
    //        return bidAdSpacePrice;
    //    }
    //
    //    public void setBidAdSpacePrice(AdSpace adSpace) {
    //        bidAdSpacePrice = product.sizeRulePrice(adSpace.getSizeType())+
    //                product.locationRulePrice(adSpace.getLocationType());
    //    }
    //
    @Override
    public String toString() {
        return "Bid"  + bidPrice;
    }

    
    
}
