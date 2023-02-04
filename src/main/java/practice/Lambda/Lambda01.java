package practice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi=new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftPozitifLamExYazdir(sayi);
        System.out.println();
        ciftPozitifMetRefYazdir(sayi);
        System.out.println();
        kareYazdir(sayi);
        System.out.println();
        kareTekrarsiz(sayi);

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifLamExYazdir (List<Integer> list){
        list.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t+" "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifMetRefYazdir (List<Integer> list){

        list.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void  kareYazdir (List<Integer> list){
        list.stream().map(Utils::kareBul).forEach(Utils::yazdir);
    }
    public static void kareTekrarsiz (List<Integer> list){
        list.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);
    }


}
