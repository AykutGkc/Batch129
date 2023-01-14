package day14arraysforeachloop.Tekrar;

import java.util.Arrays;

public class C04 {
    public static void main(String[] args) {
        //Example 1:String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz

        String arr[]=new String[6];

        arr[0]="Blue";
        arr[1]="Black";
        arr[2]="White";
        arr[3]="Yellow";
        arr[4]="Braun";
        arr[5]="Red";


        for (String w : arr) {
            if (w.equalsIgnoreCase("yellow")){
                break;
            }
            System.out.println(w);
        }


    }
}
