package day35lambda.tekrarIzleme;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        /*
    1)Lambda "functional programming" dir, digeri "structured Programming"dir.
    2)functional programming "ne yapmak gerekir?"(What to do?) ile ilgilenir. "Nasil yapmak gerekir?"(How to do?) ile ilgilenmez.
    3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
    4)LAmbda, Java'Ya "Java 8 "de eklendi.


         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);




    }
    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //Bir listte ki elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz.
    
    public static void printElements1(List<Integer> list){
        for (Integer w : list) {
            System.out.println(w+ " ");
        }
    }
    


}
