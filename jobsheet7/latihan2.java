package jobsheet7;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        // Buatlah program untuk menentukan bonus yang diterima pegawai perusahaan. Setiap pegawai yang bekerja lebih dari 8 jam per hari akan menerima bonus sebesar 20% dari gaji harian. Program akan meminta input jumlah jam kerja dan gaji harian pegawai, lalu menghitung bonusnya. Program akan berhenti jika pengguna memasukkan jam kerja negatif, dan pegawai tersebut tidak diproses.
        
        Scanner sc = new Scanner(System.in);
        int pegawai = 1;
        double gaji;
        double jam;
        double bonus;
        double total;

        while (true) {
            // header
            System.out.println("==========================================================================================");
            // validasi tipe data jam
            while (true) {
                System.out.printf("\nMasukkan jumlah jam kerja pegawai ke-%d (input negative untuk keluar): ", pegawai);
                // memeriksa apakah input nya berupa double
                if (sc.hasNextDouble()) {
                    // jika ya, maka input masuk ke var jam
                    jam = sc.nextDouble();
                    break;
    
                } else {
                    // Jika tdk, buang input dan continue (ulangi loop)
                    System.out.println("Input tidak valid. Masukkan angka.");
                    sc.next();
                }
            }

            // jika jam negatif, keluar dari loop
            if (jam < 0) {
                System.out.println("\nInput negatif diterima. Program selesai.");
                break;
            }

            // validasi input gaji
            while (true) {
                // mengambil input gaji harian
                System.out.printf("\nMasukkan gaji harian pegawai ke-%d : Rp ", pegawai);
    
                // memeriksa apakah input nya berupa double
                if (sc.hasNextDouble()) {
                    // jika ya, maka input masuk ke var gaji dan keluar loop
                    gaji = sc.nextDouble();
                    break;
                } else {
                    // jika tidak maka buang input dan ulangi loop
                    System.out.println("Input tidak valid. Masukkan angka untuk gaji.");
                    sc.next();
                }
            }
 
            // menambahkan kondisi bonus
            if (jam > 8) {
                // jika jam > 8, maka mendapatkan bonus 20% dari gaji harian
                bonus = 0.2 * gaji;
                System.out.printf("\nPegawai bekerja %.2f jam (mendapat bonus: Rp %.2f)\n", jam, bonus);
                // menampilkan gaji total
                total = gaji + bonus;
                System.out.printf("Gaji total : Rp %.2f\n", total);

            } else {
                total = gaji;
                System.out.printf("\nPegawai bekerja %.2f jam (tidak mendapat bonus)\nGaji total: Rp %.2f\n", jam, total);
            }

            // lanjut ke pekerja ke - selanjutnya
            pegawai += 1;
            // Bersihkan newline jika ada sebelum iterasi berikutnya
            sc.nextLine();
        }
        sc.close();
    }
}
