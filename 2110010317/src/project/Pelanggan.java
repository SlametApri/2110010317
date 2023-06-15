/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W8
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelepon;

   public Pelanggan(){}
    
    public Pelanggan(String a){
        setnama(a);
    }
    
    public Pelanggan(String a, String b){
        setnama(a);
        setalamat(b);
    }
    
    public Pelanggan(String a, String b, String c){
        setnama(a);
        setalamat(b);
        setnomorTelepon(c);
    }
     public void setnama (String a){
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
    
    public void setnomorTelepon (String c){
        this.nomorTelepon=c;
    }
    public String getnomorTelepon(){
        return this.nomorTelepon;
    }
    public String dataPelanggan(){
        return getnama()+getalamat()+getnomorTelepon(); 
    }
    public String dataPelanggan(String a, String b, String c){
        setnama(a);
        setalamat(b);
        setnomorTelepon(c);
        
        return getnama()+getalamat()+getnomorTelepon();
    }
    
}
