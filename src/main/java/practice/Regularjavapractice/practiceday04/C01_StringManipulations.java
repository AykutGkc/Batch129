package practice.Regularjavapractice.practiceday04;


import java.util.Scanner;

public class C01_StringManipulations {

    /*String Class Methodlari
            1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                        ii)equals() method'u "boolean" return eder.

            2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
    kucuk harfe dikkat etmeden anlamamiza yarar.
                                  ii) equalsIgnoreCase() method'u "boolean" return eder.

            3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                             ii) toLowerCase() method'u "String" return eder

            4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                            ii) toUpperCase() method'u "String" return eder

            5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                        ii) charAt() method'u "char" return eder.

            6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                        ii) length() method'u "int" return eder.

            7)contains(): i)Bir String'de belli bir characterin veya
    characterlerin var olup olmadigini anlamak icin
    kullanilir
                          ii) contains() method'u "boolean" return eder.

            8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                       ii)split() method'u "Array" return eder.

            9)replace(): i)Metin icerisindeki karakter ya da karakterlerin,
    istenilen karakter ya da metinle degistirilmesini saglar.
    Sonuc String'dir..

            10)replaceFirst():i) Replace ile aynı sadece ilk bulunan karakteri değiştirir


            11)Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
                                          1) \\d    ==> tum rakamlar (d==>digit)
                                              \\D   ==> tum rakam disi character ler
                                          2) \\w    ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
                                             \\W    ==> A->Z        a->z         0->9    _ disindaki hersey
                                          3) \\s    ==> space tum bosluklar
                                             \\S    ==> space disindaki hersey

            12) + Concat: Bir string'e diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.


            ÖNEMLI NOT=JAVA YUKARIDAN ASAGI, SOLDAN SAGA CALISIR.
         */
    public static void main(String[] args) {
        System.out.println(15+20+"Merhaba"); //35Merhaba
        System.out.println("Merhaba"+15+20);//Merhaba1520
        System.out.println("Merhaba"+15*20);

        //Kullanicidan ismini ve soyismini girmesini isteyin.
        //Kullanici ismini nasil girerse girsin konsolda büyük harf ile yazilmasini saglayin.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi yaziniz...");
        String isim=input.nextLine(), soyad=input.nextLine(); //Multiple declaration(Coklu tanimlama virgül ile yapilir)
        String tamISim=isim.concat(" "+soyad).toUpperCase();
        System.out.println(tamISim);

        //Rakam haricindekileri silin

        String str="45.99 $";
        str=str.replaceAll("\\D", "");
        System.out.println(str); //4599

        //Verilen bir cümleyi yildiz ile gizleyip onuncu karakterden sonrasini yazdirin.

        String cümle="Her dert Java gibi olsa";
        System.out.println(cümle.replaceAll("\\w","*")+cümle.substring(10)); //*** **** **** **** ****ava gibi olsa

        //a harfi yeine @ isareti yerlestiriniz.
        String kelime="olaganüstü";
        System.out.println(kelime.replace("a","@")); //ol@g@nüstü

        String txt="Merhaba Dünya";
        //txt de ki bütün a'lari e ile degistirin.
        System.out.println(txt.replace("a","e"));

        //txt deki ilk bulunana a'yi e yapin
        System.out.println(txt.replaceFirst("a","e"));

        // "Kalem" yerine "biber" yazdirin.
        String str2="Dolma Kalem ile bir dünya kalemi aldik.";
        System.out.println(str2.replaceAll("kalem","biber")); //Dolma Kalem ile bir dünya biberi aldik.


        String str3="Bugun hava yagmurlu";
        System.out.println(str3.length());//19

        String str4="";
        System.out.println("str4lenght = " + str4.length());//0

        String str5=" ";
        System.out.println("str5length = " + str5.length()); //1

        //Kullanicidan isim ve soy isim girmesini isteyin. hangisinin dah uzun oldugunu yazdiran kodu olusturun.

        Scanner input1=new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisim giriniz. \n isim : ");
        String name=input1.next();
        System.out.println("Lütfen soyisminizi giriniz. \n soyisim: ");
        String surName=input1.next();

        if (name.length()>surName.length()){
            System.out.println("Isminiz daha uzun...");
        }else if (name.length()==surName.length()){
            System.out.println("Isim ve soyismminiz ayni uzunluktalar...");
        }else{
            System.out.println("Soyisminiz daha uzun");
        }



    }//Main Body
}//Class Body
