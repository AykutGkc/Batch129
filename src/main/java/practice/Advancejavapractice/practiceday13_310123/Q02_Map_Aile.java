package practice.Advancejavapractice.practiceday13_310123;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_Aile {
    public static void main(String[] args) {
        //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.

    Aile ali=new Aile("Ali","Can",15,"Ahmet","Hayriye");
        System.out.println(ali.getAileMap());

    Aile veli=new Aile("Veli","Han",25,"Mehmet","Hatice","Hasan","Hüseyin");

        System.out.println(veli.getAileMap());

    Aile ayse=new Aile("Ayse","Tan",35,"Fatma");

        System.out.println(ayse.getAileMap());




    }
}
