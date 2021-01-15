package w06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BisikletYedekParca {

    String yedekParcaAdi=null;

    public BisikletYedekParca(String yedekParcaAdi) {
        setYedekParcaAdi(parcaIsimFormatla(yedekParcaAdi));
    }

    private String parcaIsimFormatla(String parcaIsim) {
        parcaIsim = parcaIsimBuyukHarf(parcaIsim);
        parcaIsim = parcaIsimRakamSil(parcaIsim);
        parcaIsim = parcaIsimTersCevir(parcaIsim);
        parcaIsim = parcaIsimEk(parcaIsim);
        parcaIsim = parcaIsimTarihEkle(parcaIsim);
        return parcaIsim;
    }

    private String parcaIsimTarihEkle(String parcaIsim) {
        LocalDate tarih = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        parcaIsim += tarih.format(formatter);
        return parcaIsim;
    }

    private String parcaIsimEk(String parcaIsim) {
        parcaIsim = "ASLIAG_" + parcaIsim;
        return parcaIsim;
    }

    private String parcaIsimTersCevir(String parcaIsim) {
        String tempParcaIsim = null;
        for (int i = parcaIsim.length() - 1; i >= 0; i--)
            tempParcaIsim += parcaIsim.charAt(i);
        return tempParcaIsim;
    }

    private String parcaIsimRakamSil(String parcaIsim) {
        parcaIsim = parcaIsim.replaceAll("[0-9]", "");
        return parcaIsim;
    }

    private String parcaIsimBuyukHarf(String parcaIsim) {
        parcaIsim = parcaIsim.toUpperCase();
        return parcaIsim;
    }

    public String getYedekParcaAdi() {
        return yedekParcaAdi;
    }

    public void setYedekParcaAdi(String yedekParcaAdi) {
        this.yedekParcaAdi = yedekParcaAdi;
    }

    @Override
    public String toString() {
        return yedekParcaAdi;
    }
}
