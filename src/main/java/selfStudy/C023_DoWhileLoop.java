package selfStudy;

import java.util.Scanner;

public class C023_DoWhileLoop {
    public static void main(String[] args) {

        /*
        GEcerli Username="admin" Password="pwd123" dür.
         Kullanicidan username ve passwordü alin
         Username ve Password dogru ise konsola "Hesabiniza hosgeldiniz!" yazdirin.
         Username veya Password yanlis ise 4 kere Username ve Passwordünüzp giriniz mesaji verin.
         Username veya Password 4. kere yanlis ise "Hesabiniz bloke olmustur."Mesaji vererek islemi tamamlayiniz.
         */

        Scanner input=new Scanner(System.in);


        int counter=0;

        do {


            if (counter==4){
                System.out.println("Heabiniz bloke olmusutr.");
                break;
            }

            System.out.println("Lütfen Username giriniz.");
            String username = input.nextLine();
            System.out.println("LÜtfen passwordü giriniz");
            String password=input.nextLine();


            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniz hosgeldiniz");
                break;
            }
            counter++;
        }while(true);






    }
}
