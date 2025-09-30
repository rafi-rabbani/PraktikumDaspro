package jobsheet3;
import java.util.Scanner;

public class Tugas3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarak;
        double biaya;
        int hargaBensin = 10000;

        System.out.println("Masukkan jarak dari Malang ke Surabaya : ");
        jarak = sc.nextDouble();

        biaya = jarak/2 * hargaBensin;

        System.out.println("Biaya bensin yang di perlukan untuk perjalan tersebut : " + biaya);

        sc.close();
    }
}