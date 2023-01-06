package practice.Regularjavapractice.practiceday03;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan bir gün ismi alin eger gün cuma ise "Müslümanlar icin kutsal gün",
        //Eger gün Cumartesi ise "Yahudiler icin kutsal gün",
        //Eger gün Pazar ise "Hristiyanlar icin kutsal gün", yazdiran kodu olusturun.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String gün= input.next().toLowerCase(); //Kücük harfe cevirdik

        if (gün.equals("cuma")){
            System.out.println("Müslümanlar icin kutsal gün");
        }else if (gün.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gün");
        }else if (gün.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gün");
        }else {
            System.out.println("Kutsal gün degil");
        }




    } // main body
}//Class Body
