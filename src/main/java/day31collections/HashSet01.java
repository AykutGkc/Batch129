package day31collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    "Hash" bir tekniktir. Java bu tekniği kullanarak  benzersiz datalar üretir.
    "Set" tekrarsız data depolamak icin kullanilan bir Collection'dir.
    Set tekrar kabul etmez. Yani tekrarsız verileri depolamak için kullanılır

    "set"ler 3'e ayrilir:
        i)HashSet: a)Super hizlidir, cünkü HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez.
                    Yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
                   b)HashSet'ler tekrarli elemana müsade etmezler.
                   c)HashSet'ler sadece 1 tane "null"i eleman olarak kabul ederler.
        ii)LinkedHashSet: a)elemanlari "inertion order"a göre dizer.(girilen sira)
                          b)Elemanlari siralamakta zaman kaybettigi icin HashSet'e göre yavastir.
                          c)HashSet'ler tekrarli elemana müsade etmezler.
        iii)TreeSet: a)TreeSet elemanlari "Natural order"(kücükten büyüge veya alfabetik sira)a göre dizer.
                     b)TreeSet natural order yaparken cok zaman harcar.O yüzden en yavas "Set"'tir.
                     c)HashSet'ler tekrarli elemana müsade etmezler.
     */
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78]==> Görüldügü gibi elemanlar rastgele siralama yapti.

        int hc=hs.hashCode();
        System.out.println(hc);


    }
}
