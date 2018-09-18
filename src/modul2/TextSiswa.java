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
public class TextSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("BAYU");
     siswa.setAbsen(07);
     siswa.getAddress("MALANG");
     
     System.out.println("Nama : " + siswa.getName()
             +"Absen : " + siswa.getAbsen() + 
             "Address : "+siswa.getAddress());
        
    }
}
