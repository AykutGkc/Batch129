package day11forloop;

public class C05_ForLoop05 {
    public static void main(String[] args) {
        //EX1: 5 den 8 e kadar tam sayilarin toplamini veren kodu yaziniz.

        int sum=0;

        for(int i=5 ;i<9 ; i++ ){
            sum=sum + i;
        }
        System.out.println(sum);


        //EX2: 7 den 9e kadar tam sayilarin carpimini veren kodu yaziniz.
        // 7*8*9 =504

        int sum2=1;

        for(int i=7 ;i<10 ; i++ ){
            sum2=sum2 * i;
        }
        System.out.println(sum2);



    }//Main body
}//class body
