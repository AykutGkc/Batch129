package day08nestedIf;

import java.util.Scanner;

public class C01_NestedIf {
    public static void main(String[] args) {
        /*
        Task:Kullanicidan 3 tane pozitif bir tam sayi aliniz.
        bu üc sayinin ücgen olusturma durumunu kontrol ediniz.
        Eger ücgen olabiliyorsa eskenar ücgen olma durumunu kontrol ediniz.

        INFO: ücgen olma sarti nedir?
        Herhangi iki kenar toplami ücüncü kenardan büyük olmali,
        herhangi iki kenar farki diger kenardan kücük olmali.

        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c

        a=b=c ==> eskenar ücgen

       Java Nested If kodalri calistirirken cok zaman harciyor.
       Buna "Time     " denir.
       Mümkünse bununla kod yazilmamalidir.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ücgenin 3 kenar uzunlugunu giriniz.");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) { //Ücgen olma durumunu kontrol


            if (a == b && b == c) {
                System.out.println("Eskenar ücgen");
            } else {
                System.out.println("ücgen ama eskenar ücgen degildir");
            }
        } else {
            System.out.println("bu bir ücgen degildir.");
        }

        //EX2: Kullanicidan bir ücgenin kenar uzunlugunu aliniz.Üc kenari birbirine esit ise eskenar ücgen yazdirin.
        //Sadece iki kenar uzunlugu esit ise ikizkenar ücgen yazdirin.
        //Tüm kenarlari farkli ise cesitkenar ücgen yazdirin.

        System.out.println("Lütfen ücgenin 3 kenar uzunlugunu giriniz.");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (x + y > z && x - y < z && x + z > y && x - z < y && y + z > x && y - z < x) {
            if (x == y && y == z) {
                System.out.println("Eskenar ücgen");
            } else if (x == y || y == z || x == z) {
                System.out.println("Ikizkenar ücgen");
            } else {
                System.out.println("Cesit kenar ücgen");
            }
        }else {
            System.out.println("Bu bir ücgen degildir.");
        }


    }//main body
}//Class body
