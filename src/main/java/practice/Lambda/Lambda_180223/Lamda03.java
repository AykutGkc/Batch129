package practice.Lambda.Lambda_180223;

import practice.Lambda.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda03 {
    public static void main(String[] args) throws ClassCastException {

        Apartman da01 = new Apartman("dogu", 1, 7000);
        Apartman da02 = new Apartman("bati", 2, 10000);
        Apartman da03 = new Apartman("güney", 3, 12000);
        Apartman da04 = new Apartman("dogu", 5, 15000);

        List<Apartman> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));
        System.out.println(tümDaireKira5000denBüyükIseTrue(daireler));
        System.out.println("\n **********");
        System.out.println(enAzBirisiKatSayisiIseTrue(daireler));
        System.out.println("\n **********");
        System.out.println(doguCepheSayisi(daireler));
        System.out.println("\n **********");
        System.out.println(kataGöreSiralama(daireler));
        System.out.println("\n **********");
        System.out.println(katsayisi2denFazlaOlanKirayaGöreSiralaEnBüyKiraYazdir(daireler));
        System.out.println("\n **********");
        System.out.println(katSayisi3denAzOlanKiraGoreKucBuySırEnKUcKiraListYazdır(daireler));


    }
    // SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın

    public static boolean tümDaireKira5000denBüyükIseTrue(List<Apartman> daireler) {
        boolean sonuc = daireler.stream().allMatch(t -> t.getKira() > 5000);
        return sonuc;
    }

// SORU2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın

    public static boolean enAzBirisiKatSayisiIseTrue(List<Apartman> daireler) {
        boolean sonuc = daireler.stream().anyMatch(t -> t.getKatSayi() == 2);
        return sonuc;
    }

    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.

    public static long doguCepheSayisi(List<Apartman> daireler) {
        long sonuc = daireler.stream().filter(t -> t.getCephe().contains("dogu")).count();
        return sonuc;

    }

    //SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.
    // List halinde return ederek yazdırınız.

    public static List<Apartman> kataGöreSiralama(List<Apartman> daireler) {
        List<Apartman> sonuc = daireler.
                stream().
                sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).
                collect(Collectors.toList());
        return sonuc;
    }

//Soru 5 KAtsayisin 2den fazla olan daireleri, kiraya göre büyükten kücüge siralayiniz.
// En büyük kirasini list halinde retern ederek yazdirin.

    public static List<Integer> katsayisi2denFazlaOlanKirayaGöreSiralaEnBüyKiraYazdir(List<Apartman> daireler) {
        List<Integer> sonuc = daireler.
                            stream().
                            filter(t -> t.getKatSayi() > 2).
                            sorted(Comparator.comparing(Apartman::getKira).reversed()).
                             limit(1).
                             map(t -> t.getKira()).collect(Collectors.toList());

        return sonuc;
 }

 //soru6 katsayisi 3den az olan daireleri kiraya göre kücükten büyüge siralayiniz
    //En kücük kirasini list halinde return ederek yazdirin

    public static List<Integer> katSayisi3denAzOlanKiraGoreKucBuySırEnKUcKiraListYazdır(List<Apartman> daireler) {

        List<Integer> sonuc = daireler.
                stream().
                filter(t -> t.getKatSayi() < 3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).
                map(t -> t.getKira()).
                collect(Collectors.toList());

        return sonuc;

    }

}
