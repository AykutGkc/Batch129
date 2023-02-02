package day32collections.selfStudy;

import java.util.Scanner;

public class C018_NestedLoop {
    public static void main(String[] args) {

        /*
        Example 1: Asagidaki sekli cizen kodu yaziniz
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
                */

        int sayi=5;

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1 ; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


   /*

                      *
                     * *
                    *   *
                   *     *
                  * * * * *

                    ooooo*
                    oooo* *
                    ooo*   *
                    oo*     *
                    o* * * * *

            Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();//5


        for (int i = 1;     i <=row ;                   i++) {//satir kontrol

            for (int bosluk = row; bosluk >= i;                 bosluk--) {//bosluk kontrol soldaki konsoldan uzaklastiran
                // en ust satirdaki 5 bosluk; alttaki 4 bosluk; bir altindaki 3  bosluk;2 ve 1 bosluk
                System.out.print(" ");//o
            }
            for (int yildiz = 1; yildiz <= i;               yildiz++) {//* kontrol 1.satirdaki *
                //2.satirdaki *==>* *  3.satirdaki *==>* *  4.satirdaki *==>* *

                if (yildiz == 1 || yildiz == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == row) {
                    System.out.print("* ");//en alt satirdaki  *
                } else
                    System.out.print("  ");//3. ve 4.satirdaki iki bosluk
            }//for yildiz+ if else
            System.out.println();
        }//for auter satir




    }
}
