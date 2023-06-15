/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W8
 */
public class Transaksi {
    private String nomorKamar;
    private String tipeKamar;
    private String tersedia;
    private String hargaSewa;

    public Transaksi(){}
    
    public Transaksi(String a){
        setnomorKamar(a);
    }
    
    public Transaksi(String a, String b){
        setnomorKamar(a);
        settipeKamar(b);
    }
    
    public Transaksi(String a, String b, String c){
        setnomorKamar(a);
        settipeKamar(b);
        settersedia(c);
    }
    
    public Transaksi(String a, String b, String c, String d){
        setnomorKamar(a);
        settipeKamar(b);
        settersedia(c);
        sethargaSewa(d);
        
    }
    
    public void setnomorKamar (String a){
        this.nomorKamar=a;
    }
    public String getnomorKamar(){
        return this.nomorKamar;
    }
    
    public void settipeKamar (String b){
        this.tipeKamar=b;
    }
    public String gettipeKamar(){
        return this.tipeKamar;
    }
    
    public void settersedia (String c){
        this.tersedia=c;
    }
    public String gettersedia(){
        return this.tersedia;
    }
    
    public void sethargaSewa (String c){
        this.hargaSewa=c;
    }
    public String gethargaSewa(){
        return this.hargaSewa;
    }

    public String dataTransaksi(){
        return getnomorKamar()+gettipeKamar()+gettersedia()+gethargaSewa(); 
    }
    public String dataTransaksi(String a,String b,String c,String d){
        setnomorKamar(a);
        settipeKamar(b);
        settersedia(c);
        sethargaSewa(d);
        
        return getnomorKamar()+gettipeKamar()+gettersedia()+gethargaSewa();
    }
}
