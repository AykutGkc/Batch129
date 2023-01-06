package day12forloopwhileloop;

public class C08_WhileLoop03 {
    public static void main(String[] args) {
        //EX: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz

        //1.Yol: While loop
        int num=578;

        int sum =0;

        while(num>0){

            sum= sum + num%10;

            num/=10;
        }

        System.out.println("Rakamlar toplami : " + sum);

        //2.Yol : For Loop

        int a = 684;
        int toplam= 0 ;
        for (int m=a ; m>0 ; m/=10 ){

            toplam=toplam+m%10;
        }
        System.out.println("Rakamlar toplami : " + toplam);



    }//Main body
}//Class body
