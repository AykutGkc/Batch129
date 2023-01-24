package day20passbyvaluemethodoverloading_SüleymanAlptekin;

public class C03_MethodOverloading01 {
    public static void main(String[] args) {

        /*
        1)Method Overloading yaparken method ismi degistirilemez.
        2)Method Overloading yaparken parametreler degistirilir.
           i)Parametre degistirirken, parametrelerin data type'lari degistirilebilir.
           ii) Parametre degistirirken, "Parametrelerin data typelari farkli ise " yerleri degistirilebilir.
           iii)Parametre degistirirken, parametrelerin sayisi degistirilebilir.
         3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
            Bu yüzden isim ve parametre "Method Signature" olarak adlandirilir.
         4)Method Overloading olustururken return type'i degistirmenin hicbir etkisi yoktur.
           Method Overloading olustururken access modifier degistirmenin hicbir etkisi yoktur.
           Method Overloading olustururken static veya non-static yapmanin  hicbir etkisi yoktur.
           Method Overloading olustururken mEthod body'i degistirmenin hicbir etkisi yoktur.
         5)"private" methodlar overloading edilebilir. Cünkü method overloading sadece bir classin icined olur.
            "Private" olmak ise baska class'lara gidildiginde problem olusturur.

          6)"static methodlar" overloading yapilabilir.


         */

        add(3,5);

    }

    public static void add(int a, int b){System.out.println(a+b);}
    public static void add(double a, double b) {
        System.out.println(a + b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b);
    }
}

