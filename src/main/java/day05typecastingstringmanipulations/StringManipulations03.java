package day05typecastingstringmanipulations;


import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*
        EX1:asagidaki kurallara göre kullacinin girdigi password'ü kontrol ediniz.
            I)En az 8 karakter olsun.
            II)space olmasin.
            III)En az bir tane büyük harf olsun.
            IV)en az bir tane kücük harf olsun.
            V)En az bir tane sembol olsun
            VI)En az bir tane rakam olsun.
          */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd= input.nextLine();

        //I)En az 8 karakter icermeli
        boolean first=pwd.length()>7;

        //II)space olmasin.
        boolean second=!pwd.contains(" ");


        //III)En az bir tane büyük harf olsun.
        //NOTE: büyük harf olmayanlari sil,
        //kalan karakter saysina bak
        // karakter sayisi 0 ve kücük ise büyük harf yoktur, büyük ise vardir.

        boolean third= pwd.replaceAll("[^A-Z]","").length()>0;
        //Methodlari ayni satirda yanyana kullanmaya "method chain" denir.

        //IV)en az bir tane kücük harf olsun.
        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;

        //V)En az bir tane sembol(harf ve rakam harici her sey) olsun
        boolean fifth=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;


        //VI)En az bir tane rakam olsun.
        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;


        System.out.println("Password gecerli mi: "+ (first && second && third && fourth && fifth && sixth));




    }//Main body
}//class body
