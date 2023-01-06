package day12forloopwhileloop;

import java.util.Scanner;

public class C04_ForLoop04 {
    public static void main(String[] args) {

        /*
   Ex1:Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
        ekrana yazdiriniz  //10  12  14
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangic degerini giriniz");
        int start = input.nextInt();

        System.out.println("Lütfen bitis degerinden giriniz");
        int end = input.nextInt();

        if (start > end) {
            System.out.println("Baslangic degeri bitis degerinden büyük olamaz");
        } else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }


    }//Body of main
}//Body of class
