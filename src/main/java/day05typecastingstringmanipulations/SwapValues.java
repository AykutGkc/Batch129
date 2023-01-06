package day05typecastingstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap: yer degistirmek. 1.kap:patates, 2.kap:domates ==> 1.kap:domates, 2.kap:patates

        int a =12;
        int b =5;
        int temp=0;

        //Swaptan sonra a:5, b:12 olmali

        System.out.println("a = "+a);
        System.out.println("b = " + b);

        //I.yol

        //1.Adim
        temp=a;

        //2.adim
        a=b;

        //3.adim
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //II.Yol
        int x=12;
        int y=5;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);





    }//Main body
}//class body
