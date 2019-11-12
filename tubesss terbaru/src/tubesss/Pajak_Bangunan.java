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
public class Pajak_Bangunan  extends data_induk{
     public void setTipe(int tipe){
        this.tipe = tipe;
    }
    public String getTipe(){
   
       setTipe(tipe);
       if(tipe <= 36){
           return "D";
       }
       else if(tipe <= 72){
           return "C";
       }
       else if(tipe <= 120){
           return "B";
       }
       else{
           return "A";
       }
        
    }
    
    public int getbiayapajak(){
   
        getTipe();
        if(getTipe() == "D"){
            return 96000;
        }else if(getTipe() == "C"){
           return 105000;
       }
        else if(getTipe() == "B"){
           return 118000;
       }
       else{
           return 180000;
       }
    }
     public void addkode(int kode){
        this.kode = kode;
    }
    public int getkodeharga(){
        
        if(kode ==1){
            return 2200000;
        }
        else if(kode ==2){
            return 2100000;
        }
        else if(kode ==3){
            return 2000000;
        }else if(kode ==4){
            return 2000000;
        }
        else if(kode ==5){
            return 2000000;
        } else if(kode ==6){
            return 2000000;
        }
        else if(kode ==7){
            return 2000000;
        }else if(kode ==8){
            return 1980000;
        }
        else
            return 2400000;
    }

   
 
}
