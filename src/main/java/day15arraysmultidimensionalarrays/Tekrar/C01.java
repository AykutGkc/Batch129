package day15arraysmultidimensionalarrays.Tekrar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    //Bir ögretmenin okulunda ki ögretmenin ögrencilerin isimlerini applicationa yüklemesini saglayan kodu yaziniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kac ögrenci ismi gireceksiniz");
        int numOfstd= input.nextInt();


        String [] stfName=new String[numOfstd];
        System.out.println("Cikmak icin Q ya basiniz");


        for (int i = 1; i <=numOfstd ; i++) {

            System.out.println("Lütfen "+i + ". ögrencinin ismini giriniz ");
            String nameOfstd = input.next();

            if (nameOfstd.equalsIgnoreCase("Q")) {
                break;
            }

                stfName[i-1]=nameOfstd;




        }


        System.out.println(Arrays.toString(stfName));



    }



}
