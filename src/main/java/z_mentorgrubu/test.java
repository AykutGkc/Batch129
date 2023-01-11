package z_mentorgrubu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {


    /*
  INTERWIEW QUESTIONS
   Kullanicidan bir String aliniz.
   String'de var olan her character'in sayisini ekrana yazdiriniz.
   Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
          abaa   ==> a=3  b=1
  */
/*        Scanner input = new Scanner(System.in);
        System.out.print("Bir String giriniz :");

        String str= input.nextLine();  //alican
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));//[a, l, i, c, a, n]
        Arrays.sort(arr);
        System.out.println("sort methodundan sonra "+ Arrays.toString(arr));
        int counter=0;

        for (int i = 1; i <arr.length ;             i++) {

            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni olanlar icin 1 artir
            } else {
                System.out.println(arr[i - 1] + " karakterinin sayisi " +( counter+1) + " kez tekrarlanmistir");
                counter = 0;//baska harfe gectigi icin sifirlanmali
            }
            if(i== arr.length - 1)//defalarca kodu yazdirmamasi icin sona gelindiginde yazdirmasiu icin if kullandik
                System.out.println(arr[i]+ " karakterinin sayisi "+(counter+1)+" kez tekrarlanmistir");
        }
    }*/

        public static void main(String[] args) {
            // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> ogrenci_notlari = new ArrayList<>();
            int toplam = 0;
            int ortalama;
            int index = 1;
            int sayi;
            System.out.println("Ogrencilerin notlarini girinz ve cikmak icin q ya basiniz");
            int counter = 0;






            do {
                System.out.println(index + ".ogrencinin  notunu  girinz");

                sayi = input.nextInt();

                if (String.valueOf(sayi).equalsIgnoreCase("q")) {
                    break;
                } else {
                    ogrenci_notlari.add(sayi);
                    index++;

                }
            } while (true);
            System.out.println(ogrenci_notlari);
            for (Integer w : ogrenci_notlari) {
                toplam = toplam + w;
            }
            ortalama = toplam / ogrenci_notlari.size();
            for (Integer w : ogrenci_notlari) {
                if (w > ortalama) {
                    counter++;
                }
            }
            System.out.println("sinifin ortalamasi = " + ortalama + "ortalamayi gecen ogrenci syisi = " + counter);
        }//Main
    }






