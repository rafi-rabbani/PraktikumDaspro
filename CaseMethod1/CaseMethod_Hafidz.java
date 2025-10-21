package CaseMethod1;
import java.util.*;
public class CaseMethod_Hafidz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama\t: ");
        String nama = input.nextLine();
        System.out.print("NIM\t: ");
        int nim = input.nextInt();
        
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugas1 = input.nextDouble();
        
        double matkul1 = (uts1 + uas1 + tugas1) / 3;
        
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugas2 = input.nextDouble();
        
        double matkul2 = (uts2 + uas2 + tugas2) / 3;
        
        System.out.println("\n--- Mata Kuliah 3: Matematika ---");
        System.out.print("Nilai UTS\t: ");
        double uts3 = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uas3 = input.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugas3 = input.nextDouble();
        
        double matkul3 = (uts3 + uas3 + tugas3) / 3;
        
        double ratarata = ((matkul1 + matkul2 + matkul3) / 3);
        
        System.out.println("\n========================================== HASIL PENILAIAN AKADEMIK ==========================================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.println("\nMata Kuliah\t\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t\t\t\t%.1f\t%.1f\t%.1f\t   %.2f\t    %s\t\t%s\n",uts1, uas1, tugas1, matkul1, Operasi.NilaiHuruf(matkul1), Operasi.Status(matkul1));
        System.out.printf("Struktur Data\t\t\t\t\t%.1f\t%.1f\t%.1f\t   %.2f\t    %s\t\t%s\n", uts2, uas2, tugas2, matkul2, Operasi.NilaiHuruf(matkul2), Operasi.Status(matkul2));
        System.out.printf("Matematika   \t\t\t\t\t%.1f\t%.1f\t%.1f\t   %.2f\t    %s\t\t%s\n", uts3, uas3, tugas3, matkul3, Operasi.NilaiHuruf(matkul3), Operasi.Status(matkul3));
        
        System.out.printf("\nMata Kuliah dengan Rata-rata Terbesar\t: %s", Operasi.RatarataTerbesar(matkul1, "Algoritma Pemrograman", matkul2, "Struktur Data", matkul3, "Matematika"));
        System.out.printf("\nRata-rata Nilai Akhir\t: %.2f\n", ratarata);
        System.out.println("Status semester\t\t: " + Operasi.StatusSemester(Operasi.Status(matkul1), Operasi.Status(matkul2), Operasi.Status(matkul3), ratarata));
        
        input.close();
    }
}