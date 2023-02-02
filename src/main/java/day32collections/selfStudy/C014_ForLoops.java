package day32collections.selfStudy;

public class C014_ForLoops {
    public static void main(String[] args) {
        //EX2: Size verilen kücük harfle yazilmis String'in indexi cift sayi olan karakterlerini büyük harf yapiniz.
        //    ankara==> AnKaRa

        String str = "Ankara";


        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
            }
        }
        System.out.println();

//Example 1) Verilen bir String'de ilk 'a' harfinden önce ki tüm karakterleri konsola yazdiriniz.
        // "I love Java" ==> "I love J"
//Ex: Verilen bir string'de son 'a'dan sonraki tüm kararkterleri ters sirada yazdirin.
        // Germany==>yn
        String a = "I love Java";
        int idx = a.indexOf('a');
        for (int i = idx; i >= 0; i--) {

            System.out.print(a.charAt(i));
        }
        System.out.println();

        //Ex1: size verilen bir stringi tersten yazdiriniz. (Interview sorusu)
        String b = "Tramvay";
        for (int k = b.length() - 1; k >= 0; k--) {
            char ch = b.charAt(k);
            System.out.print(ch);

        }
        System.out.println();

        //EX1: 5 den 8 e kadar tam sayilarin toplamini veren kodu yaziniz.
        int sum = 0;
        for (int i = 5; i <= 8; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println();

        //EX2: 7 den 9e kadar tam sayilarin carpimini veren kodu yaziniz.

        int sum2=1;

        for (int i = 7; i <9 ; i++) {
            sum2 = sum2 *i;
        }
        System.out.println(sum2);

        System.out.println();

        /*
         Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
       */


        for (int i = 1; i <5 ; i++) {

            System.out.println("week : "+i);
            for (int j = 1; j <8 ;j++){


                System.out.println("day : " +j);
            }
        }
        System.out.println();


      /*  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
        X X X X X
        X X X X X
        X X X X X
        */

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <=4 ; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();

      /*  Example 1: Asagidaki sekli cizen kodu yaziniz
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
       */


        for (int i =1 ; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        System.out.println();

        /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */


        for (int i = 1; i<5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print( "* ");
            }
            System.out.println();
        }









    }
}
