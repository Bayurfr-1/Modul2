/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author win 7
 */
public class Prak1 {
    

     private int penumpang;
        private int maxPenumpang;
        private int password;
       
        public static String bacainputan() {
        String baca= " ";
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader buf = new BufferedReader (input);
       
        try { baca = buf.readLine();}
        catch ( IOException e ) { System.out.println("Error!"); }
        return baca;
        }
       
        //konstruktor kelas Bus
        public Prak1(int maxPenumpang) {
            this.maxPenumpang = maxPenumpang;
            penumpang = 0;
        }
       
        public void getAverage(){
            float x = penumpang/4;
            System.out.println("Rata-ratanya adalah : "+x);
        }
       
        public void cetak() {
            System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
            System.out.println("Penumpang maksimum  "+maxPenumpang);
        }
       
        public void getPenumpang(int a){
            System.out.println("Enter Password");
            password=Integer.parseInt(bacainputan());
            if (password==546) {
                  System.out.println("Datanya adalah : ");
                  addPenumpang(a);
                  cetak();
            }
            else { System.out.println("Password salah "); }
        }
       
        public void addPenumpang (int penumpang) {
            int temp;
            temp = this.penumpang+penumpang;
            if (temp >= maxPenumpang) { System.out.println("Penumpang Melebihi kuota"); }
            else { this.penumpang = temp ; }
        }
}

