package ssg.scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise “Çift” yazsin
        // tamsayı tek ise “Tek” yazsin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfeb bir tam sayi giriniz");
        int a = input.nextInt();

        String result=a%2==0 ? "a cift sayidir" : "a tek sayidir";
        System.out.println(result);

    }
}
