package day12forloopwhileloop;

import java.util.Scanner;

public class C01_ForLoop01 {
    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Satir(row) sayisini giriniz");
        int row = input.nextInt();

        System.out.println("Sütun(Column) sayisini giriniz");
        int column = input.nextInt();


        for (int i = 1; i<=row ; i++) {
            for (int k=1 ; k<=column ; k++) {
                System.out.print("X ");
            }
            System.out.println();
        }





    }//Main Body
}//Class Body
