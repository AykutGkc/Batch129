package ssg.scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //  Uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Prizmanin genisligini giriniz");
        int width = input.nextInt();
        System.out.println("Lütfen Prizmanin yüksekligini giriniz ");
        int height = input.nextInt();
        System.out.println("Lütfen Prizmanin uzunlugunu giriniz.");
        int length = input.nextInt();

        System.out.println("Prizmanin hacmi = " + width * height * length);

        System.out.println("Dikdörtgen Hacmi = " + dikdörtgenHacmi(length,height,width));


    } // Main Body

    public static int dikdörtgenHacmi(int width, int height, int length){
        return width * height * length;
    }


}




