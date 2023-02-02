package day32collections.selfStudy;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kacinci ay oldugunu yaziniz");
        int ayNumarasi=input.nextInt();

        switch(ayNumarasi) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("Oktober");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
        }

        // EX2:kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.

        Scanner input1=new Scanner(System.in);
        System.out.println("Lütfen islem yapacaginiz 1.sayiyi giriniz");
        int x=input1.nextInt();
        System.out.println("Lütfen islem yapacaginiz 2.sayiyi giriniz");
        int y=input1.nextInt();

        System.out.println("LÜtfen islem türünü seciniz. \n Toplama==>+ \n Cikarma ==>- \n Carpma==>*\n  Bölme==>/ ");
        char islemTürü= input1.next().charAt(0);

        switch(islemTürü) {
            case '+':
                System.out.println(x + "+" + y + "=" + (x+y));
                break;
            case '-':
                System.out.println(x + "-" + y + "=" + (x-y));
                break;
            case '*':
                System.out.println(x + "*" + y + "=" + (x*y));
                break;
            case '/':
                System.out.println(x + "/" + y + "=" + (x/y));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");
        }






        } //MAin body
}//Class body
