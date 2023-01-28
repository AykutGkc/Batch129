package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class C02_TreeSet01 {
    public static void main(String[] args) {

        long one=System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);

        System.out.println(ts); //[3, 8, 12, 25, 32]
        long two=System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        TreeSet<Integer> hts= new TreeSet<>(hs);
        System.out.println(hts); //[32, 3, 8, 25, 12]

        long three=System.nanoTime();



        System.out.println("Treesetin uygulama süresi : " + (two-one));
        System.out.println("HashSetin uygulama süresi : " + (three-two));

        //Note : TreeSet eleman eklemede cok yavastir, HashSet ise cok hizlidir.
        //       TreeSet'in bu negatif yönünden kurtulmak icin, HashSEt olusturur elemanlari ekler ve sonra HashSet'i TreeSet'e ceviririz.

        int first=ts.first();
        System.out.println(first);//3

        int last=ts.last();
        System.out.println(last);//32

        int floor=ts.floor(15);
        System.out.println(floor);//12--> 15 elemanlardan biri degil o yüden 15den bir önceki eleman yazdirildi.

        //floor() metodunda kullanabileceginiz sayi en kücük selemandan az olamaz.
        int floor2=ts.floor(12);//12--> 12 elemanlardan biri o yüzden direkt 12 yazdirdi.
        System.out.println(floor2);

        int ceiling1=ts.ceiling(15);
        System.out.println(ceiling1);// 15-->15 elemanlardan biri degil o yüden 15den bir sonraki eleman yazdirildi.

        //ceiling() metodunda kullanabileceginiz sayi en büyük selemandan büyük olamaz.
        int ceiling2=ts.ceiling(25);
        System.out.println(ceiling2);//25 elemanlardan biri o yüzden direkt 25 yazdirdi.

        SortedSet<Integer> tailSet1=ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32] --> 12 elelmanlardan biri ve o yüzden 12 ve sonraki elemanlar bir set icinde yazidirildi.

        SortedSet<Integer> tailSet2=ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32] --> 15 elemanlardan biri degil, 15den sonraki elemanlar bir set icinde yazidirildi.

        NavigableSet<Integer> tailSet3=ts.tailSet(12,false);
        System.out.println(tailSet3); //[25, 32] --> 12 elemanlardan biri normalde 12 ve sonrai elemanlar bir set icinde yazdirilirdi.
                                      // ama ikinci parametre "false" kullandigim icin 12 haric tutuldu.

        SortedSet<Integer> headSet1=ts.headSet(12);
        System.out.println(headSet1);//[3, 8] --> 12 elemanlardan biri önceki elemanlar bir set icinde yazdirildi.12 yazdirilmadi.

        SortedSet<Integer> headSet2=ts.headSet(12,true);
        System.out.println(headSet2);//[3, 8, 12]

        //Generic Method: Normal methodlar parametrelerde belirtilen data type'lari ile calisirlar.
        //Generic methodlar ise verilen her türlü data type ile calisma becerisine sahiptirler.
        Integer higher1=ts.higher(12);
        System.out.println(higher1);//25 --> 12 den bir sonraki elemani verir.

        Integer lower1=ts.lower(12);
        System.out.println(lower1);//8-->12 den bir öncekini veir.

    }
}
