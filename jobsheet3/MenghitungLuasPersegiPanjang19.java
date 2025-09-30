package jobsheet3;


import java.util.Scanner;

public class MenghitungLuasPersegiPanjang19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan panjang persegi panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan panjang persegi lebar : ");
        lebar = sc.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah " + luas);

        sc.close();
    }
}
