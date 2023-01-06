package day16multidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {
    public static void main(String[] args) {

        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 2}, {32, 75}};

        int sum = 0;
        System.out.println(Arrays.deepToString(arr)); // [[2, 5, 2], [32, 75]]

        for (int[] w : arr) { //[[2, 5, 2], [32, 75]]
            for (int k : w) { // k artik array degil, arrayin icinde ki integer deger.
                sum = sum + k;
            }
        }
        System.out.println("Arrayler toplami : " + sum);

        //Multidimensional Arrayi tek katli Arraye cevirme:

        /*
        1)önce multidimensional Arrayin eleman sayisini bulun.
        2)Yeni bir Array almaliyim.
          Bu Arrayin büyüklügü ilk multidimensional Arrayin eleman sayisina esit büyüklükte olmali.
        3)
         */

        int brr[][] = {{2, 5, 1}, {32, 75}}; //3+2=5 Daire var.

        int toplam=0;
        System.out.println(Arrays.deepToString(brr)); //[[2, 5, 1], [32, 75]]

        for (int[] w : brr) { //brr MD arrayin icinden her bir w arrayini al.
            toplam=toplam+w.length;
        }

        System.out.println("Arrayde ki toplam eleman sayisi : " +toplam); //5

        int idx=0;
        int crr[]=new int[toplam];

        for (int[] w : brr) {
            for (int k : w) { //w arrayinin icinde ki her bir k degerini getir.
                //yeni crr arrayinin icine idx'e göre yerlestir.
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr)); //[2, 5, 1, 32, 75]




    }//main
}//class
