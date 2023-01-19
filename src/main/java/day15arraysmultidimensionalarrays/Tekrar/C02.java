package day15arraysmultidimensionalarrays.Tekrar;

import java.util.Arrays;

public class C02 {


    //bir stringdeki sesli harflerin sayisini bulan kodu yaziniz

    public static void main(String[] args) {

        String text = "En büyük Fenerbahce";

       String [] yeniText=text.trim().split("");
        int counter = 0;



        for (String w : yeniText ) {
            switch (w) {
                case "a":
                    counter++;
                case "e":
                    counter++;
                case "i":
                    counter++;
                case "o":
                    counter++;
                case "ü":
                    counter++;

            }
        }

        System.out.println("counter = " + counter);
    }





}
