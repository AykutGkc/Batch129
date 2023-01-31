package practice.Regularjavapractice.practiceday10_310123;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMethod {
    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir
    // listeyi karıştırin ve yazdırin
    // 3'er sağa kaydirin ve yazdırin

    public static void main(String[] args) {

        ArrayList<Integer> arrList=new ArrayList<>();

        Scanner input=new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Lütfen sayi giriniz");
            arrList.add(input.nextInt());
        }

        System.out.println("arrList = " + arrList); //arrList = [4, 5, 6, 7, 8]


        // listeyi sirala ve tersten yazdir

        arrList.sort(Collections.reverseOrder());
        System.out.println("tersten arrList"+ arrList);

        Collections.shuffle(arrList); //shuffle random olarak karistirir.
        System.out.println(" karistirdiktan sonra arrList = " + arrList);

        Collections.rotate(arrList,3);
        System.out.println("3 saga kaydiktan sonra arrList = " + arrList);

        int max=Collections.max(arrList);
        int min=Collections.min(arrList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.replaceAll(arrList,min,max);
        System.out.println("max ve min degeleri geldikten sonra arrList = " + arrList);





    }

}
