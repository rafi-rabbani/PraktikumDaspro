package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, kelompokTertinggi = 0;
        float totalNilai, rataNilai, tertinggi = 0;


        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = " + rataNilai);
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }
        System.out.println("\nKelompok dengan nilai tertinggi adalah kelompok " + kelompokTertinggi + " dengan nilai rata-rata " + tertinggi);
        sc.close();
    }
}
