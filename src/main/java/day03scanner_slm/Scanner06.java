package day03scanner_slm;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlari toplamini yazdiran kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Bes bassamakli bir sayi giriniz.");
        int number= input.nextInt();

        int lastDigit= number%10;
        System.out.println(lastDigit);

        number=number/10;
        System.out.println(number);


    }
}
