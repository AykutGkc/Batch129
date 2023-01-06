package selfStudy;

import java.util.Scanner;

public class C08_NestedIf {
    public static void main(String[] args) {

         /*
        Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
        Eger calisan kadinsa 60 yasindan buyukse “Emekli Olabilir “yazdirin
        Eger calisan erkek ise 65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz");
        String gender = input.nextLine();
        System.out.println("Lütfen Yasinizi Giriniz.");
        int age = input.nextInt();


        if (age >= 0 && age < 121) {
            if (gender.equalsIgnoreCase("Erkek")) {
                if (age > 65) {
                    System.out.println("Emekli olabilir");
                } else {
                    System.out.println((65 - age) + " yil sonra emekli olabilirsiniz.");
                }

            } else if (gender.equalsIgnoreCase("Kadin")) {
                if (age > 60) {
                    System.out.println("Emekli olabilir");
                } else {
                    System.out.println((60 - age) + " yil sonra emekli olabilirsiniz.");
                }
            }
        } else {
            System.out.println("Lütfen yasinizi 0 ile 120 arasinda giriniz.");
        }


    }//Body of Main
} //Body of Class
