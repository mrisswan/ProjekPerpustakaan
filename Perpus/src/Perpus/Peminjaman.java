/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Peminjaman {
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    
    public Peminjaman(){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
//        this.idSiswa.add(0);
//        this.idBuku.add(1);
//        this.banyak.add(3);
//        this.idSiswa.add(1);
//        this.idBuku.add(0);
//        this.banyak.add(1);
//        this.idSiswa.add(1);
//        this.idBuku.add(2);
//        this.banyak.add(2);
    }
    
    public void prosesTransaksi(Siswa siswa, Peminjaman transaksi, Buku buku){
        Scanner myObj = new Scanner(System.in);
        //int temp;
        int idSiswa;
        System.out.println("Silahkan Meminjam Buku Di Perpustakaan Online");
        
        System.out.println("Masukkan ID Siswa");
        idSiswa = myObj.nextInt();
        System.out.println("Selamat datang "+siswa.getNama(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int temp=0;
        do{ 
            System.out.println("Masukkan kode Buku :");
            temp=myObj.nextInt();
            if (temp!=99 && siswa.getStatus(idSiswa) == false){
                idBuku.add(temp);
                System.out.print(buku.getNamaBuku(idBuku.get(i))+ " sebanyak\t: ");
                banyak.add(myObj.nextInt());
                i++;         
                siswa.editStatus(idSiswa, true);   
            }else if(siswa.getStatus(idSiswa) == true){
                System.out.print(siswa.getNama(idSiswa)+" Telah meminjam!");
                break;
            }        
        }while (temp!=99);
        
        System.out.println("\nTransaksi peminjaman "+siswa.getNama(idSiswa)+" sebagai berikut:");
        System.out.println("Nama Buku \tQty \tHarga \tJumlah \t");

        int total=0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * buku.getHarga(idBuku.get(j));
            total+=jumlah;
            System.out.println(buku.getNamaBuku(idBuku.get(j))+"\t"+banyak.get(j)+"\t"+buku.getHarga(idBuku.get(j))+"\t"+ jumlah);
            transaksi.setTransaksi(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }

        System.out.println("Total sewa : "+total);
    
    }
    public void setTransaksi(Buku buku, int idSiswa, int idBuku, int banyaknya){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku)-banyaknya);
    }
    
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    } 
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    } 
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    } 
    public int getJmlTransaksi(){
        return this.idSiswa.size();
    } 
}
