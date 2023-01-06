package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");

        //remove() methodu index ile kullanilirsa o index de ki elemani siler.
        //remove() methodu index ile kullanilirsasize sildigi elemani verir.
        String n =cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);//[Miami, Kayseri, Almaty]

        //remove ()methodu eleman ile kullanilirsa sadece ilk görünümü siler.
        //remove ()methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
        // true veya false verir.
        //eger eleman Listte yok ise o elemani siler ve size true verir.
        //eger eleman Listte yok ise o elemani silemediginden ve size false verir.
        boolean p=cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);






    }//Main
}//Class
