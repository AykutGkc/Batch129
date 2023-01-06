package day13whileloopdowhileloop;

import java.util.Arrays;

public class C06_Arrays01 {
    public static void main(String[] args) {


        int a = 12; // Bu yapinin icinde sadece bir tane data depolanabilir.
        // Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        // Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur.


        //Array Nasil Olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type" i ve "eleman sayisi" Mutlaka yazilmalidir.
        String stdNames[] = new String[5];

        //Array console'a nasil yazdirir.
        //toString() methodunu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]

        //Array'e eleman ekleme nasil yapilir?
        stdNames[2] = "Ajda";
        System.out.println(Arrays.toString(stdNames));

        stdNames[0] = "Cüneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames));

        //Array'den specific bir elemani almak.
        System.out.println(stdNames[2]);

        //Example: Array de ki her elemani sonuna "!" isareti koyarak ekrana yazdirin.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");
        }


    }//Main
}//Class
