package z_mentorgrubu;

import java.util.Arrays;

public class C10_day16_010123 {
    public static void main(String[] args) {

      //  1)String bir multidimentional Array olusturun, icerisine datalari ekleyin,toplam eleman sayisini ekrana yazdirin.(C01_MultidimensionalArrays)

        String arr [][]= new String[3][2];  //  String arr [][]={{a, b, z}, {c, d}, {f}}

        arr[0][0] = "a";
        arr[0][1] = "b";

        arr[1][0]="c";
        arr[1][1]="d";

        arr[2][0]="e";
        arr[2][1]="f";

        System.out.println(Arrays.deepToString(arr));

      int sayac=0;
//        for (String[] w : arr) {
//            topEleman+=w.length;
//        }
//
//        System.out.println(topEleman);
//


        for (int i = 0; i <arr.length ; i++) {
           sayac+=arr[i].length;

        }

        System.out.println(sayac);

    }
}
