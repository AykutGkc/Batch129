package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //Interview questions

        //[0, 2, 3 , 0 , 12 , 0] 0. indexi en sona koyunuz.

        int original[]={0, 2, 3 , 0 , 12 , 0};

        int yeni[]=new int [original.length]; // [0, 0, 0, 0, 0, 0]

        int idx=0;

        for (int i = 0; i <original.length ; i++) { //orjinal array icin calisti.
            if (original[i]!=0){
                yeni[idx]=original[i];



                idx++; //Bir sonraki indexe gecer.
            }
        }
        System.out.println(Arrays.toString(yeni));




    }//Main
}//class
