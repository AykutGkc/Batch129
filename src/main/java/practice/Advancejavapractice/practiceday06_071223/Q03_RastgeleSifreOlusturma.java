package practice.Advancejavapractice.practiceday06_071223;

import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {
    public static void main(String[] args) {

        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz.");
        int karakterSayisi=input.nextInt();
        int sayac=0;
        String sifre="";

        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789«∑€®Ω¨¨øπ•";
        int maxIndex=karakterler.length();

        while(sayac<karakterSayisi){

            int rastgeleIndexs=(int)(Math.random()*maxIndex);
            sifre+=karakterler.charAt(rastgeleIndexs);
            sayac++;
        }
        System.out.println("sifre = " + sifre);


    }//Main
}//Class
