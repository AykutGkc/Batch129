package practice.Advancejavapractice.practiceday08_140123;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfleriKapa {
    public static void main(String[] args) {


        /*
        Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir karakteri bir array elemanı olarak yazdıran bir kod yazınız.
         Örn:
        input: Merhaba
        output: [M, *, r, h, *, b, *]
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String str=input.nextLine();

        String [] arr=new String[str.length()];
        int idx=0;

        for(String w:str.split("")){
            if(w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") ||
               w.equalsIgnoreCase("i") || w.equalsIgnoreCase("o") ||
               w.equalsIgnoreCase("u")){
                arr[idx]="*";
                idx++;
            }else{
                arr[idx]=w;
                idx++;
            }

        }

        System.out.println(Arrays.toString(arr));



    }//main
}//Class
