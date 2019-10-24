/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appajak;

/**
 *
 * @author user
 */
public class tarifdetail extends tarif{
    @Override
    public int getBiaya(){
        return this.biaya;
    }
    public int getBiaya(String nik)
{   int biaya = 4000000; 
    String temp = nik.substring(4,6);
    int iTemp = Integer.parseInt(temp);
     if(iTemp==25)
    {
        return 3000000;
    }
    else if(iTemp == 24)
    {
        return 3600000;
    }
    else if(iTemp == 11)
    {
        return 3200000;
    }
    return biaya;
    
}
    public double biayarr(){
        return biayareg;
    }
    public double biayarr(int biaya, int biaya2){
    double biayareg;
    biayareg = (biaya+biaya2)*0.5;
      return biayareg;
}
public double getTotalBiayaa(int tipe, int biaya, int biaya2, int tipe2)
{
    int njop =15000;
    return 0.0005*(0.2*((tipe*biaya+tipe2*biaya2)-njop));
}
}
