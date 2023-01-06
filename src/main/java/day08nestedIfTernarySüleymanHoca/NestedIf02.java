package day08nestedIfTernarySüleymanHoca;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        //EX2: Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ücgenin kenarlar icin 3 uzunluk giriniz");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        boolean ücgenMi = (a + b > c && c < Math.abs(a - b)) || (a + c > b && b > Math.abs(a - c)) || b + c > a && a > Math.abs(b - c);

        if (a<=0 || b<=0 || c<=0){
            System.out.println("Negatif kenar uzunlugu olamaz");
        }
        else if (ücgenMi){
            if (a==b && b==c && a==c){
                System.out.println("Eskenar Ucgen");
            }else if (a==b || a==c || b==c){
                System.out.println("Ikizkenar ücgen");
            }else{
                System.out.println("Cesitkenar Ücgen");
            }
        }else {
            System.out.println("Ücgen degil...");
        }



    }//Main Body
}//Class body
