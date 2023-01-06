package day07ifstatementSüleymanHoca;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {
        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir character giriniz.");

        char ch=input.next().charAt(0);

        if (ch>='A' && ch <='Z'){
            System.out.println("Büyük Harf");
        } //If body






    } //Main body

}//Class body
