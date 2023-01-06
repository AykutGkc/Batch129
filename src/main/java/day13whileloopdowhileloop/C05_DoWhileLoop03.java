package day13whileloopdowhileloop;

import java.util.Scanner;

public class C05_DoWhileLoop03 {
    public static void main(String[] args) {

        /*
        GEcerli Username="admin" Password="pwd123" dür.
         Kullanicidan username ve passwordü alin
         Username ve Password dogru ise konsola "Hesabiniza hosgeldiniz!" yazdirin.
         Username veya Password yanlis ise 4 kere Username ve Passwordünüzp giriniz mesaji verin.
         Username veya Password 4. kere yanlis ise "Hesabiniz bloke olmustur."Mesaji vererek islemi tamamlayiniz.
         */
        Scanner input = new Scanner(System.in);


        int counter=0;

        do{
            if (counter==4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }

            System.out.println("Username'i giriniz");
            String username = input.next();

            System.out.println("Password'ü giriniz");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza Hosgeldiniz");
                break;
            }
            counter ++;
        }while(true);



    }//Main
}//class
