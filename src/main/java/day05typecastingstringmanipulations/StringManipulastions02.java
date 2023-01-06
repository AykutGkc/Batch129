package day05typecastingstringmanipulations;

public class StringManipulastions02 {
    public static void main(String[] args) {
        String s="Learn java earn money";

        //EX: s stringinin money ile bitip bitmedigini kontrol ediniz.

        boolean isEnd =s.endsWith("money");
        System.out.println(isEnd);


        //EX2: s stringde ki money kelimesini "dolar" kelimesine ceviriniz.

        String newS1=s.replace("money","dollar");
        System.out.println(newS1);

        //EX3: earn kelimesini win kelimesine ceviriniz.

        String newS2=s.replace("earn", "win");
        System.out.println(newS2);

        //EX4: a harflerini *'a ceviriniz.


        //NOT:replace methodunda coklu karakter ile calisirsaniz mecburen cift tirnak kullanacaksiniz.
            // Ama tek karakter ile calisirsaniz tek tirnakta cift tirnakta kullanabilirsiniz.
            // Ikiside tek tirnak ya da cift tirnak olmalidir. Ayni olmalidir.
        String newS3=s.replace('a','*');
        System.out.println(newS3);

        //EX5: n harlerini XXX'e cevirelim.
        String newS4=s.replace("n","XXX");
        System.out.println(newS4);

        //EX6: s stringinde ki bütün e harflerini siliniz.
        //NOT: Hicbir sey char data tipinde yoktur. bu yüzden replace() methodu kullanarak islemi yaparsaniz cift tirnak kullanilmali.
        String newS5=s.replace("e","");
        System.out.println(newS5);

        String t="Ali 13 yasindadir!...";

        //EX7: t stringinde ki tüm rakamlari(0,1,2,3,4,5,6,7,8,9) yildiza ceviriniz.
        //NOT: bir grup datayi degistirmek icin replaceAll() kullanilir.
        //NOT: bir grup datayi ifade etmek icin "Regular Expressions" (regex) kullaniriz.
        String newT1=t.replaceAll("[0-9]","*");
        System.out.println(newT1);

        /*
        Meshur regex'ler:
        1) tüm rakamlar==> [0-9]
        2)Tüm kücük harfler==>[a-z]
        3)Tüm büyük Harfler==>[A-Z]
        4)Tüm büyük ve kücük harfler ==>[a-zA-Z]
        5)Tüm harfler ve rakamlar ==> [a-zA-Z0-9]
        6)Tüm noktalama isaretleri ==> \\p{Punct}
        7)Tüm sesli harfler ==> [aeiouAEIOU]
            x,q,w harfleri ==> [xqw]
        8) Kücük harflerden farkli tüm karakterler ==> [^]
        10)Space disindaki tüm karakterler: \\S
        */

        //EX8: t stringindeki tüm rakamlari ve harfleri ünleme ceviriniz.
        String newT2=t.replaceAll("[a-zA-Z0-9]","!" );
        System.out.println(newT2);

        //EX9): t stringinde ki tüm sesli harfleri "?" isaretine ceviriniz.
        String newT3=t.replaceAll("[aeiou]","?");
        System.out.println(newT3);

        //EX10: t Stringinde ki kücük harfler disindaki tüm karakterleri"<>" ceviriniz.
       String newT4= t.replaceAll("[^a-z]","<>");
        System.out.println(newT4);

        //EX11: t Stringinde ki tüm harfler disindaki tüm karakterleri "+" ceviriniz.
        String newT5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(newT5);

        //EX12: t stringinde ki space'ler disinda ki tüm karakrterleri $ isarerine ceviriniz.
        String newT6=t.replaceAll("[^ ]","€");
        System.out.println(newT6);

        //EX13: t strindinde ki sesli harfler disinda ki tüm karakterleri "&"e ceviriniz.
        String newT7=t.replaceAll("[^aeiouAeiou]","&");
        System.out.println(newT7);







    }//main Body
}//Class body
