package day05typecastingstringmanipulations;

public class TypeCasting01 {
    public static void main(String[] args) {
        /*
        Numeric primitiv data typelarinin birbirine döüstürülmesine "Type Casting" denir.
        Numeric(sayisal) Data Typelar: byte - short - int - long - float - double

         Not1: Kücük data typelerini büyük data typklarina cevirmeyi java otomatik olarak yapabilir.
              Bu isleme "AutoWidening(Otomatik genisletme)"denir

         Not2: Büyük data typelarini kücük data typelara cevirmek riskli bir istir.Java bu riskli isi otomatik olarak yapmaz.
               Bu islemi kod yazanlar yapar.
               Bu isleme "ExplicitNorrowing(Aciktan daraltma)"denir.

         */

        //EX: byte data tipini int data tipine ceviriniz.

        byte age=13;
        int ageInt=age;

        //long data typeni short data type cevirelim

        long weight= 234;
        short weigtShort=(short)weight;

        //EX: int data typemi float data typena ceviriniz.

        int population= 700000;
        System.out.println(population); //700000
        float populationFloat=population;
        System.out.println(populationFloat);//700000.0

        //EX:double data typeni Short data tipine ceviriniz.

        double hücreSayisi= 1324.4;
        System.out.println(hücreSayisi);
        short hücreSayisShort=(short)hücreSayisi; //1324.4
        System.out.println(hücreSayisShort); //1324

        //DIKKAT:
        //Dönüsüm yaptiginiz sayi(260) Dönüseceginiz data typenin sinirlari disinda ise, java kullandiginiz sayi ile+
        //mod islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur.

        //EX1:
        short num = 260;
        System.out.println(num);//260
        byte numByte=(byte)num;
        System.out.println(numByte);//4

        //EX2:

        short n = 1023;
        System.out.println(n); //1023
        byte nByte=(byte)n;
        System.out.println(nByte); //-1





    }//main body
} //Class Body
