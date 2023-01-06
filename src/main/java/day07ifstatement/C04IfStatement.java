package day07ifstatement;

import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan yas degeri alin ve yasin hangi evrede oldugunu asagida ki tabloya göre yazdiran kodu olusturun.

        0-4 ==> Bebek
        5-12==>Cocuk
        13-20==>Genc
        21-30==>Yetiskin
        31-... ==> Tanimlanmamis evre
        Hata mesaji: Gecerli bir yas giriniz.
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Yasinizi giriniz");
        int age=input.nextInt();

        if (age<0){
            System.out.println("Lütfen gecerli bir yas giriniz.");
        } else if(age<5){
            System.out.println("Bebek");
        }else if (age<13){
            System.out.println("Cocuk");
        }else if (age<21){
            System.out.println("Genc");
        }else if (age<31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre");
        }//else body


    }//main body
}//class body
