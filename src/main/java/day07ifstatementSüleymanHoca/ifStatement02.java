package day07ifstatementSüleymanHoca;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {


        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz...");
        String monthName = input.next();

        if (monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if (monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if (monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if (monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if (monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if (monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if (monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if (monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if (monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if (monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else {
            System.out.println("Invalid month name");
        }

        /*
        Note: Stringlerin esitliklerini kontrol ederken bunun yerine equals () kullaniriz.
        Cünkü cift esittir "==" sembolu iki stiringi karsilastirirken hem adreslerine hem de degerine bakar
        ikisi de esit ise siz stringler esttir der ama biz code yazarken genellikle stringlerin
        adresleri ile degil degerleri ile ilgileniriz. bu yüzden string karsilastirmalarinda "==" kullanmayiz.
        "equals()" methoduise ik stringi karsilastirirken sadece degere bakar, degeri ayni ise bi iki string esittir der.
        degerler farkli ise bu iki string farkli der ki bu bizim kod yazarken ihtiac duydugumuz seydir.
         */

        String s="Tom";
        String t="Terry";
        String r=new String ("Tom");
        String m="Tom";

        System.out.println(s==t); //false cünkü adresler ve degerler farkli.
        System.out.println(s.equals(t)); //false cünkü degerler farkli.
        System.out.println(s==r);// false cünkü adresler farkli.
        System.out.println(s.equals(r)); //true cünkü equals() adeslere bakmaz.
        System.out.println(s==m);//true

        System.out.println(s.equals(m)); //true

    } //main body
} //Class body