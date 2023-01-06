package selfStudy;

import java.util.Scanner;

public class C06_NestedIf {
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

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci kenar uzunlugunu giriniz.");
        double a=input.nextDouble();
        System.out.println("Lütfen ikinci kenar uzunlugunu giriniz");
        double b=input.nextDouble();
        System.out.println("Lütfen ücüncü kenar uzunlugunu giriniz");
        double c=input.nextDouble();

        boolean ücgenMi= (c<a+b && c>Math.abs(a-c)) && (b<a+c && b>Math.abs(a-c)) && c<b+c && c>Math.abs(b-a);

       if (a>0 && b>0 && c>0) {
           if (ücgenMi) {
               if (a == b && b == c) {
                   System.out.println("Eskenar ücgendir.");
               } else {
                   System.out.println("Ücgen ama eskenar degil");
               }
           } else {
               System.out.println("ücgen degildir.");
           }
       } else {
           System.out.println("Negatif sayilardan ücgen olmaz");
       }






    }//Main body
}//If Body
