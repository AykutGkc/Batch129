package z_mentorgrubu;

import java.util.Scanner;

public class C07_day12_271222 {
    public static void main(String[] args) {

          /*
   Ex1:Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
        ekrana yazdiriniz  //10  12  14
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen baslangic degerini giriniz");
        int baslangic=input.nextInt();
        System.out.println("Lütfen bitis degerini giriniz");
        int bitis=input.nextInt();

        if (bitis <baslangic){
            System.out.println("Bitis degeri baslangic degerinden kücük olamaz");
        }else {
            for (int i = baslangic; i <= bitis; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }//main
}//class
