package day20passbyvalueoverloading;

import java.util.Arrays;

public class C03_PassByValueArray03 {
    public static void main(String[] args) {

        int sayilar[]={3,4,5,6};

        System.out.println("sayilar = " + Arrays.toString(sayilar));

        elemanDegistir(sayilar);

        System.out.println("main icinde eleman degisince sayilar: " + Arrays.toString(sayilar)); //[10, 4, 5, 6]

        arrayDegistir(sayilar);
        System.out.println("main icinde ki Arrayidegistir sayilar = " + Arrays.toString(sayilar));

    }//MAin

    private static void arrayDegistir(int[] sayilar) {
        sayilar=new int [6];
        System.out.println("Arrayssayilar: "+ Arrays.toString(sayilar));
    }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0]=10;
        System.out.println("Method icinde eleman degisince sayilar: " + Arrays.toString(sayilar)); //[10, 4, 5, 6]
    }
}//Class
