package day03scanner_slm;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanicidan ilk ismini ve soyismini alip ikisini de ayni satirda ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk isminizi giriniz.");
        //next() method kullanicidan String almak icin kullanilir.
        String firstName = input.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String lastname=input.next();

        System.out.println("ilk isminiz = " + firstName );
        System.out.println("Soyisminiz = " + lastname);

    }//Main body
}//Class body
