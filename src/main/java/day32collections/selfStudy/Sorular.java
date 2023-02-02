package day32collections.selfStudy;

import java.util.Scanner;

public class Sorular {

    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */


    public static void main(String[] args) {


      /*  Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin ve asagida ki gibi yazdirin
        Isim-Soyisim: A**** G****
        Kart-No: **** **** **** 1907

       */


        Scanner scan = new Scanner(System.in);
        System.out.print("Isim: ");
        String isim = scan.nextLine();
        System.out.print("Soyisim: ");
        String soyisim = scan.nextLine();
        System.out.print("Kredi Kartı Numarası: ");
        String kart_no = scan.nextLine();
        String isim_yeni = "" + isim.charAt(0);
        String soyisim_yeni = "" + soyisim.charAt(0);
        for (int i = 1; i < isim.length(); i++) {
            isim_yeni += "*";
        }
        for (int i = 1; i < soyisim.length(); i++) {
            soyisim_yeni =soyisim_yeni+ "*";
        }
        String kart_no_yeni = "";
        for (int i = 0; i < 12; i++) {
            kart_no_yeni =kart_no_yeni+ "*";
        }
        kart_no_yeni += kart_no.substring(12);
        System.out.println("Isim-Soyisim: " + isim_yeni + " " + soyisim_yeni);
        System.out.println("Kart-No: " + kart_no_yeni);











    }








}
