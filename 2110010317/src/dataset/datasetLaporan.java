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
public class datasetLaporan {
    private ArrayList<String> nama;
    private ArrayList<String> checkIn;
    private ArrayList<String> checkOut;
    private ArrayList<String> totalHarga;
    
    public datasetLaporan(){
        nama = new ArrayList<String>();
        checkIn = new ArrayList<String>();
        checkOut = new ArrayList<String>();
        totalHarga = new ArrayList<String>();
    }
    
    public void insertnama (String b){
        this.nama.add(b);
    }
    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
    
    public void insertcheckIn (String b){
        this.checkIn.add(b);
    }
    public ArrayList<String> getRecordcheckIn(){
        return this.checkIn;
    }
    
    public void insertcheckOut (String b){
        this.checkOut.add(b);
    }
    public ArrayList<String> getRecordCheckOut(){
        return this.checkOut;
    }
    
    public void inserttotalHarga (String b){
        this.totalHarga.add(b);
    }
    public ArrayList<String> getRecordtotalHarga(){
        return this.totalHarga;
    }
}
