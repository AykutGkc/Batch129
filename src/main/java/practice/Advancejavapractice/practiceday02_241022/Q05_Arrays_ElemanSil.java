package practice.Advancejavapractice.practiceday02_241022;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElemanSil {
    public static void main(String[] args) {
       /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz.");
        int limit=input.nextInt();
        int[] arr = new int[limit];

        for(int i=0; i< limit; i++){
            System.out.println("Indeks " + i + " degerini giriniz.");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

        System.out.println("Silmek istediginiz indexi giriniz");
        int indexSil=input.nextInt();

        int[] arr2 =new int[limit-1];
        int idx=0;
        for(int i =0 ; i < limit; i++){
            if (i!=indexSil){
                arr2[idx]=arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(arr2));






    }//Main
}//Class
