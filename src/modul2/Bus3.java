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
public class Bus3 {
      public int penumpang ;
    public int maxPenumpang;
    
  public Bus3(int maxPenumpang) {
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
    
     public void getpenumpang(int password) {
         if(password==24){
            System.out.println("PASSWORD BENAR");
        }
        else
        {
            System.out.println("PASSWORD SALAH");
        }

    /**
     *
     */
   
        
        {
         
        }
    }
    
   
       
    
   public void cetakpenumpang(){
       System.out.println("Penumpang Bus Sekarang = "+penumpang);
       System.out.println("Maksimum Penumpang yang seharusnya adalah = "+maxPenumpang);
   }
}
