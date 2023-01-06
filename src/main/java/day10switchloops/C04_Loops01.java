package day10switchloops;

public class C04_Loops01 {
    public static void main(String[] args) {



        /*
         Code Standorts
         I) Tekrar(Repetition) olmamalidir.
         II)Dynamic olmalidir.
         III)Tamir(Fix) ve update kolay yapilabilmelidir.

         */

        //EX1: Ekrana 5 kere "hi" Yazdirin.

        //1.Yol: Tavsiye edilmez.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //2.Yol: Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop"lar kullanilir.
        //Dört tane loop var. I) for-loop II)while loop III)do-while-loop IV)for-each loop

        //I)for-loop
        //  Baslangic degeri     Loop'un calisma sartlari      Increment/decrement
        for(int i=1           ;  i<6                        ;  i++   ){
            System.out.println("Hi");
        }


        //EX2: 11'den 44'e kadar tüm sayilari ekrana yazdiran kodu yaziniz.

        for(int i=11 ; i<45 ; i++ ){
            System.out.println(i);
        }

        //EX3: 40'dan 23'E kadar tüm ciftt tam sayilari ekrana yazdiran kodu yaziniz.

        for(int h=40 ; h>22 ; h-- ){
            if(h%2 == 0){
            System.out.println(h+" ");
            }
        }

        //EX4: 18'den 56'a kadar tüm tek sayilari ekrana yazdiran kodu yaziniz.

        for(int s=18 ; s<57 ; s++ ){
            if (s%2 !=0){
            System.out.print(s + " ");
            }
        }






    }//body of main
}//Body of class
