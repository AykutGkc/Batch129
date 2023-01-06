package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayLists02 {
    public static void main(String[] args) {

        //Array list olustururken sag tarafa(Constanter) ArrayList yazmak zorundasiniz.
        //Ama sol tarafa "ArrayList" de "List" de yazabilirsiniz.
       List<Character> initials= new ArrayList<Character>();

       initials.add('A');
       initials.add('B');
       initials.add('M');
       initials.add('B');

       //Bir Listte kac eleman oldugunu nasil anlariz?
       int numOfElement=initials.size();
        System.out.println(numOfElement);//4

        //Note:Array'lerden bahsederken "length" kullanin.Listlerden bahsederkeb "size" kullanin.

        //Bir Listten istenen bir eleman nasil alinir?
        char u = initials.get(2);
        System.out.println(u);

        //Example 1: Verilen bir String Listte ki tüm elemanlarin toplam karakter sayilarini bulan kodu yaziniz.

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol
        int sum = 0;
        for (String w : cities) {
            sum=sum+w.length();
        }
        System.out.println(sum);

        //2.Yol:

        int toplam=0;

        for (int i = 0; i < cities.size() ; i++) {

            toplam=toplam+ cities.get(i).length();
        }

        System.out.println(toplam);


        //Bir listte ki istenen bir elemani nasil degistirebiliriz.

        cities.set(0, "New york");
        System.out.println(cities);

        //Example2: Maas listi olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<Double>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);

        //1.Yol
      /*  int idx=0;

        for (Double w : salary){
          salary.set(idx, w*1.20);
          idx++;
        }
        System.out.println(salary);

       */

        //2.Yol:

        for (int i = 0; i < salary.size() ; i++) {

            salary.set(i, salary.get(i)*1.20);
        }

        System.out.println(salary);


    }//Main
}//class
