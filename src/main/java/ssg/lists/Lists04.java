package ssg.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        // verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};

        //1.Yol -->method
        List<String> arraydenlist2= Arrays.asList(arr);
        System.out.println(arraydenlist2);



        //2.Yol -->foreach ile
        List<String> arraydenList = new ArrayList<String>();

        for (String w : arr) {
            arraydenList.add(w);
        }

        System.out.println(arraydenList);


        //3.yol
        List<String> list3=new ArrayList<>(List.of(arr));
        System.out.println(list3);


    }//Main
}//class
