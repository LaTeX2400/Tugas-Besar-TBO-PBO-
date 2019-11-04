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
public class PajakBumi extends data_induk {
     public void setTipe(int tipe){
        this.tipe = tipe;
    }
    public String getTipe(){
   
       setTipe(tipe);
       if(tipe <= 100 ){
           return "D";
       }
       else if(tipe <= 500){
           return "C";
       }
       else if(tipe <= 1000){
           return "B";
       }
       else{
           return "A";
       }
        
    }
   
    public int getbiayapajak(){
   
        getTipe();
        if(getTipe() == "D"){
            return 88000;
        }else if(getTipe() == "C"){
           return 96000;
       }
        else if(getTipe() == "B"){
           return 110000;
       }
       else{
           return 150000;
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
     public int getbiayapajak (int luas, int harga, int pajak, int pjk){
       
        double hasil = (0.005*(0.2*((luas * harga +pjk) - pajak))) ;
        return (int) hasil;
        
    }
}
