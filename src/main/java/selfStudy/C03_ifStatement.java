package selfStudy;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {

        // Beispiel1:Kullanıcıdan üç sayı alın ve en büyük sayıyı yazdırın.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        int ersteNum=input.nextInt();
        System.out.println("LÜtfen ikinci sayiyi giriniz");
        int zweiteNum=input.nextInt();
        System.out.println("Lütfen ücüncü sayiyi giriniz");
        int dritteNum= input.nextInt();

        if (ersteNum > zweiteNum && ersteNum>dritteNum){
            System.out.println("En büyük sayi 1.sayidir");
        }else if (zweiteNum>ersteNum && zweiteNum>dritteNum){
            System.out.println("En büyük sayi 2. sayidir");
        }else if (dritteNum>ersteNum && dritteNum>zweiteNum){
            System.out.println("En büyük sayi 3.Sayidir");
        }else {
            System.out.println("Lütfen gecerli bir sayi giriniz" );
        }

        

    }//Main body
}//class body
