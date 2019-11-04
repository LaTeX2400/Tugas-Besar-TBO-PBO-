/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesss;

/**
 *
 * @author user
 */
public class data_induk {
    String wilayah;
    public int cc;
    protected int tipe;
    protected String biaya;
    int gaji;
    int kode;
    int hasil;
    public void setTipe(int tipe){
        this.tipe = tipe;
    }
    public String getTipe(){
        return "tipe tanah adalah "+tipe;
        
    }
    public void setBiayapajak(String tipe){
        this.biaya = tipe;
    }
    public String getBiayapajak(){
        return this.biaya;
        
    }
     public int pajak(double pkb, int setsw){
        int hsl = (int) (pkb - setsw + 25000);
        return hsl;
    }
      public void setgaji(int gaji){
        this.gaji =gaji;
    }
    public int hitungpajak(){
        return hasil;
    }
    
    
    
}
