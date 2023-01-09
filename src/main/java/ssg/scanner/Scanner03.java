package ssg.scanner;

import java.util.Scanner;

public class Scanner03 {

    //  Kullanıcıdan ad, ikinci ad, soyadı, SSN’yi alın ve ardından aşağıdaki gibi yazdırın
    //Ali Mert Can
    //kkno:123456789

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi ve soyadinizi giriniz.");
        String adSoyad=input.nextLine();
        System.out.println("Lütfen Kimlik karti numaranizi giriniz.");
        int kkn=input.nextInt();

        System.out.println(adSoyad + "Kimlik karti no: " + kkn);



    }
}
