package day13whileloopdowhileloop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.
        // Java==> J*a*v*a

        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String word =input.next();

        String newWord="";

        int k=0 ;
        while (k <word.length()) {

            newWord=newWord+word.charAt(k)+ "*";

            k++;
        }
        System.out.println(newWord);


    }//Main
}//body
