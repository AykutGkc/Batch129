package day14arraysforeachloop.Tekrar;

import java.util.Arrays;

public class C03 {


    public static void main(String[] args) {

        //EX: String bir Array olusturunuz, 6 tane eleman yerlestiriniz, charaacter sayisi 5'den büyük elemanlari siliniz.


        String arr[]=new String[6];
        arr[0]="John";
        arr[1]="Tim";
        arr[2]="Hanks";
        arr[3]="Noah";
        arr[4]="Alexander";
        arr[5]="Charlie";

        int counter=0;

        for (String w : arr) {
            if (w.length()>5){
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        String newArr[]=new String[arr.length-counter];

        int idx=0;
        for (String w : arr) {
            if (w.length()<=5){
                newArr[idx]=w;
                idx++;
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}
