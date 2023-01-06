package day18lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Lists04 {
    public static void main(String[] args) {

        List<String> names= new ArrayList<String>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Mahsun");
        names.add("Müslüm");
        names.add("Orhan");

        List<String> females= new ArrayList<String>();
        females.add("Ajda");
        females.add("Emel");

        // names.containsAll(females); ==> namesin icinde tüm females elemanlari var mi ? Boolean döndürür.
        //Tamami varsa true döndürür biri bile eksik ise false döndürür.
        boolean r=names.containsAll(females);
        System.out.println(r);

        //naems.subList(1,4) "names" listinde ki index'i 1,2,3 olan elemanlari alir bir listin icinde size verir.
        //Ikinci index olan 4 dahil olmaz.
        List<String> subList=names.subList(1,4);
        System.out.println(subList); //[Cüneyt, Mahsun,Müslüm]

        names.retainAll(females);
        System.out.println(names);
        System.out.println(females);

        //EX 1: Elektronik aletleri ve ev aletleri listlerimiz var.
        //      Elektronik ev aletlerini listeleiyiniz.

        List<String> electronics= new ArrayList<String>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigetor");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods= new ArrayList<String>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        // homeGoods.retainAll(electronics); homeGoods ile electronics listlerinin ortak elemanlarini homeGoods listi icinde verir.
        //Baska bir deyisle homeGoods listinedeki ortak olmayan elemanlari siler.
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);//[Radio,TV]

        //isEmpty()Listte hic eleman yok ise true verir. bir veya daha fazla eleman varsa false verir
        //isEmpty() esasinda nemes.size()==0 demektir

        names.isEmpty();

        //
        System.out.println(names.hashCode());







    }//Main
}//class
