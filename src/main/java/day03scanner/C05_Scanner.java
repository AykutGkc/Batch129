package day03scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dirkdörtgenin en ve boyunu alan ve hesaplayan kodu yaziniz.
        //Dirtdörtgenin alani= en*boy
        //Dirtdörtgenin cevresi 2*(en+boy)

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen dikdörtegenin kisa kenarini giriniz.");
        int en=input.nextInt();

        System.out.println("Lütfen uzun kenar uzunlugunu giriniz.");
        int boy=input.nextInt();

        int dikdörtgeninAlani= en*boy;

        int dikdörtgeninCevresi= 2*(en+boy);

        System.out.println("Dikdörtgenin alani = "+ dikdörtgeninAlani);
        System.out.println("dikdörtgeninCevresi = " + dikdörtgeninCevresi);



    }
}
