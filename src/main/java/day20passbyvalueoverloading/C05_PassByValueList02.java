package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList02 {


        public static void main(String[] args) {


        /*
       bir list oluşturalım.
       sonra list elemanlarını degiştir methodu yazıp orada
       list elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden listi yazdıralım
       */

            List<String> harfler = new ArrayList<>();
            harfler.add("A");
            harfler.add("B");
            harfler.add("C");
            harfler.add("D");

            listElemanlariniDegistir(harfler);
            System.out.println("main icindeki methoddan sonra harfler = " + harfler);

            //Listemizde icindeki elemanlardan bir yada bir kacini degistirdigimizde Listeyi degistirmis olmuyoruz.
            //Pass by Value Array ve listlerde de aynen gecerlidir.
            //Ama listenin kendisini degistirmis olmuyoruz.


            harfler=listDegistir(harfler);

            System.out.println("mainin icinde methodtan sonra harfler = " + harfler);


        }//Main

        private static List<String> listDegistir(List<String> harfler) {

            harfler = new ArrayList<>();
            System.out.println("methodun icinde yeni list harfler = " + harfler);
            return harfler;
        }//Methodu

        private static void listElemanlariniDegistir(List<String> harfler) {
            harfler.set(0, "R");
            System.out.println("Method icindeki harfler = " + harfler);


        }//Method
    }//Class

