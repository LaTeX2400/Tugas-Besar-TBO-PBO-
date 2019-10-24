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

//Penggunaan Inheritance dan Polymorphism
public class Appajak {
 protected String nik;
 protected int tipe;
 
    //Menggunakan this untuk menyatakan objek sekarang
    public void setNIK(String nik)
    {
        this.nik = nik;
    }
   //Menggunakan this untuk menyatakan objek sekarang
    public String getNIK(){
        return this.nik;
    }
   //Menggunakan this untuk menyatakan objek sekarang
    public int gettipe(){
        return this.tipe;
    }
     public int getBiaya(String nik)
    {
    return 0;
    }
    public int getBiaya2(String nik)
    {
    return 0;
    }
}
