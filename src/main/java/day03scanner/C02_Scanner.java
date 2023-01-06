package day03scanner;

import java.util.Scanner;

public class C02_Scanner {
    //Scanner Clasi kullanici ile etkilesim kurmamizi saglar.
    //Scanner bir class'tir. Java util kütüphanesinden getirildigi icin import ister.

    public static void main(String[] args) {

        //Kullanicidan Data Almak icin;
        //1.Adim: Scanner clasindan object olusturun

        Scanner input = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in); Ikisinden biri kullanilir.

        //2.adim: kullaniciya ne yapacagini söyle
        System.out.println("Lütfen yasinizi giriniz");

        //3.adim: kullanicidan aldiginiz datayai variable icine koyun.
        byte age=input.nextByte();


        //kullaniciya ad,memleket,yas,boy, yasadigi yeri sevip sevmedigini soran bir kod yaziniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz.");
        String isim=scan.nextLine(); //Kullanicdan String Bir deger istedik. Tüm satiri almasi icin nextLine secilir.

        System.out.println("Lütfen memleketinizi giriniz.");
        String memleket=scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("Lütfen boyunuzu giriniz.");
        short boy=scan.nextShort();

        System.out.println("LÜtfen yasadiginiz yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu=scan.nextBoolean();


        System.out.println("***************");
        System.out.println("isim = " + isim);  //soutv ile kisa yoldan yapilabilir.
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);





    } //Main body'si

}//Class body'si
