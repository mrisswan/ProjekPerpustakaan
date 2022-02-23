/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;

/**
 *
 * @author MOKLET-2
 */
public class javaApps {
    public static void main(String[]args){
        try{
        Buku buku = new Buku();
        Petugas karyawan = new Petugas();
        Peminjaman peminjaman = new Peminjaman();
        Siswa siswa = new Siswa();
        Laporan laporan = new Laporan();
        // subclass pesan = new subclass(); Untuk menampilkan pesan 
        SubClass mukodimah = new SubClass();
        
        laporan.laporan(buku);
        laporan.laporan(siswa);
        laporan.laporan(peminjaman,buku);

        peminjaman.prosesTransaksi(siswa, peminjaman, buku);
        laporan.laporan(peminjaman,buku);
        laporan.laporan(buku);
        laporan.laporan(siswa);
        
        }catch(Exception e){
            System.out.println("Terdapat Exception! \n Info : " + e.getMessage());
        }
    }
}
