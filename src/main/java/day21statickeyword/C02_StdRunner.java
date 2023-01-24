package day21statickeyword;

import day03scanner_slm.Student;

import java.util.List;

public class C02_StdRunner {
    public static void main(String[] args) {

        //stdName static olduugndan ona ulasmak icin object olusturmadim.
        //sadece class ismi kullanmak yeterlidir.
        System.out.println(C01_Student01.stdName);

        C01_Student01 std1=new C01_Student01();
        System.out.println(std1.age);

        C01_Student01 std2=new C01_Student01();

        String initials=C01_Student01.getInitials("Tom Cruise");
        System.out.println(initials);//TC

        int vowels=std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4

        //Static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali can");
        System.out.println(s);


        //List olusturmada yeni bir isilti... :)
        List<String> names = List.of("Ali","Can","Kemal");
        System.out.println(names);

    }
}
