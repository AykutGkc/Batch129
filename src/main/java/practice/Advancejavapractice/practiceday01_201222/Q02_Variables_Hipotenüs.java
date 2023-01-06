package practice.Advancejavapractice.practiceday01_201222;

import java.util.Scanner;

public class Q02_Variables_Hipotenüs {
    public static void main(String[] args) {
        //Hipotenüsü hesaplayan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("1.Dik kenar uzunlugunu giriniz");
        int a= input.nextInt();
        System.out.println("2.dik kenar uzunlugunu giriniz.");
        int b= input.nextInt();
        
        double hipotenüs=Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs = " + hipotenüs);

        
        
        
    }//Main
}//Class
