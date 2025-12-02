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

    static void tambahData() {
        if (jumlahPrestasi >= prestasi.length) {
            System.out.println("Kapasitas penyimpanan data prestasi sudah penuh");
            return;
        }

        System.out.print("\nMasukkan Nama Mahasiswa\t : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM\t\t : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jenis Prestasi\t : ");
        String jenis = input.nextLine();

        System.out.print(
            "\nTingkat Prestasi yang Tersedia: " +
            "\n1. Lokal" +
            "\n2. Nasional" +
            "\n3. Internasional" +
            "\nPilih Tingkat Prestasi (1/2/3): "
        );
        int pilih = input.nextInt();
        input.nextLine();

        while (pilih < 1 || pilih > 3) {
            System.out.print("\nTingkat tidak valid\nPilih Tingkat Prestasi (1/2/3): ");
            pilih = input.nextInt();
            input.nextLine();
        }

        String tingkat;
        switch (pilih) {
            case 1:
                tingkat = "Lokal";
                break;
            case 2:
                tingkat = "Nasional";
                break;
            default:
                tingkat = "Internasional";
                break;
        }

        System.out.println("\nTingkat Prestasi yang Dipilih: " + tingkat);
        
        int tahun;
        while (true) {
            System.out.print("\nMasukkan Tahun Prestasi (2015-2025): ");
            tahun = input.nextInt();
            input.nextLine();

            if (tahun < 2015 || tahun > 2025) {
                System.out.print("\nTahun tidak valid");
            } else {
                break;
            }
        }

        prestasi[jumlahPrestasi][0] = nama;
        prestasi[jumlahPrestasi][1] = nim;
        prestasi[jumlahPrestasi][2] = jenis;
        prestasi[jumlahPrestasi][3] = tingkat;
        prestasi[jumlahPrestasi][4] = Integer.toString(tahun);

        jumlahPrestasi++;
        
        System.out.println("\nData prestasi berhasil ditambahkan!");
    }

    static void tampilData(String[][] prestasi, int jumlah) {
        if (jumlah == 0) {
            System.out.println("\nBelum ada data prestasi yang tersimpan");
            return;
        }

        System.out.println("\n=====================================================================================================");
        System.out.println("| No. |             NAMA             |      NIM      |    JENIS PRESTASI    |    TINGKAT    | TAHUN |");
        System.out.println("=====================================================================================================");

        int[] lebarKolom = {29, 14, 21, 14, 6};

        for (int i = 0; i < jumlah; i++) {
            System.out.print("|");
            System.out.printf(" %-4s|", (i + 1)+".");

            for (int j = 0; j < prestasi[i].length; j++) {
                System.out.printf(" %-" + lebarKolom[j] + "s|", prestasi[i][j]);
            }
            System.out.println();
        }
        System.out.println("=====================================================================================================");
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
