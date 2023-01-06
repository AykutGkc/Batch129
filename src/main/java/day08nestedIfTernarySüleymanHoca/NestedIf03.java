package day08nestedIfTernarySüleymanHoca;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {
       /* Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        A ==> gecerli
        z ==>gecerli
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");

        String pwd=input.nextLine();
        char firstChar=pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z'){
            if (firstChar=='A'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password. Cünkü büyük harf ama 'A' degil...");
            }
        }else if (firstChar>='a' && firstChar<='z'){
            if (firstChar=='z'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("Gecersiz password. Cünkü Kücük harf ama 'z' degil...");}
        }else{
            System.out.println("Ilk karakter harf olmali");
        }




    }//Main Body
}//Class body
