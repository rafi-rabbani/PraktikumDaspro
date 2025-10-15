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
        int uts1 = Operasi.ValidasiNilai("UTS", input);
        int uas1 = Operasi.ValidasiNilai("UAS", input);
        int tugas1 = Operasi.ValidasiNilai("Tugas", input);
        
        Double matkul1 = ((uts1*0.3) + (uas1*0.4) + (tugas1*0.3));
        
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        int uts2 = Operasi.ValidasiNilai("UTS", input);
        int uas2 = Operasi.ValidasiNilai("UAS", input);
        int tugas2 = Operasi.ValidasiNilai("Tugas", input);
        
        Double matkul2 = ((uts2*0.3) + (uas2*0.4) + (tugas2*0.3));
        
        System.out.println("\n--- Mata Kuliah 2: Bahasa Inggris ---");
        int uts3 = Operasi.ValidasiNilai("UTS", input);
        int uas3 = Operasi.ValidasiNilai("UAS", input);
        int tugas3 = Operasi.ValidasiNilai("Tugas", input);
        
        Double matkul3 = ((uts3*0.3) + (uas3*0.4) + (tugas3*0.3));
        
        double ratarata = ((matkul1+matkul2+matkul3)/3);
        
        System.out.println("\n========================================== HASIL PENILAIAN AKADEMIK ==========================================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.println("\nMata Kuliah\t\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n",uts1, uas1, tugas1, matkul1, Operasi.NilaiHuruf(matkul1), Operasi.Status(matkul1));
        System.out.printf("Struktur Data\t\t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n", uts2, uas2, tugas2, matkul2, Operasi.NilaiHuruf(matkul2), Operasi.Status(matkul2));
        System.out.printf("Bahasa Inggris   \t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n", uts3, uas3, tugas3, matkul3, Operasi.NilaiHuruf(matkul3), Operasi.Status(matkul3));
        
        System.out.printf("\nRata-rata Nilai Akhir\t: %.2f\n", ratarata);
        System.out.println("Status semester\t\t: " + Operasi.StatusSemester(Operasi.Status(matkul1), Operasi.Status(matkul2), Operasi.Status(matkul3), ratarata));
        
        input.close();
    }
}