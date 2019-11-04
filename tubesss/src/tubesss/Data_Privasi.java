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
public class Data_Privasi {
   private String nik;
   private int tahun;
   private String b, zonk;
   private int kode;   
   private String nama;
    public void setWilayah(String nik){
        this.nik = nik;
    }
     public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return this.nama;
    }


    public String getWilayah(){
       
       String temp = nik.substring(2,4);
    int iTemp = Integer.parseInt(temp);
    
    if(iTemp==74 || iTemp == 13)
    {
       return "Probolinggo"; 
    }
    else if(iTemp==75 || iTemp == 14)
    {
       return "Pasuruan"; 
    }
    else if(iTemp==73 || iTemp == 07)
    {
       return "Malang"; 
    }
     else if(iTemp==71 || iTemp == 06)
    {
       return "Kediri"; 
    }
    else if(iTemp==78)
    {
       return "Surabaya"; 
    }
     else if(iTemp==15)
    {
       return "Sidoarjo"; 
    }
      else if(iTemp == 8)
    {
       return "Lumajang"; 
    }
      else if(iTemp == 9)
    {
       return "Jember"; 
    }
    else{
        return"Tidak dapat terdeteksi";
    }
    }
    public void addkode(int kode){
        this.kode = kode;
    }
     public int getkodeharga(){
        
        if(kode ==1){
            return 2000000;
        }
        else if(kode ==2){
            return 1900000;
        }
        else if(kode ==3){
            return 1800000;
        }else if(kode == 4){
            return 1850000;
        }else if(kode == 5){
            return 1950000;
        }else if(kode ==6){
            return 1830000;
        }else if(kode == 7){
            return 1880000;
        }else if(kode == 8){
            return 1920000;
        }
        else 
            return 2100000;
    }
     public void settahun(int tahun){
        this.tahun = tahun;
    }
    public double gettahun(){
        settahun(tahun);
        if(tahun <= 2019){
            return 0.19; 
        }else if(tahun<= 2016){
            return 0.14;
        }else if(tahun <= 2010){
            return 0.09;
        }else{
            return 0.05;
        }
    }
}
