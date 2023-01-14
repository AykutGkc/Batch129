package day14arraysforeachloop.Tekrar;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int [] arr=new int[6];

        arr[0]=23;
        arr[1]=14;
        arr[2]=44;
        arr[3]=55;
        arr[4]=43;
        arr[5]=65;


        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0]+arr[arr.length-1]);




    }
}
