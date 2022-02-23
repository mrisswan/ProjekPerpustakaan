/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;
import java.util.ArrayList;
/**
 *
 * @author MOKLET-2
 */
public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {
        this.namaSiswa.add("Siswa Satu");
        this.alamat.add("Jawa Timur");
        this.telepon.add("+62");
        this.status.add(false);


        this.namaSiswa.add("Siswa Dua");
        this.alamat.add("Jawa Tengah");
        this.telepon.add("+62");
        this.status.add(false);
    }
    
    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }
    
    public void editStatus(int idSiswa, Boolean status){
       this.status.set(idSiswa, status);
    } 

    @Override
    public void setNama(String namaSiswa){
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idSiswa){
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa){
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa){
        return this.telepon.get(idSiswa);
    } 
}
