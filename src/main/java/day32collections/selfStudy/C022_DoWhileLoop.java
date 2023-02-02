package day32collections.selfStudy;

import java.util.Scanner;

public class C022_DoWhileLoop {
    public static void main(String[] args) {

 /*
        Kullanicidan bir tamsayi aliniz.
        Tam sayi 100'den kücük ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandiriniz.
        Tam sayi 100 ve 100'den büyük ise "Kazandiniz" mesaji vererek oyuna devam ettiriniz.
         */


        Scanner input=new Scanner(System.in);

             int sayi=0;
        do {
            System.out.println("Lütfen bir tamsayi giriniz.");
            sayi=input.nextInt();

            if (sayi>100) {
                System.out.println("Kazandiniz");
            }


        }while(sayi>=100);

        System.out.println("Kaybettiniz");



    }
}
