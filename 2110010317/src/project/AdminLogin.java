/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W8
 */
public class AdminLogin {
    private String username;
    private String password;

    // Constructor overload
    public AdminLogin(){}
    public AdminLogin(String a){
        setusername(a);
    }
    
    public AdminLogin(String a, String b){
        setusername(a);
        setpassword(b);
    }

    // Method overload
    public void setusername (String a){
        this.username=a;
    }
    public String getusername(){
        return this.username;
    }
    
    public void setpassword (String b){
        this.password=b;
    }
    public String getpassword(){
        return this.password;
    }
     public String dataAdminLogin(){
        return getusername()+getpassword(); 
    }
    public String dataAdminLogin(String a,String b){
        setusername(a);
        setpassword(b);
        
        
        return getusername()+getpassword();
    }
    
}
