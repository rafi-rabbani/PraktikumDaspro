package jobsheet2;
public class Tugas2_3 {
    public static void main(String[] args) {
        int panjangTanah = 100;
        int lebarTanah = 50;
        int diameter = 2;
        int sisi = 2;

        int luasTanah = panjangTanah * lebarTanah;
        double luasKolamLingkaran = Math.PI * (diameter/2) * (diameter/2);
        int luasKolamPersegi = sisi * sisi;

        double luasRumput = luasTanah - luasKolamLingkaran - luasKolamPersegi;

        System.out.println("======= Luas tanah Pak Jaka yang dapat di tanami rumput =======\n");

        System.out.println(String.format("Panjang tanah \t\t\t\t: %s m", panjangTanah));
        System.out.println(String.format("Lebar tanah \t\t\t\t: %s m", lebarTanah));
        System.out.println(String.format("Diameter Kolam lingkaran \t\t: %s m", diameter));
        System.out.println(String.format("Sisi kolam persegi \t\t\t: %s m", sisi));

        System.out.println(String.format("\nLuas lahan yang dapat ditanami rumput \t: %s m²", (int)Math.round(luasRumput)));
    }
}