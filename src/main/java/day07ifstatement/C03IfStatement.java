package day07ifstatement;

import java.util.Scanner;

public class C03IfStatement {
    public static void main(String[] args) {

        /*
        iki tane String datanin birbirinr esit olup olmadigini anlamak icin "==" degil, equals methodunu kullaniriz.
        I)equals() methodu icin büyük küyük harf önemlidir.
        II)equalsIgnoreCase() methodu büyük kücük harf önemsemez. Ayni kabul eder.
         */

        //Kullanicidan gün isimlerini aliniz ve haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.

        //1.Yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String day = input.next();

        if (day.equalsIgnoreCase("Cumartesi") || day.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (day.equalsIgnoreCase("pazartesi") || day.equalsIgnoreCase("sali") ||
                day.equalsIgnoreCase("carsamba") || day.equalsIgnoreCase("Persembe") ||
                day.equalsIgnoreCase("cuma")) {
            System.out.println("Haftaici");
        } else {
            System.out.println("Lütfen gecerli bir gün giriniz.");
        }//Else body

        //2.Yol

        boolean haftaIci= day.equalsIgnoreCase("pazartesi") || day.equalsIgnoreCase("sali") ||
                day.equalsIgnoreCase("carsamba") || day.equalsIgnoreCase("Persembe") ||
                day.equalsIgnoreCase("cuma");

        boolean haftaSonu= day.equalsIgnoreCase("Cumartesi") || day.equalsIgnoreCase("Pazar");

        if(haftaIci){
            System.out.println("Haftaici");
        }else if (haftaSonu){
            System.out.println("Haftasonu");
        }else {
            System.out.println("Lütfen gecerli bir gün gitiniz.");
        }





    }//Main body
}//Class body
