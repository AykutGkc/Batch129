package day22_Staticblocksconstructors;

public class C01_StaticBlocks01 {

    //Bir variable olusturdugunuzda, degeer atamazsaniz o variable'i initialize etmediniz demektir.
    //static variable'lar static block'lar icinde initialize edilirsse o classin icinde herseyden önce hazir hale getirilmis olur.
    //BAzen main method calistirilmadan önce variable'larin hazir hale getirilmesi gerekir bu yüzden static bloclar kullanilir.

    //Note 1: "static block" lar static variablariinitizalize etmek icin kullanilir.
    //Note 2: "static block" lar class icin de herseyden önce calistirilir.



    static double pi;
    static String shape;


    static {
        pi = 3.14;
        System.out.println("Static blocks 1");
    }

    static {
        shape = "circle";
        System.out.println("Static blocks 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");


    }



}
