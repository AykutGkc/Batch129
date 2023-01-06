package selfStudy;

import java.util.Random;
import java.util.Scanner;

public class KonsolOyunu {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 100);
        System.out.println("1'DEN 100'E KADAR BİR SAYI TUTTUM");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bİ TAHMİN YAP: ");
        int tahmin = 0;
        int sayac = 1;
        while ((tahmin = scanner.nextInt()) != number) {
            if (number > tahmin) {
                if (number - tahmin < 10) {
                    System.out.println("Yaklaştın!! Çık!");
                } else {
                    System.out.println("Çık!");
                }
            } else {
                if (tahmin - number < 10) {
                    System.out.println("Yaklaştın!! Biraz daha in!");
                } else {
                    System.out.println("İn!");
                }
            }
            sayac++;
        }
        System.out.println("BRAVO!! " + sayac + ". tahminde bildin");
    }
}
