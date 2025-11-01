package jobsheet8.tugas2;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1) {
                    System.out.print(n + " ");
                } else {
                    if (j == 0 || j == n-1) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}
