package day06stringmanipulationifstatement;

public class StringManupilations01 {
    public static void main(String[] args) {

        //EX1: bir stringin sonunda ve basinda space karakteri var ise siliniz.
        // "   Ali Can    " ==> "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() methodu Stringin bas ve sonda ki space karakterlerini siler, aradaki Spacelere dokunmaz.
        String sTrimmed=s.trim();
        System.out.println(sTrimmed);

        //EX2: Asagidan fiyatlari verilen ürünlerin toplamini bulunuz.
        //String tv="$456.99";   String laptop="$875.99"; ==> 456.99+875.99=1332.98
        String tv="$456.99";
        String laptop1="$875.99";

        String tv2=tv.replace("$","");
        System.out.println(tv2); //456.99

        String laptop2= laptop1.replace("$","");
        System.out.println(laptop2); //875.99

        Double totalPrice=Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //EX3: Verilen ismin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        // "Ali Can"==> AC

        String name="   ali cAN  ";
        char first=name.trim().toUpperCase().charAt(0); // name'in bastaki ve sondaki spaceleri sil. ==>trim()
                                                        // kalanin tüm harfleri büyük. ==>toUpperCase()
                                                        //kalanin 0. indeksini al ==>charAt(0) ==>A
        System.out.println(first);//A

        char second= name.trim().toUpperCase().split(" ")[1].charAt(0);
        // name in bastaki ve sondaki spaceleri sil ==>trim()
        //kalanin tüm harflerini büyüt. ==>toUpperCase()
        //kalani spaceden kes ve birinci indeksi al.(kestikten sonra ilk kelime 0. indeks, 2.kelime birinci indeks.)==>split(" ")[1]
        //kalanin 0.indeksini al (char)==> charAt(0)
        System.out.println(second);//C

        System.out.println(""+first+second);

        //EX4: bir stringin hic karakter icermedigini (bos string) kontrol eden kodu yaziniz.
        String str="a";

        //1.yol: length() kullan
        boolean result1=str.length()==0;
        System.out.println("String bos mu = "+result1); //true

        //2.Yol: java bir konuda method üretmisse o methodu kullanmak en iyisidir.
        boolean result2=str.isEmpty();
        System.out.println("String bos mu = " +result2);

        //EX5: bir stringin space haric hocbir karakter icermedigini kontrol eden kodu yaziniz.

        String t= "    ";

        //1.yol ==> spacelerin yerine hicbir sey koy ve uzunlugu 0 mi ?
        boolean result3=t.replace(" ","").length()==0;
        System.out.println("sadece space var mi = "+ result3);

        //2.Yol

        boolean result4=t.replace(" ","").isEmpty();
        System.out.println("sadece Space var mi = "+result4);

        //3.yol:
        // isBlank() methodu sadece space iceren stringler icin true verir. Space disinda bir karakter var ise false verir.
        //isBlank() methodu bos stringler icin de true verir.
        //isBlank() ==> space + hicbir sey icin true       isEmpty ==> sadece hicbir sey icin true
        boolean result5=t.isBlank();
        System.out.println("sadece space var mi = "+ result5);

        //EX6: Bir stringde  a,e,i karakterlerinin ilk görünümlerinin indexleri toplamini ekrana yazdirin.
        //"Java is easy to learn" ==> a'nin ilk görünüm indeksi=1, e harfinin ilk görünüm indeksi=8, i harfinin ilk görünüm indeksi=5
        //1+5+8=14

        String r = "Java is easy tolearn";

        int idxA=r.indexOf('a');//1
        System.out.println(idxA);
        int idxI=r.indexOf('i');
        System.out.println(idxI);//5
        int idxE=r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Indexler toplami = " + (idxA+idxE+idxI));//14

        //EX7: Bir stringde  "java" kelimesinin ilk kacinci indexlerde kullanildigini ekrana yazdirin.
        // "Ah Java vah Java sensiz olmuyor Java"

        String u = "Ah Java vah Java sensiz olmuyor Java" ;
        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk görünümündeki ilk harfin yani J'nin indexini almis olursunuz.

        int idxJava=u.indexOf("Java");
        System.out.println(idxJava);//3

        // indexOf () methodu olmayan characterler icin kullanilirsa her zaman "-1" veir.
        int idxOfXyz=u.indexOf("xyz");
        System.out.println(idxOfXyz);// -1

        //EX8: Bir stringde  a,e,i karakterlerinin son görünümlerinin indexleri toplamini ekrana yazdirin.
        //"Java is easy to learn" ==> a'nin son görünüm indeksi=18, e harfinin ilk görünüm indeksi=17, i harfinin ilk görünüm indeksi=5
        // 18+5+17=40
        String v = "Java is easy to learn";
        int idxOfA=v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfi=v.lastIndexOf('i');
        System.out.println(idxOfi);//5

        int idxOfE= v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA+idxOfi+idxOfE);//40

        //NOTE: lastIndexOf() methodu string de olmayan bir character icin kullanilirsa her zaman "-1" verir.

        //EX9: Bir stringde ki tekrarsiz karakterleri ekrana yazdiriniz.
        // abbccd c ==>ad ==> ilk görünüm ve son görünümler karsilastirilarak cözelebilir.
        //indexOf() ile lastIndexOf() methodlarinin sonuclari ayni ise tekrarsizdir.

        String y=  "aac" ;

        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2=y.charAt(1);

        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3=y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //NOTE: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara göre aktive etmek icin "if statement" kullanilir.
        //      if you study hard, you will learn Java.


        //EX: sayi cift ise ekrana cift yazdirin.
        int num=-12;

        if (num>0){
            System.out.println("Pozitif");
        }

        //EX11: sayi -1 ile 10 arasinda ise ekrana rakam yazdirin.
        int number=3;
        if (number > -1 && number <10){
            System.out.println("Rakam");
        }

        //EX12: Sayi üc basamakli ise "Wowww!" yazdirin.

        int n=-123;

        n=Math.abs(n); //==> n'nin mutlak degerini almak icin Math clasindan abs() (mutlak deger) methodunu kullanip sayiyi pozitif yaptim.

        if (n>99 && n<1000){
            System.out.println("Woooww!");
        }









    } //Main body
} //Class body
