package practice.Advancejavapractice.practiceday05_030123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7_List_OrtalamaUstuOgrenciler {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input=new Scanner(System.in);
        List<Integer> notlar = new ArrayList<>();
        int sayac=0;
        String karar;

        //Kullanicidan notlari al.
        do {
            sayac++;
            System.out.println(sayac + ". notu giriniz");
            notlar.add(input.nextInt());
            System.out.println("Cikmak icin 'H' giriniz,daha fazla not girmek icin herhangibir karakter giriniz." );
            karar=input.next();

        }while(!karar.equalsIgnoreCase("H"));

        System.out.println("notlar = " + notlar);


        //Ortalama hesapla.
        double toplam=0;

        for (int w : notlar) {
            toplam+=w;
        }

        double ortalama=toplam/notlar.size();
        System.out.printf("ortalama = " + "%.2f",ortalama);
        System.out.println();

        //Ortalama üstü not sayisini bul.

        int ortalamaÜstüNotSayisi=0;

        for (int w : notlar) {
            if (w>ortalama){
                ortalamaÜstüNotSayisi++;
            }
        }

        System.out.println("ortalamaÜstüNotSayisi = " + ortalamaÜstüNotSayisi);


    }
}
