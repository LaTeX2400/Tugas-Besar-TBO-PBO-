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
public class Pajak_motor extends data_induk {
   public int setsw(){
        if(cc <= 49){
            return 0;
        }else if(cc <= 250){
            return 43000;
        }else if (cc <= 1000){
            return 88000;
        }else if (cc<=1780){
            return 150000;
        }else{
            return 203000;
        }
    } 
   public void swkj(int cc){
    this.cc=cc;        
    
    
    }
    public int pajak(double pkb, int setsw){
        int hsl = (int) (pkb + setsw + 25000);
        return hsl;
    }
}
