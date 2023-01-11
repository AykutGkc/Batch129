package z_mentorgrubu;

import java.util.ArrayList;
import java.util.List;

public class c18 {
    public static void main(String[] args) {

//        Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
//        toplamını yazdıran bir program yazın. (Q04_MultiArray_AyniIndexTop)
//                arr1[]={{1,2},{3,4,5}{6}}
//        arr2[]={{7,8,9},{10,11},{12}}


        List<Integer> yeni=new ArrayList<Integer>();

      int [][] arr1={{1,2},{3,4,5,6,7},{6}, {10,11}, {12}};
      int[][] arr2={{7,8,9},{10,11},{12}};
      int toplam=0;

      int elemanSAyisi=0;
      if (arr1.length< arr2.length){
          elemanSAyisi=arr1.length;
      }else {
          elemanSAyisi=arr2.length;
      }

        for (int i = 0; i <elemanSAyisi ; i++) {
            toplam=0;
            int index;
            if (arr1[i].length< arr2[i].length){
                index=arr1[i].length;
            }else {
                index=arr2[i].length;
            }
            for (int j = 0; j <index ; j++) {
                toplam=0;
                toplam+=arr1[i][j]+arr2[i][j];
                yeni.add(toplam);

            }

            System.out.println(yeni);

        }







    }
}
