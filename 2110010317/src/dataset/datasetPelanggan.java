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
public class datasetPelanggan {
    private ArrayList<String> nama;
    private ArrayList<String> alamat;
    private ArrayList<Integer> nomorTelepon;
    
    public datasetPelanggan(){
        nama = new ArrayList<String>();
        alamat = new ArrayList<String>();
        nomorTelepon = new ArrayList<Integer>();
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
    
    public void insertnomorTelepon (Integer a){
        this.nomorTelepon.add(a);
    }
    public ArrayList<Integer> getRecordnomorTelepon(){
        return this.nomorTelepon;
    }
    
}
