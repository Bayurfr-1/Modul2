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
public class UjiPrak1 {
       public static void main(String[]args){
          //membuat objek busBesar dari class Bus
         
          Prak1 busBesar = new Prak1(40);
         
          busBesar.getPenumpang(15);
          busBesar.getPenumpang(5);
          busBesar.getPenumpang(26);
          busBesar.getAverage();
       }
}

