package day37lambda;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import day36lambda.Utils;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {
    public Lambda02() throws IOException {
    }

    public static void main(String[] args) throws IOException {


        //1)LambdaTextFile.txt dosyasi icindeki kodu console'a yazdiran kodu yaziniz.

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);
        //Files.Lines() Methodu path i stream e cevirir.
        // file classina git sag tikla "copy Path reference" ile adresi alip "Paths.get()" in icine koyuyoruz ve yazdirinca textFile i consolda okuruz

        //2)LambdaTextFile.txt dosyasi icindeki her karakteri UpperCase yapiniz.

        Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).forEach(System.out::println);

        //3)LambdaTextFile.txt dosyasi icindeki herhangibir kelimenin var olup olmadigini gösteren kodu yaziniz.
        boolean result = Files.
                         lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt"))
                        .map(t -> t.split(" ")).
                        flatMap(Arrays::stream).
                        anyMatch(t -> t.contains("Java"));//Herhangibir kelime "Java" ise sonuc true olur.
        System.out.println(result);
        //split Array dondurdugu icin "Line" i alip parcalayip "array" icine yazar.Arrayden cikarmak icin  "flatmap()" ile kelimeleri duz yapariz.sonra
        // "Stream"e ceviricek sonra da "anyMatch()" ile herhangi birinin verecegimiz degerle eslesip eslesmedigini kontrol edecek ve true vericek

        //4) LambdaTextFile dosyasi icindeki her kelimenin "a" harfi icerip icermedigini gösteren kodu yaziniz.
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt"))
                .map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t->t.contains("a"));//her kelime a harfo iceriyorsa true olur yoksa false olur.

        System.out.println(result2);


    /*
    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.


    AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.


    NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.
     */

    //5) LambdaTextFile dosyasi icindeki hicbir kelimenin "x" iceermedigini gösteren kodu yaziniz.
    boolean result3 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt"))
            .map(t -> t.split(" ")).
            flatMap(Arrays::stream).
            noneMatch(t->t.contains("x"));

        System.out.println(result3);
        //6) LambdaTextFile dosyasi icindeki "r" ile biten kelimeleri sayan kodu yaziniz.
        //1.Yol
        long result4 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt"))
                .map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).count();
        System.out.println(result4);
        //2.Yol--Tavsiye edilmez
        int result5 = Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt"))
                .map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                collect(Collectors.toList()).
                size();
        System.out.println(result5);



    }
}
