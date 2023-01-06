package practice.Advancejavapractice.practiceday04_311222;

import java.util.Scanner;

public class Q03_DoWhile_TopunSicramasi {
    public static void main(String[] args) {

        /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan yüksekligi giriniz...");
        double yükseklik=input.nextDouble();
        int sicramaSayisi=0;
        double toplamYol=0;


        do{
            sicramaSayisi++;
            toplamYol+=yükseklik;
            yükseklik =yükseklik*0.75;
            toplamYol+=yükseklik;
        }while(yükseklik>=1);
        System.out.println("sicramaSayisi = " + sicramaSayisi);
        System.out.printf("toplamYol = " +"%.2f", toplamYol);


    }//Main
}//class
