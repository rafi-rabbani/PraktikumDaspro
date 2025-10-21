package jobsheet7;
import java.util.*;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pelanggan = 1;
        int harga = 50000;
        double totalHarga = 0;
        int totalTiket = 0;
        double jumlahHarga = 0;
        int jumlahTiket = 0;
        String lanjut;

        // header
        System.out.println("========================= TOTAL PENJUALAN TIKET DALAM SATU HARI =========================");

        // perulangan pelanggan
        while (true) {
            // meminta input jumlah tiket
            System.out.printf("\nMasukkan jumlah tiket pelanggan ke-%d: ", pelanggan);
            jumlahTiket = sc.nextInt();

            // membersihkan buffer
            sc.nextLine();

            // validasi nilai negatif
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid.");
                continue;
            }

            // menentukan diskon atau tidak
            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                jumlahHarga = (jumlahTiket * harga) * 0.9; // Diskon 10%

            } else if (jumlahTiket > 10) {
                jumlahHarga = (jumlahTiket * harga) * 0.85; // Diskon 15%

            } else {
                jumlahHarga = jumlahTiket * harga; // Tanpa diskon
            }

            // menambahkan ke total
            totalHarga += jumlahHarga;
            totalTiket += jumlahTiket;

            // menampilkan jumlah dan harga tiket yang di beli
            System.out.println("Total tiket yang dibeli saat ini\t\t: " + jumlahTiket);
            System.out.println("Total harga \t\t\t\t\t: Rp " + jumlahHarga);
            
            // menanyakan lanjut kagak?
            System.out.print("\nApakah ada pembelian lagi? (y/n): ");
            lanjut = sc.nextLine();

            // jika n maka keluar loop
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }

            // lanjut ke pelanggan berikutnya
            pelanggan +=1;
        }

        // menampilkan total seluruh pembelian dalam 1 hari
        System.out.println("\nTotal harga tiket yang dibeli dalam 1 hari\t: Rp " + totalHarga);
        System.out.println("Total tiket yang dibeli dalam 1 hari\t\t: " + totalTiket);

        // footer
        System.out.println("=========================================================================================");

        // menutup scanner
        sc.close();
    }
}
