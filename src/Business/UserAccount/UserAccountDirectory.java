/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    private ArrayList<Viewer> viewerList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
        viewerList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public ArrayList<Viewer> getViewerList(){
//        for (UserAccount ua : userAccountList){
//            if (ua instanceof Viewer){
//                viewerList.add((Viewer) ua);
//            }
//        }
        return viewerList;
    }
    
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public Viewer createViewer(String username, String password, Role role,  
            String fullname,int age,String address,String zipCode,
            Viewer.GenderType gender,Viewer.EducationType education,Viewer.LocationType location){
        Viewer viewer = new Viewer();
        
        viewer.setUsername(username);
        viewer.setPassword(password);
        viewer.setRole(role);
        viewer.setFullname(fullname);
        viewer.setAge(age);
        viewer.setAddress(address);
        viewer.setZipCode(zipCode);
        viewer.setGender(gender);
        viewer.setEducation(education);
        viewer.setLocation(location);  
        userAccountList.add(viewer);
        viewerList.add(viewer);
        return viewer;
    }
    

}
