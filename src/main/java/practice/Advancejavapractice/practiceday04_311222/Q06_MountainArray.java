package practice.Advancejavapractice.practiceday04_311222;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06_MountainArray {
    public static void main(String[] args) {

        /*
    Bir Array'in Mountain Array olup olmadýðýný kontrol eden bir kod yazýnýz.
    Mountain Array: Element deðerleri bir noktaya kadar sürekli artýp o noktadan sonra sürekli azalan Array.
     */

        int[]  arr = {-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

         //Arrayi liste cevir.
        List<Integer> list=new ArrayList<>();

        for (int w : arr) {
            list.add(w);
        }

        System.out.println("list = " + list);

        //Max degeri bul

        int max=list.get(0);
        for (int w : list) {
            if (w>max){
              max=w;
            }
        }
        System.out.println("max = " + max);

        //List1

        List<Integer> list1 = new ArrayList<>();
        for (int i=0 ; i<list.size() ; i++) {
            if (list.get(i)==max){
                break;
            }
            list1.add(list.get(i));
        }//For

        System.out.println("list1 = " + list1);

        //List2

        List<Integer> list2=new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i++) {
            if (i<list.indexOf(max)){
                continue;
            }
            list2.add(list.get(i));
        }//For

        System.out.println("list2 = " + list2);

        // Yedekleyip Sirala
        List<Integer> list1Copy=new ArrayList<>(list1);
        List<Integer> list2Copy=new ArrayList<>(list2);

        Collections.sort(list1Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);
        System.out.println("list1Copy = " + list1Copy);
        System.out.println("list2Copy = " + list2Copy);

        //Kontrol
        if (list1.equals(list1Copy)&&list2.equals(list2Copy)){
            System.out.println("Mountain Array");
        }else{
            System.out.println("Mountain Array degil");
        }




    }//main
}//if
