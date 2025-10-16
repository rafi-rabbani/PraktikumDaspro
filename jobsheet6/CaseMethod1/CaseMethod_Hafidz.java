package CaseMethod1;
import java.util.*;
public class CaseMethod_Hafidz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama\t: ");
        String nama = input.nextLine();
        System.out.print("NIM\t: ");
        String nim = input.nextLine();
        
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        int uts1 = input.nextInt();
        System.out.print("Nilai UAS\t: ");
        int uas1 = input.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int tugas1 = input.nextInt();
        
        Double matkul1 = ((uts1*0.3) + (uas1*0.4) + (tugas1*0.3));

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        int uts2 = input.nextInt();
        System.out.print("Nilai UAS\t: ");
        int uas2 = input.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int tugas2 = input.nextInt();
        
        Double matkul2 = ((uts2*0.3) + (uas2*0.4) + (tugas2*0.3));
        
        double ratarata = ((matkul1+matkul2)/2);
        
        System.out.println("\n========================================== HASIL PENILAIAN AKADEMIK ==========================================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.println("\nMata Kuliah\t\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n",uts1, uas1, tugas1, matkul1, Operasi.NilaiHuruf(matkul1), Operasi.Status(matkul1));
        System.out.printf("Struktur Data\t\t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n", uts2, uas2, tugas2, matkul2, Operasi.NilaiHuruf(matkul2), Operasi.Status(matkul2));
        
        System.out.printf("\nRata-rata Nilai Akhir\t: %.2f\n", ratarata);
        System.out.println("Status semester\t\t: " + Operasi.StatusSemester(Operasi.Status(matkul1), Operasi.Status(matkul2), ratarata));
        
        input.close();
    }
}