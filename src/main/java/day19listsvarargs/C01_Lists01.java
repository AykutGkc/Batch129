package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Lists01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir list'teki elemanlari tekrarsiz olarak yazdiriniz
        //           [2,3,2,2,3,5]  ==>[2,3,5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List <Integer> newList = new ArrayList<>();

        for (Integer w : myList) {
            if (!newList.contains(w)){
                newList.add(w);
            }
        }

        System.out.println(newList);

        //Ex 2 : Müsterinin ürün ismini aliniz.
        //       Müsterinin ismini verdigi ürün listede varsa ismini yazdirin.
        //       Müsterinin ismini verdigi ürün listede yoksa "Out of Stock" yazdirin.

        Scanner input=new Scanner(System.in);


        List<String> products = new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Headphone");
        products.add("Mobile Phone");

        do{
            System.out.println("Aradiginiz ürünün ismini giriniz...");
            System.out.println("Aramayi sonlandirmak icin Q'ya basin...");
            String product= input.nextLine();
            if (product.equalsIgnoreCase("Q")){
                break;
            } else if(products.contains(product)){
                System.out.println(product + " is in stock");
            }else {
                System.out.println(product + " is out of stock...");
            }

        }while(true);

        System.out.println("Stemizi kullandiginiz icin tesekkür eder, tekrar bekleriz...");












    }//Main
}//Class
