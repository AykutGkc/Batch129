package ssg.stringBuiilder130223;

public class C01stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder("animal"); //animal olusturup 16yi üstüne ekler capacity 22 olur.
                                                       //.apend ile eklenirse önce capacity olusturur sonra icine animal koyardi.
        System.out.println(sb2.length());//6
        System.out.println(sb2.capacity());//16

        StringBuilder sb3=new StringBuilder(10);


    }
}
