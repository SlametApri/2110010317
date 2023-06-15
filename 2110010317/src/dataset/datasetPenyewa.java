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
public class datasetPenyewa {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<Integer> noTelepon;
    private ArrayList<String> email;
    
    public datasetPenyewa(){
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        noTelepon = new ArrayList<Integer>();
        email = new ArrayList<String>();
    }
    
    public void insertnama (String a){
        this.nama.add(a);
    }
    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
    
    public void insertalamat (String a){
        this.alamat.add(a);
    }
    public ArrayList<String> getRecordalamat(){
        return this.alamat;
    }
    
    public void insertnoTelepon (Integer a){
        this.noTelepon.add(a);
    }
    public ArrayList<Integer> getRecordnoTeleepon(){
        return this.noTelepon;
    }
    
    public void insertemail (String a){
        this.email.add(a);
    }
    public ArrayList<String> getRecordemail(){
        return this.email;
    }
}
