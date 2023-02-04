package HastaneBenim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hastane extends VeriBankasi {

    public static void anaMenü() {
     Scanner input = new Scanner(System.in);
        System.out.println("==========Q1 Tip Merkezine hos geldiniz===========" +
                "\n Hasta bulmak icin.......1'e" +
                "\n Doktor bulmak icin......2'e" +
                "\n Randevu almak icin......3'e basiniz"+
                "\n Cikmak icin.............4'e basiniz" );



        try {
            int secim = input.nextInt();
            switch (secim) {
                case 1:
                    hastaBul();
                    break;
                case 2:
                    doktorBul();
                    break;
                case 3:
                    randevuAl();
                    break;
                case 4:
                    cikisYap();
                    break;
                default:
                    System.out.println("Yanlis giris yaptiniz.Lütfen menüden secim yapiniz.");
                    anaMenü();
            }
        } catch (InputMismatchException e) {
            System.out.println("Yanlis Secim yaptiniz:Lütfen menüden secim ypiniz.");
            anaMenü();
        }
    }

    private static void cikisYap() {
        System.out.println("Bizi tercih etiiiginiz icin tesekkürler.Saglikli günler dileriz.");
    }

    private static void randevuAl() {
    }

    private static void doktorBul() {
    }

    public static void hastaBul() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hastanin ID'sini giriniz.");
        int idSecimi=input.nextInt();


    }



}

