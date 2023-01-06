package z_mentorgrubu;

import java.util.Scanner;

public class TaskagitMakas {

    public static void main(String[] args) {

        int kullanicipuani = 0;
        int bilgisayarpuani = 0;
        System.out.println("Oyunumza hosgeldiniz");
        System.out.println("oyuna devam etmek istemiyorsaniz Qya basin");

        do {


            Scanner input = new Scanner(
                    System.in
            );
            System.out.println("lütfen TAS,KAGIT yada MAKAS isimlerinden birini giriniz");
            String  secimUser = input.nextLine().toUpperCase();
            int bilgisayarsecimi = (int) (Math.random() * 3);
            String bilgisayarsecimistr = String.valueOf(bilgisayarsecimi);//0=tas 1=makas 2= kagit

            if (secimUser.equals("TAS") && bilgisayarsecimistr.equals("1")) {
                kullanicipuani++;
                System.out.println("kazandiniz"   +kullanicipuani );
            } else if (secimUser.equals("MAKAS") && bilgisayarsecimistr.equals("2")) {
                kullanicipuani++;
                System.out.println("kazandiniz"+kullanicipuani);

            } else if (secimUser.equals("KAGIT") && bilgisayarsecimistr.equals("0")) {
                kullanicipuani++;
                System.out.println("Kazandiniz" +kullanicipuani );
            } else if (secimUser.equals(bilgisayarsecimistr)) {
                System.out.println("berabere kaldiniz");

            } else {
                bilgisayarpuani++;
                System.out.println("Kaybettiniz"+bilgisayarpuani);
                if (secimUser.equals("Q")) {
                    System.out.println("Oyun bitti");
                    break;

                }

                System.out.println("Puaniniz" + kullanicipuani);
                System.out.println("bilgisayar puani" + bilgisayarpuani);

            }


        } while (kullanicipuani<=3&bilgisayarpuani<=3 );


    }

}





