package practice.Advancejavapractice.practiceday08_140123;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {
    /*
    Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
     */

    static List<String> günler=new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List<Double> günlükKazanclar=new ArrayList<>();
    static double toplamKazanc=0;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int gun=0;

        while(gun<7){
            System.out.println(günler.get(gun) + " gününün kazancini giriniz");
            double kazanc=input.nextDouble();
            günlükKazanclar.add(kazanc);
            toplamKazanc+=kazanc;
            gun++;
        }

        DecimalFormat decimalFormat=new DecimalFormat("0.00");

        System.out.println("Günlük Kazanclar: " + günlükKazanclar);
        System.out.println("Toplam Kazanc : " + toplamKazanc);
        System.out.println("Ortalama Gelir : " + decimalFormat.format(ortalamaGelir()));
        System.out.println("Ortalamaüstü Gunler : " + ortalamaUstuGunler());
        System.out.println("Ortalamaalti Günler : " + ortalamaaltiGunler());
        System.out.println("Ortalama Gelirli Günler : " + ortalamaGunler());





    }//main

    static double ortalamaGelir(){
        return toplamKazanc/7;
    }

    static String ortalamaUstuGunler(){
        String ortalamaUsmiGünler="";
        for (int i=0 ; i<7 ; i++){
            if (günlükKazanclar.get(i)>ortalamaGelir()){
                ortalamaUsmiGünler+=günler.get(i)+ " ";
            }
        }
        return ortalamaUsmiGünler;
    }

    static String ortalamaaltiGunler (){
        String ortalamaAltiGünler="";
        for (int i=0 ; i<7 ; i++){
            if (günlükKazanclar.get(i)<ortalamaGelir()){
                ortalamaAltiGünler+=günler.get(i)+ " ";
            }
        }
        return ortalamaAltiGünler;
    }
    static String ortalamaGunler (){
        String ortalamaGünler="";
        for (int i=0 ; i<7 ; i++){
            if (günlükKazanclar.get(i)==ortalamaGelir()){
                ortalamaGünler+=günler.get(i)+ " ";
            }
        }
        return ortalamaGünler;
    }



}//class
