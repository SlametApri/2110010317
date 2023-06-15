/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author W8
 */
public class datasetAdminLogin {
    
    private ArrayList<String> username;
    private ArrayList<String> password;
    public datasetAdminLogin(){
        username = new ArrayList<String>();
        password = new ArrayList<String>();    
    }
    
    public void insertusername (String a){
        this.username.add(a);
    }
    public ArrayList<String> getRecordusername(){
        return this.username;
    }
    
    public void insertpassword (String a){
        this.password.add(a);
    }
    public ArrayList<String> getRecordpassword(){
        return this.password;
    }
}
