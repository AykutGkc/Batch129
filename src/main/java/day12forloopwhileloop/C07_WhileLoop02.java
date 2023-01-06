package day12forloopwhileloop;

public class C07_WhileLoop02 {
    public static void main(String[] args) {
        //Example 2: 23'den 12'yw kadar tam sayilari console' a yazdiriniz


        int i = 23;
        while (i >= 12) {
            if (i%2==0){
                System.out.print(i + " ");
            }
            i--;
        }




    }
}
