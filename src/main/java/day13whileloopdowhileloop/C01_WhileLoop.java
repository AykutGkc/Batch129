package day13whileloopdowhileloop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen carpim tablosunu görmek icin bir sayi giriniz");
        int num= input.nextInt();

        int i =1;
        while (i<11){

            System.out.println(num + "x" + i + "=" + (num*i));

            i++;
        }


    }//MAin
}//class
