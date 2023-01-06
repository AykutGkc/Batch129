package z_mentorgrubu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C13_AdvancedPractice_061223 {
    public static void main(String[] args) {


        //Fahrenheit degeri, Celsius degerine ceviren kodu yaziniy
        //formül : c=(f-32)*5/9


        Scanner input = new Scanner(System.in);
        System.out.println("Fahreheit degeri giriniz");

        double f=input.nextDouble();

        double c= (f-32)*5/9;

        System.out.println("Celcius: " + c);

        DecimalFormat yeni=new DecimalFormat("0.000");
        String yenicelcius=yeni.format(c);
        System.out.println(yenicelcius);

        System.out.printf("2.yol: "+"%.3f",c);



    }
}
