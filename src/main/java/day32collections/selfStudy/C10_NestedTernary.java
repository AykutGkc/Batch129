package day32collections.selfStudy;

public class C10_NestedTernary {
    public static void main(String[] args) {

         /*EX1: Verilen yilin artik yil olup olmadigini kontrol eden kodu yaziniz.
            1) Yil 100'e bölünüyorsa 400'e bölünmelidir.
            2) Yil 100'e bölünmüyorsa 4'e bölünmelidir.
         */


        int year=2016;

        String result =   year%100 ==0 ? ( year%400==0 ? "Artik yil" : "Artik yil degil") : (year%4==0 ?  "Artik yil"  : "Artik yil degil");

        System.out.println(result);




    }//Main
}//class
