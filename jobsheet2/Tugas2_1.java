package jobsheet2;
public class Tugas2_1 {
    public static void main(String[] args) {
        int gajiPokok = 3000000, tunjangan = 150000, jumlahAnak = 3;
        double simpanan = 0.05;
        double gajiBersih = (gajiPokok + (tunjangan * jumlahAnak) - (gajiPokok * simpanan));

        System.out.println("========== Gaji bulanan Bu Jesi ==========\n");
        System.out.println("Gaji pokok \t\t\t: Rp" + gajiPokok);
        System.out.println("Tunjangan per anak \t\t: Rp" + tunjangan);
        System.out.println("Jumlah anak \t\t\t: " + jumlahAnak);
        System.out.println("Simpanan wajib dana pensiun\t: " + (int)(simpanan*100) + "% dari gaji pokok");
        System.out.println("\nGaji bersih \t\t\t: Rp" + (int) gajiBersih);
    }
}