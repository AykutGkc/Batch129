package day01Variables;

public class Variables01 {
    public static void main(String[] args) {
        //Variable olusturmak:
        //javada esittir demek "==".
        //javada "=" assigment operatordür. sagdaki degeri alir, soldaki kutuya koyar.
        //Access Modifier yazmaz iseniz "defult" demektir.
        //Data Type + Variable name==> VAriable Declaration
        //Assingment Operator(atama operatörü) + Variable degeri ==> Assigment
        //Eger variable declaration yapar, assignment yapmazsaniz Java kendi degerini (default) koyar.
        //Default degerler sayilar icin sifirdir.
        // Data type ni yaziniz. Variables ismini yaziniz.  atama operatörü (assigment operator). Variable degeri. Noktali virgül.
                    int                    age                          =                                13          ;

        //Örnek1: Ögrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //Stringlere verilen degerler cift tirnak icinde olmalidir.
        //Stringler icin "default value" "null"dir.
        String studentName= "Ali Can" ;

        /*
        Javada temel de iki tip data vardir.
        1) primitive data type:
           char: Tek karakterler icin kullanilan data tipidir. A, x, ?, 5
           boolean: booleanlar sadece iki farkli deger alabilir. "True" ve "False"
           byte: -128 den + 127 e kadar tam sayi degerleri icin kullanilir. (1 byte)
           short: -32768 ile 32767 arasindaki tam sayilar icin kullanilir.  (2 byte)
           int:-2147483648 ile 2147483647 arasinda ki tam sayi degerlerin icin kullanilir.(4 byte)
           long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icin kullanilir.(8 byte)
           float:
           double:
        2) non-primitive data type:

         */

        //Örnek2: char data tipinde ilk ismin ilk harfi olaarak bir variable olusturunuz ve deger atayiniz.
        //char data tipinde degerler tek tirnak icine konulmalidir.
        char isminIlkHarfi = 'A';

        //örnek3: Boolean data tipinde emekli misin icin bir variable olusturun ve false degerini atayin.
        boolean emekliMisin =false;

        //örnek4: byte data tipinde ögrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //örnek5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1200;

        //Örnek6:Ülke nufuslari icin bir variable olusturup deger atamasi yapiniz.
        int countryPopulation = 124274821 ;

        //örnek7: insan vucudundaki hücre sayisi icin variable olusturup deger atayiniz
        //Not: Bir deger long ise sonuna "L(TErcih edilir)" veya "l" konur.
        long cellNummerHumanBody = 3272378527357235745L ;
        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yoktur.
        long weightOfSun = 1234567;





    }
}
