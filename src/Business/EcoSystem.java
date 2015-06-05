/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.Viewer;
import java.util.ArrayList;



/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Network> networkList;
    //private ArrayList<Viewer> viewerList;
    
    
    public static EcoSystem getInstance(){
        if (system == null){
            system = new EcoSystem();
        }
        return system;
    }

    public EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }

    public Network createAndAddNetwork(String name){
        Network network = new Network();
        network.setName(name);
        networkList.add(network);
        return network;
    }

//    public ArrayList<Viewer> getViewerList() {
//        return viewerList;
//    }
//
//    public void setViewerList(ArrayList<Viewer> viewerList) {
//        this.viewerList = viewerList;
//    }
//    
//        public Viewer createViewer(String username, String password, Role role,  
//            String fullname,int age,String address,String zipCode,
//            Viewer.GenderType gender,Viewer.EducationType education,Viewer.LocationType location){
//        Viewer viewer = new Viewer();
//        viewerList.add(viewer);
//        viewer.setUsername(username);
//        viewer.setPassword(password);
//        viewer.setRole(role);
//        viewer.setFullname(fullname);
//        viewer.setAge(age);
//        viewer.setAddress(address);
//        viewer.setZipCode(zipCode);
//        viewer.setGender(gender);
//        viewer.setEducation(education);
//        viewer.setLocation(location);  
//        return viewer;
//    }
    
}