package day03scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Ex : Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz.");

        int num=input.nextInt(); //12345

        int ilkIkiRkm = num/1000;//12
        System.out.println("Ilk iki rakam==>" + ilkIkiRkm);

        int ilkIkiTop= (ilkIkiRkm%10)+(ilkIkiRkm/10);
        System.out.println("ilk iki Toplami==>"+ ilkIkiTop);

        int sonIkiRkm= num%100 ;//45
        System.out.println("son Iki rakam ==>" + sonIkiRkm);

        int sonIkiTop=(sonIkiRkm%10 + sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);


        int toplam= ilkIkiTop + sonIkiTop ;
        System.out.println("toplam = " + toplam);




    }//Main body
}//Class body
