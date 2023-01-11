package z_mentorgrubu;

import java.util.Scanner;

public class C17_AdvantagePractice_110123 {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        // İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?


        Scanner input=new Scanner(System.in);
        int sayi;
        int rastgeleSayi=(int)(Math.random()*101);
        int sayac=10;

        System.out.println("Lütfen 0 ile 100 arasinda bir sayi giriniz");

        do {
            sayac--;


            sayi=input.nextInt();
           if (sayac!=0){if (sayi>rastgeleSayi){
                System.out.println("Kücük bir sayi giriniz");
                System.out.println(sayac + " hakkiniz kalmistir");
            }else if (sayi<rastgeleSayi){
                System.out.println("Büyük bir sayi giriniz");
                System.out.println(sayac + " hakkiniz kalmistir");
            }else{

                System.out.println("Kazandiniz " + (10-sayac) + ". tahminde bildiniz");
            }
           }else {
                System.out.println("Hakkiniz bitti!");
                    break;
           }

         }while(sayi!=rastgeleSayi);





    }
}
