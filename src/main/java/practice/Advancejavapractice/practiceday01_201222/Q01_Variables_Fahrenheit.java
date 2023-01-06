package practice.Advancejavapractice.practiceday01_201222;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_Fahrenheit {
    public static void main(String[] args) {

        //Fahrenheit degeri, Celsius degerine ceviren kodu yaziniy
        //formül : c=(f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz");
        double f=input.nextDouble();
        double c=(f-32)*5/9;
        System.out.println("Celcius : " + c);

        DecimalFormat format=new DecimalFormat("0.00");
        String formattedCelcius=format.format(c);
        System.out.println("formattedCelcius = " + formattedCelcius);

        System.out.printf("Formatli : "+"%.2f",c);




    }//Main
}//Class
