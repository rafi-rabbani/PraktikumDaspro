package jobsheet11;

public class Kubus19 {
    public static int volumeKubus(int sisi) {return sisi * sisi * sisi;}
    public static int luasPermukaanKubus(int sisi) {return 6 * sisi * sisi;}

    public static void main(String[] args) {
        int sisi = 4;
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volumeKubus(sisi));
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah " + luasPermukaanKubus(sisi));
    }
}
