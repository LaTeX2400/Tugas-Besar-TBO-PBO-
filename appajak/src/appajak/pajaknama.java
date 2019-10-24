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

//Penggunaan Enkapsulasi
class pajaknama {
    private String daerah1 = "Kecamtan Lowokwaru";
    private String daerah2 = "Kecamtan Blimbing";
    private String daerah3 = "Kecamtan Klojen";
    private String daerah4 = "Kecamatan tidak terdaftar di kota malang";
    
    //method asesor
    public String setdaerah(String nik)
{
    String temp = nik.substring(4,6);
    int iTemp = Integer.parseInt(temp);
    
    if(iTemp==25)
    {
       return daerah1; 
    }
    else if(iTemp ==24)
    {
        return daerah2;
    }
    else if(iTemp == 11){
        return daerah3;
    }
    else{
        return daerah4;
    }

}
}
