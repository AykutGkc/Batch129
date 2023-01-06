package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //ÖRNEK1: Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz.

        //1.Adim: Scanner clasindan object olusturun
        Scanner input= new Scanner(System.in);

        //2.adim: kullaniciya ne yapacagini söyle
        System.out.println("Lütfen toplanacak olan ilk sayi giriniz");

        //3.adim: kullanicidan aldiginiz datayai variable icine koyun.

        double sayi1=input.nextDouble();

        System.out.println("Lütfen toplanacak olan ikinci sayiyi giriniz");
        double sayi2=input.nextDouble();

        System.out.println("Toplam=  " + (sayi1+sayi2));




    } //Main bodysi

}//Class bodysi
