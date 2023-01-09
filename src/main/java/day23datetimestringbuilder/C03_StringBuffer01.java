package day23datetimestringbuilder;

public class C03_StringBuffer01 {

    /*
    String olusturmak icin String var, String builder var ve String buffer kullanabilir.
    1)StringBuffer javanin string üretmek icin olusturdugu ilk classtir. Java 5de üretilmistir.
    2)StringBuffer "synchronized"dir, StringBuilder "synchronized" degildir.
    3)StringBuffer "thread-safe"(Multi-thread'e uygundur.)dir, StringBuilder "thread-safe" degildir.
    4)StringBuffer ve String builder ikisi de mutabledir.

    Note 1: Immutable String lazim oldugunda String Class kullanilir.
    Note 2: Mutable String  lazim oldugunda StringBuilder veya StringBuffer kullanilir.
    Note 3: StringBuffer "Multi Thread ve "synchronization" lazin oldugunda tercih edilir.
            StringBuilder "Multi Thread ve "synchronization" gerekmezse tercih edilir.....
         */
    public static void main(String[] args) {


        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());




    }//MAIN
}//class
