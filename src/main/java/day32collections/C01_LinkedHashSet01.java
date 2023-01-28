package day32collections;

import java.util.LinkedHashSet;

public class C01_LinkedHashSet01 {
    public static void main(String[] args) {

        //LinkedHashSet olusturma

        LinkedHashSet<String> artist = new LinkedHashSet<String>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        // "Set"ler tekrarsiz eleman icerirler.
        //Siz ayni elemani tekrar tekrar eklerseniz java hata vermez, ama tekrarli eklenen elemani "Set" sadece bir kere koyar.
        artist.add("Tom");
        System.out.println(artist);//[Ajda, Tom, Brad, Angelina]

        LinkedHashSet<String> actress= new LinkedHashSet<String>();

        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);// [Tom, Brad]

    }
}
