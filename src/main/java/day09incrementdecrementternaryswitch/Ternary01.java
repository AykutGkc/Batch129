package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

        //EX1:

        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : b++;

        System.out.println(r1); //20
        System.out.println(a); //10 ("a" nin oldugu yer calismadi.)
        System.out.println(b);//21

        //EX2: Verilwn bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        int c = -10;

        int r2 = c < 0 ? c * (-1) : c;

        System.out.println(r2);

        //Example 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        //           mesaji veren kodu yaziniz.
        int m = 5;
        int n = -6;

        //"Object" Java da butun "Non-Primitive Data Type"(Class) larinin ortak "Parent"(Baba) idir.
        //"Object" in "Parent"i yoktur.
        //Farkli data type'lari icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz.
        //Java'da "Object", insanlik aleminde "Hz.Adem" e benzer.
        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";

        System.out.println(r3);

        //EX4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int d = 15;
        int r = Math.abs(d);

        String r4 = r > 99 && d < 1000 ? d + " üc basamakli sayidir" : d + " üc basamakli bir sayi degildir.";

        System.out.println(r4);


    }//Main body
}//Class body
