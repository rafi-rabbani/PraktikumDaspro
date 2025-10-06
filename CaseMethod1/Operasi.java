package CaseMethod1;

public class Operasi {
    public static String NilaiHuruf(double nilai) {
        String huruf = "";

        if (80 < nilai && nilai <= 100) {
            huruf = "A";
            
        } else if (73 < nilai && nilai <= 80) {
            huruf = "B+";
            
        } else if (65 < nilai && nilai <= 73) {
            huruf = "B";
            
        } else if (60 < nilai && nilai <= 65) {
            huruf = "C+";
            
        } else if (50 < nilai && nilai <= 60) {
            huruf = "C";

        } else if (39 < nilai && nilai <= 50) {
            huruf = "D";
            
        } else if (nilai <= 39) {
            huruf = "E";
            
        } else {
            System.out.println("input tidak sesuai");
        }

        return huruf;
    }

    public static String Status(double nilai) {
        String status = "";

        if (nilai >= 60) {
            status = "LULUS";

        } else if (nilai < 60) {
            status = "TIDAK LULUS";
        }

        return status;
    }

    public static String StatusSemester(String status1, String status2, double nilai) {
        String statusSemester = "";

        if (status1.equals("LULUS") && status2.equals("LULUS")) {

            if (nilai >= 70) {
                statusSemester = "LULUS";
            } else if (nilai < 70) {
                statusSemester = "TIDAK LULUS";
            }

        } else {
            statusSemester = "TIDAK LULUS";
        }

        return statusSemester;
    }
}
