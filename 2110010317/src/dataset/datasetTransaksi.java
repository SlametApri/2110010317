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
public class datasetTransaksi {
    private ArrayList<Integer> nomorKamar;
    private ArrayList<String> tipeKamar;
    private ArrayList<String> tersedia;
    private ArrayList<String> hargaSewa;
    
    public datasetTransaksi(){
        nomorKamar = new ArrayList<Integer>();
        tipeKamar = new ArrayList<String>();
        tersedia = new ArrayList<String>();
        hargaSewa = new ArrayList<String>();
    }
    
    public void insertnomorKamar (Integer a){
        this.nomorKamar.add(a);
    }
    public ArrayList<Integer> getRecordnomorKamar(){
        return this.nomorKamar;
    }
    
    public void inserttipeKamar (String a){
        this.tipeKamar.add(a);
    }
    public ArrayList<String> getRecordtipeKamar(){
        return this.tipeKamar;
    }
    
        public void inserttersedia (String a){
        this.tersedia.add(a);
    }
    public ArrayList<String> getRecordtersedia(){
        return this.tersedia;
    }
    
    public void inserthargaSewa (String a){
        this.hargaSewa.add(a);
    }
    public ArrayList<String> getRecordhargaSewa(){
        return this.hargaSewa;
    }
}
