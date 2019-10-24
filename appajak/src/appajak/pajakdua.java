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
public class pajakdua extends Appajak {


  public int biaya;


   
     
     
    @Override
  public void setNIK(String nik){
    this.nik = nik;
}

    /**
     *
     * @return
     */
public int getBiaya()
{
    return this.biaya;
}

public void settipe(int tipe)
{
    this.tipe=tipe;
}


/* Overloading */
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

public double getTotalBiaya(int tipe, int biaya)
{
    int njop =100000;
    return 0.0005*(0.2*(tipe*biaya-njop));
}
  //Override kelas appajak
  public int gettipe(){
    return this.tipe;
}
}

