package day32collections.selfStudy;

public class C019_Whileloop03 {
    public static void main(String[] args) {


        //EX: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz

        int sayi=555;

        int sum=0;

        while(sayi>0){

            sum+=sayi%10;

            sayi=sayi/10;


        }


        System.out.println(sum);


    }
}
