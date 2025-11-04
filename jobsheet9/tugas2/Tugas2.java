package jobsheet9.tugas2;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = input.nextInt();
        input.nextLine();
        System.out.println();

        String[] nama = new String[jumlah];
        int[] harga = new int[jumlah];
        int totalHarga = 0;

        for (int i = 0; i < harga.length; i++) {
            System.out.print("Masukkan nama pesanan anda : ");
            String namaPesanan = input.nextLine();
            nama[i] = namaPesanan;

            System.out.print("Harga : ");
            int hargaPesanan = input.nextInt();
            input.nextLine();
            harga[i] = hargaPesanan;

            totalHarga += hargaPesanan;
        }

        System.out.println("\n=========================================");
        System.out.println("\nkamu memesan :");
        for (int i = 0; i < harga.length; i++) {
            System.out.println(nama[i] + "\t: Rp " + harga[i]);
        }
        System.out.println("\nTotal harga keseluruhan : Rp " + totalHarga);

        input.close();
    }
}
