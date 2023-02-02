package hastane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hastane extends VeriBankasi {
    public String hastaneAdi = "Kartal Devlet Hastanesi";
    public String hastaneAdresi = "Kartal/Istanbul";
    public String basHekim = " Dr. Mustafa Onder";


    Doktor doktor = new Doktor();
    Hasta hasta = new Hasta();


    public Hastane(String hastaneAdi, String hastaneAdresi, String basHekim) {
        this.hastaneAdi = hastaneAdi;
        this.hastaneAdresi = hastaneAdresi;
        this.basHekim = basHekim;
    }

    public static void DoktorUnvan() {
        VeriBankasi obj = new VeriBankasi();

        Scanner input = new Scanner(System.in);
        System.out.println("Alerji icn 1'e \n Bas agrisi icin 2'e \n Tirnak batmasi icin 3'e\n " +
                "Cocuk hastaliklari icin 4'e\n Diyabet icin 5'e \n Kalp hastaligi icin 6'ya ");

        try {
            int durum = input.nextInt();


            switch (durum) {
                case 1:
                    System.out.println(obj.durumlar[0] + " icin " + "Dr." + obj.doctorIsimleri[0] + " " + obj.doctorSoyIsimleri[0] + "--Ünvani : " + obj.unvanlar[0]);
                    break;
                case 2:
                    System.out.println(obj.durumlar[1] + " icin " + "Dr." + obj.doctorIsimleri[1] + " " + obj.doctorSoyIsimleri[1] + "--Ünvani : " + obj.unvanlar[1]);
                    break;
                case 3:
                    System.out.println(obj.durumlar[2] + " icin " + "Dr." + obj.doctorIsimleri[2] + " " + obj.doctorSoyIsimleri[2] + "--Ünvani : " + obj.unvanlar[2]);
                    break;
                case 4:
                    System.out.println(obj.durumlar[3] + " icin " + "Dr." + obj.doctorIsimleri[3] + " " + obj.doctorSoyIsimleri[3] + "--Ünvani : " + obj.unvanlar[3]);
                    break;
                case 5:
                    System.out.println(obj.durumlar[4] + " icin " + "Dr." + obj.doctorIsimleri[4] + " " + obj.doctorSoyIsimleri[4] + "--Ünvani : " + obj.unvanlar[4]);
                    break;
                case 6:
                    System.out.println(obj.durumlar[5] + " icin " + "Dr." + obj.doctorIsimleri[5] + " " + obj.doctorSoyIsimleri[5] + "--Ünvani : " + obj.unvanlar[5]);
                    break;
                default:
                    System.out.println("Seciminiz yanlis.Lütfen Tekrar deneyiniz");
                    DoktorUnvan();
            }

        }catch (InputMismatchException e){
            System.out.println("Yanlis giris.Lütfen Menüden secim yapiniz.");
            DoktorUnvan();
        }

    }


    public Hastane() {
    }
}
