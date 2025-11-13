package jobsheet10;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[10][6];

        for (int i = 0; i < survei.length; i++) {
            System.err.println("Survei responden ke-" + (i + 1));

            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Masukkan jawaban pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();

                if (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.println("Jawaban tidak valid. Masukkan nilai antara 1 hingga 5.");
                    j--;
                }
            }
            System.out.println();
        }
        
        for (int i = 0; i < survei.length; i++) {
            double totalPerResponden = 0;
            
            for (int j = 0; j < survei[i].length; j++) {
                totalPerResponden += survei[i][j];
            }
            System.out.println("Rata-rata Jawaban Responden ke-" + (i + 1) + " : " + (totalPerResponden / survei[i].length));
        }
        System.out.println();
        
        for (int i = 0; i < survei[i].length; i++) {
            double totalPerPertanyaan = 0;
            
            for (int j = 0; j < survei.length; j++) {
                totalPerPertanyaan += survei[j][i];
            }
            System.out.println("Rata-rata Jawaban Pertanyaan ke-" + (i + 1) + " : " + (totalPerPertanyaan / survei.length));
        }
        System.out.println();
        
        double total = 0;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
        }
        System.out.println("Rata-rata Jawaban Keseluruhan: " + (total / (survei.length * survei[0].length)));
        sc.close();
    }
}
