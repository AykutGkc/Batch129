package z_mentorgrubu;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class A01Örnekler {


    //Scanner

    //Ex1:kullaniciya ad,memleket,yas,boy, yasadigi yeri sevip sevmedigini soran bir kod yaziniz.
    //Ex2: Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz.
    //Ex3 : Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindak rakamlari toplamini yazdiran kodu yaziniz
    //Ex4:Kullanicidan bir dirkdörtgenin en ve boyunu alan ve hesaplayan kodu yaziniz. Dirtdörtgenin alani= en*boy Dirtdörtgenin cevresi 2*(en+boy)
  /*Ex5:Kullanicidan aldiginiz seki ile asagidaki gibi bir gorsel olusturunuz

          A
         A A
        A A A
   */

    /* 1)SwapValues
       2)String Manipulations örnekleri:
                                        "S" stringinde "money" kelimesinin var olup olmadigini kontrol ediniz.
                                        "S" stringinin belli bir harfle baslayip baslamadigini kontrol ediniz.
                                        "S" stringinin 6. chacterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
                                        "S" stringinin money ile bitip bitmedigini kontrol ediniz.
                                        "S" stringde ki money kelimesini "dolar" kelimesine ceviriniz.
       3)String Manipulations örnekleri:
                                        "S" stringinde ki tüm rakamlari(0,1,2,3,4,5,6,7,8,9) yildiza ceviriniz.
                                        "S" stringindeki tüm rakamlari ve harfleri ünleme ceviriniz.
                                        "S" stringinde ki tüm sesli harfleri "?" isaretine ceviriniz.
                                        "S" Stringinde ki kücük harfler disindaki tüm karakterleri"<>" ceviriniz.
                                        "S" strindinde ki sesli harfler disinda ki tüm karakterleri "&"e ceviriniz.
       4)Asagidaki kurallara göre kullacinin girdigi password'ü kontrol ediniz.
            I)En az 8 karakter olsun.
            II)space olmasin.
            III)En az bir tane büyük harf olsun.
            IV)en az bir tane kücük harf olsun.
            V)En az bir tane sembol olsun
            VI)En az bir tane rakam olsun.
       5)Verilen ismin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
         "Ali Can"==> AC

   */

// 1)  Object olusturma
    // 2) byte, short, int, long data typlerinin max ve min degerlerini hesaplatan kodu yaziniz.
    //  3)AutoWidening ve Explicit Norrowing
    // 4) Mantik Operatörleri



        /*
         1) i)bir stringin hic karakter icermedigini (bos string) kontrol eden kodu yaziniz.
           ii) bir stringin space haric hocbir karakter icermedigini kontrol eden kodu yaziniz.
         2) i)Bir stringde  a,e,i karakterlerinin ilk görünümlerinin indexleri toplamini ekrana yazdirin.
            ii)Bir stringde  a,e,i karakterlerinin son görünümlerinin indexleri toplamini ekrana yazdirin.
            String str="Java is easy to learn";


         3)  i)Verilen karakter büyük harf ise ekrana büyük harf yazdiran kodu olusturunuz.
             ii)Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
          4) i)Verilen bir sayinin negatif,pozitif ya da notr oldugunu gösteredn kodu yaziniz.
             ii)Kullanici gün numarasini girsin kod gün ismini yazsin.
          5)Kullanicidan gün isimlerini aliniz ve haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.
          6)Kullanicidan yas degeri alin ve yasin hangi evrede oldugunu asagida ki tabloya göre yazdiran kodu olusturun.
            0-4 ==> Bebek
            5-12==>Cocuk
           13-20==>Genc
           21-30==>Yetiskin
           31-... ==> Tanimlanmamis evre
           Hata mesaji: Gecerli bir yas giriniz.
         */


       /*
        1)Kullanicidan 3 tane pozitif bir tam sayi aliniz.
        bu üc sayinin ücgen olusturma durumunu kontrol ediniz.
        Eger ücgen olabiliyorsa eskenar ücgen olma durumunu kontrol ediniz.

        INFO: ücgen olma sarti nedir?
        Herhangi iki kenar toplami ücüncü kenardan büyük olmali,
        herhangi iki kenar farki diger kenardan kücük olmali.

        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ==> eskenar ücgen

        2)Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
            Passwordun ilk harfi kucuk harf ise
             'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin

         3) Kullanicidan 0 dan kücük 120 den büyük deger giremeyecek sekilde datalari altiktan sonra
    eger calisan kadinsa 60 yasindan büyükse emekli olabilir yazdirin.
    eger calisan erkekse 65 yasindan büyükse emekli olabilir yazdirin.


        4) Verilen yilin artik yil olup olmadigini kontrol eden kodu yaziniz.
            1) Yil 100'e bölünüyorsa 400'e bölünmelidir.
            2) Yil 100'e bölünmüyorsa 4'e bölünmelidir.

         5) Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin ve asagida ki gibi yazdirin
            Isim-Soyisim: A**** G****
            Kart-No: **** **** **** 1907


         */

   /*
        1)Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz.
        2) I)40'dan 23'E kadar tüm ciftt tam sayilari ekrana yazdiran kodu yaziniz
           II)18'den 56'a kadar tüm tek sayilari ekrana yazdiran kodu yaziniz.

        3)Size verilen kücük harfle yazilmis String'in indexi cift sayi olan karakterlerini büyük harf yapiniz.
           ankara==> AnKaRa



        5)Verilen bir string'de son 'a'dan sonraki tüm kararkterleri ters sirada yazdirin.
         Germany==>yn

        6)Kullanicidan toplamak icin sayi isteyin ve oplam 500'e ulasincaya kadar istemeyi devam ettirin.
          Toplam 500e ulastiginda veya gectiginde toplami ve kac sayi girilddigini yazdirin.


    */


    public static void main(String[] args) {

        // 6)Kullanicidan toplamak icin sayi isteyin ve toplam 500'e ulasincaya kadar istemeyi devam ettirin.
        //Toplam 500e ulastiginda veya gectiginde toplami ve kac sayi girilddigini yazdirin.

//        Scanner input = new Scanner(System.in);
//
//        int toplam = 0;
//        int sayac = 0;
//
//        do {
//
//
//            if (toplam > 499) {
//
//                System.out.println("Toplam = " + toplam);
//                break;
//
//            }
//
//            System.out.println("Lütfen sayi giriniz");
//            int sayi = input.nextInt();
//            toplam = toplam + sayi;
//
//            sayac++;
//        } while (true);
//
//        System.out.println("girilen sayi sayisi = " + sayac);


    /*

    day12forloopwhileloop:

        1)i)3den 10a kadar tam sayilari konsola yazdirin.(C06_WhileLoop01)
          ii)23'den 12'yw kadar tam sayilari console' a yazdiriniz(C07_WhileLoop02)

        2)            *
                     * *
                    *   *
                   *     *
                  * * * * *


            Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz (C08_NestedLoop

         3)  Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz.(C08_WhileLoop03)

      day13whileloopdowhileloop:

         4)Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.(C01_WhileLoop)

         5)Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.(C02_WhileLoop
           Java==> J*a*v*a

         6) Kullanicidan bir tamsayi aliniz.
        Tam sayi 100'den kücük ise kullaniciya kaybettiniz mesaji vererek oyunu sonlandiriniz.
        Tam sayi 100 ve 100'den büyük ise "Kazandiniz" mesaji vererek oyuna devam ettiriniz.  (C04_DoWhileLoop01)

        7)  Gecerli Username="admin" Password="pwd123" dür.
            Kullanicidan username ve passwordü alin
            Username ve Password dogru ise konsola "Hesabiniza hosgeldiniz!" yazdirin.
            Username veya Password yanlis ise 4 kere Username ve Passwordünüzp giriniz mesaji verin.
            Username veya Password 4. kere yanlis ise "Hesabiniz bloke olmustur."Mesaji vererek islemi tamamlayiniz. (C05_DoWhileLoop03)


        day14arraysforeachloop:

         8) Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
             icerdigi karakter sayilari toplamini ekrana yazdiriniz. (C01_Arrays01)

     */

    /*
    day14arraysforeachloop:

    1)String array olusturun, icine 5 tane eleman ekleyin, tum elemanlari icerdigi karakter sayilari toplamini ekrana yazdiriniz.(C02_Arrays02)
    2)Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.(C03_Arrays03)
    3)String bir Array olusturunuz, 6 tane eleman yerlestiriniz, charaacter sayisi 5'den büyük elemanlari siliniz.(C04_Arrays04)
    4)String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz.(C05_Arrays05)

    day15arraysmultidimensionalarrays:

    5)Bir ögretmenin okulunda ki ögretmenin ögrencilerin isimlerini applicationa yüklemesini saglayan kodu yaziniz.(C01_Arrays)
    6)Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz.(C02_Arrays)
    7)[0, 2, 3 , 0 , 12 , 0] 0. indexi en sona koyunuz.(C03_Arrays)
    8)Bir arrayin icinde herhangibir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gösteren kodu yaziniz.(C04_Arrays)
    */




    /*
    day16multidimensionalarrays:

    1)String bir multidimentional Array olusturun, icerisine datalari ekleyin,toplam eleman sayisini ekrana yazdirin.(C01_MultidimensionalArrays)
    2)Bir tane integer multidimensional array olusturunuz.Bu array'deki tum sayilarin toplamini veren kodu yaziniz.(C02_MultidimensionalArrays)
    3)Asagidaki multi dimensional array'in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.(C03_MultidimentionalArrays)
      { {1,2,3}, {4,5,6} }
    4)Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz.(C04_MultidimensionalArrays)

    day17arraylist:

    5)Verilen iki integer Liste tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.(C01_ArrayLists01)
    6)Verilen bir String Listte ki tüm elemanlarin toplam karakter sayilarini bulan kodu yaziniz.(C02_ArrayLists01)


     */


    /*
    day15arraysmultidimensionalarrays:

    1)String Array elemanlarini character sayisina gore kucukten buyuge siralayiniz.
        ["Michael", "Ajda", "Thomas", "Tom"] ==> ["Tom", "Ajda", "Thomas", "Michael"]

    2)String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
      Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
     ["Michael", "Ajda", "Reyhane", "Gabriel", "Thomas", "Tom", "Ali", "Cin", "Cuneyt", "Cem"]

    day17arraylist:

    3)Verilen iki integer Liste tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.(C01_ArrayLists01)
    4)Verilen bir String Listte ki tüm elemanlarin toplam karakter sayilarini bulan kodu yaziniz.(C02_ArrayLists02)
    5)Maas listi olusturunuz ve maaslara %20 zam yapiniz.


     */



 /*
       day18lists :

      1) Integer bir list olusturunuz.Liste 5 eleman ekleyiniz.(C01_Lists01)
         i)Bu elemanlardan 12'yi siliniz.
         ii)Bu elemanlardan tüm 12'leri siliniz.

      2)Bir tane integer list olusturunuz. Bu listte birbirine en yakin tamsayiyi yaziniz.(C02_Lists02)
         [12,23,9,11,35] ==> 12,11

      3)Bir integer listte ki 7 haric tüm elemanlari 3 artiriniz. (C03_Lists03)

      4)Elektronik aletleri ve ev aletleri listlerimiz var. Elektronik ev aletlerini listeleyiniz.(C04_Lists04)

      day19listsvarargs:

      5)Verilen bir list'teki elemanlari tekrarsiz olarak yazdiriniz (C01_Lists01)
      [2,3,2,2,3,5]  ==>[2,3,5]

      6) Müsterinin ürün ismini aliniz.
        Müsterinin ismini verdigi ürün listede varsa ismini yazdirin.
        Müsterinin ismini verdigi ürün listede yoksa "Out of Stock" yazdirin. (C01_Lists01)

      7)             SAYI TAHMIN OYUNU
        Oyuncudan 1-10 arasi bir sayi isteyiniz
        Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
        Yoksa verdigi sayiyi listenize ekleyiniz.
        Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
        [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
        [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
        [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ   (C04_Lists03)
*/



         //1) Integer bir list olusturunuz.Liste 5 eleman ekleyiniz.(C01_Lists01)
        //         i)Bu elemanlardan 12'yi siliniz.
        //         ii)Bu elemanlardan tüm 12'leri siliniz.


        List<Integer> yas=new ArrayList<>();

        yas.add(10);
        yas.add(12);
        yas.add(18);
        yas.add(12);
        yas.add(50);


//        Integer silinecek=12;
//        yas.remove(silinecek);
//
//
//        yas.remove((Integer)12);
//

        List<Integer> silinecek=new ArrayList<>();
        silinecek.add(12);

        yas.removeAll(silinecek);

        System.out.println(yas);}

        


}
/*
        day19listsvarargs

        1)             SAYI TAHMIN OYUNU
        Oyuncudan 1-10 arasi bir sayi isteyiniz
        Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
        Yoksa verdigi sayiyi listenize ekleyiniz.
        Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
        [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
        [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
        [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ   (C04_Lists03)

        Advance practiceday01_201222

        2)  Fahrenheit degeri, Celsius degerine ceviren kodu yaziniz.(Q01_Variables_Fahrenheit)
            formül : c=(f-32)*5/9

        3)Yüzlük Not cinsinden kullanicidan alinan notu harf sistemine ceviren kodu yaziniz.(Q03_Ternary_NotSistemi)
        (Ternary kullaniniz)

        4)Kullanicidan tek sefrde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,(Q04_Regex_AdSoyad)
          Ad ayri soyad ayri sekilde ekrana yazdiriniz.
          Örn:
          Ad:Ali
          Soyad: Can

          5)Tek bir string icerisinde verilen euro ve dolarin ayri ayri toplamlarini bulan kod yaziniz.
           String= $1 "$12 €34 €56 $45 €78";
           dolarToplami:58
          euroToplami:168      (Q05_ForEach_EuroDolar)

          6)Kullanicidan alinan bir sayinin ilk ve son rakamlari toplamini toplayan kodu yaziniz.(Q06_WhileLoop_IlkVeSonRakam)

*/


    /*
         day19listsvarargs

        1) Rastgele kullanici adi olusturan JAVA kodu yaziniz.
              1. Kullanicidan ismini isteyelim
              2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
              3. Kullanici adinin alinabilir olup olmadigina bakalim.
              4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
              5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim

        Advance practiceday01_201222

        2)Kullanicidan tek sefrde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,(Q04_Regex_AdSoyad)
          Ad ayri soyad ayri sekilde ekrana yazdiriniz.
          Örn:
          Ad:Ali
          Soyad: Can

        3)Tek bir string icerisinde verilen euro ve dolarin ayri ayri toplamlarini bulan kod yaziniz.
           String= $1 "$12 €34 €56 $45 €78";
           dolarToplami:58
          euroToplami:168      (Q05_ForEach_EuroDolar)

       4)Kullanicidan alinan bir sayinin ilk ve son rakamlari toplamini toplayan kodu yaziniz.(Q06_WhileLoop_IlkVeSonRakam)

       practice.Advancejavapractice.practiceday02_241022

        5)Adınızın içerdiği harfleri ve ascii table kullanmadan, adınızı yazdıran bir kod yazınız.(Q01_Ascii_AdiniYaz)

        6)
         katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.(Q02_If_Diskriminant)



    */

