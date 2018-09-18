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
public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen () {
        return absen;     
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAge(int newAbsen){
        absen = newAbsen;
    }
     public void setName(String newName){
        name = newName;
     }
       public void getAddress(String newAddress){
        address = newAddress;
     }
        public void setAbsen(int newAbsen){
        absen = newAbsen;
     }
}
