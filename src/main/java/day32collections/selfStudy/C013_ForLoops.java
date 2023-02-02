package day32collections.selfStudy;

public class C013_ForLoops {
    public static void main(String[] args) {

        String hi="Hi!";


        //EX1: Ekrana 5 kere "hi" Yazdirin

        for (int i = 1; i <6 ; i++) {
            System.out.print(hi);
        }


        //EX3: 40'dan 23'E kadar tüm ciftt tam sayilari ekrana yazdiran kodu yaziniz.


        for (int i = 40; i>23 ; i--) {
            if (i % 2 == 0){
                System.out.print(i);
            }
        }


        // EX1:21 den 180 e kadar hem 4 e hem de 6 ya bölünebilen tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i = 21; i<180 ; i++) {
            if (i % 4 == 0 && i % 6 == 0){
                System.out.print(i + " ");
            }
        }




    }//Main
}//class
