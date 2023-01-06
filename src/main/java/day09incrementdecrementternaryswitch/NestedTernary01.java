package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*EX1: Verilen yilin artik yil olup olmadigini kontrol eden kodu yaziniz.
            1) Yil 100'e bölünüyorsa 400'e bölünmelidir.
            2) Yil 100'e bölünmüyorsa 4'e bölünmelidir.
         */

        int year=1800;

        String result=year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year %4==0 ? "Leap" : "Not Leap");

        System.out.println(result);

    }//Main body
}//Class body
