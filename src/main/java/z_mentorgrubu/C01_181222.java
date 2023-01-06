package z_mentorgrubu;

import java.util.Scanner;

public class C01_181222 {
    public static void main(String[] args) {

      /*  1)Kullanicidan 3 tane pozitif bir tam sayi aliniz.
        bu üc sayinin ücgen olusturma durumunu kontrol ediniz.
        Eger ücgen olabiliyorsa eskenar ücgen olma durumunu kontrol ediniz.

                INFO: ücgen olma sarti nedir?
        Herhangi iki kenar toplami ücüncü kenardan büyük olmali,
        herhangi iki kenar farki diger kenardan kücük olmali.

        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ==> eskenar ücgen
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Ücgenin kenarlari icin 3 uzunluk giriniz.");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        if (a<0 || b<0 || c<0){
            System.out.println("Ücgenin kenarlari negatif olamaz.");
        }else if (a+b > c && c> Math.abs(a-b) && a+c>b && b>Math.abs(a-c) && b+c>a && a>Math.abs(b-c)){
            if(a==b && b==c ){
                System.out.println("Eskenar ücgen");
            } else {
                System.out.println("Ücgen ama eskenar degil");
            }
        }else {
            System.out.println("ücgen degildir.");
        }








    }//Main
}//Class
