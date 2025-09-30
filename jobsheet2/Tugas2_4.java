package jobsheet2;
import java.util.Scanner;

public class Tugas2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= Luas tanah Pak Jaka yang dapat di tanami rumput =======\n");

        System.out.print("Panjang tanah \t\t\t\t: ");
        double panjangTanah = sc.nextDouble();

        System.out.print("Lebar tanah \t\t\t\t: ");
        double lebarTanah = sc.nextDouble();

        System.out.print("Diameter Kolam lingkaran \t\t: ");
        double diameter = sc.nextDouble();

        System.out.print("Sisi kolam persegi \t\t\t: ");
        double sisi = sc.nextDouble();

        double luasTanah = panjangTanah * lebarTanah;
        double luasKolamLingkaran = Math.PI * (diameter/2) * (diameter/2);
        double luasKolamPersegi = sisi * sisi;

        double luasRumput = luasTanah - luasKolamLingkaran - luasKolamPersegi;

        System.out.println(String.format("\nLuas lahan yang dapat ditanami rumput \t: %s m²", luasRumput));

        sc.close();
    }
}