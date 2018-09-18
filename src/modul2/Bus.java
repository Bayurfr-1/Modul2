/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author win 7
 */
public class Bus {
     public int penumpang ;
    public int maxPenumpang;


    Bus(int maxPenumpang) {
       
         this.maxPenumpang = maxPenumpang;
         penumpang = 0;
    }

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>=maxPenumpang){
            System.out.println("MELEBIHI BATAS KUOTA");
            
        }else{
            this.penumpang=temp;
        }
    }
    public void cetak() {
        System.out.println("Penumpang Bus Sekarang adalah : " + penumpang);
        System.out.println("Penumpang Maksimum Seharusnya adalah : " + maxPenumpang);
    }

    void getPenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getAverage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
