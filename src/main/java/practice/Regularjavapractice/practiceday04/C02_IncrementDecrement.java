package practice.Regularjavapractice.practiceday04;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b = a++;//post-increment

        System.out.println("b = " + b);//13
        System.out.println("a = " + a);//12

        int x=15;
        int y=x--;//Post-decrement
        System.out.println("x = " + x); //14
        System.out.println("y = " + y); //15

        int m=21;
        int n=++m; //Pre-increment
        System.out.println("m = " + m); //22
        System.out.println("n = " + n); //22

        int t=32;
        int u=--t; //pre-increment
        System.out.println("t = " + t);
        System.out.println("u = " + u);

    }//Body of main
}//Body of class
