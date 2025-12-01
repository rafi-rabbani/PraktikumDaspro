package jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa19 {
    static Scanner sc = new Scanner(System.in);
    
    static void isianArray(double[] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextDouble();
        }
    }

    static void tampilArray(double[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static double hitTot(double[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        System.out.println();

        double[] nilai = new double[n];

        isianArray(nilai);
        tampilArray(nilai);

        System.out.println("\nTotal nilai semua mahasiswa: " + hitTot(nilai));
    }
}
