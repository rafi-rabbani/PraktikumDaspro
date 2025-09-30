package jobsheet2;
import java.util.Scanner;

public class Tugas2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("============== Gaji bulanan ==============\n");

        System.out.print("Gaji pokok \t\t\t: Rp");
        int gajiPokok = sc.nextInt();

        System.out.print("Tunjangan per anak \t\t: RP");
        int tunjangan = sc.nextInt();

        System.out.print("Jumlah anak \t\t\t: ");
        int jumlahAnak = sc.nextInt();
        
        double simpanan = 0.05;
        double gajiBersih = (gajiPokok + (tunjangan * jumlahAnak) - (gajiPokok * simpanan));
        
        System.out.println("Simpanan wajib dana pensiun\t: " + (int)(simpanan * 100) + "% dari gaji pokok");
        System.out.println("\nGaji bersih \t\t\t: Rp" + (int) gajiBersih);

        sc.close();
    }
}