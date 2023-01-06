package day11forloop;

public class C04_ForLoop04 {
    public static void main(String[] args) {

        //Ex1: size verilen bir stringi tersten yazdiriniz. (Interview sorusu)

        String str="Germany";

        String t = "";

        for (int i = str.length()-1; i >= 0; i--) {
          t= t + str.charAt(i);
        }

        System.out.println(t);

        //Ex2: Size verilen bor stringin palindrome olup olmadigini kontrol eden kodu yaziniz,
        // palindrome==> civic, nalan, 11211

        // logic: Stringi ters cevir sonra da düz hali ile ters halini karsilastir, ayni ise "Palindrome" de.

        String düz ="Civic";

        String ters = "";

        for(int i = düz.length()-1 ; i >= 0; i--) {

            ters = ters + düz.charAt(i);

        }
        if (düz.equalsIgnoreCase(ters)){
            System.out.println(düz+" Palindrome'dur.");
        } else {
            System.out.println(düz+" Palindrome degildir");
        }










    }//Main Body
}//Class Body
