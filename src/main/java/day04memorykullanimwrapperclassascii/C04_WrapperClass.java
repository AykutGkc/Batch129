package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {
    /*

    Non-Primitive Data türleri sadece data barindirmak icin degil ayni zamanda methodlarda bulundurur.
    Primitive data türleri ise sadece deger saklar.
    Java bu duruma bir cözüm üretmistir.
    Her Primitive data türünü Non-Primitiv olarak kullanabilmek icin özel classlar olusturmustur.
    Oracle firmasinin ürünü olan JAva primitivlere method ekleyerej olusturduklari yapiya "Wrapper Class" adini vermistir.


            **Primitive**     **Wrapper**
                byte     ==>    Byte
                short    ==>    Short
                int      ==>    Integer  *****
                long     ==>    Long
                float    ==>    Float
                double   ==>    Double
                boolean  ==>    Boolean
                char     ==>    Character *****
         */
    public static void main(String[] args) {

        byte primitiveByte = 12; //Primitive data typlarinda nokta koydugumuzda hic bir method gelmez.
        Byte wrapperByte= 12;//Ancak Wrapper classlarda nokta koydugumuzda bir cok method kullanabilirz.

        //ÖR. byte data typnin en küyük ve en büyük degerini ekrana yazdirin.
        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE);//127

        //EX: shor, int, long data typlerinin may ve min degerlerini hesaplatan kodu yaziniz.

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);



        //*****Primitiveler wrapper classlara nasil cevrilir?***** ==>Autoboxing

        float f1 = 13.99f; // Kücük kutu primitve

        Float wrapperF1 = f1 ; // f1 büyük kutuya (Heap) konuldu artik non-primitive oldu. ==> Autoboxing

        //******Wrapper Classlari Primitive data type nasil cevrilir?*****==> Unboxing

        Character w1 = 's';
        char primitiveW1= w1; // w1i büyük kutudan(Heap) cikartip primitive oldu tekrar. ==>Unboxing

        //Note: Autoboxing ve Unboxing java tarafindan otomatik yapilir.
        //      Ekstra kod yazmaya gerek yoktur.

        //EX: verilen iki string datanin toplamini veren kodu yazdiriniz.

        String str1="12345";
        String str2="6789";

        System.out.println(str1+str2); //123456789 ==> yanyana yazdirdi.

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2)); //19134








    }//Main Body
} //Class body
