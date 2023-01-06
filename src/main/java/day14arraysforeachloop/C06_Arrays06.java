package day14arraysforeachloop;

import java.util.Arrays;

public class C06_Arrays06 {
    public static void main(String[] args) {

        //Note1: sort() methodu sayisal data typelarini kücükten büyüge siralar.(Ascending order)
        //Note2: sort() methodu String data typelarini alfabetik olarak siralar.(Alphabetical order)
        //Note3: Ascending order + alphabetical order ==> Natural Order
        //Note4:sort() methodu Array elemanlarini natural ordera göre siralar.

        //Note5:BinarySearch() methodu bir elemanin bir Array de olup olmadigini kontrol etmek icin kullanilir.
        //      BinarySearch() methodunu kullanmadan önce sort() methodunu kullanmak zorundayiz.
        //      sort() methodunu kullanmazsaniz güvenilir olmaz.
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors)); //[Blue, Brown, Green, Orange, Red, Yellow]

        int num1=Arrays.binarySearch(colors, "Blue");
        System.out.println(num1); //var hemde indexi "0".

        int num2=Arrays.binarySearch(colors, "Orange");
        System.out.println(num2); //var hem de indexi "3".

        int num3=Arrays.binarySearch(colors, "Tarik");
        System.out.println(num3); // -6 ==> "-" bu eleman ok demek.
                                  //         "6" ise olsaydi 6. eleman olacakti.






    }//Main
}//Class

