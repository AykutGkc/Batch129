package day32collections.selfStudy;

import java.util.Scanner;

public class C07_NestedIf {
    public static void main(String[] args) {


        /* Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        A ==> gecerli
        z ==>gecerli
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password giriniz.");
        String pwd = input.nextLine();

        char firstChar=pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z'){
            if (firstChar=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz password");
            }
        }else if (firstChar>='a' && firstChar<='z'){
            if (firstChar=='z'){
                System.out.println("Password Gecerli");
            }else{
                System.out.println("Password Gecersiz");
            }
        }else {
            System.out.println("Ilk karakter harf olamli");
        }



    }//Main Body
}//Class Body
