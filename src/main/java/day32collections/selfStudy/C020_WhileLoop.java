package day32collections.selfStudy;

import java.util.Scanner;

public class C020_WhileLoop {

    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 0 il1 10 arasinda bir sayi giriniz.");
        int sayi = input.nextInt();


        int i=1;
        while(i<11){

            System.out.println( i+ "x"+sayi + "="  +sayi*i);
            i++;


        }










    }


}
