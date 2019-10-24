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
public class pajaktujuh extends Appajak {
    //overriding method pada kelas appajak
    public int getBiaya2(String nik)
{
    String temp = nik.substring(4,6);
    int iTemp = Integer.parseInt(temp);
     if(iTemp==25)
    {
        return 1200000;
    }
    else if(iTemp == 24)
    {
        return 3700000;
    }
    else if(iTemp == 11)
    {
        return 1550000;
    }
    return 0;
}
}
