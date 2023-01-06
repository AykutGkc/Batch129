package day07ifstatement;


import java.util.Scanner;

public class C01IfStatement {
    public static void main(String[] args) {

        // If it rains, I will cancel the picnic. (Eger yagmur yagarsa piknigi iptal edecegim.)

        //EX1: Verilen karakter büyük harf ise ekrana büyük harf yazdiran kodu olusturunuz.

        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Büyük harf");
        }//if body

        //EX2: Verilen bir sayi cift sayi ise ekrana cift sayi yazdiran kodu olusturunuz.

        int num=-14;


        if (num%2==0){
            System.out.println("Cift Sayi");
        }//If body

        //EX3:Verilen bir sayi 300 den kücük veya 1200den büyük ise harika sayi yazdirin

        int harikaSayi=1290;

        if (harikaSayi<300 || harikaSayi>1200){
            System.out.println("Harika Sayi.");

        }//If body

        //EX4: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        int sayi=input.nextInt();

        //1.Yol:
        if (sayi%2==0){
            System.out.println("Sayi Cifttir.");
        }//If body
        if (sayi%2==1){ //if (sayi%2!=0) de yazilabilir.
            System.out.println("Sayi Tektir");
        } //If body

        //2.Yol

        if (num%2==0){
            System.out.println("Bu Sayi cifttir");
        }else {      //kalan bütün diger ihtimallerde asagidakini yazdirir.
            System.out.println("Bu sayi tektir");
        }

        //EX5) Verilen bir sayinin negatif,pozitif ya da notr oldugunu gösteredn kodu yaziniz.

        int sayi1=105;

        if(sayi1<0){
            System.out.println("Sayi negatiftir.");
        }else if (sayi1 == 0 ){
            System.out.println("Nötr Sayi");
        }else{
            System.out.println("Sayi pozitiftir");
        }

    }//Main body
}//Class body
