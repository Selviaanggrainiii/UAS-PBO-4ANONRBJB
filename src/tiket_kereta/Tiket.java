/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiket_kereta;

/**
 *
 * @author Dio
 */
public class Tiket {

    int h;
    double total;

    public void Ekonomi(int i, int a) {
        if (a == 1) {
            h = 500000;
            total = h * i;

        } else if (a == 2) {
            h = 300000;
            total = h * i;

        } else if (a == 3) {
            h = 700000;
            total = h * i;

        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }
        System.out.println("Jumlah yan harus dibayar : " + total);
    }

    public void Bisnis(int i, int a) {
        if (a == 1) {
            h = 600000;
            total = h * i;

        } else if (a == 2) {
            h = 400000;
            total = h * i;

        } else if (a == 3) {
            h = 900000;
            total = h * i;

        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }
        System.out.println("Jumlah yan harus dibayar : " + total);
    }

    public void Eksekutif(int i, int a) {
        if (a == 1) {
            h = 700000;
            total = h * i;

        } else if (a == 2) {
            h = 500000;
            total = h * i;

        } else if (a == 3) {
            h = 1000000;
            total = h * i;

        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }
        System.out.println("Jumlah yan harus dibayar : " + total);
    }
    
    public void Allert(){
        System.out.println("Lakukan Pembayaran Maksimal 24 jam dari pemesanan ini");
        System.out.println("Datang Minimal 1 Jam Sebelum Keberangkatan Kereta");
    }

}
