package day32collections.selfStudy;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {

        //Kullanicidan iki sayi aliniz büyük olmayan sayiyi yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        double a = input.nextDouble();
        System.out.println("Lütfen ikin sayiyi giriniz");
        double b =input.nextDouble();

        double sonuc= a>b ? a : b;
        System.out.println("Büyük sayi = " + sonuc);


        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        System.out.println("Lütfen sayiyi giriniz");
        int x = input.nextInt();

        int sonuc2= x>=0 ? x : Math.abs(x);

        System.out.println("Sayinin mutlak degeri = " + sonuc2);



    }//Main
}//Class
