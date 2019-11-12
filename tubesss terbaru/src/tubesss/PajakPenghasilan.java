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
public class PajakPenghasilan extends data_induk {
    public void setgaji(int gaji){
        this.gaji =gaji;
    }
    public int hitungpajak(){
        int hasil = gaji*12;
        return hasil;
    }
}
