package jobsheet13;

import java.util.Scanner;

public class Prestasi {
    static Scanner input = new Scanner(System.in);

    static String[][] prestasi = new String[100][5];
    static int jumlahPrestasi = 0;

    public static void main(String[] args) {
        System.out.println("\n================= PENCATATAN PRESTASI MAHASISWA ================");

        while (true) {
            int pilihan = menu();
            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    System.out.println("\nDaftar Prestasi Mahasiswa :");
                    tampilData(prestasi, jumlahPrestasi);
                    break;
                case 3:
                    cariData();
                    break;
                case 4:
                    hitungPrestasi();
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    input.close();
                    return;
                default:
                    break;
            }
        }
    }
}
