package day15arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Locale;

public class C02_Arrays {
    public static void main(String[] args) {

        //bir stringdeki sesli harflerin sayisini bulan kodu yaziniz

        String str = "Java ögenince para kazanmak ne kolay, ögrenmeyince ne kadar zor.";

        str = str.toLowerCase();
        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));

        int counter = 0;
// iter ==> for each loop un kisac yazdirmak icin kullanilir.
        for (String w : harfler) {

            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                    counter++;

            }

        }//for each loop
        System.out.println(counter);

    }//Main
}//Class
