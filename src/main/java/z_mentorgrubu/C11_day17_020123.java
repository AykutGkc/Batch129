package z_mentorgrubu;

import java.util.*;

public class C11_day17_020123 {

    public static void main(String[] args) {



         //4)Verilen bir String Listte ki tüm elemanlarin toplam karakter sayilarini bulan kodu yaziniz.


        List<String> cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        System.out.println(cities);

        int toplam=0;

        for (int i=0 ; i<cities.size() ; i++) {
          toplam=toplam+cities.get(i).length();
        }

        System.out.println(toplam);









    }


}

