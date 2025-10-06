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
        
        String huruf1 = "";
        String status1 = "";
        String huruf2 = "";
        String status2 = "";
        String statusSemester = "";
        double ratarata = ((matkul1+matkul2)/2);
        
        if (80 < matkul1 && matkul1 <= 100) {
            huruf1 = "A";
            
        } else if (73 < matkul1 && matkul1 <= 80) {
            huruf1 = "B+";
            
        } else if (65 < matkul1 && matkul1 <= 73) {
            huruf1 = "B";
            
        } else if (60 < matkul1 && matkul1 <= 65) {
            huruf1 = "C+";
            
        } else if (50 < matkul1 && matkul1 <= 60) {
            huruf1 = "C";

        } else if (39 < matkul1 && matkul1 <= 50) {
            huruf1 = "D";
            
        } else if (matkul1 <= 39) {
            huruf1 = "E";
            
        } else {
            System.out.println("input tidak sesuai");
        }

        if (matkul1 >= 60) {
            status1 = "LULUS";

        } else if (matkul1 < 60) {
            status1 = "TIDAK LULUS";
        }

        if (80 < matkul2 && matkul2 <= 100) {
            huruf2 = "A";
            
        } else if (73 < matkul2 && matkul2 <= 80) {
            huruf2 = "B+";
            
        } else if (65 < matkul2 && matkul2 <= 73) {
            huruf2 = "B";
            
        } else if (60 < matkul2 && matkul2 <= 65) {
            huruf2 = "C+";
            
        } else if (50 < matkul2 && matkul2 <= 60) {
            huruf2 = "C";

        } else if (39 < matkul2 && matkul2 <= 50) {
            huruf2 = "D";
            
        } else if (matkul2 <= 39) {
            huruf2 = "E";
            
        } else {
            System.out.println("input tidak sesuai");
        }

        if (matkul2 >= 60) {
            status2 = "LULUS";

        } else if (matkul2 < 60) {
            status2 = "TIDAK LULUS";
        }
        
        System.out.println("\n========================================== HASIL PENILAIAN AKADEMIK ==========================================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.println("\nMata Kuliah\t\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n", uts1, uas1, tugas1, matkul1, huruf1, status1);
        System.out.printf("Struktur Data\t\t\t\t\t%d\t%d\t%d\t   %.2f\t    %s\t\t%s\n", uts2, uas2, tugas2, matkul2, huruf2, status2);
        
        System.out.println("\nRata-rata Nilai Akhir\t: " + ratarata);

        if (status1.equals("LULUS") && status2.equals("LULUS")) {

            if (ratarata >= 70) {
                statusSemester = "LULUS";
            } else if (ratarata < 70) {
                statusSemester = "TIDAK LULUS";
            }

        } else {
            statusSemester = "TIDAK LULUS";
        }

        System.out.println("Status semester\t\t: " + statusSemester);
        
        input.close();
    }
}