package jobsheet8.tugas1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + " --> jumlah kuadrat = 1");
            int k = 1;
            for (int j = 2; j < i+1; j++) {
                k += (j * j);
                System.out.print(" + " + (j * j));
            }
            if (i > 1) {
                System.out.println(" = " + k);
            } else {
                System.out.println();
            }
        }
        input.close();
    }
}