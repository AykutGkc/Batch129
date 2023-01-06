package day15arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {

        //Bir ögretmenin okulunda ki ögretmenin ögrencilerin isimlerini applicationa yüklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ögrenci ismi gireceksiniz.");
        int numOfStd= input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println("Cikmak istiyorsaniz lütfen Q harfine basiniz.");

        for (int i = 1; i <=numOfStd ; i++) {
            System.out.println("Lütfen " + i + ". ögrencinin ismini giriniz.");
           String stdName= input.next();
           if (stdName.equalsIgnoreCase("Q")){
               break;
           }

           names[i-1]= stdName;
        }
        System.out.println(Arrays.toString(names));



    }//Main
}//Class
