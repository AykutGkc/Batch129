package day08nestedIf;

import java.util.Scanner;

public class C03_NestedIf {
    /*
    Kullanicidan 0 dan kücük 120 den büyük deger giremeyecek sekilde datalari altiktan sonra
    eger calisan kadinsa 60 yasindan büyükse emekli olabilir yazdirin.
    eger calisan erkekse 65 yasindan büyükse emekli olabilir yazdirin.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz. \n Kadin=K, Erkek=E");

        char cinsiyet = input.next().toUpperCase().charAt(0); //Kullacinin verdigi harfi büyük harfe cevirdim.
        System.out.println("Lütfen yasinizi giriniz.");
        int yas = input.nextInt();

        if (cinsiyet == 'K') { //Auter if
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olamazsin. " + (60 - yas) + " yil daha calismaniz gerekiyor.");
            }
        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olamazsin. " + (65 - yas) + " yil daha calismaniz gerekiyor.");
            }

        } else {
            System.out.println("Lütfen cinsiyet icin gecerli bir harf giriniz.");
        }


    }//Main body
}//Class body
