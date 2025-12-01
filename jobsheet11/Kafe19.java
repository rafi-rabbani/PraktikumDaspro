package jobsheet11;

import java.util.Scanner;

public class Kafe19 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo 'DISKON50' anda berhasil, dapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo 'DISKON30' anda berhasil, dapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid.");
        }
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    
    public static int[] hitungTotalHarga19(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        double diskon = 0;

        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;
        } else {
            diskon = 0;
        }

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int hargaBayar = (int) (hargaTotal - (hargaTotal * diskon));

        int[] value = {hargaTotal, hargaBayar};

        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTotal = 0;
        int hargaBayar = 0;

        String kodePromo = "DISKON30";

        Menu("Budi", true, kodePromo);

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan\t: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan\t\t: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            
            int[] nota = hitungTotalHarga19(pilihanMenu, banyakItem, kodePromo);
            hargaTotal += nota[0];
            hargaBayar += nota[1];
            
            System.out.print("\nPesen lagi ga? (y/n): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nTotal harga\t\t: Rp " + hargaTotal);
        System.out.println("Diskon\t\t\t: Rp " + (hargaTotal - hargaBayar));
        System.out.println("Harga yang harus dibayar: Rp " + hargaBayar);
        sc.close();
    }
}
