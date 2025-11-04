package jobsheet9.tugas1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();
        System.out.println();

        double[] arrNilai = new double[jumlah];
        double total = 0;
        double tertinggi = 0;
        double terendah = 100;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            double nilai = input.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("\nnilai tidak sesuai, masukkan (0 - 100)");
                i -= 1;
                continue;
            }

            arrNilai[i] = nilai;
            total += nilai;

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        double rata2 = total/arrNilai.length;

        System.out.println("\n======================================================");
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah " + arrNilai[i]);
        }
        System.out.println("\nNilai tertinggi adalah\t\t: " + tertinggi);
        System.out.println("Nilai terendah adalah\t\t: " + terendah);
        System.out.println("Rata-rata keseluruhan adalah\t: " + rata2);

        input.close();
    }
    
}
