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
public class pajak_penghasilan implements penghasilan {
    int kode;
    protected int gaji;
    
   
  
  
    public double hitunghasil(int hasil){
        if(hasil<=54000000){
            return 0.05;
        }else if(hasil <= 250000000){
            return 0.15;
        }else if(hasil <= 500000000){
            return 0.25;
        }else{
            return 0.5;
        }
        
    }
}