/*
   Advance practiceday01_201222

   1)Kullanicidan alinan bir sayinin ilk ve son rakamlari toplamini toplayan kodu yaziniz.(Q06_WhileLoop_IlkVeSonRakam)
       practice.Advancejavapractice.practiceday02_241022

    practice.Advancejavapractice.practiceday02_241022

   2)Adınızın içerdiği harfleri ve ascii table kullanmadan, adınızı yazdıran bir kod yazınız.(Q01_Ascii_AdiniYaz)

   3)
   katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.(Q02_If_Diskriminant)

     4)Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.(Q03_Arrays_IkinciMaksimimum)
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787

    5)Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.(Q04_RandomMethod_RastgeleHarf)
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.

      6) Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.(Q05_Arrays_ElemanSil)
         Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

      7)Şekli Yazdırınız:  (Q06_ForLoop_Sekil)

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F


 */



/*
    practice.Advancejavapractice.practiceday02_241022


   1) Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.(Q05_Arrays_ElemanSil)
         Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

    2)Şekli Yazdırınız:  (Q06_ForLoop_Sekil)

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F

     practice.Advancejavapractice.practiceday03_271222


     3)Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdıran bir kod yazınız.
       Örn: Sayı: 46 Çıktı: 46, 47, 48, 49    (Q01_WhileLoop_10KatinaKadar )

     4)Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran
       yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.  (Q02_List_EkleCikar)

     5)0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.   (Q03_DoWhile_TahminOyunu)
         İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
             Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
             Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

     6)Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın. (Q04_MultiArray_AyniIndexTop)
      arr1[]={{1,2},{3,4,5}{6}}
      arr2[]={{7,8,9},{10,11},{12}}

      7)2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız. (Q05_NestedForLoop_Carpim)
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.

       8)Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.     (Q06_ForLoop_Continue)


 */



