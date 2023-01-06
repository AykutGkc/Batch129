package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatörleri {

    //10<sayi<20 ==> java ücünü birden ayni anda yapamaz.
    //10<sayi MantikOperatörü sayi<20 seklinde yapiyor.

    // = tek esittir atama(assigmet) yapar.
    //== cift esittir matematikde ki esittir.

    /*
    Java üclü karsilastirma kabul etmez.
    ikili karsilastirmlar yapip mantik operatörleri ile birlestirmeliyiz.

    &&== ve and || or operatörü veya demek

    Cay ve   Limon
     +  &&    +   = True
     +  &&    -   = False
     -  &&    +   = False
     -  &&    -   = False

     ***&& ile & arasinda ki fark;***
     &&==> boolean sonucta bir tane false bulunca durur.
     &==> ise tüm satiri tarar sonra durur.
     Bu da &&'nin &'den daha hizli calismasini saglar.

     || veya operatörü Pollyanacidir. En ufak pozitiflikten True döner.

     Cay ve   Limon
     +  ||    +   = True
     +  ||    -   = True
     -  ||    +   = True
     -  ||    -   = False

      */
    public static void main(String[] args) {

        System.out.println(5+2==8 ); //false

        boolean sonuc1 = (5>4) && (7<9) && (6+3==9) && (5+2 !=8) ; //true
        System.out.println(sonuc1); //true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2==7 ; //false
        System.out.println(sonuc2);

        int sayi1= 15;

        System.out.println(10<sayi1 && sayi1<20); //true

        int sayi2 = 5;
        int sayi3=10;
        System.out.println((sayi2<10 || sayi2 >20 || sayi3>15) && sayi3>sayi1);




    }//Main Body


}//Class Body
