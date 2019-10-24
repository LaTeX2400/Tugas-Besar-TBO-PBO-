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
public class pajaktiga extends Appajak {
  protected String daerah;
  private int tipe2;
  protected int kode;

    //Melakukan overriding method pada kelas appajak
  public void setNIK(String nik){
    super.nik = nik;
}
//merupakan method asesor
public void settipe(int tipe)
{
    super.tipe=tipe;
}
//menggunakan keyword this
//merupakan method mutator
public void settipe2(int tipe2)
{
    this.tipe2=tipe2;
}

//Melakukan overriding method pada kelas appajak
public int getBiaya(String nik)
{
    String temp = nik.substring(4,6);
    int iTemp = Integer.parseInt(temp);
     if(iTemp==25)
    {
        return 1000000;
    }
    else if(iTemp == 24)
    {
        return 3600000;
    }
    else if(iTemp == 11)
    {
        return 1000000;
    }
    return 0;
    
}
//Melakukan overriding method pada kelas appajak
public int getBiaya2(String nik)
{
    String temp = nik.substring(4,6);
    int iTemp = Integer.parseInt(temp);
     if(iTemp==25)
    {
        return 1000000;
    }
    else if(iTemp == 24)
    {
        return 3650000;
    }
    else if(iTemp == 11)
    {
        return 1000000;
    }
    return 0;
    
}
//Melakukan overriding method pada kelas appajak
public int gettipe(){
    return super.tipe;
}
//Melakukan overloading pada method gettip.
public int gettipe(int tipe){
    super.tipe = tipe;
    return tipe;
}
//merupakan method asesor
public int gettipe2(){
    return this.tipe2;
}
}

