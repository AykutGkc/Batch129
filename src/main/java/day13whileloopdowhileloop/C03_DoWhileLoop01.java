package day13whileloopdowhileloop;

public class C03_DoWhileLoop01 {
    public static void main(String[] args) {

        //1)While loop

        int i=1;
        while(i<1 ){

            System.out.println("Sen bir While Loop'sun");    //==> 1) While body hic calismadi. 2)While loop da Zero Execution Mümkündür
            i++;
        }

        //Do-While loop

        int k=1;

        do {
            System.out.println("Sen bir do-While loop'sun");  //==> 1) Do-While body hic calisti. 2)do while loop en az bir kere calisir.
            k++;                                                                                   //Do-While da Zero Execution Mümkün degildir.
        }while(k<1);




    }//Main
}//Class
