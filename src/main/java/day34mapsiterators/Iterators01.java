package day34mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        /*
    Iterator'lar Loop'ların yaptığı işi yapar.
    Iterator'lar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
    Javanın Iterator'ları ortaya çıkarma sebebi infinite(sonsuz) Loop riskini bitirmektir.
    Iterator'larda sonsuz loop yoktur.
    Iterator'lar Java tarafından sonradan oluşturulmuşlardır ve loop'ların yaptıkları bütün işlemleri yaparlar.
    Looop'lar ile Iterator'larin preformans farki yoktur ama Iterator'lar eleman silme ve update etmede daha basarilidirlar.

    Iki Tip Iterator var:
    i)Iterator: Sadecce elemanlari silebilirsiniz(remove).
                Sadece Sodlan saga calisir yani tek yönlüdür.

    ii)ListIterator:Eleman "remove" etme, "update" etme  ve "add" yapabilirsiniz.
                    Hem soldan saga hemde sagdan sola calisabilir, yani cift yönlüdür.
        */

        //Iterator
        List<String> list1 = new ArrayList<>();

        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        Iterator<String> itr1= list1.iterator();

        while(itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }

        System.out.println(list1);//[]


        //ListIterator
        //Example 1;
        List<String> list2 = new ArrayList<>();

        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println(list2);

        ListIterator<String> listItr=list2.listIterator();

        while(listItr.hasNext()){

            String el=listItr.next();
            listItr.set(el+"!");
        }

        System.out.println(list2);//[Ali!, Can!, Aliye!]

        //Example 2:
        List<String> list3 = new ArrayList<>();

        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2=list3.listIterator();

        //Asagidaki loopo "pointer" i en saga almak icin yazildi.

        while(listItr2.hasNext()){
            listItr2.next();
        }

        //Asagidaki loop elemanlari en sondan en basa
        while(listItr2.hasPrevious()){

            String el=listItr2.previous();
            System.out.println(el+"<==");


        }








    }



}
