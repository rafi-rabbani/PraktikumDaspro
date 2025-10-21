package jobsheet7;
import java.util.*;

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        String status;
        int jumlahLulus = 0, jumlahTidakLulus = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                status = "Lulus";
                jumlahLulus++;
            } else {
                status = "Tidak Lulus";
                jumlahTidakLulus++;
            }

            System.out.println("Status mahasiswa ke-" + i + ": " + status + "\n");
        }

        System.out.println("Nilai tertinggi\t\t\t: " + tertinggi);
        System.out.println("Nilai terendah\t\t\t: " + terendah);
        System.out.println("Jumlah mahasiswa lulus\t\t: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus\t: " + jumlahTidakLulus);
        sc.close();
    }
}
