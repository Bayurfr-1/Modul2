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
 import java.lang.Math;
public class Bola {
    

   private double jarijari = 14;
   private double diameter;
   private double luas;
   private double volume;

   public void setJari(double jarijari){
   this.jarijari=jarijari;
   }
  
   public void showDiameter(){
   this.diameter=2*jarijari;
   }
  
   public void showLuas(){
   this.luas=4*Math.PI*jarijari*jarijari;
   }
  
   public void showVolume(){
   this.volume=(4*Math.PI*jarijari*jarijari*jarijari)/3;
   }
  
   public void cetak(){
   System.out.println("Jari-jari : "+jarijari+ " cm   ");
   System.out.println("______________________________ ");
   System.out.println("Diameter  : "+diameter+ " cm   ");
   System.out.println("Luas      : "+luas+" cm kuadrat");
   System.out.println("Volume    : "+volume+" cm kubik");
   }
   }








