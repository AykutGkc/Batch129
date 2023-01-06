package day20passbyvalueoverloading;

public class C07_Overloading {
    public static void main(String[] args) {

        /*
        AYNI ISIMDE AYNI CLASSTA BIRDEN FAZLA METHOD OLUSTURABILIR MIYIZ?
        Java ayni isimde ayni classta birden fazla method oldugunde icerisinde ki
        data typena, data saysina yada yerlerine göre en uygun olani secer.
        Eger bir classta isimleri ayni data typelari farkli methodlar olusturusak buna
        "Method Overloading"denir.
        Java hangi methodu kullacagina karar verirken optimizisyona gider.
        En uygun olani en az AutoWidening gerektireni secer.
         */

        String str = "Java ile güzel dünya";
        System.out.println(str.substring(2)); //va ile güzel dünya
        System.out.println(str.replace("Java", "*"));

        topla(3,5);
        topla(8.6,5);
        topla(8.4,6.8);



    }//Main

    private static void topla(double a, double b) {
        System.out.println(a+b);
    }//Method

    private static void topla(double a, int b) {
        System.out.println(a+b);
    }//Method

    private static void topla(int a, int b) {
        System.out.println(a+b);
    }//Method
}//Class
