package day03scanner_slm;

import java.util.Scanner;

public class Scanner01 {
    //Kullanicidan data alip kodlarimizda kullanacagiz.



    // Objectin ismini input yaptim cünkü bu object kullanicidan alinan datayi benim kodlarimin arasina koyacak.
    //System.in ==> sistemin icine koy demek

    public static void main(String[] args) {
        //1.adim: Scanner class'dan object olustur.
        Scanner input = new Scanner(System.in);
        //2.adim: kullaniciya ne istedigimize dair mesaj verin
        System.out.println("Lütfen yasinizi giriniz...");
        //3.Adim: uygun methodu kullanarak kullanicinin verdigi datayi memorye yerlestir.
        byte age = input.nextByte();
        System.out.println(age);

    }//Main body
}//Class Body
