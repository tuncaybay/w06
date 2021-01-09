package w06;

import java.time.LocalDate;
import java.util.Scanner;

public class Bisiklet {

    public static void main(String[] args) {
        String parcaListesi[] = new String[10];
        parcaListesi[0] = parcaIsimGir();
        parcaListesi[0] = parcaIsimFormatla(parcaListesi[0]);
        System.out.println(parcaListesi[0]);
    }

    private static String parcaIsimFormatla(String parcaIsim) {
        parcaIsim = parcaIsimBuyukHarf(parcaIsim);
        parcaIsim = parcaIsimRakamSil(parcaIsim);
        parcaIsim = parcaIsimTersCevir(parcaIsim);
        parcaIsim = parcaIsimEk(parcaIsim);
        parcaIsim = parcaIsimTarihEkle(parcaIsim);
        return parcaIsim;
    }

    private static String parcaIsimTarihEkle(String parcaIsim) {
        LocalDate tarih = LocalDate.now();
        // ay'a 100 ekleyip sagdaki 2 karakter aliniyor, bu sekilde ay 2 haneli olmus oluyor
        String ay = String.valueOf(tarih.getMonthValue()+100);
        ay = ay.substring(1);

        // gun'e 100 ekleyip sagdaki 2 karakter aliniyor, bu sekilde gun 2 haneli olmus oluyor
        String gun = String.valueOf(tarih.getDayOfMonth()+100);
        gun = gun.substring(1);
        parcaIsim = parcaIsim + tarih.getYear() + ay + gun;
        return parcaIsim;
    }

    private static String parcaIsimEk(String parcaIsim) {
        parcaIsim = "ASLIAG_"+parcaIsim;
        return parcaIsim;
    }

    private static String parcaIsimTersCevir(String parcaIsim) {
        String tempParcaIsim = new String();
        for (int i = parcaIsim.length()-1 ; i >= 0 ; i--)
            tempParcaIsim += parcaIsim.charAt(i);
        return tempParcaIsim;
    }

    private static String parcaIsimRakamSil(String parcaIsim) {
        parcaIsim = parcaIsim.replaceAll("[0-9]", "");
        return parcaIsim;
    }

    private static String parcaIsimBuyukHarf(String parcaIsim) {
        parcaIsim = parcaIsim.toUpperCase();
        return parcaIsim;
    }
    public static String parcaIsimGir () {
        String parcaIsmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Parca ismi: ");
        parcaIsmi = sc.nextLine();
        return parcaIsmi;
    }
}
