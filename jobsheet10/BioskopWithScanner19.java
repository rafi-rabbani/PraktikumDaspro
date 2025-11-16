package jobsheet10;

import java.util.Arrays;
import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        for (String[] strings : penonton) {
            Arrays.fill(strings, "***");
        }

        boolean i = true;
        while (i) {
            System.out.print(
            "\nMenu yang Tersedia:" + 
            "\n1. Input Penonton" +
            "\n2. Tampilkan daftar penonton" +
            "\n3. Exit" +
            "\nSilahkan pilih menu (1-3): "
            );
            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    while (true) {
                        System.out.print("\nMasukkan nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            while (true) {
                                System.out.print("Masukkan baris: ");
                                baris = sc.nextInt();
    
                                if (baris < 1 || baris > 4) {
                                    System.out.println("Baris tidak tersedia. Masukkan nilai antara 1 hingga 4.");
                                } else {
                                    break;
                                }
                            }
    
                            while (true) {
                                System.out.print("Masukkan kolom: ");
                                kolom = sc.nextInt();
    
                                if (kolom < 1 || kolom > 2) {
                                    System.out.println("Kolom tidak tersedia. Masukkan nilai antara 1 hingga 2.");
                                } else {
                                    break;
                                }
                            }
                            sc.nextLine();
                
                            if (penonton[baris - 1][kolom - 1] != "***") {
                                System.out.println("Kursi yang dipilih sudah terisi! Mohon pilih kursi lain!");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                break;
                            }
                        }
            
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
            
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case "2":
                    System.out.println();
                    for (int j = 0; j < penonton.length; j++) {
                        System.out.println("Penonton pada baris ke-" + (j + 1) + ": " + String.join(", ", penonton[j]));
                    }
                    break;

                case "3":
                    System.out.println("\nkeluar dari program.");
                    i = false;
                    break;

                default:
                    System.out.println("\nMenu tidak valid. Silahkan pilih antara 1-3.");
                    break;
            }
        }
        sc.close();
    }
}