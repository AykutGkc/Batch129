package mini_projects.biletBus;

import java.util.Scanner;

public class Bilet {

    static Scanner input =new Scanner (System.in);

    public static void main(String[] args) {

      int km=0;
      int yas=0;
      int yolculukTipi=1;

      String plakaNumarasi="19 AG 19";
        System.out.println("Lütfen gideceginiz mesafeyi km olarak yaziniz.");
        km=input.nextInt();

        System.out.println("Lütfen yasinizi giriniz");
        yas= input.nextInt();

        System.out.println("Lütfen yolculuk tipini giriniz. \nSadece gidis ise 1\n gidis dönüs ise 2");
        yolculukTipi= input.nextInt();


        if (km>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)) {
            double biletUcreti=km*0.1;
            System.out.println("Indirimsiz Bilet Ücreti : " + biletUcreti);
            double yasIndirimOrani=0;
            if (yas<12){
                yasIndirimOrani=0.5;
            }else if (yas<24 ){
                yasIndirimOrani=0.1;
            }else if (yas>65){
                yasIndirimOrani=0.3;
            }

            biletUcreti-=biletUcreti*yasIndirimOrani;

            if(yolculukTipi==2){
                System.out.println();
               biletUcreti-=biletUcreti*0.2;
            }


           biletDoküm(plakaNumarasi,km, yolculukTipi);
            System.out.println();
            System.out.println("Bilet Ücretiniz : " + biletUcreti);


        }else{
            System.out.println("Hatali veri girdiniz...");
        }







    }//Main

    private static void biletDoküm(String plakaNumarasi, int km, int yolculukTipi) {

        System.out.println("================Bilet Döküm================");
        System.out.println("Otobüsün Plakasi : " + plakaNumarasi);
        System.out.println("Mesafe : "+km);
        System.out.println("Yolculuk Tipi : " + (yolculukTipi==1 ? "Tek Yön" : "Gidis-Gelis"));


        slowPrint("KeyifAl Turizm olarak keyifli yolculuklar dileriz....",50);

    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}//class
