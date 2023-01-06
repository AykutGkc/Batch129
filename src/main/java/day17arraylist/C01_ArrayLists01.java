package day17arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class C01_ArrayLists01 {
    public static void main(String[] args) {
        /*
        1)ArrayLists'ler coklu data depolamak icin kullanilir.
        2)ArrayLists`ler non-Primitive data tipinde ki coklu datalari depolamak icin kullanilir.
          Lise'ler "non- primitiv" data kabul ederler, "Array'ler " ise primitiv veya reference kabul eder.
        3)ArrayList(List)`leri olustururken icine koyacaginiz eleman sayisini absta söylemeye gerek yoktur.
          Listler eleman sayisinda "flexibele"dir ama Arrayler degildir.
        4)Madem "Array"ler eleman sayisi flexible deil nicin "Array'leri iptal etmedi?
          i)Eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir.
          ii)Array'ler cok hizli calisir
          iii)Arrayler memory de cok ay yer kaplar.
         */

        //List nasil olusturulur?

        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//[]

        //Listlere eleman nasil eklenir?
        //List'e eleman eklemek icin add() methodu kullaniriz.
        //add() methodu elemanlari sizin verdiginiz sirada "List'e" ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);
        ages.add(1,656);
        ages.add(3,777);

        System.out.println(ages); //[9, 656, 12, 777, 10, 888]

        //Liste coklu eleman nasil eklenir?
        //Bir Liste coklu eleman eklemek icin o elemanlari önce bir listin icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //Bir list'te ki tüm elemanlar clear() methodu ile silinir.
        //  ages.clear();
       // System.out.println(ages);


        //contains() methodu bir elemanin Listte var olup olamdigini kontrol eder.
        boolean r =ages.contains(656);
        System.out.println(r);

        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz.
        //Iki Listin birbiri ile esit olabolmesi icin ayni index'te ayni elemanlar olmali
        ArrayList<String> names1= new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2= new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s=names1.equals(names2);
        System.out.println(s); //false


        //Example 1: Verilen iki integer Liste tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(8);
        number1.add(10);
        number1.add(9);
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(8);
        number2.add(9);
        number2.add(10);

        Collections.sort(number1);
        Collections.sort(number2);

        boolean t= number1.equals(number2);
        System.out.println(t);


    }//Main
}//class
