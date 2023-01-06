package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04_Lists03 {
    public static void main(String[] args) {

        /*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz.
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
    */


        Scanner input =new Scanner(System.in);
        System.out.println("Oyunumuza hos geldiniz");
        System.out.println("Oyunu sonlandirmak icin Q'a basin");
        //Arrays.asList() ile List olusturulabilir
        //Ama Listlerde ki eleman sayilarini degistiren hivbir method bu List icin kullanilamaz.
        //Dolayisiyla bu sorunun cözümünde ihtiyaciniz olan Listi "Arrays.asList()" kullanilarak olusturmamalisiniz.
        //List<Integer> numList= Arrays.asList(5,8,2,9);

        List<String> numList=new ArrayList<>();
        numList.add("5");
        numList.add("8");
        numList.add("2");
        numList.add("9");

        int counter=0;
        String num= "";

        do{
            System.out.println("Lütfen 1 ile 10 arasinda bir tamsayi giriniz");
            num= input.next();



            if (num.equalsIgnoreCase("Q")){
                break;
            }else if(numList.contains(num)){
                numList.set(numList.indexOf(num), "Bingo");
                counter++;
            }else{
                numList.add(num);
            }

        }while (counter!=numList.size());

       if (!num.equals("Q")) {
           System.out.println("Kazandiniz");
       }else{
           System.out.println("Oyundan isteyerek ayrildiniz tekrar bekleriz.");
       }

        System.out.println("Final report" + numList);






    }//Main
}//class
