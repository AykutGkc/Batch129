package day08nestedIf;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int a=input.nextInt();

        System.out.println( a<=0 ? (a*-1) : (a)    );

        // Kullanicidan alinan sayinin pozitif mi negatif mi oldugunu yazdirin.

        System.out.println("Lütfen bir sayi giriniz");
        int b=input.nextInt();

        String sonuc= a>=0 ? "Sayi pozitiftir" : "Sayi negatiftir ";

        System.out.println(sonuc);







    }
}
