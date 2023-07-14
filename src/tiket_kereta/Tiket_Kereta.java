/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiket_kereta;

/**
 *
 * @author Dio
 */
import java.util.Scanner;

public class Tiket_Kereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Tiket T = new Tiket();

        int JT, PT;
        System.out.println("TIKET KERETA API UHUY");
        System.out.println("");
        System.out.println("Pilih Kelas");
        System.out.println("1. Ekonomi");
        System.out.println("2. Bisnis");
        System.out.println("3. Eksekutif");
        System.out.print("Masukkan Pilihan : ");
        int kategori = k.nextInt();
        System.out.println("");

        if (kategori == 1) {
            System.out.println("Kelas Ekonomi");
            System.out.println("");
            System.out.println("Pilih Tujuan");
            System.out.println("1. Surabay - Jakarta");
            System.out.println("2. Banyuwangi - Malang");
            System.out.println("3. Cirebon - Yogyakarta");
            System.out.print("Masukkan Pilihan : ");
            PT = k.nextInt();
            System.out.println("");
            System.out.print("Masukkan Jumlah Tiket : ");
            JT = k.nextInt();
            System.out.println("");
            T.Ekonomi(JT, PT);
            T.Allert();
        } else if (kategori == 2) {
            System.out.println("Kelas Bisnis");
            System.out.println("");
            System.out.println("Pilih Tujuan");
            System.out.println("1. Surabay - Jakarta");
            System.out.println("2. Banyuwangi - Malang");
            System.out.println("3. Cirebon - Yogyakarta");
            System.out.print("Masukkan Pilihan : ");
            PT = k.nextInt();
            System.out.println("");
            System.out.print("Masukkan Jumlah Tiket : ");
            JT = k.nextInt();
            System.out.println("");
            T.Bisnis(JT, PT);
            T.Allert();
        } else if (kategori == 3) {
            System.out.println("Kelas Eksekutif");
            System.out.println("");
            System.out.println("Pilih Tujuan");
            System.out.println("1. Surabay - Jakarta");
            System.out.println("2. Banyuwangi - Malang");
            System.out.println("3. Cirebon - Yogyakarta");
            System.out.print("Masukkan Pilihan : ");
            PT = k.nextInt();
            System.out.println("");
            System.out.print("Masukkan Jumlah Tiket : ");
            JT = k.nextInt();
            System.out.println("");
            T.Eksekutif(JT, PT);
            T.Allert();
        } else {
            System.out.println("Pilihan Tidak ada di Daftar");
        }

    }

}
