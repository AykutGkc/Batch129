package z_mentorgrubu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04 {

    public static void main(String[] args) {


        //6.  int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 }; bu array de 7 elemaninin olup olmadigini kontrol etme,
        //    var ise true, yoksa false yazdiran metotu olusturun

        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};

        int eleman = 7;
        int sayac = 0;

        for (int w : arr) {
            if (w == eleman) {
                sayac++;
            }
        }

        if (sayac > 0) {
            System.out.println("Var");
        } else {
            System.out.println("yok");
        }


        //7. verilen bir array deki tüm elementleri bir saga kaydirip
        //  sondaki elementide basa tasiyacak bir metot olusturun ve array'i yeni hali ile kaydedin
        //        int[] arr={4,5,6,7,8,5,6}; mesela bu arr={6,4,5,6,7,8,5} seklinde olacak


                   //[6, 5, 8, 7, 8, 5, 6]
        int[] arr1 = {1,2,3};
        int i =0;
               while (i<arr1.length-1){
                   arr1[i]=arr1[arr1.length-1] ;
                    i++;
               }

        System.out.println(Arrays.toString(arr1));








     /*   int[] yeni={4, 5, 6, 7, 8, 5, 6};
a
        arr1[0] = arr1[arr1.length - 1];

        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i + 1]]=yeni[i];
        }
*/

    }


}
