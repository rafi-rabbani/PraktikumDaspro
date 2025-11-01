package jobsheet8.tugas3;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPelanggan = 0, totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        int n = input.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Cabang " + (i + 1) + " ---");

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = input.nextInt();
            totalPelanggan += jumlahPelanggan;

            int totalItemCabang = 0;

            for (int j = 0; j < jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + (j + 1) + " memesan berapa item? ");
                int jumlahItem = input.nextInt();
                totalItemCabang += jumlahItem;

            }
            System.out.println("Cabang " + (i + 1) + ":");
            System.out.println("- Pelanggan\t: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual\t: " + totalItemCabang + " item");
            totalItem += totalItemCabang;
        }
        System.out.println("\nTotal seluruh cabang:");
        System.out.println("Pelanggan\t: " + totalPelanggan + " orang");
        System.out.println("Item terjual\t: " + totalItem + " item");
        input.close();
    }
}
