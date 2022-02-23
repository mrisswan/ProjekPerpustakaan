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
public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku(){//mengisi ke array list
        this.namaBuku.add("Buku satu");
        //setNamaBuku("Buku satu");
        this.stok.add(10);
        this.harga.add(1000);
        this.namaBuku.add("Buku dua");
        this.stok.add(20);
        this.harga.add(2000);
        this.namaBuku.add("Buku tiga");
        this.stok.add(30);
        this.harga.add(3000);
    }

    public int getJmlBuku(){
        return this.namaBuku.size();
    }
    
    //sama saja input 2x jika dipangggil di main class
    
    //this dlm 1 class
    //tanpa this dlm method
    public void setNamaBuku(String namaBuku){//menerima inputan(argumen)
        this.namaBuku.add(namaBuku);//menambahkan ke array list namaBuku
    }
    // setNamaBuku("psikologi");
    // namaBuku = "psikologi";
    // this.namaBuku (ArrayList) .add (tambah) (namaBuku = "psikologi")
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    } 

    public void setStok(int stok ){
        this.stok.add(stok);
    }
    
    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    } 
    
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);
    } 
    
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    } 
}
