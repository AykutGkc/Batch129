package practice.Advancejavapractice.practiceday01_201222;

import java.util.Scanner;

public class Q06_WhileLoop_IlkVeSonRakam {
    public static void main(String[] args) {

        //Kullanicidan alinan bir sayinin ilk ve son rakamlari toplamini toplayan kodu yaziniz.


        Scanner input=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi= input.nextInt();

        //1.Yol:
        int sonRakam=sayi%10;
        System.out.println("sonRakam = " + sonRakam);

        int ilkRakam=sayi;

        while(ilkRakam>9){
            ilkRakam/=10;
        }
        System.out.println("ilkRakam = " + ilkRakam);
        System.out.println("Toplama = " + (ilkRakam+sonRakam));


        //2.Yol
       String sayiString= String.valueOf(sayi);
       int strIlkRakam = Integer.parseInt( sayiString.substring(0,1));
       int strSonRakam = Integer.parseInt(sayiString.substring(sayiString.length()-1));
        System.out.println("Toplam: "+(strIlkRakam+strSonRakam));





    }//Main
}//class
