package practice.Regularjavapractice.practiceday03;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz 2 sayiyi yine kullaniciya sectireceginiz dört
        islemden biri ile isleme koyup yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen islem türünü seciniz. \n Toplama =>1 \n Cikarma=>2 \n Carpma=3 \n Bölme=>4");
        int islem = input.nextInt();
        System.out.println("Lütfen iki tam sayi giriniz.");
        double num1 = input.nextDouble();//1.Sayi assign edildi.
        double num2 = input.nextDouble(); //2.Sayi assign edildi

        if (islem == 1) {
            System.out.println("Toplama isleminin sonucu: " + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu: " + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Carpma isleminin sonucu: " + num1 + "*" + num2 + "= " + (num1 * num2));
        } else if (islem == 4) {
            System.out.println("Bölme isleminin sonucu: " + num1 + "/" +num2 +"=" + (num1 / num2));
        } else {
            System.out.println("Hatali secim yptiniz.Lütfen tekrar deneyiniz.");
        }


    }//Main body
}//Class body
