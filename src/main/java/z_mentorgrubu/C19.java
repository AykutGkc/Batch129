package z_mentorgrubu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C19 {
    public static void main(String[] args) {

      List<Integer> list1=new ArrayList<Integer>();
      List<Integer> list2=new ArrayList<Integer>();

      list1.add(1);
      list1.add(2);
      list1.add(3);

      list2.add(4);
      list2.add(5);
      list2.add(6);
      list2.add(7);

        System.out.println(list1);
        System.out.println(list2);

        list2=list1;

        System.out.println(list2);

        System.out.println(list1);

        int arr1 [] =new int[3];

        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;


        int arr2 [] =new int[4];

        arr2[0]=4;
        arr2[1]=5;
        arr2[2]=6;
        arr2[3]=7;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2=arr1;

        System.out.println(Arrays.toString(arr2));

    }
}
