package w06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String parcaListesi[] = {"pedal123", "direksiyon345", "teker324", "korna321", "bagaj321"};
        List<BisikletYedekParca> yedekParcalar = new ArrayList<>();

        for (int i = 0; i < parcaListesi.length; i++) {
            yedekParcalar.add(new BisikletYedekParca(parcaListesi[i]));
            System.out.println(yedekParcalar.get(i).toString());
        }
    }
}