/*
        practice.Advancejavapractice.practiceday03_271222


        1)2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız. (Q05_NestedForLoop_Carpim)
        Örnek Ekran çıktısı
        1  2  3  4  5
        2  4  6  8 10
        3  6  9 12 15
        4  8 12 16 20
        5 10 15 20 25
        Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
        isterseniz boyutları klavyeden okuyup istenen boyutlara göre
        ekrana basan bir kod yazabilirsiniz.


        2Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        Not: 5 ve 10 dahil değil.     (Q06_ForLoop_Continue)


       Advancejavapractice.practiceday04_311222

        3) * İki Array'de ortak bulunan elementleri ayrı bir List içerisine ekleyen bir kod yazınız.
             * (case sensitivity olmadan)
             * Input1 :      String[] arr = {"John","Brad","Angel","Sofia","Emily"};
                     String[] brr = {"sofia","brad","grace","emily","hazel"};
             * Output : [brad,sofia,emily] (Q01_Arrays_OrtakElemanlar)

         4)Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.(Q02_Arrays_OrtalamadanBüyük)

         5)Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
        Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.(Q03_DoWhile_TopunSicramasi)

    */

/*
 a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ==> eskenar ücgen

        2)Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
            Passwordun ilk harfi kucuk harf ise
             'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin

         3) Kullanicidan 0 dan kücük 120 den büyük deger giremeyecek sekilde datalari altiktan sonra
    eger calisan kadinsa 60 yasindan büyükse emekli olabilir yazdirin.
    eger calisan erkekse 65 yasindan büyükse emekli olabilir yazdirin.


        4) Verilen yilin artik yil olup olmadigini kontrol eden kodu yaziniz.
            1) Yil 100'e bölünüyorsa 400'e bölünmelidir.
            2) Yil 100'e bölünmüyorsa 4'e bölünmelidir.

         5) Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin ve asagida ki gibi yazdirin
            Isim-Soyisim: A**** G****
            Kart-No: **** **** **** 1907
 */









