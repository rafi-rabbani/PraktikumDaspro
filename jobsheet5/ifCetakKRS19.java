import java.util.*;
public class ifCetakKRS19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktLunas = sc.nextBoolean();

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        // }

        String pesan = (uktLunas)   ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" 
                                    : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);

        sc.close();
    }
}
