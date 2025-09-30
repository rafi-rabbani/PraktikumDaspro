package jobsheet3;
import java.util.Scanner;

public class Tugas3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        int uangMuka;
        int bulan;
        int sisaHarga;
        double bunga = 0.01;
        double besarCicilan;

        System.out.print("Masukkan harga motor : ");
        harga = sc.nextInt();
        System.out.print("Masukkan jumlah uang muka : ");
        uangMuka = sc.nextInt();
        System.out.print("Masukkan lama mencicil (bulan) : ");
        bulan = sc.nextInt();

        sisaHarga = harga - uangMuka;
        besarCicilan = (sisaHarga / bulan) + (sisaHarga/bulan * bunga);

        System.out.println("Jumlah cicilan per bulan : " + besarCicilan);

        sc.close();
    }
}
