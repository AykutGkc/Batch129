package practice.Advancejavapractice.practiceday01_201222;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    public static void main(String[] args) {
        //Kullanicidan tek sefrde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        //Ad ayri soyad ayri sekilde ekrana yazdiriniz.
        //Örn:
        //Ad:Ali
        //Soyad: Can


        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen adinizi soyadinizi arada bir bosluk olacak sekilde giriniz.");
        String adSoyad= input.nextLine().replaceAll("[^a-zA-Z]", " ").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);

        String ad= adSoyad.split(" ")[0];
        String soyad= adSoyad.split(" ")[1];

        String adIlkHarf=ad.substring(0,1).toUpperCase();
        String soyadIlkHarf=soyad.substring(0,1).toUpperCase();

        String adFormat= adIlkHarf+ad.substring(1);
        String soyadFormat= soyadIlkHarf+soyad.substring(1);

        System.out.println("Ad : = " + adFormat);
        System.out.println("Soyad :  = " + soyadFormat);

    }//Main
}//class
