package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {


    /*

      ASCII=American Standart Kodlama Sistemi. Uluslararasi kabul görmüs degerlerdir.
      Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi char data türünde isleme
      alinirsa o char degerinin ASCII Table'daki karsiligini isleme alir. Harf ve sembollere deger atar.
      Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cünkü bilgisayarda her sey 1 ve 0 lardan
      olusur. Bu yapiya dönüstürmek icin cebirsel karsiliklari ASCII Table olusturulmustur.

    */

    public static void main(String[] args) {

        //Bir tamsayi ile bir harfi toplayiniz.

        int deger =20;
        char harf ='a';

        //1.yol

        int sum = deger+harf;

        System.out.println("Bir tamsayi ile harfin toplami = " + sum); //117



        System.out.println("2.yol toplam = "+(deger+harf));


        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2='2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3='3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1+rakam2+rakam3+rakam4); //1234

        System.out.println("rakam1+rakam2+rakam3+rakam4  ASCII Toplami= " + (rakam1+rakam2+rakam3+rakam4));

        char kh='a';
        char bh='A';

        System.out.println("a'nin ASCII degeri = " + (kh+0)); //97

        System.out.println("A'nin Ascii degeri = "+ (bh+0)); //65

        System.out.println("kh > bh ==> "+ (kh>bh)); //true

        //Herhangibir karakterin ASCII degerini hesaplatalim.

        char space=' ';
        System.out.println("Space'in ASCII degeri = " + (space+0));//32

        //2.yol

        int hrf='m';

        //char data typelarinda java karaktere integer deger de atanabilir.
        //Cünkü char data typenin bir resim degeri bir de ASCII den gelen integer degeri vardir.
        //Bu nedenle bu sekilde de ASCII degerini bulabiliriz.

        System.out.println("Int hrf'nin ASCII degeri = "+ hrf); //109

        //*******ASCII degerlerinden yararlanarak karsilastirma yapabiliriz.********

        byte b= 125;
        float f =2.456f;
        long l = 54564334634634L;
        char ch = 'h';

        System.out.println(l>ch); //true
        System.out.println(b<f); //false
        System.out.println(b<ch);//false








    }//main body
}//Class body
