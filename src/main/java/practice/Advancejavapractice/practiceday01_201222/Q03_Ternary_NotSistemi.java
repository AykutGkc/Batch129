package practice.Advancejavapractice.practiceday01_201222;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {
    public static void main(String[] args) {

        //Yüzlük Not cinsinden kullanicidan alinan notu harf sistemine ceviren kodu yaziniz.(Ternary kullaniniz)


        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu sayi cinsinden giriniz");
        int notSayi=input.nextInt();

        String notHarf=notSayi>100 ?
                "0 ile 100 arasi bir not giriniz." :  notSayi>89 ?
                "A" : notSayi>79 ?
                "B" : notSayi>69 ?
                "C" : notSayi>59 ?
                "D" : notSayi>49 ?
                "E" : notSayi>-1 ?
                "F" : "0 ile 100 arasi bir not giriniz." ;

        System.out.println("notHarf = " + notHarf);








    }//Main
}//class
