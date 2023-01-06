package day03scanner_slm;


import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
        //1)Alanini hesaplayiniz. ==>Kisa kenar*uzun kenar
        //2)Cevresini hesaplayiniz==>2*(kisa kenar+uzun kenar)

        Scanner input=new Scanner(System.in);

        System.out.println("Dikdörtgenin kisa kenar uzunlugunu giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Dirtdörtgenin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();

        System.out.println("Dirtdörtgenin alani= " +shortSide*longSide);
        System.out.println("Dirtdörtgenin cevresi= " + 2*(shortSide+longSide));
    }
}
