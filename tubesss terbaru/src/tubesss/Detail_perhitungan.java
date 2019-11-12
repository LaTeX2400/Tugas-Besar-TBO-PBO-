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
public class Detail_perhitungan extends Perhitungan{
    public String biaya1, biaya2;

   public int getharga(int harga, double tahun, double admin){
        
        int hasil = (int) (0.015*((harga - (harga * tahun))*admin));
        return hasil;
    }
   
   public int hasilpjk(double jml, int hasil){
        int total = (int) (jml * hasil);
        return total;
    }
    
}
