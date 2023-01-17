package practice.Advancejavapractice.practiceday09_170123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Q04_Manav {
    /*
     Basit bir 5 ürünlü manav alışveriş programı yazınız.

 * 1. Adim : Ürün ve fiyat listesi oluştur.
 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
 * 4. Adim : Alisveris bitince ödemesi gereken tutari göster.
 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
 *            istemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün sectir.
 *            Bu işlemi alışveriş bitene kadar tekrarla.

 */

    static List<String> ürünListesi=new ArrayList<String>();
    static double toplamÖdeme;

    public static void main(String[] args) {
        // Ürün ve fiyat listesi oluştur.
        ürünListesi.add("Domates - Ürün kodu: 1 - Fiyati: 20");
        ürünListesi.add("Biber - Ürün kodu: 2 - Fiyati: 25");
        ürünListesi.add("Patates - Ürün kodu: 3 - Fiyati: 9");
        ürünListesi.add("Elma - Ürün kodu: 4 - Fiyati: 15");
        ürünListesi.add("Muz - Ürün kodu: 5 - Fiyati: 30");

        System.out.println("ürünListesi = " + ürünListesi);
        System.out.println("toplamÖdeme = " + toplamÖdeme);
        müsteriSecimi();

    }

    public static void müsteriSecimi (){
        // * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ürün kodunu giriniz");
        int kod=scanner.nextInt();

        System.out.println("Kiloyu giriniz");
        double kilo=scanner.nextInt();

        System.out.println(kilo+ " kilo " + ürünListesi.get(kod-1).substring(0,ürünListesi.get(kod-1).indexOf(" ")) + ":" +Double.parseDouble(ürünListesi.get(kod-1).substring(ürünListesi.get(kod-1).lastIndexOf(" ")+1))*kilo);
         //* 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
        toplamÖdeme+=Double.parseDouble(ürünListesi.get(kod-1).substring(ürünListesi.get(kod-1).lastIndexOf(" ")+1))*kilo;
        System.out.println("toplamÖdeme = " + toplamÖdeme);

        System.out.println("Devam etmek icin d, kasa icin herhangibir karakter giriniz");
        String karar= scanner.next();

        if (karar.equalsIgnoreCase("d")){
            müsteriSecimi();
        }else{
            System.out.println("toplamÖdeme = " + toplamÖdeme);
            System.out.println("Güle, güle yine bekleriz");
        }

    }


}
