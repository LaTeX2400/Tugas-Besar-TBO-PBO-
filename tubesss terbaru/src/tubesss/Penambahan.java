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
public class Penambahan implements Pajak_Daerah {
    String kota;
    int kode, luas;
    double hasil;

    public void addpajak(String kota){
        this.kota = kota;
    }
    
    public void addkode(int kode){
        this.kode = kode;
    }
    
    public int harga2(){
        
        if(kode ==1 || kode == 2){
            return 2800000;
        }else if(kode == 3|| kode == 4){
            return 3700000;
        }else if(kode == 5|| kode == 6){
            return 3900000;
        }else if(kode == 7|| kode == 8){
            return 3200000;
        }
        else
            return 4000000;
    }
    public int htg(int luas, int biaya, int luas2, int biaya2){
        double luastanah =(biaya*luas)+(luas2*biaya2);
        return (int) luastanah;
    }
     public int htg2 (int hasil2, int pjk, int pajak){
       
        double hasil = (0.005*(0.2*((hasil2 +pjk) - pajak))) ;
        return (int) hasil;
        
    }
}
