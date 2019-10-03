/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program untuk menampilkan saldo tabungan yang sudah
 * ditambah dengan bunga per bulan selama 6 bulan berturut-turut
 */
public class PBO210118068Latihan19SaldoTabungan {

    public static int saldo = 2500000;
    public static String textSaldo;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            
            /**
             * 1. Ubah saldo ke float untuk mendapatkan nilai bunga
             * 2. Ubah kembali hasil bunga menjadi integer
             * 3. Tambahkan ke saldo
             */
            saldo = saldo + (int)((float)saldo * 0.15F);

            // ganti koma ke titik
            textSaldo = String.format("%,d", saldo).replace(',', '.');

            System.out.println("Saldo di bulan ke-"+i+" Rp."+textSaldo);
        }
    }
    
}
