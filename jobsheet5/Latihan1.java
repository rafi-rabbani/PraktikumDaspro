import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah anda membawa kartu mahasiswa? (true/false) : ");
        Boolean kartu = input.nextBoolean();
        
        System.out.print("Apakah anda sudah registrasi secara online? (true/false) : ");
        Boolean regis = input.nextBoolean();
        
        // Sesuai syarat pertama (or)
        if (kartu || regis) {
            System.out.println("\nselamat anda telah mendapatkan izin memasuki perpustakaan kampus\nyaayyy!!");
        } else {
            System.out.println("\nmaaf anda tidak memenuhi syarat masuk perpustakaan kampus!" +
            "\nsilahkan membawa kartu mahasiswa atau melakukan registrasi secara online");
        }
        
        // Sesuai syarat kedua (and)
        // if (kartu && regis) {
        //     System.out.println("\nselamat anda telah mendapatkan izin memasuki perpustakaan kampus\nyaayyy!!");
        // } else {
        //     System.out.println("\nmaaf anda tidak memenuhi syarat masuk perpustakaan kampus!" +
        //     "\nsilahkan membawa kartu mahasiswa dan melakukan registrasi secara online");
        // }

        input.close();
    }
}
