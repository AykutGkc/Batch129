package day08nestedIfTernarySüleymanHoca;

import java.util.Scanner;

public class NestedIf01 {

    /*
    Java NestedIf leri calistirirken cok zamana ihtiyac duyar. (Time consuming)
    Bu yüzden mümkün oldugu kadar NestedIf kullanmamaya calisiriz.
     */

    public static void main(String[] args) {

        /*
         Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ücgenin kenarlari icin 3 uzunluk giriniz");
        //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
        //double a = Math.abs(input.nextDouble());
        //double b = Math.abs(input.nextDouble());
        //double c = Math.abs(input.nextDouble());

        //Kullanicinin negatif sayi girmesini affetmiyorum.
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ücgenMi = (a + b > c && c < Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("ücgenin kenarlari negatif olamaz");
        } else if (ücgenMi) {
            if (a == b && b == c && a == c) {
                System.out.println("Sen eskenar ücgensin ");
            } else {
                System.out.println("Ücgen ama eskenar degil.");
            }
        } else {
            System.out.println("Sen Ücgen degilsin");
        }


    }//Main Body
}//class body
