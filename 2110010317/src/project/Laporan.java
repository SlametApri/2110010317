/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author W8
 */
public class Laporan {
    private String nama;
    private String checkIn;
    private String checkOut;
    private String totalHarga;
    
    public Laporan(){}
    
    public Laporan(String a){
        setnama(a);
    }
    
    public Laporan(String a, String b){
        setnama(a);
        setcheckIn(b);
    }
    
    public Laporan(String a, String b, String c){
        setnama(a);
        setcheckIn(b);
        setcheckOut(c);
    }
    
    public Laporan(String a, String b, String c, String d){
        setnama(a);
        setcheckIn(b);
        setcheckOut(c);
        settotalHarga(d);
        
    }
    
    public void setnama (String a){
        this.nama=a;
    }
    public String getnama(){
        return this.nama;
    }
    
    public void setcheckIn (String b){
        this.checkIn =b;
    }
    public String getcheckIn (){
        return this.checkIn ;
    }
    
    public void setcheckOut (String c){
        this.checkOut=c;
    }
    public String getcheckOut(){
        return this.checkOut;
    }
    
    public void settotalHarga (String d){
        this.totalHarga=d;
    }
    public String gettotalHarga(){
        return this.totalHarga;
    }

    public String dataLaporan(){
        return getnama()+getcheckIn()+getcheckOut()+gettotalHarga(); 
    }
    public String dataLaporan (String a,String b,String c,String d){
        setnama(a);
        setcheckIn(b);
        setcheckOut(c);
        settotalHarga(d);
        
        return getnama()+getcheckIn()+getcheckOut()+gettotalHarga();
    }
}
