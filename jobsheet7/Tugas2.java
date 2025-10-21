package jobsheet7;
import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        int tarif = 0;
        int kendaraan = 1;

        // header
        System.out.println("========================= MENGHITUNG TOTAL PEMBAYARAN PARKIR =========================");

        // perulangan pelanggan
        while (true) {
            // meminta input jenis kendaraan
            System.out.print(
            "\nMasukkan jenis kendaraan ke-" + kendaraan +
            "\n1. Mobil" +
            "\n2. Motor" +
            "\n(pilih 0 untuk keluar)" +
            "\nSilahkan pilih jenis kendaraan (1-2)\t: ");
            jenis = sc.nextInt();

            // membersihkan buffer
            sc.nextLine();

            // validasi nilai negatif
            if (jenis < 0 || jenis > 2) {
                System.out.println("pilihan tidak valid.");
                continue;
            }

            // menentukan diskon atau tidak
            if (jenis == 1 || jenis == 2) {
                while (true) {
                    System.out.print("\nMasukkan durasi parkir (dalam jam)\t: ");
                    durasi = sc.nextInt();

                    // validasi durasi
                    if (durasi <= 0) {
                        System.out.println("Durasi tidak valid.");
                        continue;
                    }

                    // menghitung tarif
                    if (durasi > 5) {
                        tarif = 12500;
                    } else if (jenis == 1) {
                        tarif = durasi * 3000;
                    } else if (jenis == 2) {
                        tarif = durasi * 2000;
                    }
                    total += tarif;
                    break;
                }
            } else if (jenis == 0) {
                break;
            } 

            // menampilkan total yang harus dibayar
            System.out.println("\nTarif kendaraan ke-" + kendaraan + "\t\t\t: Rp " + tarif);

            // footer
            System.out.println("-----------------------------------------");

            // lanjut ke kendaraan berikutnya
            kendaraan += 1;
        }

        // menampilkan total seluruh pembelian dalam 1 hari
        System.out.println("\nTotal pembayaran parkir dalam 1 hari\t: Rp " + total);
        System.out.println("Total kendaraan yang diparkir\t\t: " + (kendaraan - 1));

        // menutup scanner
        sc.close();
    }
}