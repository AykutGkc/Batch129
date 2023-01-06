package day02datatypesmethodcreation;

public class Variables01 {

    // Primitive data types --> char - boolean - byte - short - int - long - float - double
    //float: virgüllü(ondalikli sayilar- decimal numbers) sayilar icin kullanilir. (Fiyatlandirmalar: 12,99 vb)
    //double: virgüllü(ondalikli sayilar- decimal numbers) sayilar icin kullanilir.(hücre agirligi: 0,00000000112 vb)


    //Note:1)Primitive data typlarini java olusturmustur. biz olusturamayiz.
    //2)Primitive data typlerinda da sadece kücük harf kullanilir.
    //3)Primitive datalar, data typlara göre farkli farkli yer kaplarlar.
    //4) Primitive datalar iclerinde sadece sizin atadiginiz degeri barindirir.


    public static void main(String[] args) {

        //Örnek1: Gömlek ve ayakkabi fiyatlari icin iki tane variable olusturup. toplam fiyatu ekrana yazdiriniz.
        //Note: Java "Decimal numbers" lari otomatik olarak "Double kabul eder.
        //Data typeni "float yazarsaniz hata verir. float olmasinda israr ediyorsaniz sonun "F" veya "f" konur.
        //float 4byte yer kaplar, double 8 byte yer kaplar.
        float shirtPrice = 12.99F;
        float shoesPrice =15.89F;

        System.out.println(shirtPrice+shoesPrice);
        //System.out.println yazilirsa printin sonuna, pointer bir sonraki satira yazilir.
        //System.out.print olursa pointer ayni satirda devam edecek demektir.

        //pointer: imlec

        //System.out.println() yazdirmanin kisa yolu ==> sout + enter

        //Örnek2: Hücre agirligi ve amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdirin

        double weigtCell = 0.000000000112;
        double weightAmip= 0.000000000023;

        System.out.println(weigtCell-weightAmip); // 8.9E-11 ==> "8.9 carpi 10 üzeri -14" "E==> exponent



    }

}
