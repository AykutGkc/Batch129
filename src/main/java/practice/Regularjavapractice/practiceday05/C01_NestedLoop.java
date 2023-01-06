package practice.Regularjavapractice.practiceday05;

import java.util.Scanner;

public class C01_NestedLoop {

    //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi =5 olsun

/*


    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    |||
    |||
    |||
    |||
    |||


      */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen agacin tac uzunlugunu giriniz.");
    int tac =input.nextInt();
    String yaprak="^";

    for (int i = 0; i <tac ; i++) {
        yaprak+="^";
        System.out.println(yaprak);
    }

    for (int i = 0; i <5 ; i++) {
        System.out.println("|||");
    }



}//Main
}//Class
