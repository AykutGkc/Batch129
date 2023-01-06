package practice.Regularjavapractice.practiceday01;

import java.util.Scanner;

public class C02_Variables {

          /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
        salona devam edeceği ay süresi
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("TEchProEd Spor salonuna Hos geldiniz...");

        System.out.println("Lütfen isim ve soyisim giriniz.");
        String isim = input.nextLine(); // tüm satiri alir.

        System.out.println("Lütfen Yasinizi giriniz...");
        byte yas = input.nextByte();

        System.out.println("Lütfen kilonuzu giriniz...");
        double kilo = input.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz...");
        double boy = input.nextDouble();

        int aylikÜcret = 20;
        System.out.println("aylikÜcret = " + aylikÜcret);

        System.out.println("Kac ay geleceginizi giriniz...");
        int ay = input.nextInt();

        int toplamTutar = aylikÜcret * ay;
        System.out.println("Isminiz : " + isim + "\t" + "Yasiniz : " + yas + " Kilonuz : " + kilo + " Boyunuz : " + boy +
                " Ödemeniz gereken toplam tutar : " + toplamTutar + "$");





    }//Main body
}//Class body
