/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W8
 */
public class Penyewa {
    private String nama;
    private String alamat;
    private String noTelepon;
    private String email;

    public Penyewa(){}
    
    public Penyewa(String a){
        setnama(a);
    }
    
    public Penyewa(String a, String b){
        setnama(a);
        setalamat(b);
    }
    
    public Penyewa(String a, String b, String c){
        setnama(a);
        setalamat(b);
        setnoTelepon(c);
    }
    
    public Penyewa(String a, String b, String c, String d){
        setnama(a);
        setalamat(b);
        setnoTelepon(c);
        setemail(d);
        
    }
    
    public void setnama(String a){
        this.nama=a;
    }
    public String getnama(){
        return this.nama;
    }
    
    public void setalamat (String b){
        this.alamat=b;
    }
    public String getalamat(){
        return this.alamat;
    }
    
    public void setnoTelepon (String c){
        this.noTelepon=c;
    }
    public String getnoTelepon(){
        return this.noTelepon;
    }
    
    public void setemail (String c){
        this.email=c;
    }
    public String getemail(){
        return this.email;
    }

    public String dataPenyewa(){
        return getnama()+getalamat()+getnoTelepon()+getemail(); 
    }
    public String dataPenyewa(String a,String b,String c,String d){
        setnama(a);
        setalamat(b);
        setnoTelepon(c);
        setemail(d);
        
        return getnama()+getalamat()+getnoTelepon()+getemail();
    }}
