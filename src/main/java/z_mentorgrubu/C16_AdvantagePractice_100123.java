package z_mentorgrubu;

import java.util.Scanner;

public class C16_AdvantagePractice_100123 {
    public static void main(String[] args) {

        //Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdıran bir kod yazınız.
        //Örn: Sayı: 46 Çıktı: 46, 47, 48, 49

            Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= input.nextInt();


        while(sayi %10!=0){
            System.out.print(sayi + " ");
            sayi++;
        }





    }
}
