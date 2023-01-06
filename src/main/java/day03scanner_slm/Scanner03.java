package day03scanner_slm;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen adresinizi giriniz...");

        String address = input.nextLine();
        //nextLine() metodu kullanicidan cok kelimeli String almak icin kullanilir.
        System.out.println("Adresiniz = " + address);
    }
}
