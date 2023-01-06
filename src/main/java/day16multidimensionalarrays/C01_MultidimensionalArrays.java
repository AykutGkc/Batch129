package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        Bir arrayin icerisinde ki data yine bir array ise buna multidimensional Array denir.
         */

        //Multidimensional arrayler nasil olusturulur?

        int arr[][]=new int[3][2]; //Auter array ==>3
                                   // Inner array ==>2 olan bir multidimensional array olusturduk.
                                   // Bu yöntemle inner arrayler sabit olmak zorunda.
        System.out.println(Arrays.toString(arr)); //Icinde ki data non-primitiv oldugu icin adresleri görürüz

        System.out.println(Arrays.toString(arr[1])); // [0, 0]

        System.out.println(Arrays.toString(arr[2])); // [0, 0]

        System.out.println(Arrays.deepToString(arr)); //  [[0, 0], [0, 0], [0, 0]] ==>MULTIDIMENSONAL ARRAYLER BÖYLE YAZDIRILIR

        //Arraylere eleman eklemenin 2. yöntemi:
        //Hem declare edip hemde deger atama

        int arr2[][]={{2,3},{9},{78,6,4,5}};
        System.out.println("Hem declare edip hemde deger atamasi ile: " + Arrays.deepToString(arr2)); //[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("Hem declare edip hemde deger atamasi ile 2.index: "+ Arrays.toString(arr2[2])); // [78, 6, 4, 5]
        System.out.println("Hem declare edip hemde deger atamasi ile 0.index: "+ Arrays.toString(arr2[0])); //[2, 3]
        System.out.println("Hem declare edip hemde deger atamasi ile 1.index: "+ Arrays.toString(arr2[1])); //[9]

        //Multi Dimensional Arraylere nasil eleman eklenir?
        //Önce kati cagirip ekleme yapiyoruz.

        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr)); // [[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1])); //[6, 18]
        System.out.println(arr[1][0]); //6

        //EX: String bir multidimentional Array olusturun, icerisine datalari ekleyin,toplam eleman sayisini ekrana yazdirin.

        String brr[][]=new String[3][2];
        brr[0][0]="a";
        brr[0][1]="b";

        brr[1][0]="c";
        brr[1][1]="d";

        brr[2][0]="e";
        brr[2][1]="f";

        System.out.println(Arrays.deepToString(brr));// [[a, b], [c, d], [e, f]]

        int sum=0; // Toplami yazdirmak icin variables olusturdum

        for (String[] w : brr) { //Testlerde w yerine each de kullanilir. Her bir demek. w=each
                sum=sum+ w.length;
        }//for

        System.out.println(sum);
















    }//MAIN
}//CLASS
