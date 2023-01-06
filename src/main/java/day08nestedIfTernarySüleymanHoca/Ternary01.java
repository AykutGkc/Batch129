package day08nestedIfTernarySüleymanHoca;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi aliniz "Büyük olmayan"i yazdiriniz

        Scanner input=new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double  a=input.nextDouble();
        double  b=input.nextDouble();


        //1.Yol:
        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.Yol: Ternary
        //              //condition ? Contion true ise calisir : Conditon false ise calisir.   ;
        double result=       a<b    ?            a             :            b                  ;
        System.out.println(result);







    }//Main body
}//Class body
