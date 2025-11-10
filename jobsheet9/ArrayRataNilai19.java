package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int mahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[mahasiswa];
        double total = 0;
        double rata2;
        int lulus = 0;
        double totalLulus = 0;
        double rata2Lulus;
        double rata2TdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus += 1;
                totalLulus += nilaiMhs[i];
            }
        }
        rata2 = total / nilaiMhs.length;
        rata2Lulus = totalLulus / lulus;
        rata2TdkLulus = (total - totalLulus) / (nilaiMhs.length - lulus);

        System.out.println("Jumlah mahasiswa lulus = " + lulus);
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
        System.out.println("Rata-rata nilai total = " + rata2);
        sc.close();
    }
}
