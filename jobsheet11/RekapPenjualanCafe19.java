package jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe19 {
    static Scanner sc = new Scanner(System.in);

    static void inputData(int[][] penjualan, String[] namaMenu) {
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\nMenu ke-" + (i + 1) + " (" + namaMenu[i] + ")");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Masukkan jumlah penjualan pada hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilData(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n=== REKAP PENJUALAN CAFE ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\nMenu ke-" + (i + 1) + " (" + namaMenu[i] + ")");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.println("Jumlah penjualan pada hari ke-" + (j + 1) + ": " + penjualan[i][j]);
            }
        }
    }

    static void menuTertinggi(int[][] penjualan, String[] namaMenu) {
        int indexMenuTertinggi = 0;
        int totalPenjualan = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;

            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > totalPenjualan) {
                totalPenjualan = total;
                indexMenuTertinggi = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi selama " + penjualan[0].length + " hari adalah: " + namaMenu[indexMenuTertinggi]);
        System.out.println("Total penjualan: " + totalPenjualan);
    }

    static void rataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\nRata-rata Penjualan selama " + penjualan[0].length + " hari:");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print("Menu ke-" + (i + 1) + " (" + namaMenu[i] + ") : ");

            double total = 0;

            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            double rata = total / penjualan[i].length;
            System.out.print(rata);
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah menu: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String[] namaMenu = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
        System.out.print("\nMasukkan jumlah hari penjualan\t: ");
        int m = sc.nextInt();

        int[][] penjualan = new int[n][m];

        inputData(penjualan, namaMenu);
        tampilData(penjualan, namaMenu);
        menuTertinggi(penjualan, namaMenu);
        rataPenjualan(penjualan, namaMenu);
    }
}
