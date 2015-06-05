/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 * @author anna
 */
public class Viewer extends UserAccount{
    private String fullname;
    private int age;
    private String address;
    private String zipCode;
    private GenderType gender;
    private EducationType education;
    private LocationType location;
    private double genderPrice;
    private double educationPrice;
    private double locationPrice;
    private double viewerPrice;
    
    private AuctionDirectory auctionDirectory = new AuctionDirectory();

    public AuctionDirectory getAuctionDirectory() {
        return auctionDirectory;
    }

    public void setAuctionDirectory(AuctionDirectory auctionDirectory) {
        this.auctionDirectory = auctionDirectory;
    }


    
    

    public enum GenderType{
        Male("male"),Female("femail");
        private String value;
        
        private GenderType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }  

    
    
    
     public enum EducationType{
        PrimarySchool("Primary School"),HighSchool("high school"),
        Bachelor("bachelor"),Master("master"),
        Phd("phd");      
        private String value;
        
        private EducationType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    } 
    public enum LocationType{
        NorthEast("Primary School"),NorthWest("high school"),
        SouthEast("bachelor"),SouthWest("master");      
        private String value;
        
        private LocationType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public EducationType getEducation() {
        return education;
    }

    public void setEducation(EducationType education) {
        this.education = education;
    }

    public LocationType getLocation() {
        return location;
    }

    public void setLocation(LocationType location) {
        this.location = location;
    }


    

   
    
}
