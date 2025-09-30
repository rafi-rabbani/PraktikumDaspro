import java.util.*;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(
        "--- Layanan WIFI gratis ---" + 
        "\nKamu siapa kawan???" +
        "\n1. Dosen" +
        "\n2. Mahasiswa" +
        "\n3. Lainnya" +
        "\npilih salah satu nomor (1-3) : ");
        int siapa = input.nextInt();
        
        switch (siapa) {
            case 1:
                System.out.println("\nHallo Pak/Bu Dosen");
                System.out.println("Akses WIFI diberikan (dosen)");
                break;
            case 2:
                System.out.println("\nHallo Mahasiswa");
                System.out.print("Masukkan jumlah SKS yang diambil : ");
                int sks = input.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses WIFI diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
                break;
            case 3:
                System.out.println("\nHai kawan kamu bukan civitas akademika ya, kamu siapa??");
                System.out.println("Akses ditolak");
                break;
            default:
                System.out.println("\ninput tidak sesuai");
                break;
        }
        input.close();
    }
}
