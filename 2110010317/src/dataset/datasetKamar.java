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
public class datasetKamar {
    
    private ArrayList<Integer> nomorKamar;
    private ArrayList<String> tipeKamar;
    private ArrayList<String> hargaSewa;
        
    public datasetKamar(){
    
        nomorKamar = new ArrayList<Integer>();
        tipeKamar = new ArrayList<String>();
        hargaSewa = new ArrayList<String>();
        
    }
    
    public void insertnomorKamar(Integer isi){
        this.nomorKamar.add(isi);
    }
    public ArrayList<Integer> getRecordnomorKamar(){
        return this.nomorKamar;
    }
    
    public void inserttipeKamar(String isi){
        this.tipeKamar.add(isi);
    }
    public ArrayList<String> getRecordtipeKamar(){
        return this.tipeKamar;
    }
    
    public void inserthargaSewa (String isi){
        this.hargaSewa.add(isi);
    }
    public ArrayList<String> getRecordhargaSewa(){
        return this.hargaSewa;
    }
    
    
}
