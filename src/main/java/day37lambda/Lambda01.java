package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSunOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplacationFromthreeToNine1());
        System.out.println(getMultiplacationFromthreeToNine2());
        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvensBetweenTwoInt(15,4));
        System.out.println(getSumOfDigitsBetweenTwoInts(12,18));

    }

    //1)Verilen listteki tüm sayilarin toplamini veren methodu olusturunuz.

    public static int getSunOfAllElements(List<Integer> list) {
        return list.
                stream().
                reduce(Math::addExact).get();
    }

    //2) 7den 70e kadar tam sayilarin toplamini veren kodu yaziniz.

    public static int getSumFromSevenToSeventy() {
        return IntStream.               //Intstream==> integerlari yukardan asagi diziyor.
                rangeClosed(7, 70).      //rangeClosed==> baslangis ve bitis araligi veriyor
                reduce(Math::addExact).
                getAsInt();
    }

    //3) 3den 9a kadar tüm tam sayilarin carpimini veren methodu olusturunuz.

    public static int getMultiplacationFromthreeToNine1() {
        return IntStream.
                rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    }

    public static int getMultiplacationFromthreeToNine2() {
        return IntStream.
                range(3, 10).reduce(Math::multiplyExact).getAsInt();
    }

    //4)Size verilen sayinin faktöriel hesaplatan kodu yaziniz.

    public static int getFactorial(int x) {

        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktöriel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

    // 5) Size verilen iki tam sayi arasindaki tüm cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInt (int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();
    }
    //Size verilen iki tam sayi arasindaki tüm tam sayilarin rakamlari toplamini veren kodu yaziniz.

    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).map(Utils::getSumOfDigit).sum();
    }

}
