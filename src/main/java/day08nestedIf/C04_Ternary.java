package day08nestedIf;

import java.util.Scanner;

public class C04_Ternary {
    //Kullanicidan iki sayi aliniz büyük olmayan sayiyi yaziniz.
    public static void main(String[] args) {

        //1.Yol
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();

        if(sayi1<sayi2) {
            System.out.println("Büyük olmayan sayi : " + sayi1 );
        }else if(sayi1>sayi2) {
            System.out.println("Büyük olmayan sayi : " + sayi2);
        }else{
            System.out.println("Sayilar birbirine esittir.");
        }

        //2.Yol:
                            //Condition ?  True         :   False
                            //Sart      ?
        System.out.println(sayi1==sayi2 ? "Sayilar esit" : sayi1>sayi2 ? sayi2 + " kücük sayidir." : sayi1 + " kücük sayidir.");


    } //Main body
}//Class Body
