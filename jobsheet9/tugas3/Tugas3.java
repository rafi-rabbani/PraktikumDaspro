package jobsheet9.tugas3;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        boolean ada = false;

        System.out.print("Masukkan menu yang kamu mau kawan : ");
        String pilihan = input.nextLine();

        for (String n : menu) {
            if (n.equalsIgnoreCase(pilihan)) {
                ada = true;
            }
        }
        if (ada) {
            System.out.println("\nMenu tersedia kawan\n");
        } else {
            System.out.println("\nMenu gaada kawan\n");
        }
        input.close();
    }
}
