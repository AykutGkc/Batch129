package day05typecastingstringmanipulations;

public class StringManipulastions01 {
    public static void main(String[] args) {

        //String bir non-Primitive data typedir ve ayni zamanda bir classtir.

        String s ="Java is easy";
         //EX1: s Stringinde ki tüm karakterleri büyük harp yapiniz.

        String sUpper=s.toUpperCase();
        System.out.println(sUpper); //JAVA İS EASY

        //EX2: s stringinde ki tüm karakterleri kücük harp yapin.
        String sLower=s.toLowerCase();
        System.out.println(sLower);//java is easy

        //EX3: s Stringinde ki ilk karakteri aliniz.

        char firstChar=s.charAt(0);
        System.out.println(firstChar);

        //EX4: s stringinde ki 2. ve sondan 2. karakteri aliniz ve ekrana yanyana yazdiriniz.
        char secondChar=s.charAt(1);

        char secondLAst=s.charAt(10);
        System.out.println(secondChar + secondLAst); //212

        //I.Yol ayni satirda yazdirmak icin
        System.out.print(secondChar); //a
        System.out.println(secondLAst);//s

        //II.yol ayni satirda yazdirmak icin
        System.out.println(""+secondChar+secondLAst); //as

        //EX5: s Stringinde kullanilan karakter sayisini bulunuz.

        int sLength =s.length();
        System.out.println(sLength);// 12

        //EX6: s Stringinde ki ilk 4 karakteri aliniz.
        //subString(0,4) ==> "0" yani ilk index dahil "4" yani ikinci index harictir. (0,4)

        String sub1=s.substring(0,4);
        System.out.println(sub1);

        //EX7: s stringinde ki "is" kelimesini aliniz.

        String sub2=s.substring(5,7);
        System.out.println(sub2);

        //EX8) s stringinde ki "easy" kelimesini yazdirin

        String sub3=s.substring(8,12);
        System.out.println(sub3);

        //Bir rkarakterden baslayip Stringin sonun kadar almaz isterseniz, ikinci indexi yazmayiniz.
        String sub4=s.substring(8);

        //EX9: S stringinde "money" kelimesinin var olup olmadigini kontrol ediniz.

        boolean isExist=s.contains("easy");
        System.out.println(isExist);

        /*
        Bir methodu ögrenirken 3 seyi mutlaka ögrenin,
        1)Bu method ne is yapar.
        2)Bu methodun farkli kullanimlari nasildir.
        3)Bu metod ne return eder. (hangi tip data)
         */

        //EX10: "s" stringinin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        //EX11: s stringinin 6. chacterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isBegin= s.startsWith("i",5);
        System.out.println(isBegin);

    }//Main body
}//Class body
