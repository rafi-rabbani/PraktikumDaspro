package jobsheet13;

import java.util.Scanner;

public class Prestasi {
    static Scanner input = new Scanner(System.in);

    static String[][] prestasi = new String[100][5];
    static int jumlahPrestasi = 0;

    static int menu() {
            System.out.print(
                "\nMenu Prestasi Mahasiswa:\n" +
                "1. Tambah Data Prestasi\n" +
                "2. Tampilkan Semua Data Prestasi\n" +
                "3. Mencari Data Prestasi Berdasarkan Tahun\n" +
                "4. Hitung Jumlah Prestasi per Tingkat\n" +
                "5. Keluar\n" +
                "Pilih menu (1-5): "
            );
            int pilihan = input.nextInt();
            input.nextLine();

            while (pilihan < 1 || pilihan > 5) {
                System.out.print("\nPilihan tidak valid\nPilih menu (1-5): ");
                pilihan = input.nextInt();
                input.nextLine();
            }
            return pilihan;
    }
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
