package practice.Regularjavapractice.practiceday03;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tam sayi girmesini isteyin.
        Girilen pozitif tam sayi 3 basamakli ise ekrana 3 basamakli yazdirin.
        3 basamakli degilse cift olup olmadigini kontrol edin.
        Cift ise 3 basamakli olmayan cift sayi yazdirin.
        Cift sayi degilse 3 basamakli olmayan tek sayi yazdirin.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli pozitif bir tam sayi giriniz.");
        int num = input.nextInt();

        if (num > 0) {

            if (num > 99 && num < 1000) {
                System.out.println("üc Basamakli bir sayidir.");
            } else if (num < 99 || num > 1000) {
                if (num % 2 == 0) {
                    System.out.println("3 Basamakli olmayan cift sayidir.");
                } else {
                    System.out.println("3 Basamakli olmayan tek sayidir.");
                }
            }
        } else {
            System.out.println("Lütfen gecerli bir sayi giriniz.");
        }

    }//Main body
}//Class body
