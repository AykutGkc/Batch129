package practice.Advancejavapractice.practiceday01_201222;

import java.util.Arrays;

public class Q05_ForEach_EuroDolar {
    public static void main(String[] args) {

        /*
        Tek bir string icerisinde verilen euro ve dolarin ayri ayri toplamlarini bulan kod yaziniz.
        String= $1 "$12 €34 €56 $45 €78";
        dolarToplami:58
        euroToplami:168
         */

        String str= "$1 $12 €34 €56 $45 €78";

        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr)); //[$1, $12, €34, €56, $45, €78]

        int dolarToplam=0;
        int euroToplam=0;

        for( String w:arr){

            if (w.contains("$")){
               dolarToplam +=Integer.parseInt(w.replaceAll("\\D",""));
            }else{
                euroToplam += Integer.parseInt(w.replaceAll("\\D",""));
            }

        }

        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);








}

}